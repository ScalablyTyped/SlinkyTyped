package typingsSlinky.diagnosticChannelPublishers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConnection extends js.Object {
  var _connection: js.UndefOr[AnonConfig] = js.native
  var sql: js.UndefOr[String] = js.native
}

object AnonConnection {
  @scala.inline
  def apply(): AnonConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonConnection]
  }
  @scala.inline
  implicit class AnonConnectionOps[Self <: AnonConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_connection(value: AnonConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_connection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without_connection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_connection")(js.undefined)
        ret
    }
    @scala.inline
    def withSql(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSql: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sql")(js.undefined)
        ret
    }
  }
  
}

