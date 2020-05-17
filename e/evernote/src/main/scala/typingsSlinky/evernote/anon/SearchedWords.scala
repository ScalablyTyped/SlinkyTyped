package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.NoteStore.NoteMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchedWords extends js.Object {
  var notes: js.UndefOr[js.Array[NoteMetadata]] = js.native
  var searchedWords: js.UndefOr[js.Array[String]] = js.native
  var startIndex: js.UndefOr[Double] = js.native
  var stoppedWords: js.UndefOr[js.Array[String]] = js.native
  var totalNotes: js.UndefOr[Double] = js.native
  var updateCount: js.UndefOr[Double] = js.native
}

object SearchedWords {
  @scala.inline
  def apply(): SearchedWords = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchedWords]
  }
  @scala.inline
  implicit class SearchedWordsOps[Self <: SearchedWords] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotes(value: js.Array[NoteMetadata]): Self = {
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
    def withSearchedWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchedWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchedWords")(js.undefined)
        ret
    }
    @scala.inline
    def withStartIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withStoppedWords(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedWords")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStoppedWords: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stoppedWords")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalNotes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNotes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalNotes")(js.undefined)
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

