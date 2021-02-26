package typingsSlinky.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisSettings extends StObject {
  
  /**
    * Shows detailed control information for table definition, column definition, and table and column changes in the Kinesis message output. The default is false.
    */
  var IncludeControlDetails: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Include NULL and empty columns for records migrated to the endpoint. The default is false.
    */
  var IncludeNullAndEmpty: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Shows the partition value within the Kinesis message output, unless the partition type is schema-table-type. The default is false.
    */
  var IncludePartitionValue: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Includes any data definition language (DDL) operations that change the table in the control data, such as rename-table, drop-table, add-column, drop-column, and rename-column. The default is false.
    */
  var IncludeTableAlterOperations: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * Provides detailed transaction information from the source database. This information includes a commit timestamp, a log position, and values for transaction_id, previous transaction_id, and transaction_record_id (the record offset within a transaction). The default is false.
    */
  var IncludeTransactionDetails: js.UndefOr[BooleanOptional] = js.native
  
  /**
    * The output format for the records created on the endpoint. The message format is JSON (default) or JSON_UNFORMATTED (a single line with no tab).
    */
  var MessageFormat: js.UndefOr[MessageFormatValue] = js.native
  
  /**
    * Prefixes schema and table names to partition values, when the partition type is primary-key-type. Doing this increases data distribution among Kinesis shards. For example, suppose that a SysBench schema has thousands of tables and each table has only limited range for a primary key. In this case, the same primary key is sent from thousands of tables to the same shard, which causes throttling. The default is false.
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
  implicit class KinesisSettingsMutableBuilder[Self <: KinesisSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIncludeControlDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeControlDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeControlDetailsUndefined: Self = StObject.set(x, "IncludeControlDetails", js.undefined)
    
    @scala.inline
    def setIncludeNullAndEmpty(value: BooleanOptional): Self = StObject.set(x, "IncludeNullAndEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeNullAndEmptyUndefined: Self = StObject.set(x, "IncludeNullAndEmpty", js.undefined)
    
    @scala.inline
    def setIncludePartitionValue(value: BooleanOptional): Self = StObject.set(x, "IncludePartitionValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludePartitionValueUndefined: Self = StObject.set(x, "IncludePartitionValue", js.undefined)
    
    @scala.inline
    def setIncludeTableAlterOperations(value: BooleanOptional): Self = StObject.set(x, "IncludeTableAlterOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTableAlterOperationsUndefined: Self = StObject.set(x, "IncludeTableAlterOperations", js.undefined)
    
    @scala.inline
    def setIncludeTransactionDetails(value: BooleanOptional): Self = StObject.set(x, "IncludeTransactionDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeTransactionDetailsUndefined: Self = StObject.set(x, "IncludeTransactionDetails", js.undefined)
    
    @scala.inline
    def setMessageFormat(value: MessageFormatValue): Self = StObject.set(x, "MessageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageFormatUndefined: Self = StObject.set(x, "MessageFormat", js.undefined)
    
    @scala.inline
    def setPartitionIncludeSchemaTable(value: BooleanOptional): Self = StObject.set(x, "PartitionIncludeSchemaTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionIncludeSchemaTableUndefined: Self = StObject.set(x, "PartitionIncludeSchemaTable", js.undefined)
    
    @scala.inline
    def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "ServiceAccessRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "ServiceAccessRoleArn", js.undefined)
    
    @scala.inline
    def setStreamArn(value: String): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
  }
}
