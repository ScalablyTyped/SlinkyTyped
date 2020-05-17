package typingsSlinky.evernote.anon

import typingsSlinky.evernote.mod.Types.Timestamp
import typingsSlinky.evernote.mod.Types.UserID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LastEditorId extends js.Object {
  var lastEditorId: js.UndefOr[UserID] = js.native
  var saved: js.UndefOr[Timestamp] = js.native
  var title: js.UndefOr[String] = js.native
  var updateSequenceNum: js.UndefOr[Double] = js.native
  var updated: js.UndefOr[Timestamp] = js.native
}

object LastEditorId {
  @scala.inline
  def apply(): LastEditorId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LastEditorId]
  }
  @scala.inline
  implicit class LastEditorIdOps[Self <: LastEditorId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastEditorId(value: UserID): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditorId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastEditorId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastEditorId")(js.undefined)
        ret
    }
    @scala.inline
    def withSaved(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saved")(js.undefined)
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

