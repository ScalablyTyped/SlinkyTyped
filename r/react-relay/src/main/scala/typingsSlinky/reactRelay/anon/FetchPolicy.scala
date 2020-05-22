package typingsSlinky.reactRelay.anon

import typingsSlinky.reactRelay.queryResourceMod.RenderPolicy
import typingsSlinky.reactRelay.useRefetchableFragmentNodeMod.Action
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchPolicy extends Action {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
  var fetchPolicy: js.UndefOr[typingsSlinky.reactRelay.queryResourceMod.FetchPolicy] = js.undefined
  var onComplete: js.UndefOr[js.Function1[/* args */ js.Error | Null, Unit]] = js.undefined
  var refetchVariables: Variables
  var renderPolicy: js.UndefOr[RenderPolicy] = js.undefined
  var `type`: String
}

object FetchPolicy {
  @scala.inline
  def apply(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    refetchVariables: Variables,
    `type`: String,
    fetchPolicy: typingsSlinky.reactRelay.queryResourceMod.FetchPolicy = null,
    onComplete: /* args */ js.Error | Null => Unit = null,
    renderPolicy: RenderPolicy = null
  ): FetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (fetchPolicy != null) __obj.updateDynamic("fetchPolicy")(fetchPolicy.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (renderPolicy != null) __obj.updateDynamic("renderPolicy")(renderPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPolicy]
  }
}

