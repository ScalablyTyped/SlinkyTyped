package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgSliderMethods extends StObject {
  
  def clearBookmarks(): Unit = js.native
  
  def destroy(): Unit = js.native
  
  def value(newValue: js.Object): Unit = js.native
  
  def widget(): Unit = js.native
}
object IgSliderMethods {
  
  @scala.inline
  def apply(clearBookmarks: () => Unit, destroy: () => Unit, value: js.Object => Unit, widget: () => Unit): IgSliderMethods = {
    val __obj = js.Dynamic.literal(clearBookmarks = js.Any.fromFunction0(clearBookmarks), destroy = js.Any.fromFunction0(destroy), value = js.Any.fromFunction1(value), widget = js.Any.fromFunction0(widget))
    __obj.asInstanceOf[IgSliderMethods]
  }
  
  @scala.inline
  implicit class IgSliderMethodsMutableBuilder[Self <: IgSliderMethods] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearBookmarks(value: () => Unit): Self = StObject.set(x, "clearBookmarks", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setValue(value: js.Object => Unit): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWidget(value: () => Unit): Self = StObject.set(x, "widget", js.Any.fromFunction0(value))
  }
}
