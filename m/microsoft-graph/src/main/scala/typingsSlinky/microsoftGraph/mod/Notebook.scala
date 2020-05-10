package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Notebook extends OnenoteEntityHierarchyModel {
  // Indicates whether this is the user's default notebook. Read-only.
  var isDefault: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the notebook is shared. If true, the contents of the notebook can be seen by people other than the
    * owner. Read-only.
    */
  var isShared: js.UndefOr[Boolean] = js.native
  /**
    * Links for opening the notebook. The oneNoteClientURL link opens the notebook in the OneNote native client if it's
    * installed. The oneNoteWebURL link opens the notebook in OneNote on the web.
    */
  var links: js.UndefOr[NotebookLinks] = js.native
  // The section groups in the notebook. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.native
  // The URL for the sectionGroups navigation property, which returns all the section groups in the notebook. Read-only.
  var sectionGroupsUrl: js.UndefOr[String] = js.native
  // The sections in the notebook. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.native
  // The URL for the sections navigation property, which returns all the sections in the notebook. Read-only.
  var sectionsUrl: js.UndefOr[String] = js.native
  /**
    * Possible values are: Owner, Contributor, Reader, None. Owner represents owner-level access to the notebook. Contributor
    * represents read/write access to the notebook. Reader represents read-only access to the notebook. Read-only.
    */
  var userRole: js.UndefOr[OnenoteUserRole] = js.native
}

object Notebook {
  @scala.inline
  def apply(): Notebook = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Notebook]
  }
  @scala.inline
  implicit class NotebookOps[Self <: Notebook] (val x: Self) extends AnyVal {
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
    def withIsShared(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShared")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsShared: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isShared")(js.undefined)
        ret
    }
    @scala.inline
    def withLinks(value: NotebookLinks): Self = {
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
    def withSectionGroups(value: js.Array[SectionGroup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroups")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionGroupsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroupsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionGroupsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionGroupsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withSections(value: js.Array[OnenoteSection]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSections: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sections")(js.undefined)
        ret
    }
    @scala.inline
    def withSectionsUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionsUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSectionsUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sectionsUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withUserRole(value: OnenoteUserRole): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRole")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserRole: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userRole")(js.undefined)
        ret
    }
  }
  
}

