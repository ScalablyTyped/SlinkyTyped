package typingsSlinky.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisSettings extends js.Object {
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is False.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.native
  /**
    * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is False.
    */
  var IncludePartitionValue: js.UndefOr[BooleanOptional] = js.native
  /**
    * Includes any data definition language (DDL) operations that change the table in the control data, such as rename-table, drop-table, add-column, drop-column, and rename-column. The default is False.
    */
  var IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.native
  /**
    * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for transaction_id, previous transaction_id, and transaction_record_id (the record offset within a transaction). The default is False.
    */
  var IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.native
  /**
    * The output format for the records created on the endpoint. The message format is JSON (default) or JSON_UNFORMATTED (a single line with no tab).
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.native
  /**
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same shard, which causes throttling. The default is False.
    */
  var PartitionIncludeSchemaTable: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) for the AWS Identity and Access Management (IAM) role that AWS DMS uses to write to the Kinesis data stream.
    */
  var ServiceAccessRoleArn: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the Amazon Kinesis Data Streams endpoint.
    */
  var StreamArn: js.UndefOr[String] = js.native
}

object KinesisSettings {
  @scala.inline
  def apply(): KinesisSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisSettings]
  }
  @scala.inline
  implicit class KinesisSettingsOps[Self <: KinesisSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIncludeControlDetails(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeControlDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeControlDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeControlDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludePartitionValue(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePartitionValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludePartitionValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludePartitionValue")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTableAlterOperations(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTableAlterOperations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTableAlterOperations: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTableAlterOperations")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeTransactionDetails(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTransactionDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeTransactionDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IncludeTransactionDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMessageFormat(value: MessageFormatValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessageFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MessageFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPartitionIncludeSchemaTable(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionIncludeSchemaTable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartitionIncludeSchemaTable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PartitionIncludeSchemaTable")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceAccessRoleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceAccessRoleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceAccessRoleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamArn")(js.undefined)
        ret
    }
  }
  
}

