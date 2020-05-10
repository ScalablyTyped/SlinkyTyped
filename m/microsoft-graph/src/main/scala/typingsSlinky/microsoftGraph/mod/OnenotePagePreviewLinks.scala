package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePagePreviewLinks extends js.Object {
  var previewImageUrl: js.UndefOr[ExternalLink] = js.native
}

object OnenotePagePreviewLinks {
  @scala.inline
  def apply(): OnenotePagePreviewLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePagePreviewLinks]
  }
  @scala.inline
  implicit class OnenotePagePreviewLinksOps[Self <: OnenotePagePreviewLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewImageUrl(value: ExternalLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviewImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewImageUrl")(js.undefined)
        ret
    }
  }
  
}

