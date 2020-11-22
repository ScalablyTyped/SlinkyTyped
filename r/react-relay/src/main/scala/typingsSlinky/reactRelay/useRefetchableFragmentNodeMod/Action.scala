package typingsSlinky.reactRelay.useRefetchableFragmentNodeMod

import typingsSlinky.reactRelay.reactRelayStrings.refetch
import typingsSlinky.reactRelay.reactRelayStrings.reset
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.reactRelay.anon.Environment
  - typingsSlinky.reactRelay.anon.RefetchVariables
*/
trait Action extends js.Object
object Action {
  
  @scala.inline
  def Environment(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: reset
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  def RefetchVariables(refetchVariables: Variables, `type`: refetch): Action = {
    val __obj = js.Dynamic.literal(refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}
