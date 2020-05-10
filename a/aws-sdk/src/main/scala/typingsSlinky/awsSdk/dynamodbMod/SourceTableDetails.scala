package typingsSlinky.awsSdk.dynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableDetails extends js.Object {
  /**
    * Controls how you are charged for read and write throughput and how you manage capacity. This setting can be changed later.    PROVISIONED - Sets the read/write capacity mode to PROVISIONED. We recommend using PROVISIONED for predictable workloads.    PAY_PER_REQUEST - Sets the read/write capacity mode to PAY_PER_REQUEST. We recommend using PAY_PER_REQUEST for unpredictable workloads.   
    */
  var BillingMode: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BillingMode] = js.native
  /**
    * Number of items in the table. Note that this is an approximate value. 
    */
  var ItemCount: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ItemCount] = js.native
  /**
    * Schema of the table. 
    */
  var KeySchema: typingsSlinky.awsSdk.dynamodbMod.KeySchema = js.native
  /**
    * Read IOPs and Write IOPS on the table when the backup was created.
    */
  var ProvisionedThroughput: typingsSlinky.awsSdk.dynamodbMod.ProvisionedThroughput = js.native
  /**
    * ARN of the table for which backup was created. 
    */
  var TableArn: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableArn] = js.native
  /**
    * Time when the source table was created. 
    */
  var TableCreationDateTime: js.Date = js.native
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: typingsSlinky.awsSdk.dynamodbMod.TableId = js.native
  /**
    * The name of the table for which the backup was created. 
    */
  var TableName: typingsSlinky.awsSdk.dynamodbMod.TableName = js.native
  /**
    * Size of the table in bytes. Note that this is an approximate value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: KeySchema,
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: js.Date,
    TableId: TableId,
    TableName: TableName
  ): SourceTableDetails = {
    val __obj = js.Dynamic.literal(KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableCreationDateTime = TableCreationDateTime.asInstanceOf[js.Any], TableId = TableId.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceTableDetails]
  }
  @scala.inline
  implicit class SourceTableDetailsOps[Self <: SourceTableDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKeySchema(value: KeySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughput): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableId(value: TableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBillingMode(value: BillingMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingMode")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: ItemCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ItemCount")(js.undefined)
        ret
    }
    @scala.inline
    def withTableArn(value: TableArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableArn")(js.undefined)
        ret
    }
    @scala.inline
    def withTableSizeBytes(value: Long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableSizeBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableSizeBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableSizeBytes")(js.undefined)
        ret
    }
  }
  
}

