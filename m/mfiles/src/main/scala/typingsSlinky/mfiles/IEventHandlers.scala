package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IEventHandlers extends js.Object {
  
  def Add(Index: Double, EventHandler: IEventHandler): Unit = js.native
  
  def Clone(): IEventHandlers = js.native
  
  val Count: Double = js.native
  
  def GetIndexByGUID(EventHandlerGUID: String): Double = js.native
  
  def Item(Index: Double): IEventHandler = js.native
  
  def Remove(Index: Double): Unit = js.native
}
object IEventHandlers {
  
  @scala.inline
  def apply(
    Add: (Double, IEventHandler) => Unit,
    Clone: () => IEventHandlers,
    Count: Double,
    GetIndexByGUID: String => Double,
    Item: Double => IEventHandler,
    Remove: Double => Unit
  ): IEventHandlers = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), Clone = js.Any.fromFunction0(Clone), Count = Count.asInstanceOf[js.Any], GetIndexByGUID = js.Any.fromFunction1(GetIndexByGUID), Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IEventHandlers]
  }
  
  @scala.inline
  implicit class IEventHandlersOps[Self <: IEventHandlers] (val x: Self) extends AnyVal {
    
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
    def setAdd(value: (Double, IEventHandler) => Unit): Self = this.set("Add", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClone(value: () => IEventHandlers): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetIndexByGUID(value: String => Double): Self = this.set("GetIndexByGUID", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => IEventHandler): Self = this.set("Item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
  }
}
