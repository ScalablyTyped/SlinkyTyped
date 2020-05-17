package typingsSlinky.activexLibreoffice.com_.sun.star.lang

import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the base for all event objects and identifies the source of the event. */
@js.native
trait EventObject extends js.Object {
  /** refers to the object that fired the event. */
  var Source: XInterface = js.native
}

object EventObject {
  @scala.inline
  def apply(Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventObject]
  }
  @scala.inline
  implicit class EventObjectOps[Self <: EventObject] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSource(value: XInterface): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Source")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

