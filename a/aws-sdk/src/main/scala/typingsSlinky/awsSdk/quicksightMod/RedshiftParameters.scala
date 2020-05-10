package typingsSlinky.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedshiftParameters extends js.Object {
  /**
    * Cluster ID. This field can be blank if the Host and Port are provided.
    */
  var ClusterId: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.ClusterId] = js.native
  /**
    * Database.
    */
  var Database: typingsSlinky.awsSdk.quicksightMod.Database = js.native
  /**
    * Host. This field can be blank if ClusterId is provided.
    */
  var Host: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Host] = js.native
  /**
    * Port. This field can be blank if the ClusterId is provided.
    */
  var Port: js.UndefOr[OptionalPort] = js.native
}

object RedshiftParameters {
  @scala.inline
  def apply(Database: Database): RedshiftParameters = {
    val __obj = js.Dynamic.literal(Database = Database.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftParameters]
  }
  @scala.inline
  implicit class RedshiftParametersOps[Self <: RedshiftParameters] (val x: Self) extends AnyVal {
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
    def withClusterId(value: ClusterId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClusterId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClusterId")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: Host): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Host")(js.undefined)
        ret
    }
    @scala.inline
    def withPort(value: OptionalPort): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPort: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Port")(js.undefined)
        ret
    }
  }
  
}

