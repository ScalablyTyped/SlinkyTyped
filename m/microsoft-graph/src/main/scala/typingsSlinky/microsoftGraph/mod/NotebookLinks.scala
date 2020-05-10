package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NotebookLinks extends js.Object {
  // Opens the notebook in the OneNote native client if it's installed.
  var oneNoteClientUrl: js.UndefOr[ExternalLink] = js.native
  // Opens the notebook in OneNote on the web.
  var oneNoteWebUrl: js.UndefOr[ExternalLink] = js.native
}

object NotebookLinks {
  @scala.inline
  def apply(): NotebookLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotebookLinks]
  }
  @scala.inline
  implicit class NotebookLinksOps[Self <: NotebookLinks] (val x: Self) extends AnyVal {
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

