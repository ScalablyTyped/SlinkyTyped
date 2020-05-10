package typingsSlinky.docxTemplates

import typingsSlinky.docxTemplates.docxTemplatesStrings.success
import typingsSlinky.docxTemplates.processTemplateMod.ReportOutput
import typingsSlinky.docxTemplates.typesMod.Htmls
import typingsSlinky.docxTemplates.typesMod.Images
import typingsSlinky.docxTemplates.typesMod.Links
import typingsSlinky.docxTemplates.typesMod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHtmls extends ReportOutput {
  var htmls: Htmls = js.native
  var images: Images = js.native
  var links: Links = js.native
  var report: Node = js.native
  var status: success = js.native
}

object AnonHtmls {
  @scala.inline
  def apply(htmls: Htmls, images: Images, links: Links, report: Node, status: success): AnonHtmls = {
    val __obj = js.Dynamic.literal(htmls = htmls.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], report = report.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHtmls]
  }
  @scala.inline
  implicit class AnonHtmlsOps[Self <: AnonHtmls] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtmls(value: Htmls): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("htmls")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImages(value: Images): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("images")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLinks(value: Links): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReport(value: Node): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("report")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: success): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

