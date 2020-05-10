package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnenoteSection extends OnenoteEntityHierarchyModel {
  // Indicates whether this is the user's default section. Read-only.
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Links for opening the section. The oneNoteClientURL link opens the section in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the section in OneNote on the web.
    */
  var links: js.UndefOr[SectionLinks] = js.native
  // The collection of pages in the section. Read-only. Nullable.
  var pages: js.UndefOr[js.Array[OnenotePage]] = js.native
  // The pages endpoint where you can get details for all the pages in the section. Read-only.
  var pagesUrl: js.UndefOr[String] = js.native
  // The notebook that contains the section. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.native
  // The section group that contains the section. Read-only.
  var parentSectionGroup: js.UndefOr[SectionGroup] = js.native
}

object OnenoteSection {
  @scala.inline
  def apply(): OnenoteSection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteSection]
  }
  @scala.inline
  implicit class OnenoteSectionOps[Self <: OnenoteSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDefault: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDefault")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: SectionLinks): Self = {
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
    def withPages(value: js.Array[OnenotePage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pages")(js.undefined)
        ret
    }
    @scala.inline
    def withPagesUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPagesUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pagesUrl")(js.undefined)
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
    def withParentSectionGroup(value: SectionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSectionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionGroup")(js.undefined)
        ret
    }
  }
  
}

