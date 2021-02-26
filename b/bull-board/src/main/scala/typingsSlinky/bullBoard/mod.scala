package typingsSlinky.bullBoard

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.bull.mod.Queue
import typingsSlinky.bull.mod.QueueOptions
import typingsSlinky.express.mod.Express
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("bull-board", JSImport.Namespace)
  @js.native
  val ^ : Options = js.native
  
  @js.native
  trait CreateQueue extends StObject {
    
    def add(name: String, opts: QueueOptions): Queue[_] = js.native
  }
  object CreateQueue {
    
    @scala.inline
    def apply(add: (String, QueueOptions) => Queue[_]): CreateQueue = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add))
      __obj.asInstanceOf[CreateQueue]
    }
    
    @scala.inline
    implicit class CreateQueueMutableBuilder[Self <: CreateQueue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, QueueOptions) => Queue[_]): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    def UI(): Express = js.native
    
    def createQueues(redisURL: String): CreateQueue = js.native
    
    def setQueues(bullQueues: js.Array[Queue[_]]): Queue[_] = js.native
    def setQueues(bullQueues: Queue[_]): Queue[_] = js.native
  }
  
  type _To = Options
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Options = ^
}
