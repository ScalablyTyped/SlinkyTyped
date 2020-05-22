package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.clipboard

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to be implemented to receive notifications on clipboard content changes. */
trait XClipboardListener extends XEventListener {
  /**
    * The content of the clipboard has changed.
    * @param event The event object containing the new clipboard content.
    * @see com.sun.star.datatransfer.clipboard.ClipboardEvent
    */
  def changedContents(event: ClipboardEvent): Unit
}

object XClipboardListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    changedContents: ClipboardEvent => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XClipboardListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changedContents = js.Any.fromFunction1(changedContents), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XClipboardListener]
  }
}

