package typingsSlinky.officeJsPreview.OneNote.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a OneNote section. Sections can contain pages.
  *
  * [Api set: OneNoteApi 1.1]
  */
@js.native
trait SectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * The client url of the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the ID of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if this section is encrypted with a password. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if this section is locked. Read only
    *
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the name of the section. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Gets the notebook that contains the section.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.native
  /**
    *
    * The collection of pages in the section. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.native
  /**
    *
    * Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.native
  /**
    *
    * Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.native
  /**
    *
    * The web url of the page. Read only
    *
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.native
}

object SectionLoadOptions {
  @scala.inline
  def apply(): SectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionLoadOptions]
  }
  @scala.inline
  implicit class SectionLoadOptionsOps[Self <: SectionLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with$all(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$all: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$all")(js.undefined)
        ret
    }
    @scala.inline
    def withClientUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withIsEncrypted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsEncrypted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEncrypted")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLocked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocked")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebook(value: NotebookLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebook")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebook: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebook")(js.undefined)
        ret
    }
    @scala.inline
    def withPages(value: PageCollectionLoadOptions): Self = {
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
    def withParentSectionGroup(value: SectionGroupLoadOptions): Self = {
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
    def withParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionGroupOrNull")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentSectionGroupOrNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentSectionGroupOrNull")(js.undefined)
        ret
    }
    @scala.inline
    def withWebUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWebUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("webUrl")(js.undefined)
        ret
    }
  }
  
}

