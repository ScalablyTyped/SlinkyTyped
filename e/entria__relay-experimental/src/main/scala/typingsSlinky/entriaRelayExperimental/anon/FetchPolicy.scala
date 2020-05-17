package typingsSlinky.entriaRelayExperimental.anon

import typingsSlinky.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod.Action
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchPolicy extends Action {
  var environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment = js.native
  var fetchPolicy: js.UndefOr[typingsSlinky.entriaRelayExperimental.queryResourceMod.FetchPolicy] = js.native
  var onComplete: js.UndefOr[js.Function1[/* args */ js.Error | Null, Unit]] = js.native
  var refetchVariables: Variables = js.native
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
  var `type`: String = js.native
}

object FetchPolicy {
  @scala.inline
  def apply(
    environment: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment,
    refetchVariables: Variables,
    `type`: String
  ): FetchPolicy = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], refetchVariables = refetchVariables.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchPolicy]
  }
  @scala.inline
  implicit class FetchPolicyOps[Self <: FetchPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnvironment(value: typingsSlinky.relayRuntime.relayStoreTypesMod.Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefetchVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchPolicy(value: typingsSlinky.entriaRelayExperimental.queryResourceMod.FetchPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFetchPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetchPolicy")(js.undefined)
        ret
    }
    @scala.inline
    def withOnComplete(value: /* args */ js.Error | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnComplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onComplete")(js.undefined)
        ret
    }
    @scala.inline
    def withRenderPolicy(value: RenderPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPolicy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRenderPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("renderPolicy")(js.undefined)
        ret
    }
  }
  
}

