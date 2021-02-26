package typingsSlinky.ethereumjsVm

import typingsSlinky.ethereumjsVm.stateManagerMod.StateManagerOpts
import typingsSlinky.ethereumjsVm.stateManagerMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateMod {
  
  @JSImport("ethereumjs-vm/dist/state", "StateManager")
  @js.native
  /**
    * Instantiate the StateManager interface.
    */
  class StateManager () extends default {
    def this(opts: StateManagerOpts) = this()
  }
}
