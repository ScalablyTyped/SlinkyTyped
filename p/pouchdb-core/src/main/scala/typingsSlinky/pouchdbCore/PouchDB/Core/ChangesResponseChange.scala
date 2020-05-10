package typingsSlinky.pouchdbCore.PouchDB.Core

import typingsSlinky.pouchdbCore.AnonRevString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangesResponseChange[Content /* <: js.Object */] extends js.Object {
  var changes: js.Array[AnonRevString] = js.native
  var deleted: js.UndefOr[Boolean] = js.native
  var doc: js.UndefOr[ExistingDocument[Content with ChangesMeta]] = js.native
  var id: String = js.native
  var seq: Double | String = js.native
}

object ChangesResponseChange {
  @scala.inline
  def apply[Content](changes: js.Array[AnonRevString], id: String, seq: Double | String): ChangesResponseChange[Content] = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangesResponseChange[Content]]
  }
  @scala.inline
  implicit class ChangesResponseChangeOps[Self[content] <: ChangesResponseChange[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withChanges(value: js.Array[AnonRevString]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("changes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeq(value: Double | String): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("seq")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeleted(value: Boolean): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleted: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleted")(js.undefined)
        ret
    }
    @scala.inline
    def withDoc(value: ExistingDocument[Content with ChangesMeta]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDoc: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("doc")(js.undefined)
        ret
    }
  }
  
}

