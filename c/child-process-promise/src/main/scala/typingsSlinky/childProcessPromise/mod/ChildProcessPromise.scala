package typingsSlinky.childProcessPromise.mod

import typingsSlinky.node.childProcessMod.ChildProcess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildProcessPromise[T]
  extends js.Promise[T] {
  
  var childProcess: ChildProcess = js.native
}
