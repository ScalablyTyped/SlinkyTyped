package typingsSlinky.mapboxGl.mod

import org.scalajs.dom.raw.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IControl extends StObject {
  
  var getDefaultPosition: js.UndefOr[js.Function0[String]] = js.native
  
  def onAdd(map: Map): HTMLElement = js.native
  
  def onRemove(map: Map): Unit = js.native
}
object IControl {
  
  @scala.inline
  def apply(onAdd: Map => HTMLElement, onRemove: Map => Unit): IControl = {
    val __obj = js.Dynamic.literal(onAdd = js.Any.fromFunction1(onAdd), onRemove = js.Any.fromFunction1(onRemove))
    __obj.asInstanceOf[IControl]
  }
  
  @scala.inline
  implicit class IControlMutableBuilder[Self <: IControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDefaultPosition(value: () => String): Self = StObject.set(x, "getDefaultPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetDefaultPositionUndefined: Self = StObject.set(x, "getDefaultPosition", js.undefined)
    
    @scala.inline
    def setOnAdd(value: Map => HTMLElement): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnRemove(value: Map => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
  }
}
