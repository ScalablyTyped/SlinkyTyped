package typingsSlinky.pouchdbCore.anon

import typingsSlinky.pouchdbCore.PouchDB.Core.AllDocsMeta
import typingsSlinky.pouchdbCore.PouchDB.Core.DocumentId
import typingsSlinky.pouchdbCore.PouchDB.Core.DocumentKey
import typingsSlinky.pouchdbCore.PouchDB.Core.ExistingDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doc[Content /* <: js.Object */] extends js.Object {
  /** Only present if `include_docs` was `true`. */
  var doc: js.UndefOr[ExistingDocument[Content with AllDocsMeta]] = js.native
  var id: DocumentId = js.native
  var key: DocumentKey = js.native
  var value: Deleted = js.native
}

object Doc {
  @scala.inline
  def apply[Content](id: DocumentId, key: DocumentKey, value: Deleted): Doc[Content] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doc[Content]]
  }
  @scala.inline
  implicit class DocOps[Self[content] <: Doc[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withId(value: DocumentId): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKey(value: DocumentKey): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: Deleted): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDoc(value: ExistingDocument[Content with AllDocsMeta]): Self[Content] = {
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

