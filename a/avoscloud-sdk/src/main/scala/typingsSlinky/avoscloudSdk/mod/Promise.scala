package typingsSlinky.avoscloudSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("avoscloud-sdk", "Promise")
@js.native
class Promise[T] () extends js.Object {
  
  def always(callback: js.Function): Promise[T] = js.native
  
  def done(callback: js.Function): Promise[T] = js.native
  
  def fail(callback: js.Function): Promise[T] = js.native
  
  def reject(error: js.Any): Unit = js.native
  
  def resolve(result: js.Any): Unit = js.native
  
  def `then`[U](resolvedCallback: js.Function1[/* value */ T, Promise[U] | U]): IPromise[T] = js.native
  def `then`[U](
    resolvedCallback: js.Function1[/* value */ T, Promise[U] | U],
    rejectedCallback: js.Function1[/* reason */ js.Any, IPromise[U] | Promise[U] | U]
  ): IPromise[T] = js.native
}
/* static members */
@JSImport("avoscloud-sdk", "Promise")
@js.native
object Promise extends js.Object {
  
  def as[U](resolvedValue: U): Promise[U] = js.native
  
  def error[U](error: U): Promise[U] = js.native
  
  def is(possiblePromise: js.Any): Boolean = js.native
  
  def when(promises: js.Array[Promise[_]]): Promise[_] = js.native
}
