package typingsSlinky.entriaRelayExperimental.useRefetchableFragmentNodeMod

import typingsSlinky.entriaRelayExperimental.queryResourceMod.RenderPolicy
import typingsSlinky.relayRuntime.relayStoreTypesMod.Environment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalOptions extends Options {
  var __environment: js.UndefOr[Environment] = js.native
  var renderPolicy: js.UndefOr[RenderPolicy] = js.native
}

object InternalOptions {
  @scala.inline
  def apply(): InternalOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalOptions]
  }
  @scala.inline
  implicit class InternalOptionsOps[Self <: InternalOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with__environment(value: Environment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__environment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without__environment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("__environment")(js.undefined)
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

