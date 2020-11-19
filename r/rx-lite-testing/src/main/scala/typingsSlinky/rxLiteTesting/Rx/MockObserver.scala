package typingsSlinky.rxLiteTesting.Rx

import typingsSlinky.rxCore.Rx.Observer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MockObserver[T] extends Observer[T] {
  
  var messages: js.Array[Recorded] = js.native
}
object MockObserver {
  
  @scala.inline
  def apply[T](checked: () => Observer[_], messages: js.Array[Recorded]): MockObserver[T] = {
    val __obj = js.Dynamic.literal(checked = js.Any.fromFunction0(checked), messages = messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockObserver[T]]
  }
  
  @scala.inline
  implicit class MockObserverOps[Self <: MockObserver[_], T] (val x: Self with MockObserver[T]) extends AnyVal {
    
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
    def setMessagesVarargs(value: Recorded*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[Recorded]): Self = this.set("messages", value.asInstanceOf[js.Any])
  }
}
