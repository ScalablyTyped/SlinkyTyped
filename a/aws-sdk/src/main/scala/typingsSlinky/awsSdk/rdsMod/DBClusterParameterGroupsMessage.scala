package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroupsMessage extends js.Object {
  /**
    * A list of DB cluster parameter groups.
    */
  var DBClusterParameterGroups: js.UndefOr[DBClusterParameterGroupList] = js.native
  /**
    *  An optional pagination token provided by a previous DescribeDBClusterParameterGroups request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterParameterGroupsMessage {
  @scala.inline
  def apply(): DBClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterParameterGroupsMessage]
  }
  @scala.inline
  implicit class DBClusterParameterGroupsMessageOps[Self <: DBClusterParameterGroupsMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterParameterGroups(value: DBClusterParameterGroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterParameterGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterParameterGroups")(js.undefined)
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

