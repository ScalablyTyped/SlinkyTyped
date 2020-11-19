package typingsSlinky.promiseWorker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("promise-worker/register", JSImport.Namespace)
@js.native
object registerMod extends js.Object {
  
  def default[TMessageIn, TMessageOut](callback: js.Function1[/* message */ TMessageIn, js.Promise[TMessageOut] | TMessageOut]): Unit = js.native
}
