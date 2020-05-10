package typingsSlinky.googleAppsScript.GoogleAppsScript.JDBC

import typingsSlinky.googleAppsScript.GoogleAppsScript.Integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A JDBC Savepoint. For documentation of this class, see java.sql.Savepoint
  * .
  */
@js.native
trait JdbcSavepoint extends js.Object {
  def getSavepointId(): Integer = js.native
  def getSavepointName(): String = js.native
}

object JdbcSavepoint {
  @scala.inline
  def apply(getSavepointId: () => Integer, getSavepointName: () => String): JdbcSavepoint = {
    val __obj = js.Dynamic.literal(getSavepointId = js.Any.fromFunction0(getSavepointId), getSavepointName = js.Any.fromFunction0(getSavepointName))
    __obj.asInstanceOf[JdbcSavepoint]
  }
  @scala.inline
  implicit class JdbcSavepointOps[Self <: JdbcSavepoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetSavepointId(value: () => Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSavepointId")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSavepointName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getSavepointName")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

