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

trait MigrationResponse extends js.Object {
  var id: String
  var status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`
}

object MigrationResponse {
  @scala.inline
  def apply(id: String, status: `not-run` | skipped | pending | ok | error | rollback | `rollback-error`): MigrationResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MigrationResponse]
  }
}

