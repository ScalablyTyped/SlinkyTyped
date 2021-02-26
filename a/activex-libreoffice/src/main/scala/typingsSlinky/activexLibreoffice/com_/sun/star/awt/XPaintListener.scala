package typingsSlinky.activexLibreoffice.com_.sun.star.awt

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to receive paint events. */
@js.native
trait XPaintListener extends XEventListener {
  
  /** is invoked when a region of the window became invalid, e.g. when another window has been moved away. */
  def windowPaint(e: PaintEvent): Unit = js.native
}
object XPaintListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    windowPaint: PaintEvent => Unit
  ): XPaintListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), windowPaint = js.Any.fromFunction1(windowPaint))
    __obj.asInstanceOf[XPaintListener]
  }
  
  @scala.inline
  implicit class XPaintListenerMutableBuilder[Self <: XPaintListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWindowPaint(value: PaintEvent => Unit): Self = StObject.set(x, "windowPaint", js.Any.fromFunction1(value))
  }
}
