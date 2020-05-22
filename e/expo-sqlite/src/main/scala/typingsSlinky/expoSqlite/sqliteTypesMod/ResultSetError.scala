package typingsSlinky.expoSqlite.sqliteTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultSetError extends js.Object {
  var error: js.Error
}

object ResultSetError {
  @scala.inline
  def apply(error: js.Error): ResultSetError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSetError]
  }
}

