package typingsSlinky.mongration.mod

import typingsSlinky.mongration.mongrationStrings.`not-run`
import typingsSlinky.mongration.mongrationStrings.`rollback-error`
import typingsSlinky.mongration.mongrationStrings.error
import typingsSlinky.mongration.mongrationStrings.ok
import typingsSlinky.mongration.mongrationStrings.pending
import typingsSlinky.mongration.mongrationStrings.rollback
import typingsSlinky.mongration.mongrationStrings.skipped
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MigrationResponse extends js.Object {
  var id: String = js.native
  var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error` = js.native
}

object MigrationResponse {
  @scala.inline
  def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationResponse]
  }
  @scala.inline
  implicit class MigrationResponseOps[Self <: MigrationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

