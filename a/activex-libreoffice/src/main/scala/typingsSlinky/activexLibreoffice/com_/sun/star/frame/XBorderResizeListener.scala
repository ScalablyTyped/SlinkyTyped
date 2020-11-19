package typingsSlinky.activexLibreoffice.com_.sun.star.frame

import typingsSlinky.activexLibreoffice.`type`
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsSlinky.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to listen to border resize events of a controller. */
@js.native
trait XBorderResizeListener extends XEventListener {
  
  /**
    * notifies the listener that the controller's border widths have been changed.
    * @param Object reference to the object representing the controller
    * @param NewSize the new widths of the controller's border
    */
  def borderWidthsChanged(Object: XInterface, NewSize: BorderWidths): Unit = js.native
}
object XBorderResizeListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    borderWidthsChanged: (XInterface, BorderWidths) => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XBorderResizeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), borderWidthsChanged = js.Any.fromFunction2(borderWidthsChanged), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XBorderResizeListener]
  }
  
  @scala.inline
  implicit class XBorderResizeListenerOps[Self <: XBorderResizeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBorderWidthsChanged(value: (XInterface, BorderWidths) => Unit): Self = this.set("borderWidthsChanged", js.Any.fromFunction2(value))
  }
}
