package typingsSlinky.remarkable.libMod

import typingsSlinky.remarkable.remarkableBooleans.`false`
import typingsSlinky.remarkable.remarkableStrings.htmlblock
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typingsSlinky.remarkable.libMod._Token because Already inherited */ @js.native
trait HtmlBlockToken extends ContentToken {
  @JSName("block")
  var block_HtmlBlockToken: `false` = js.native
  @JSName("content")
  var content_HtmlBlockToken: String = js.native
  @JSName("type")
  var type_HtmlBlockToken: htmlblock = js.native
}

object HtmlBlockToken {
  @scala.inline
  def apply(block: `false`, content: String, level: Double, `type`: htmlblock): HtmlBlockToken = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlBlockToken]
  }
  @scala.inline
  implicit class HtmlBlockTokenOps[Self <: HtmlBlockToken] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlock(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("block")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContent(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: htmlblock): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

