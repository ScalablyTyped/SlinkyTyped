package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionGroup extends OnenoteEntityHierarchyModel {
  // The notebook that contains the section group. Read-only.
  var parentNotebook: js.UndefOr[Notebook] = js.native
  // The section group that contains the section group. Read-only.
  var parentSectionGroup: js.UndefOr[SectionGroup] = js.native
  // The section groups in the section. Read-only. Nullable.
  var sectionGroups: js.UndefOr[js.Array[SectionGroup]] = js.native
  /**
    * The URL for the sectionGroups navigation property, which returns all the section groups in the section group.
    * Read-only.
    */
  var sectionGroupsUrl: js.UndefOr[String] = js.native
  // The sections in the section group. Read-only. Nullable.
  var sections: js.UndefOr[js.Array[OnenoteSection]] = js.native
  // The URL for the sections navigation property, which returns all the sections in the section group. Read-only.
  var sectionsUrl: js.UndefOr[String] = js.native
}

object SectionGroup {
  @scala.inline
  def apply(): SectionGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionGroup]
  }
  @scala.inline
  implicit class SectionGroupOps[Self <: SectionGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

