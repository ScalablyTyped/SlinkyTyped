package typingsSlinky.evernote

import typingsSlinky.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonIncludeExpunged extends js.Object {
  var includeExpunged: js.UndefOr[Boolean] = js.native
  var includeLinkedNotebooks: js.UndefOr[Boolean] = js.native
  var includeNoteApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  var includeNoteAttributes: js.UndefOr[Boolean] = js.native
  var includeNoteResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  var includeNoteResources: js.UndefOr[Boolean] = js.native
  var includeNotebooks: js.UndefOr[Boolean] = js.native
  var includeNotes: js.UndefOr[Boolean] = js.native
  var includeResourceApplicationDataFullMap: js.UndefOr[Boolean] = js.native
  var includeResources: js.UndefOr[Boolean] = js.native
  var includeSearches: js.UndefOr[Boolean] = js.native
  var includeSharedNotes: js.UndefOr[Boolean] = js.native
  var includeTags: js.UndefOr[Boolean] = js.native
  var notebookGuids: js.UndefOr[Set[String]] = js.native
  var omitSharedNotebooks: js.UndefOr[Boolean] = js.native
  var requireNoteContentClass: js.UndefOr[String] = js.native
}

object AnonIncludeExpunged {
  @scala.inline
  def apply(): AnonIncludeExpunged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonIncludeExpunged]
  }
  @scala.inline
  implicit class AnonIncludeExpungedOps[Self <: AnonIncludeExpunged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeExpunged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExpunged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeExpunged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeExpunged")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeLinkedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinkedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeLinkedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeLinkedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNoteApplicationDataFullMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteApplicationDataFullMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNoteApplicationDataFullMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteApplicationDataFullMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNoteAttributes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNoteAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNoteResourceApplicationDataFullMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteResourceApplicationDataFullMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNoteResourceApplicationDataFullMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteResourceApplicationDataFullMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNoteResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNoteResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNoteResources")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResourceApplicationDataFullMap(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourceApplicationDataFullMap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResourceApplicationDataFullMap: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResourceApplicationDataFullMap")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeResources(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeResources")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSearches(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSearches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSearches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSearches")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeSharedNotes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeSharedNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeSharedNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTags(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeTags")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookGuids(value: Set[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookGuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuids")(js.undefined)
        ret
    }
    @scala.inline
    def withOmitSharedNotebooks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitSharedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOmitSharedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("omitSharedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withRequireNoteContentClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNoteContentClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequireNoteContentClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requireNoteContentClass")(js.undefined)
        ret
    }
  }
  
}

