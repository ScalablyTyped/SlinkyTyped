package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.LinkedNotebook
import typingsSlinky.evernote.mod.Types.Notebook
import typingsSlinky.evernote.mod.Types.Resource
import typingsSlinky.evernote.mod.Types.SavedSearch
import typingsSlinky.evernote.mod.Types.Tag
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChunkHighUSN extends js.Object {
  var chunkHighUSN: js.UndefOr[Double] = js.native
  var currentTime: js.UndefOr[Timestamp] = js.native
  var expungedLinkedNotebooks: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var expungedNotebooks: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var expungedNotes: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var expungedSearches: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var expungedTags: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var linkedNotebooks: js.UndefOr[js.Array[LinkedNotebook]] = js.native
  var notebooks: js.UndefOr[js.Array[Notebook]] = js.native
  var notes: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Note]] = js.native
  var resources: js.UndefOr[js.Array[Resource]] = js.native
  var searches: js.UndefOr[js.Array[SavedSearch]] = js.native
  var tags: js.UndefOr[js.Array[Tag]] = js.native
  var updateCount: js.UndefOr[Double] = js.native
}

object ChunkHighUSN {
  @scala.inline
  def apply(): ChunkHighUSN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChunkHighUSN]
  }
  @scala.inline
  implicit class ChunkHighUSNOps[Self <: ChunkHighUSN] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChunkHighUSN(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkHighUSN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChunkHighUSN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chunkHighUSN")(js.undefined)
        ret
    }
    @scala.inline
    def withCurrentTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentTime")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungedLinkedNotebooks(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedLinkedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungedLinkedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedLinkedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungedNotebooks(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungedNotes(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungedNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedNotes")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungedSearches(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedSearches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungedSearches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedSearches")(js.undefined)
        ret
    }
    @scala.inline
    def withExpungedTags(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpungedTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expungedTags")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkedNotebooks(value: js.Array[LinkedNotebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedNotebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLinkedNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkedNotebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebooks(value: js.Array[Notebook]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebooks")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[typingsSlinky.evernote.mod.Types.Note]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: js.Array[Resource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
    @scala.inline
    def withSearches(value: js.Array[SavedSearch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searches")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: js.Array[Tag]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateCount")(js.undefined)
        ret
    }
  }
  
}

