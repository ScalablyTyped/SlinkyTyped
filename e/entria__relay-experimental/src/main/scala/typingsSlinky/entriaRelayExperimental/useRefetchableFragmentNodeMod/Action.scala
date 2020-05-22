package typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod

import typingsSlinky.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.entriaRelayExperimental.anon.Environment
  - typingsSlinky.entriaRelayExperimental.anon.FetchPolicy
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def Environment(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    fragmentIdentifier: String,
    `type`: String
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], fragmentIdentifier = fragmentIdentifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def FetchPolicy(
    environment: Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: typingsSlinky.entriaRelayExperimental.queryResourceMod.FetchPolicy = null,
    onComplete: /* args */ js.Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): Action = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

