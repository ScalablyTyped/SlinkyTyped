package typingsSlinky.ethereumjsVm

import typingsSlinky.ethereumjsVm.evmMod.ExecResult
import typingsSlinky.ethereumjsVm.typesMod.PrecompileInput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/evm/precompiles/09-blake2f", JSImport.Namespace)
@js.native
object `09Blake2fMod` extends js.Object {
  
  def F(
    h: js.typedarray.Uint32Array,
    m: js.typedarray.Uint32Array,
    t: js.typedarray.Uint32Array,
    f: Boolean,
    rounds: Double
  ): Unit = js.native
  
  def default(opts: PrecompileInput): ExecResult = js.native
}
