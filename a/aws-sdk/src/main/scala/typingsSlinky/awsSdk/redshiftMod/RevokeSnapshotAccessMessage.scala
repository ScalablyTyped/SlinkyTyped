package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeSnapshotAccessMessage extends js.Object {
  /**
    * The identifier of the AWS customer account that can no longer restore the specified snapshot.
    */
  var AccountWithRestoreAccess: String = js.native
  /**
    * The identifier of the cluster the snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name.
    */
  var SnapshotClusterIdentifier: js.UndefOr[String] = js.native
  /**
    * The identifier of the snapshot that the account can no longer access.
    */
  var SnapshotIdentifier: String = js.native
}

object RevokeSnapshotAccessMessage {
  @scala.inline
  def apply(AccountWithRestoreAccess: String, SnapshotIdentifier: String): RevokeSnapshotAccessMessage = {
    val __obj = js.Dynamic.literal(AccountWithRestoreAccess = AccountWithRestoreAccess.asInstanceOf[js.Any], SnapshotIdentifier = SnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeSnapshotAccessMessage]
  }
  @scala.inline
  implicit class RevokeSnapshotAccessMessageOps[Self <: RevokeSnapshotAccessMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountWithRestoreAccess(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountWithRestoreAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSnapshotClusterIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotClusterIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotClusterIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotClusterIdentifier")(js.undefined)
        ret
    }
  }
  
}

