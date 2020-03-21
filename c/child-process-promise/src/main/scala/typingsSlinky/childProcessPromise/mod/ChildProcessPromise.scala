package typingsSlinky.childProcessPromise.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import typingsSlinky.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildProcessPromise[T] extends Promise[T] {
  var childProcess: ChildProcess = js.native
}

