package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IViews extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IView = js.native
}
object IViews {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IView): IViews = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IViews]
  }
  
  @scala.inline
  implicit class IViewsMutableBuilder[Self <: IViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IView): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
