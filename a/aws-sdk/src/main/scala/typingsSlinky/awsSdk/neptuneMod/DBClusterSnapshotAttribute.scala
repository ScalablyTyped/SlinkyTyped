package typingsSlinky.awsSdk.neptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterSnapshotAttribute extends js.Object {
  /**
    * The name of the manual DB cluster snapshot attribute. The attribute named restore refers to the list of AWS accounts that have permission to copy or restore the manual DB cluster snapshot. For more information, see the ModifyDBClusterSnapshotAttribute API action.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * The value(s) for the manual DB cluster snapshot attribute. If the AttributeName field is set to restore, then this element returns a list of IDs of the AWS accounts that are authorized to copy or restore the manual DB cluster snapshot. If a value of all is in the list, then the manual DB cluster snapshot is public and available for any AWS account to copy or restore.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}

object DBClusterSnapshotAttribute {
  @scala.inline
  def apply(): DBClusterSnapshotAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DBClusterSnapshotAttribute]
  }
  @scala.inline
  implicit class DBClusterSnapshotAttributeOps[Self <: DBClusterSnapshotAttribute] (val x: Self) extends AnyVal {
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
    def withoutAttributeName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeName")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeValues(value: AttributeValueList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeValues")(js.undefined)
        ret
    }
  }
  
}

