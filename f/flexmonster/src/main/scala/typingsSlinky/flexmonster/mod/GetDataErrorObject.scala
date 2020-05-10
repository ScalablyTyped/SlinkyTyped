package typingsSlinky.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDataErrorObject extends js.Object {
  var dataHeight: Double = js.native
  var dataWidth: Double = js.native
  var errorMessage: String = js.native
}

object GetDataErrorObject {
  @scala.inline
  def apply(dataHeight: Double, dataWidth: Double, errorMessage: String): GetDataErrorObject = {
    val __obj = js.Dynamic.literal(dataHeight = dataHeight.asInstanceOf[js.Any], dataWidth = dataWidth.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataErrorObject]
  }
  @scala.inline
  implicit class GetDataErrorObjectOps[Self <: GetDataErrorObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataHeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDataWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorMessage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

