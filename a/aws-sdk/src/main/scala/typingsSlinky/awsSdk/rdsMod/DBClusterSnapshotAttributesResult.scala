package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotAttributesResult extends js.Object {
  /**
    * The list of attributes and values for the manual DB cluster snapshot.
    */
  var DBClusterSnapshotAttributes: js.UndefOr[DBClusterSnapshotAttributeList] = js.native
  /**
    * The identifier of the manual DB cluster snapshot that the attributes apply to.
    */
  var DBClusterSnapshotIdentifier: js.UndefOr[String] = js.native
}

object DBClusterSnapshotAttributesResult {
  @scala.inline
  def apply(): DBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttributesResult]
  }
  @scala.inline
  implicit class DBClusterSnapshotAttributesResultOps[Self <: DBClusterSnapshotAttributesResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterSnapshotAttributes(value: DBClusterSnapshotAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshotAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withDBClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshotIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(js.undefined)
        ret
    }
  }
  
}

