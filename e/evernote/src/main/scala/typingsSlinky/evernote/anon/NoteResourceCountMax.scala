package typingsSlinky.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NoteResourceCountMax extends js.Object {
  var noteResourceCountMax: js.UndefOr[Double] = js.native
  var noteSizeMax: js.UndefOr[Double] = js.native
  var noteTagCountMax: js.UndefOr[Double] = js.native
  var resourceSizeMax: js.UndefOr[Double] = js.native
  var uploadLimit: js.UndefOr[Double] = js.native
  var userLinkedNotebookMax: js.UndefOr[Double] = js.native
  var userMailLimitDaily: js.UndefOr[Double] = js.native
  var userNoteCountMax: js.UndefOr[Double] = js.native
  var userNotebookCountMax: js.UndefOr[Double] = js.native
  var userSavedSearchesMax: js.UndefOr[Double] = js.native
  var userTagCountMax: js.UndefOr[Double] = js.native
}

object NoteResourceCountMax {
  @scala.inline
  def apply(): NoteResourceCountMax = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteResourceCountMax]
  }
  @scala.inline
  implicit class NoteResourceCountMaxOps[Self <: NoteResourceCountMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNoteResourceCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteResourceCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteResourceCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteResourceCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteSizeMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteSizeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteSizeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteSizeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withNoteTagCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTagCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNoteTagCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noteTagCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceSizeMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceSizeMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceSizeMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceSizeMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withUserLinkedNotebookMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLinkedNotebookMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserLinkedNotebookMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userLinkedNotebookMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUserMailLimitDaily(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMailLimitDaily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserMailLimitDaily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userMailLimitDaily")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNoteCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNoteCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNoteCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNoteCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUserNotebookCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotebookCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserNotebookCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userNotebookCountMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUserSavedSearchesMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSavedSearchesMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserSavedSearchesMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userSavedSearchesMax")(js.undefined)
        ret
    }
    @scala.inline
    def withUserTagCountMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTagCountMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserTagCountMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userTagCountMax")(js.undefined)
        ret
    }
  }
  
}

