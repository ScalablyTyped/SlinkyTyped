package typingsSlinky.nightwatch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonELEMENT extends js.Object {
  var ELEMENT: String = js.native
}

object AnonELEMENT {
  @scala.inline
  def apply(ELEMENT: String): AnonELEMENT = {
    val __obj = js.Dynamic.literal(ELEMENT = ELEMENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonELEMENT]
  }
  @scala.inline
  implicit class AnonELEMENTOps[Self <: AnonELEMENT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withELEMENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ELEMENT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

