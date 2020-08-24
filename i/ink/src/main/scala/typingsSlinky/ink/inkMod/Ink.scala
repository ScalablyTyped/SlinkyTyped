package typingsSlinky.ink.inkMod

import slinky.core.facade.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ink extends js.Object {
  val container: js.Any = js.native
  var exitPromise: js.Any = js.native
  var fullStaticOutput: js.Any = js.native
  var isUnmounted: js.Any = js.native
  var lastOutput: js.Any = js.native
  val log: js.Any = js.native
  val options: js.Any = js.native
  var restoreConsole: js.Any = js.native
  val rootNode: js.Any = js.native
  val throttledLog: js.Any = js.native
  val unsubscribeResize: js.Any = js.native
  def clear(): Unit = js.native
  def onRender(): Unit = js.native
  def patchConsole(): Unit = js.native
  def rejectExitPromise(): Unit = js.native
  def rejectExitPromise(reason: js.Error): Unit = js.native
  def render(node: ReactElement): Unit = js.native
  def resolveExitPromise(): Unit = js.native
  def unmount(): Unit = js.native
  def unmount(error: Double): Unit = js.native
  def unmount(error: js.Error): Unit = js.native
  def unsubscribeExit(): Unit = js.native
  def waitUntilExit(): js.Promise[Unit] = js.native
  def writeToStderr(data: String): Unit = js.native
  def writeToStdout(data: String): Unit = js.native
}

