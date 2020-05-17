package typingsSlinky.htmlWebpackPlugin.anon

import typingsSlinky.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assets extends js.Object {
  var assets: Css = js.native
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object Assets {
  @scala.inline
  def apply(assets: Css, outputName: String, plugin: HtmlWebpackPlugin): Assets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assets]
  }
  @scala.inline
  implicit class AssetsOps[Self <: Assets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: Css): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOutputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlugin(value: HtmlWebpackPlugin): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("plugin")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

