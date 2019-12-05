package typingsSlinky.avoscloudDashSdk.leanengineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leanengine", "Promise")
@js.native
class Promise[T] ()
  extends typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[T]

/* static members */
@JSImport("leanengine", "Promise")
@js.native
object Promise extends js.Object {
  def as[U](resolvedValue: U): typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[U] = js.native
  def error[U](error: U): typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[U] = js.native
  def is(possiblePromise: js.Any): Boolean = js.native
  def when(promises: js.Array[typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[_]]): typingsSlinky.avoscloudDashSdk.avoscloudDashSdkMod.Promise[_] = js.native
}

