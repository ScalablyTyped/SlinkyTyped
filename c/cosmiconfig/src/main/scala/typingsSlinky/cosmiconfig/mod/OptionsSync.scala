package typingsSlinky.cosmiconfig.mod

import typingsSlinky.cosmiconfig.typesMod.CosmiconfigResult
import typingsSlinky.cosmiconfig.typesMod.LoadersSync
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsSync extends OptionsBase {
  var loaders: js.UndefOr[LoadersSync] = js.native
  var transform: js.UndefOr[TransformSync] = js.native
}

object OptionsSync {
  @scala.inline
  def apply(): OptionsSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsSync]
  }
  @scala.inline
  implicit class OptionsSyncOps[Self <: OptionsSync] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLoaders(value: LoadersSync): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaders")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: /* CosmiconfigResult */ CosmiconfigResult => CosmiconfigResult): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
  }
  
}

