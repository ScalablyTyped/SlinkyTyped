package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.NoteAttributes
import typingsSlinky.evernote.mod.Types.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attributes extends js.Object {
  var attributes: js.UndefOr[NoteAttributes] = js.native
  var contentLength: js.UndefOr[Double] = js.native
  var created: js.UndefOr[Timestamp] = js.native
  var deleted: js.UndefOr[Timestamp] = js.native
  var guid: js.UndefOr[typingsSlinky.evernote.mod.Types.Guid] = js.native
  var largestResourceMime: js.UndefOr[String] = js.native
  var largestResourceSize: js.UndefOr[Double] = js.native
  var notebookGuid: js.UndefOr[String] = js.native
  var tagGuids: js.UndefOr[js.Array[typingsSlinky.evernote.mod.Types.Guid]] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

object Attributes {
  @scala.inline
  def apply(): Attributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Attributes]
  }
  @scala.inline
  implicit class AttributesOps[Self <: Attributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributes(value: NoteAttributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributes")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLength")(js.undefined)
        ret
    }
    @scala.inline
    def withCreated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleted(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withGuid(value: typingsSlinky.evernote.mod.Types.Guid): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guid")(js.undefined)
        ret
    }
    @scala.inline
    def withLargestResourceMime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestResourceMime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargestResourceMime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestResourceMime")(js.undefined)
        ret
    }
    @scala.inline
    def withLargestResourceSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestResourceSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLargestResourceSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("largestResourceSize")(js.undefined)
        ret
    }
    @scala.inline
    def withNotebookGuid(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotebookGuid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notebookGuid")(js.undefined)
        ret
    }
    @scala.inline
    def withTagGuids(value: js.Array[typingsSlinky.evernote.mod.Types.Guid]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagGuids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTagGuids: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tagGuids")(js.undefined)
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
    def withUpdateSequenceNum(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateSequenceNum: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateSequenceNum")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdated(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updated")(js.undefined)
        ret
    }
  }
  
}

