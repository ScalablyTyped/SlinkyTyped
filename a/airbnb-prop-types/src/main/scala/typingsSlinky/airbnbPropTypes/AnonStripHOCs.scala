package typingsSlinky.airbnbPropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonStripHOCs extends js.Object {
  var stripHOCs: js.Array[String] = js.native
}

object AnonStripHOCs {
  @scala.inline
  def apply(stripHOCs: js.Array[String]): AnonStripHOCs = {
    val __obj = js.Dynamic.literal(stripHOCs = stripHOCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStripHOCs]
  }
  @scala.inline
  implicit class AnonStripHOCsOps[Self <: AnonStripHOCs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStripHOCs(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripHOCs")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

