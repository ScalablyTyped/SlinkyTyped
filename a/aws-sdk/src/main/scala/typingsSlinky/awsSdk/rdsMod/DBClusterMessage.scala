package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterMessage extends js.Object {
  /**
    * Contains a list of DB clusters for the user.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.native
  /**
    * A pagination token that can be used in a later DescribeDBClusters request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterMessage {
  @scala.inline
  def apply(): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterMessage]
  }
  @scala.inline
  implicit class DBClusterMessageOps[Self <: DBClusterMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusters(value: DBClusterList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusters")(js.undefined)
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

