package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStates extends StObject {
  
  val Count: Double = js.native
  
  def Item(Index: Double): IState = js.native
}
object IStates {
  
  @scala.inline
  def apply(Count: Double, Item: Double => IState): IStates = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item))
    __obj.asInstanceOf[IStates]
  }
  
  @scala.inline
  implicit class IStatesMutableBuilder[Self <: IStates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IState): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
  }
}
