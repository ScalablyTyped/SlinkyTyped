package typingsSlinky.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableDescription extends js.Object {
  /**
    * Contains information about the table archive.
    */
  var ArchivalSummary: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.ArchivalSummary] = js.native
  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
    */
  var AttributeDefinitions: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.AttributeDefinitions] = js.native
  /**
    * Contains the details for the read/write capacity mode.
    */
  var BillingModeSummary: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.BillingModeSummary] = js.native
  /**
    * The date and time when the table was created, in UNIX epoch time format.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table. It is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)   You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
    */
  var GlobalSecondaryIndexes: js.UndefOr[GlobalSecondaryIndexDescriptionList] = js.native
  /**
    * Represents the version of global tables in use, if the table is replicated across AWS Regions.
    */
  var GlobalTableVersion: js.UndefOr[String] = js.native
  /**
    * The number of items in the specified table. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var ItemCount: js.UndefOr[Long] = js.native
  /**
    * The primary key structure for the table. Each KeySchemaElement consists of:    AttributeName - The name of the attribute.    KeyType - The role of the attribute:    HASH - partition key    RANGE - sort key    The partition key of an item is also known as its hash attribute. The term "hash attribute" derives from DynamoDB's usage of an internal hash function to evenly distribute data items across partitions, based on their partition key values. The sort key of an item is also known as its range attribute. The term "range attribute" derives from the way DynamoDB stores items with the same partition key physically close together, in sorted order by the sort key value.    For more information about primary keys, see Primary Key in the Amazon DynamoDB Developer Guide.
    */
  var KeySchema: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.KeySchema] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the latest stream for this table.
    */
  var LatestStreamArn: js.UndefOr[StreamArn] = js.native
  /**
    * A timestamp, in ISO 8601 format, for this stream. Note that LatestStreamLabel is not a unique identifier for the stream, because it is possible that a stream from another table might have the same timestamp. However, the combination of the following three elements is guaranteed to be unique:   AWS customer ID   Table name    StreamLabel   
    */
  var LatestStreamLabel: js.UndefOr[String] = js.native
  /**
    * Represents one or more local secondary indexes on the table. Each index is scoped to a given partition key value. Tables with one or more local secondary indexes are subject to an item collection size limit, where the amount of data within a given item collection cannot exceed 10 GB. Each element is composed of:    IndexName - The name of the local secondary index.    KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - Only the specified table attributes are projected into the index. The list of projected attributes is in NonKeyAttributes.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      IndexSizeBytes - Represents the total size of the index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.    ItemCount - Represents the number of items in the index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.   If the table is in the DELETING state, no information about indexes will be returned.
    */
  var LocalSecondaryIndexes: js.UndefOr[LocalSecondaryIndexDescriptionList] = js.native
  /**
    * The provisioned throughput settings for the table, consisting of read and write capacity units, along with data about increases and decreases.
    */
  var ProvisionedThroughput: js.UndefOr[ProvisionedThroughputDescription] = js.native
  /**
    * Represents replicas of the table.
    */
  var Replicas: js.UndefOr[ReplicaDescriptionList] = js.native
  /**
    * Contains details for the restore.
    */
  var RestoreSummary: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.RestoreSummary] = js.native
  /**
    * The description of the server-side encryption status on the specified table.
    */
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.SSEDescription] = js.native
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.StreamSpecification] = js.native
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the table.
    */
  var TableArn: js.UndefOr[String] = js.native
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableId] = js.native
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableName] = js.native
  /**
    * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible. Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival process when a table's AWS KMS key remains inaccessible for more than seven days.     ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.     ARCHIVED - The table has been archived. See the ArchivalReason for more information.   
    */
  var TableStatus: js.UndefOr[typingsSlinky.awsSdk.documentClientMod.DocumentClient.TableStatus] = js.native
}

object TableDescription {
  @scala.inline
  def apply(): TableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDescription]
  }
  @scala.inline
  implicit class TableDescriptionOps[Self <: TableDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArchivalSummary(value: ArchivalSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchivalSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArchivalSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ArchivalSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeDefinitions(value: AttributeDefinitions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeDefinitions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttributeDefinitions")(js.undefined)
        ret
    }
    @scala.inline
    def withBillingModeSummary(value: BillingModeSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingModeSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingModeSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BillingModeSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalSecondaryIndexes(value: GlobalSecondaryIndexDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobalTableVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobalTableVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GlobalTableVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withItemCount(value: Long): Self = {
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
    def withKeySchema(value: KeySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeySchema: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeySchema")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestStreamArn(value: StreamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestStreamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestStreamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestStreamArn")(js.undefined)
        ret
    }
    @scala.inline
    def withLatestStreamLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestStreamLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLatestStreamLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestStreamLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withLocalSecondaryIndexes(value: LocalSecondaryIndexDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocalSecondaryIndexes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocalSecondaryIndexes")(js.undefined)
        ret
    }
    @scala.inline
    def withProvisionedThroughput(value: ProvisionedThroughputDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughput")(js.undefined)
        ret
    }
    @scala.inline
    def withReplicas(value: ReplicaDescriptionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replicas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReplicas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Replicas")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreSummary(value: RestoreSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withSSEDescription(value: SSEDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSSEDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SSEDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withStreamSpecification(value: StreamSpecification): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSpecification")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStreamSpecification: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StreamSpecification")(js.undefined)
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
    def withTableId(value: TableId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableId")(js.undefined)
        ret
    }
    @scala.inline
    def withTableName(value: TableName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableName")(js.undefined)
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
    @scala.inline
    def withTableStatus(value: TableStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableStatus")(js.undefined)
        ret
    }
  }
  
}

