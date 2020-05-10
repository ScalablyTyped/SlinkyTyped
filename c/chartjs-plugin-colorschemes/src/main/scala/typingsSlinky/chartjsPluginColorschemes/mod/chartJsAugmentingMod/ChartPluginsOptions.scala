package typingsSlinky.chartjsPluginColorschemes.mod.chartJsAugmentingMod

import typingsSlinky.chartjsPluginColorschemes.mod.ColorSchemesOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChartPluginsOptions extends js.Object {
  var colorschemes: js.UndefOr[ColorSchemesOptions] = js.native
}

object ChartPluginsOptions {
  @scala.inline
  def apply(): ChartPluginsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartPluginsOptions]
  }
  @scala.inline
  implicit class ChartPluginsOptionsOps[Self <: ChartPluginsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColorschemes(value: ColorSchemesOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorschemes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutColorschemes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colorschemes")(js.undefined)
        ret
    }
  }
  
}

