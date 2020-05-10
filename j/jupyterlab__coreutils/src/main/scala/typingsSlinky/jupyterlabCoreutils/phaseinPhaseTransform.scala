package typingsSlinky.jupyterlabCoreutils

import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin
import typingsSlinky.jupyterlabCoreutils.tokensMod.ISettingRegistry.IPlugin.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ phase in @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Phase ]:? @jupyterlab/coreutils.@jupyterlab/coreutils/lib/tokens.ISettingRegistry.IPlugin.Transform} */
@js.native
trait phaseinPhaseTransform extends js.Object {
  var compose: js.UndefOr[Transform] = js.native
  var fetch: js.UndefOr[Transform] = js.native
}

object phaseinPhaseTransform {
  @scala.inline
  def apply(): phaseinPhaseTransform = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[phaseinPhaseTransform]
  }
  @scala.inline
  implicit class phaseinPhaseTransformOps[Self <: phaseinPhaseTransform] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompose(value: /* plugin */ IPlugin => IPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCompose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compose")(js.undefined)
        ret
    }
    @scala.inline
    def withFetch(value: /* plugin */ IPlugin => IPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFetch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.undefined)
        ret
    }
  }
  
}

