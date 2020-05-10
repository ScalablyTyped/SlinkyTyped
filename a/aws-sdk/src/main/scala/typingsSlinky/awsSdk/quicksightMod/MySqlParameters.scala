package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MySqlParameters extends js.Object {
  /**
    * Database.
    */
  var Database: typingsSlinky.awsSdk.quicksightMod.Database = js.native
  /**
    * Host.
    */
  var Host: typingsSlinky.awsSdk.quicksightMod.Host = js.native
  /**
    * Port.
    */
  var Port: typingsSlinky.awsSdk.quicksightMod.Port = js.native
}

object MySqlParameters {
  @scala.inline
  def apply(Database: Database, Host: Host, Port: Port): MySqlParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any], Host = Host.asInstanceOf[js.Any], Port = Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[MySqlParameters]
  }
  @scala.inline
  implicit class MySqlParametersOps[Self <: MySqlParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: Database): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHost(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPort(value: Port): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

