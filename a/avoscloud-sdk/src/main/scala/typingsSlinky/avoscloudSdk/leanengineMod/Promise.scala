package typingsSlinky.avoscloudSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Promise")
@js.native
class Promise[T] ()
  extends typingsSlinky.avoscloudSdk.mod.Promise[T]

/* static members */
@JSImport("leanengine", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): typingsSlinky.avoscloudSdk.mod.Promise[U] = js.native
  def error[U](error: U): typingsSlinky.avoscloudSdk.mod.Promise[U] = js.native
  def is(possiblePromise: js.Any): Boolean = js.native
  def when(promises: js.Array[typingsSlinky.avoscloudSdk.mod.Promise[_]]): typingsSlinky.avoscloudSdk.mod.Promise[_] = js.native
}

