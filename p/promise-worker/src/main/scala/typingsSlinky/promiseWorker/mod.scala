package typingsSlinky.promiseWorker

import org.scalajs.dom.raw.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("promise-worker", JSImport.Default)
  @js.native
  class default protected () extends PromiseWorker {
    /**
      * Pass in the worker instance to promisify
      *
      * @param worker The worker instance to wrap
      */
    def this(worker: Worker) = this()
  }
  
  @js.native
  trait PromiseWorker extends StObject {
    
    /**
      * Send a message to the worker
      *
      * The message you send can be any object, array, string, number, etc.
      * Note that the message will be `JSON.stringify`d, so you can't send functions, `Date`s, custom classes, etc.
      *
      * @param userMessage Data or message to send to the worker
      * @returns Promise resolved with the processed result or rejected with an error
      */
    def postMessage[TResult, TInput](userMessage: TInput): js.Promise[TResult] = js.native
  }
  object PromiseWorker {
    
    @scala.inline
    def apply(postMessage: js.Any => js.Promise[js.Any]): PromiseWorker = {
      val __obj = js.Dynamic.literal(postMessage = js.Any.fromFunction1(postMessage))
      __obj.asInstanceOf[PromiseWorker]
    }
    
    @scala.inline
    implicit class PromiseWorkerMutableBuilder[Self <: PromiseWorker] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPostMessage(value: js.Any => js.Promise[js.Any]): Self = StObject.set(x, "postMessage", js.Any.fromFunction1(value))
    }
  }
}
