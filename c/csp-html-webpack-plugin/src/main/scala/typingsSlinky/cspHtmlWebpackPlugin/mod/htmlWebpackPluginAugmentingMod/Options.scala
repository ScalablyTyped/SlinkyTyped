package typingsSlinky.cspHtmlWebpackPlugin.mod.htmlWebpackPluginAugmentingMod

import typingsSlinky.cspHtmlWebpackPlugin.AdditionalOptionspolicyPo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  var cspPlugin: js.UndefOr[AdditionalOptionspolicyPo] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCspPlugin(value: AdditionalOptionspolicyPo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspPlugin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCspPlugin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cspPlugin")(js.undefined)
        ret
    }
  }
  
}

