package typingsSlinky.jsforce.metadataMod

import typingsSlinky.jsforce.connectionMod.Callback
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.std.PromiseLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce/api/metadata", "AsyncResultLocator")
@js.native
class AsyncResultLocator[T] ()
  extends EventEmitter
     with PromiseLike[T] {
  
  def check(): js.Promise[T] = js.native
  def check(callback: Callback[T]): js.Promise[T] = js.native
  
  def complete(): js.Promise[T] = js.native
  def complete(callback: Callback[T]): js.Promise[T] = js.native
  
  def `finally`(): js.Promise[T] = js.native
  def `finally`(onfinally: js.Function0[Unit]): js.Promise[T] = js.native
  
  def poll(interval: Double, timeout: Double): Unit = js.native
}
