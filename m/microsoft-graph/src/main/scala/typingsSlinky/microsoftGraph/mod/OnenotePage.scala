package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenotePage extends OnenoteEntitySchemaObjectModel {
  // The page's HTML content.
  var content: js.UndefOr[js.Any] = js.native
  // The URL for the page's HTML content. Read-only.
  var contentUrl: js.UndefOr[String] = js.native
  // The unique identifier of the application that created the page. Read-only.
  var createdByAppId: js.UndefOr[String] = js.native
  /**
    * The date and time when the page was last modified. The timestamp represents date and time information using ISO 8601
    * format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would look like this:
    * '2014-01-01T00:00:00Z'. Read-only.
    */
  var lastModifiedDateTime: js.UndefOr[String] = js.native
  // The indentation level of the page. Read-only.
  var level: js.UndefOr[Double] = js.native
  /**
    * Links for opening the page. The oneNoteClientURL link opens the page in the OneNote native client if it 's installed.
    * The oneNoteWebUrl link opens the page in OneNote on the web. Read-only.
    */
  var links: js.UndefOr[PageLinks] = js.native
  // The order of the page within its parent section. Read-only.
  var order: js.UndefOr[Double] = js.native
  // The notebook that contains the page. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.native
  // The section that contains the page. Read-only.
  var parentSection: js.UndefOr[OnenoteSection] = js.native
  // The title of the page.
  var title: js.UndefOr[String] = js.native
  var userTags: js.UndefOr[js.Array[String]] = js.native
}

object OnenotePage {
  @scala.inline
  def apply(): OnenotePage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenotePage]
  }
  @scala.inline
  implicit class OnenotePageOps[Self <: OnenotePage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContent(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("content")(js.undefined)
        ret
    }
    @scala.inline
    def withContentUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatedByAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByAppId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedByAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdByAppId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastModifiedDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("level")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: PageLinks): Self = {
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
    def withOrder(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("order")(js.undefined)
        ret
    }
    @scala.inline
    def withParentNotebook(value: Notebook): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNotebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentNotebook")(js.undefined)
        ret
    }
    @scala.inline
    def withParentSection(value: OnenoteSection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSection")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withUserTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTags")(js.undefined)
        ret
    }
  }
  
}

