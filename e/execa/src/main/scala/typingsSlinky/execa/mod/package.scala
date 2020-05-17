package typingsSlinky.execa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecaChildProcess[StdoutErrorType] = typingsSlinky.node.childProcessMod.ChildProcess with typingsSlinky.execa.mod.ExecaChildPromise[StdoutErrorType] with js.Promise[typingsSlinky.execa.mod.ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = typingsSlinky.execa.mod.ExecaReturnBase[StdoutErrorType]
}
