package typingsSlinky.materialMenuSurface

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCLOSEDEVENT extends js.Object {
  var CLOSED_EVENT: String = js.native
  var FOCUSABLE_ELEMENTS: String = js.native
  var OPENED_EVENT: String = js.native
}

object AnonCLOSEDEVENT {
  @scala.inline
  def apply(CLOSED_EVENT: String, FOCUSABLE_ELEMENTS: String, OPENED_EVENT: String): AnonCLOSEDEVENT = {
    val __obj = js.Dynamic.literal(CLOSED_EVENT = CLOSED_EVENT.asInstanceOf[js.Any], FOCUSABLE_ELEMENTS = FOCUSABLE_ELEMENTS.asInstanceOf[js.Any], OPENED_EVENT = OPENED_EVENT.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCLOSEDEVENT]
  }
  @scala.inline
  implicit class AnonCLOSEDEVENTOps[Self <: AnonCLOSEDEVENT] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCLOSED_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CLOSED_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFOCUSABLE_ELEMENTS(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FOCUSABLE_ELEMENTS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOPENED_EVENT(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OPENED_EVENT")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

