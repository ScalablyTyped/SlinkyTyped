package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassGroups extends StObject {
  
  def Clone(): IClassGroups = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IClassGroup = js.native
}
object IClassGroups {
  
  @scala.inline
  def apply(Clone: () => IClassGroups, Count: Double, Item: Double => IClassGroup): IClassGroups = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IClassGroups]
  }
  
  @scala.inline
  implicit class IClassGroupsMutableBuilder[Self <: IClassGroups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IClassGroups): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IClassGroup): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
