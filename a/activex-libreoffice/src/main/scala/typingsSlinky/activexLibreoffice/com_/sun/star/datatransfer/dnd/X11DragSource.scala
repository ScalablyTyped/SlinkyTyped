package typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.dnd

import typingsSlinky.activexLibreoffice.LibreOffice.SeqEquiv
import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.datatransfer.XTransferable
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XInitialization
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This service connects the Java-like UNO Drag and Drop protocol to the X Drag and Drop protocol used on X-Servers to transfer data between applications
  * via Drag and Drop operations.
  * @see XDragSource
  */
@js.native
trait X11DragSource
  extends XDragSource
     with XInitialization
     with XComponent
object X11DragSource {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    dispose: () => Unit,
    getDefaultCursor: Double => Double,
    initialize: SeqEquiv[_] => Unit,
    isDragImageSupported: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    startDrag: (DragGestureEvent, Double, Double, Double, XTransferable, XDragSourceListener) => Unit
  ): X11DragSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), dispose = js.Any.fromFunction0(dispose), getDefaultCursor = js.Any.fromFunction1(getDefaultCursor), initialize = js.Any.fromFunction1(initialize), isDragImageSupported = js.Any.fromFunction0(isDragImageSupported), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), startDrag = js.Any.fromFunction6(startDrag))
    __obj.asInstanceOf[X11DragSource]
  }
}
