package typingsSlinky.htmlWebpackPlugin.anon

import typingsSlinky.htmlWebpackPlugin.mod.HtmlTagObject
import typingsSlinky.htmlWebpackPlugin.mod.HtmlWebpackPlugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Body extends js.Object {
  var body: js.Array[HtmlTagObject] = js.native
  var head: js.Array[HtmlTagObject] = js.native
  var outputName: String = js.native
  var plugin: HtmlWebpackPlugin = js.native
}

object Body {
  @scala.inline
  def apply(
    body: js.Array[HtmlTagObject],
    head: js.Array[HtmlTagObject],
    outputName: String,
    plugin: HtmlWebpackPlugin
  ): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], outputName = outputName.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  @scala.inline
  implicit class BodyOps[Self <: Body] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBody(value: js.Array[HtmlTagObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("body")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHead(value: js.Array[HtmlTagObject]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("head")(value.asInstanceOf[js.Any])
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

