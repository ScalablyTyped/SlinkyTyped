package typingsSlinky.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IStateTransitions extends StObject {
  
  def Add(Index: Double, StateTransition: IStateTransition): Unit = js.native
  
  val Count: Double = js.native
  
  def Item(Index: Double): IStateTransition = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IStateTransitions {
  
  @scala.inline
  def apply(
    Add: (Double, IStateTransition) => Unit,
    Count: Double,
    Item: Double => IStateTransition,
    Remove: Double => Unit
  ): IStateTransitions = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Count = Count.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IStateTransitions]
  }
  
  @scala.inline
  implicit class IStateTransitionsMutableBuilder[Self <: IStateTransitions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: (Double, IStateTransition) => Unit): Self = StObject.set(x, "Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => IStateTransition): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
  }
}
