package typingsSlinky.entriaRelayExperimental

import typingsSlinky.entriaRelayExperimental.queryResourceMod.FetchPolicy
import typingsSlinky.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.Action
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFetchPolicy extends Action {
  var environment: Environment
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ js.Error | Null, Unit]] = js.undefined
  var refetchVariables: Variables
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: String
}

object AnonFetchPolicy {
  @scala.inline
  def apply(
    environment: Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: FetchPolicy = null,
    onComplete: /* args */ js.Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): AnonFetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFetchPolicy]
  }
}

