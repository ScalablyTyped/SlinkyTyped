package typingsSlinky.ethereumjsVm.runCodeMod

import typingsSlinky.ethereumjsVm.evmMod.ExecResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/runCode", JSImport.Default)
@js.native
object default extends js.Object {
  
  def apply(opts: RunCodeOpts): js.Promise[ExecResult] = js.native
}
