package typingsSlinky.pouchdbAdapterIdb.PouchDB.Core

import typingsSlinky.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.base64
import typingsSlinky.pouchdbAdapterIdb.pouchdbAdapterIdbStrings.binary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInfo extends js.Object {
  var idb_attachment_format: js.UndefOr[base64 | binary] = js.native
}

object DatabaseInfo {
  @scala.inline
  def apply(): DatabaseInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseInfo]
  }
  @scala.inline
  implicit class DatabaseInfoOps[Self <: DatabaseInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIdb_attachment_format(value: base64 | binary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idb_attachment_format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdb_attachment_format: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idb_attachment_format")(js.undefined)
        ret
    }
  }
  
}

