package typingsSlinky.pouchdbNode.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatabaseInfo extends js.Object {
  /** The backend *DOWN adapter being used (MemDOWN, RiakDOWN, …). */
  var backend_adapter: js.UndefOr[String] = js.native
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
    def withBackend_adapter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend_adapter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackend_adapter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backend_adapter")(js.undefined)
        ret
    }
  }
  
}

