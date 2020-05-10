package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectionsFilter extends js.Object {
  /**
    * The type of connections to return. Currently, only JDBC is supported; SFTP is not supported.
    */
  var ConnectionType: js.UndefOr[typingsSlinky.awsSdk.glueMod.ConnectionType] = js.native
  /**
    * A criteria string that must match the criteria recorded in the connection definition for that connection definition to be returned.
    */
  var MatchCriteria: js.UndefOr[typingsSlinky.awsSdk.glueMod.MatchCriteria] = js.native
}

object GetConnectionsFilter {
  @scala.inline
  def apply(): GetConnectionsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsFilter]
  }
  @scala.inline
  implicit class GetConnectionsFilterOps[Self <: GetConnectionsFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectionType(value: ConnectionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectionType")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchCriteria(value: MatchCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchCriteria")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchCriteria: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MatchCriteria")(js.undefined)
        ret
    }
  }
  
}

