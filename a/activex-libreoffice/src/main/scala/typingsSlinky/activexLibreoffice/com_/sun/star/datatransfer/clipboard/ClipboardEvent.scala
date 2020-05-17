package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A clipboard uses this object to notify its listeners of content changes.
  * @see com.sun.star.datatransfer.clipboard.XClipboardListener
  */
@js.native
trait ClipboardEvent extends EventObject {
  /** The current content of the clipboard. */
  var Contents: XTransferable = js.native
}

object ClipboardEvent {
  @scala.inline
  def apply(Contents: XTransferable, Source: XInterface): ClipboardEvent = {
    val __obj = js.Dynamic.literal(Contents = Contents.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardEvent]
  }
  @scala.inline
  implicit class ClipboardEventOps[Self <: ClipboardEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContents(value: XTransferable): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Contents")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

