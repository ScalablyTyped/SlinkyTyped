package typingsSlinky.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonATSArray extends js.Object {
  var ATS: js.Array[String] = js.native
}

object AnonATSArray {
  @scala.inline
  def apply(ATS: js.Array[String]): AnonATSArray = {
    val __obj = js.Dynamic.literal(ATS = ATS.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonATSArray]
  }
  @scala.inline
  implicit class AnonATSArrayOps[Self <: AnonATSArray] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withATS(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ATS")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

