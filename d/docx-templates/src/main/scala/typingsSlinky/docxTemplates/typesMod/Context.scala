package typingsSlinky.docxTemplates.typesMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.docxTemplates.anon.Wp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  var buffers: Wp = js.native
  var cmd: String = js.native
  var fCmd: Boolean = js.native
  var fJump: Boolean = js.native
  var fSeekQuery: Boolean = js.native
  var htmlId: Double = js.native
  var htmls: Htmls = js.native
  var imageId: Double = js.native
  var images: Images = js.native
  var jsSandbox: js.UndefOr[js.Object] = js.native
  var level: Double = js.native
  var linkId: Double = js.native
  var links: Links = js.native
  var loops: js.Array[LoopStatus] = js.native
  var options: CreateReportOptions = js.native
  var pendingHtmlNode: js.UndefOr[TextNode | NonTextNode] = js.native
  var pendingImageNode: js.UndefOr[NonTextNode] = js.native
  var pendingLinkNode: js.UndefOr[NonTextNode] = js.native
  var query: js.UndefOr[Query] = js.native
  var shorthands: StringDictionary[String] = js.native
  var textRunPropsNode: js.UndefOr[NonTextNode] = js.native
  var vars: StringDictionary[VarValue] = js.native
}

object Context {
  @scala.inline
  def apply(
    buffers: Wp,
    cmd: String,
    fCmd: Boolean,
    fJump: Boolean,
    fSeekQuery: Boolean,
    htmlId: Double,
    htmls: Htmls,
    imageId: Double,
    images: Images,
    level: Double,
    linkId: Double,
    links: Links,
    loops: js.Array[LoopStatus],
    options: CreateReportOptions,
    shorthands: StringDictionary[String],
    vars: StringDictionary[VarValue]
  ): Context = {
    val __obj = js.Dynamic.literal(buffers = buffers.asInstanceOf[js.Any], cmd = cmd.asInstanceOf[js.Any], fCmd = fCmd.asInstanceOf[js.Any], fJump = fJump.asInstanceOf[js.Any], fSeekQuery = fSeekQuery.asInstanceOf[js.Any], htmlId = htmlId.asInstanceOf[js.Any], htmls = htmls.asInstanceOf[js.Any], imageId = imageId.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], linkId = linkId.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], loops = loops.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], shorthands = shorthands.asInstanceOf[js.Any], vars = vars.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
  @scala.inline
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuffers(value: Wp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buffers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCmd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFCmd(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fCmd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFJump(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fJump")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFSeekQuery(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fSeekQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmlId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmlId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHtmls(value: Htmls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImageId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: Images): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinkId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: Links): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoops(value: js.Array[LoopStatus]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loops")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOptions(value: CreateReportOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShorthands(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shorthands")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVars(value: StringDictionary[VarValue]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vars")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withJsSandbox(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsSandbox")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutJsSandbox: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("jsSandbox")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingHtmlNode(value: TextNode | NonTextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingHtmlNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingHtmlNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingHtmlNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingImageNode(value: NonTextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingImageNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingImageNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingImageNode")(js.undefined)
        ret
    }
    @scala.inline
    def withPendingLinkNode(value: NonTextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingLinkNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPendingLinkNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pendingLinkNode")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withTextRunPropsNode(value: NonTextNode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRunPropsNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextRunPropsNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textRunPropsNode")(js.undefined)
        ret
    }
  }
  
}

