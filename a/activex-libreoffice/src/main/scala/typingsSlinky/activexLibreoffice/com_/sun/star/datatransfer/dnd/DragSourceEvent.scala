package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is the base class for {@link DragSourceDragEvent} and {@link DragSourceDropEvent} .
  *
  * To access the {@link XDragSource} that originated this event, use the {@link com.sun.star.lang.EventObject.Source} member of this object.
  */
@js.native
trait DragSourceEvent extends EventObject {
  /**
    * The drag source on which the Drag and Drop operation was initiated.
    * @see com.sun.star.datatransfer.dnd.XDragSource
    */
  var DragSource: XDragSource = js.native
  /**
    * The drag source context of the current drag operation.
    * @see com.sun.star.datatransfer.dnd.XDragSourceContext
    */
  var DragSourceContext: XDragSourceContext = js.native
}

object DragSourceEvent {
  @scala.inline
  def apply(DragSource: XDragSource, DragSourceContext: XDragSourceContext, Source: XInterface): DragSourceEvent = {
    val __obj = js.Dynamic.literal(DragSource = DragSource.asInstanceOf[js.Any], DragSourceContext = DragSourceContext.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragSourceEvent]
  }
  @scala.inline
  implicit class DragSourceEventOps[Self <: DragSourceEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDragSource(value: XDragSource): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDragSourceContext(value: XDragSourceContext): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DragSourceContext")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

