package typingsSlinky.promiseWorker.mod

import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
