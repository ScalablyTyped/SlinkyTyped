package typingsSlinky.reactRelay.useRefetchableFragmentNodeMod

import typingsSlinky.reactRelay.queryResourceMod.FetchPolicy
import typingsSlinky.reactRelay.queryResourceMod.RenderPolicy
import typingsSlinky.relayRuntime.relayRuntimeTypesMod.Variables
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefetchState extends js.Object {
  var fetchPolicy: js.UndefOr[FetchPolicy] = js.native
  var mirroredEnvironment: Environment = js.native
  var mirroredFragmentIdentifier: String = js.native
  var onComplete: js.UndefOr[js.Function1[/* arg */ js.Error | Null, Unit]] = js.native
  var refetchEnvironment: js.UndefOr[Environment | Null] = js.native
  var refetchVariables: js.UndefOr[Variables | Null] = js.native
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
}

object RefetchState {
  @scala.inline
  def apply(mirroredEnvironment: Environment, mirroredFragmentIdentifier: String): RefetchState = {
    val __obj = js.Dynamic.literal(mirroredEnvironment = mirroredEnvironment.asInstanceOf[js.Any], mirroredFragmentIdentifier = mirroredFragmentIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefetchState]
  }
  @scala.inline
  implicit class RefetchStateOps[Self <: RefetchState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMirroredEnvironment(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroredEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMirroredFragmentIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mirroredFragmentIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFetchPolicy(value: FetchPolicy): Self = {
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
    def withOnComplete(value: /* arg */ js.Error | Null => Unit): Self = {
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
    def withRefetchEnvironment(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchEnvironment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchEnvironment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchEnvironment")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchEnvironmentNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchEnvironment")(null)
        ret
    }
    @scala.inline
    def withRefetchVariables(value: Variables): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchVariables")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefetchVariables: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchVariables")(js.undefined)
        ret
    }
    @scala.inline
    def withRefetchVariablesNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refetchVariables")(null)
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

