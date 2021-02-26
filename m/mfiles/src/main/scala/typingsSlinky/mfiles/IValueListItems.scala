package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IValueListItems extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IValueListItem = js.native
}
object IValueListItems {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IValueListItem): IValueListItems = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IValueListItems]
  }
  
  @scala.inline
  implicit class IValueListItemsMutableBuilder[Self <: IValueListItems] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IValueListItem): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
