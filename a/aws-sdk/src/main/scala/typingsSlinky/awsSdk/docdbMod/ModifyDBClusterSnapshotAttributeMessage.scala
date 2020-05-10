package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterSnapshotAttributeMessage extends js.Object {
  /**
    * The name of the cluster snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual cluster snapshot, set this value to restore.
    */
  var AttributeName: String = js.native
  /**
    * The identifier for the cluster snapshot to modify the attributes for.
    */
  var DBClusterSnapshotIdentifier: String = js.native
  /**
    * A list of cluster snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual cluster snapshot, set this list to include one or more AWS account IDs. To make the manual cluster snapshot restorable by any AWS account, set it to all. Do not add the all value for any manual cluster snapshots that contain private information that you don't want to be available to all AWS accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.native
  /**
    * A list of cluster snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual cluster snapshot, set this list to include one or more AWS account identifiers. To remove authorization for any AWS account to copy or restore the cluster snapshot, set it to all . If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore a manual cluster snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.native
}

object ModifyDBClusterSnapshotAttributeMessage {
  @scala.inline
  def apply(AttributeName: String, DBClusterSnapshotIdentifier: String): ModifyDBClusterSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
  }
  @scala.inline
  implicit class ModifyDBClusterSnapshotAttributeMessageOps[Self <: ModifyDBClusterSnapshotAttributeMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttributeName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDBClusterSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshotIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValuesToAdd(value: AttributeValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValuesToAdd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesToAdd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValuesToAdd")(js.undefined)
        ret
    }
    @scala.inline
    def withValuesToRemove(value: AttributeValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValuesToRemove")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValuesToRemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ValuesToRemove")(js.undefined)
        ret
    }
  }
  
}

