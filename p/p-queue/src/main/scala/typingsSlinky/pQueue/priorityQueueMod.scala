package typingsSlinky.pQueue

import typingsSlinky.pQueue.anon.PartialPriorityQueueOptio
import typingsSlinky.pQueue.anon.ReadonlyPartialPriorityQu
import typingsSlinky.pQueue.optionsMod.QueueAddOptions
import typingsSlinky.pQueue.queueMod.Queue
import typingsSlinky.pQueue.queueMod.RunFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object priorityQueueMod {
  
  @JSImport("p-queue/dist/priority-queue", JSImport.Default)
  @js.native
  class default () extends PriorityQueue
  
  @js.native
  trait PriorityQueue extends Queue[RunFunction, PriorityQueueOptions] {
    
    val _queue: js.Any = js.native
    
    def enqueue(run: RunFunction, options: PartialPriorityQueueOptio): Unit = js.native
    
    def filter(options: ReadonlyPartialPriorityQu): js.Array[RunFunction] = js.native
    
    @JSName("size")
    def size_MPriorityQueue: Double = js.native
  }
  
  @js.native
  trait PriorityQueueOptions extends QueueAddOptions {
    
    var priority: js.UndefOr[Double] = js.native
  }
  object PriorityQueueOptions {
    
    @scala.inline
    def apply(): PriorityQueueOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriorityQueueOptions]
    }
    
    @scala.inline
    implicit class PriorityQueueOptionsMutableBuilder[Self <: PriorityQueueOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
}
