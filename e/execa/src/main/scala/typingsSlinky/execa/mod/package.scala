package typingsSlinky.execa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExecaChildProcess[StdoutErrorType] = typingsSlinky.node.childProcessMod.ChildProcess with typingsSlinky.execa.mod.ExecaChildPromise[StdoutErrorType] with js.Promise[typingsSlinky.execa.mod.ExecaReturnValue[StdoutErrorType]]
  type ExecaSyncReturnValue[StdoutErrorType] = typingsSlinky.execa.mod.ExecaReturnBase[StdoutErrorType]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.execa.execaStrings.pipe
    - typingsSlinky.execa.execaStrings.ipc
    - typingsSlinky.execa.execaStrings.ignore
    - typingsSlinky.execa.execaStrings.inherit
    - typingsSlinky.node.streamMod.Stream
    - scala.Double
    - `js.undefined`
  */
  type StdioOption = js.UndefOr[
    typingsSlinky.execa.mod._StdioOption | typingsSlinky.node.streamMod.Stream | scala.Double
  ]
}
