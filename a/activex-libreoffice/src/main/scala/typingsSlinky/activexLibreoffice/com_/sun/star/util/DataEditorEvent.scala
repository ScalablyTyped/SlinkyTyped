package typingsSlinky.activexLibreoffice.com_.sun.star.util

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies an event broadcasted by an {@link XDataEditor} . */
@js.native
trait DataEditorEvent extends EventObject {
  /** specifies the type of the event. */
  var Type: DataEditorEventType = js.native
}

object DataEditorEvent {
  @scala.inline
  def apply(Source: XInterface, Type: DataEditorEventType): DataEditorEvent = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEditorEvent]
  }
  @scala.inline
  implicit class DataEditorEventOps[Self <: DataEditorEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: DataEditorEventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

