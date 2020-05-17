package typingsSlinky.htmlWebpackPlugin.anon

import typingsSlinky.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputName extends js.Object {
  var html: String = js.native
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object OutputName {
  @scala.inline
  def apply(html: String, outputName: String, plugin: HtmlWebpackPlugin): OutputName = {
    val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputName]
  }
  @scala.inline
  implicit class OutputNameOps[Self <: OutputName] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
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

