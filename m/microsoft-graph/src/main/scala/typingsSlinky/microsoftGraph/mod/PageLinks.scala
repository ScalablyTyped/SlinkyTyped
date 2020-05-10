package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageLinks extends js.Object {
  // Opens the page in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.native
  // Opens the page in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.native
}

object PageLinks {
  @scala.inline
  def apply(): PageLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageLinks]
  }
  @scala.inline
  implicit class PageLinksOps[Self <: PageLinks] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOneNoteClientUrl(value: ExternalLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneNoteClientUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneNoteClientUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneNoteClientUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOneNoteWebUrl(value: ExternalLink): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneNoteWebUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOneNoteWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oneNoteWebUrl")(js.undefined)
        ret
    }
  }
  
}

