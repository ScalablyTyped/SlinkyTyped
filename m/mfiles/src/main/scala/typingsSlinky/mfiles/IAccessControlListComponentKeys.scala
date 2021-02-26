package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccessControlListComponentKeys extends StObject {
  
  def Clone(): IAccessControlListComponentKeys = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IAccessControlListComponentKey = js.native
}
object IAccessControlListComponentKeys {
  
  @scala.inline
  def apply(
    Clone: () => IAccessControlListComponentKeys,
    Count: Double,
    Item: Double => IAccessControlListComponentKey
  ): IAccessControlListComponentKeys = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IAccessControlListComponentKeys]
  }
  
  @scala.inline
  implicit class IAccessControlListComponentKeysMutableBuilder[Self <: IAccessControlListComponentKeys] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IAccessControlListComponentKeys): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IAccessControlListComponentKey): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
