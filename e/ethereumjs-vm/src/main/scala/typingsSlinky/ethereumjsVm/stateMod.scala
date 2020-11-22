package typingsSlinky.ethereumjsVm

import typingsSlinky.ethereumjsVm.stateManagerMod.StateManagerOpts
import typingsSlinky.ethereumjsVm.stateManagerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-vm/dist/state", JSImport.Namespace)
@js.native
object stateMod extends js.Object {
  
  @js.native
  /**
    * Instantiate the StateManager interface.
    */
  class StateManager () extends default {
    def this(opts: StateManagerOpts) = this()
  }
}
