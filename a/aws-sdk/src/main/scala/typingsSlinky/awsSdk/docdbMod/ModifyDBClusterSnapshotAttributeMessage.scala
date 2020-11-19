package typingsSlinky.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributeName(value: String): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBClusterSnapshotIdentifier(value: String): Self = this.set("DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesToAddVarargs(value: String*): Self = this.set("ValuesToAdd", js.Array(value :_*))
    
    @scala.inline
    def setValuesToAdd(value: AttributeValueList): Self = this.set("ValuesToAdd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesToAdd: Self = this.set("ValuesToAdd", js.undefined)
    
    @scala.inline
    def setValuesToRemoveVarargs(value: String*): Self = this.set("ValuesToRemove", js.Array(value :_*))
    
    @scala.inline
    def setValuesToRemove(value: AttributeValueList): Self = this.set("ValuesToRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValuesToRemove: Self = this.set("ValuesToRemove", js.undefined)
  }
}
