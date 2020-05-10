package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterBacktrackMessage extends js.Object {
  /**
    * Contains a list of backtracks for the user.
    */
  var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.native
  /**
    * A pagination token that can be used in a later DescribeDBClusterBacktracks request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterBacktrackMessage {
  @scala.inline
  def apply(): DBClusterBacktrackMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterBacktrackMessage]
  }
  @scala.inline
  implicit class DBClusterBacktrackMessageOps[Self <: DBClusterBacktrackMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterBacktracks(value: DBClusterBacktrackList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterBacktracks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterBacktracks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterBacktracks")(js.undefined)
        ret
    }
    @scala.inline
    def withMarker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMarker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Marker")(js.undefined)
        ret
    }
  }
  
}

