package typingsSlinky.asap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rawMod {
  
  /**
    * Executes a task as soon as possible.
    * @param task Function or any object that implements `call()`.
    */
  @JSImport("asap/raw", JSImport.Namespace)
  @js.native
  def apply(task: Task): Unit = js.native
  
  /**
    * Flushes the event queue.
    */
  @JSImport("asap/raw", "requestFlush")
  @js.native
  def requestFlush(): Unit = js.native
  
  @js.native
  trait Task extends StObject {
    
    def call(args: js.Any*): js.Any = js.native
  }
  object Task {
    
    @scala.inline
    def apply(call: /* repeated */ js.Any => js.Any): Task = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction1(call))
      __obj.asInstanceOf[Task]
    }
    
    @scala.inline
    implicit class TaskMutableBuilder[Self <: Task] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(value: /* repeated */ js.Any => js.Any): Self = StObject.set(x, "call", js.Any.fromFunction1(value))
    }
  }
}
