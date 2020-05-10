package typingsSlinky.googleAppsScript.GoogleAppsScript.Slides.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Page extends js.Object {
  var layoutProperties: js.UndefOr[LayoutProperties] = js.native
  var masterProperties: js.UndefOr[MasterProperties] = js.native
  var notesProperties: js.UndefOr[NotesProperties] = js.native
  var objectId: js.UndefOr[String] = js.native
  var pageElements: js.UndefOr[js.Array[PageElement]] = js.native
  var pageProperties: js.UndefOr[PageProperties] = js.native
  var pageType: js.UndefOr[String] = js.native
  var revisionId: js.UndefOr[String] = js.native
  var slideProperties: js.UndefOr[SlideProperties] = js.native
}

object Page {
  @scala.inline
  def apply(): Page = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Page]
  }
  @scala.inline
  implicit class PageOps[Self <: Page] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLayoutProperties(value: LayoutProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLayoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("layoutProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterProperties(value: MasterProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withNotesProperties(value: NotesProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotesProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notesProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withObjectId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObjectId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("objectId")(js.undefined)
        ret
    }
    @scala.inline
    def withPageElements(value: js.Array[PageElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElements")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageElements: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageElements")(js.undefined)
        ret
    }
    @scala.inline
    def withPageProperties(value: PageProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageProperties")(js.undefined)
        ret
    }
    @scala.inline
    def withPageType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageType")(js.undefined)
        ret
    }
    @scala.inline
    def withRevisionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevisionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revisionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSlideProperties(value: SlideProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideProperties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSlideProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("slideProperties")(js.undefined)
        ret
    }
  }
  
}

