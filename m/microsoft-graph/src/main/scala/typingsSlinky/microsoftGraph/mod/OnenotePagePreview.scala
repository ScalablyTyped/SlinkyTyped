package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePagePreview extends js.Object {
  var links: js.UndefOr[OnenotePagePreviewLinks] = js.native
  var previewText: js.UndefOr[String] = js.native
}

object OnenotePagePreview {
  @scala.inline
  def apply(): OnenotePagePreview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreview]
  }
  @scala.inline
  implicit class OnenotePagePreviewOps[Self <: OnenotePagePreview] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLinks(value: OnenotePagePreviewLinks): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("links")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviewText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewText")(js.undefined)
        ret
    }
  }
  
}

