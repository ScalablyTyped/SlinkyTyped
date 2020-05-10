package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBSnapshotAttributeMessage extends js.Object {
  /**
    * The name of the DB snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual DB snapshot, set this value to restore.
    */
  var AttributeName: String = js.native
  /**
    * The identifier for the DB snapshot to modify the attributes for.
    */
  var DBSnapshotIdentifier: String = js.native
  /**
    * A list of DB snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account IDs, or all to make the manual DB snapshot restorable by any AWS account. Do not add the all value for any manual DB snapshots that contain private information that you don't want available to all AWS accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.native
  /**
    * A list of DB snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual snapshot, set this list to include one or more AWS account identifiers, or all to remove authorization for any AWS account to copy or restore the DB snapshot. If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore the manual DB snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.native
}

object ModifyDBSnapshotAttributeMessage {
  @scala.inline
  def apply(AttributeName: String, DBSnapshotIdentifier: String): ModifyDBSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBSnapshotAttributeMessage]
  }
  @scala.inline
  implicit class ModifyDBSnapshotAttributeMessageOps[Self <: ModifyDBSnapshotAttributeMessage] (val x: Self) extends AnyVal {
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
    def withDBSnapshotIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBSnapshotIdentifier")(value.asInstanceOf[js.Any])
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

