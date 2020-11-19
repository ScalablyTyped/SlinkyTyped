package typingsSlinky.anyPromise.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Promise[R] extends Thenable[R] {
  
  /**
    * Sugar for promise.then(undefined, onRejected)
    *
    * @param onRejected called when/if "promise" rejects
    */
  def `catch`[U](): Promise[U] = js.native
  def `catch`[U](onRejected: js.Function1[/* error */ js.Any, U | Thenable[U]]): Promise[U] = js.native
}
