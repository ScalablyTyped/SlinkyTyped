package typingsSlinky.htmlWebpackPlugin

import typingsSlinky.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAssets extends js.Object {
  var assets: AnonCss = js.native
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object AnonAssets {
  @scala.inline
  def apply(assets: AnonCss, outputName: String, plugin: HtmlWebpackPlugin): AnonAssets = {
    val __obj = js.Dynamic.literal(assets = assets.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAssets]
  }
  @scala.inline
  implicit class AnonAssetsOps[Self <: AnonAssets] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssets(value: AnonCss): Self = {
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

