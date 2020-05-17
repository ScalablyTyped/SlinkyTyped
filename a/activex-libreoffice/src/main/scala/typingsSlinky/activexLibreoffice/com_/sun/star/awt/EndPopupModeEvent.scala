package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an end pop-up mode event. */
@js.native
trait EndPopupModeEvent extends EventObject {
  /** specifies the new position of the floating window in frame coordinates if bTearoff is `TRUE` */
  var FloatingPosition: Point = js.native
  /**
    * specifies how the pop-up mode was ended `TRUE` means the window should be teared-off and positioned at FloatingPosition `FALSE` means the window was
    * closed
    */
  var bTearoff: Boolean = js.native
}

object EndPopupModeEvent {
  @scala.inline
  def apply(FloatingPosition: Point, Source: XInterface, bTearoff: Boolean): EndPopupModeEvent = {
    val __obj = js.Dynamic.literal(FloatingPosition = FloatingPosition.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], bTearoff = bTearoff.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndPopupModeEvent]
  }
  @scala.inline
  implicit class EndPopupModeEventOps[Self <: EndPopupModeEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFloatingPosition(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FloatingPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBTearoff(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bTearoff")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

