package typingsSlinky.awsSdkClientDynamodbBrowser.typesSourceTableDetailsMod

import typingsSlinky.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceTableDetails extends js.Object {
  /**
    * <p>Number of items in the table. Please note this is an approximate value. </p>
    */
  var ItemCount: js.UndefOr[Double] = js.native
  /**
    * <p>Schema of the table. </p>
    */
  var KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement] = js.native
  /**
    * <p>Read IOPs and Write IOPS on the table when the backup was created.</p>
    */
  var ProvisionedThroughput: typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput = js.native
  /**
    * <p>ARN of the table for which backup was created. </p>
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * <p>Time when the source table was created. </p>
    */
  var TableCreationDateTime: js.Date | String | Double = js.native
  /**
    * <p>Unique identifier for the table for which the backup was created. </p>
    */
  var TableId: String = js.native
  /**
    * <p>The name of the table for which the backup was created. </p>
    */
  var TableName: String = js.native
  /**
    * <p>Size of the table in bytes. Please note this is an approximate value.</p>
    */
  var TableSizeBytes: js.UndefOr[Double] = js.native
}

object SourceTableDetails {
  @scala.inline
  def apply(
    KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
    ProvisionedThroughput: ProvisionedThroughput,
    TableCreationDateTime: js.Date | String | Double,
    TableId: String,
    TableName: String
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
    def withKeySchemaIterable(value: js.Iterable[KeySchemaElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeySchema(value: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement]): Self = {
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
    def withTableCreationDateTimeDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableCreationDateTime(value: js.Date | String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableCreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTableName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItemCount(value: Double): Self = {
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
    def withTableArn(value: String): Self = {
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
    def withTableSizeBytes(value: Double): Self = {
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

