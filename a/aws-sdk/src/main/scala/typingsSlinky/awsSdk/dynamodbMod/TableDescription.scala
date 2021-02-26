package typingsSlinky.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableDescription extends StObject {
  
  /**
    * Contains information about the table archive.
    */
  var ArchivalSummary: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.ArchivalSummary] = js.native
  
  /**
    * An array of AttributeDefinition objects. Each of these objects describes one attribute in the table and index key schema. Each AttributeDefinition object in this array is composed of:    AttributeName - The name of the attribute.    AttributeType - The data type for the attribute.  
    */
  var AttributeDefinitions: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.AttributeDefinitions] = js.native
  
  /**
    * Contains the details for the read/write capacity mode.
    */
  var BillingModeSummary: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.BillingModeSummary] = js.native
  
  /**
    * The date and time when the table was created, in UNIX epoch time format.
    */
  var CreationDateTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The global secondary indexes, if any, on the table. Each index is scoped to a given partition key value. Each element is composed of:    Backfilling - If true, then the index is currently in the backfilling phase. Backfilling occurs only when a new global secondary index is added to the table. It is the process by which DynamoDB populates the new index with data from the table. (This attribute does not appear for indexes that were created during a CreateTable operation.)   You can delete an index that is being created during the Backfilling phase when IndexStatus is set to CREATING and Backfilling is true. You can't delete the index that is being created when IndexStatus is set to CREATING and Backfilling is false. (This attribute does not appear for indexes that were created during a CreateTable operation.)    IndexName - The name of the global secondary index.    IndexSizeBytes - The total size of the global secondary index, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     IndexStatus - The current status of the global secondary index:    CREATING - The index is being created.    UPDATING - The index is being updated.    DELETING - The index is being deleted.    ACTIVE - The index is ready for use.      ItemCount - The number of items in the global secondary index. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.     KeySchema - Specifies the complete index key schema. The attribute names in the key schema must be between 1 and 255 characters (inclusive). The key schema must begin with the same partition key as the table.    Projection - Specifies attributes that are copied (projected) from the table into the index. These are in addition to the primary key attributes and index key attributes, which are automatically projected. Each attribute specification is composed of:    ProjectionType - One of the following:    KEYS_ONLY - Only the index and primary keys are projected into the index.    INCLUDE - In addition to the attributes described in KEYS_ONLY, the secondary index will include other non-key attributes that you specify.    ALL - All of the table attributes are projected into the index.      NonKeyAttributes - A list of one or more non-key attribute names that are projected into the secondary index. The total count of attributes provided in NonKeyAttributes, summed across all of the secondary indexes, must not exceed 20. If you project the same attribute into two different indexes, this counts as two distinct attributes when determining the total.      ProvisionedThroughput - The provisioned throughput settings for the global secondary index, consisting of read and write capacity units, along with data about increases and decreases.    If the table is in the DELETING state, no information about indexes will be returned.
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
  var KeySchema: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.KeySchema] = js.native
  
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
  var RestoreSummary: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.RestoreSummary] = js.native
  
  /**
    * The description of the server-side encryption status on the specified table.
    */
  var SSEDescription: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.SSEDescription] = js.native
  
  /**
    * The current DynamoDB Streams configuration for the table.
    */
  var StreamSpecification: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.StreamSpecification] = js.native
  
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the table.
    */
  var TableArn: js.UndefOr[String] = js.native
  
  /**
    * Unique identifier for the table for which the backup was created. 
    */
  var TableId: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableId] = js.native
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableName] = js.native
  
  /**
    * The total size of the specified table, in bytes. DynamoDB updates this value approximately every six hours. Recent changes might not be reflected in this value.
    */
  var TableSizeBytes: js.UndefOr[Long] = js.native
  
  /**
    * The current state of the table:    CREATING - The table is being created.    UPDATING - The table is being updated.    DELETING - The table is being deleted.    ACTIVE - The table is ready for use.    INACCESSIBLE_ENCRYPTION_CREDENTIALS - The AWS KMS key used to encrypt the table in inaccessible. Table operations may fail due to failure to use the AWS KMS key. DynamoDB will initiate the table archival process when a table's AWS KMS key remains inaccessible for more than seven days.     ARCHIVING - The table is being archived. Operations are not allowed until archival is complete.     ARCHIVED - The table has been archived. See the ArchivalReason for more information.   
    */
  var TableStatus: js.UndefOr[typingsSlinky.awsSdk.dynamodbMod.TableStatus] = js.native
}
object TableDescription {
  
  @scala.inline
  def apply(): TableDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableDescription]
  }
  
  @scala.inline
  implicit class TableDescriptionMutableBuilder[Self <: TableDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchivalSummary(value: ArchivalSummary): Self = StObject.set(x, "ArchivalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchivalSummaryUndefined: Self = StObject.set(x, "ArchivalSummary", js.undefined)
    
    @scala.inline
    def setAttributeDefinitions(value: AttributeDefinitions): Self = StObject.set(x, "AttributeDefinitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeDefinitionsUndefined: Self = StObject.set(x, "AttributeDefinitions", js.undefined)
    
    @scala.inline
    def setAttributeDefinitionsVarargs(value: AttributeDefinition*): Self = StObject.set(x, "AttributeDefinitions", js.Array(value :_*))
    
    @scala.inline
    def setBillingModeSummary(value: BillingModeSummary): Self = StObject.set(x, "BillingModeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingModeSummaryUndefined: Self = StObject.set(x, "BillingModeSummary", js.undefined)
    
    @scala.inline
    def setCreationDateTime(value: js.Date): Self = StObject.set(x, "CreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateTimeUndefined: Self = StObject.set(x, "CreationDateTime", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexes(value: GlobalSecondaryIndexDescriptionList): Self = StObject.set(x, "GlobalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalSecondaryIndexesUndefined: Self = StObject.set(x, "GlobalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setGlobalSecondaryIndexesVarargs(value: GlobalSecondaryIndexDescription*): Self = StObject.set(x, "GlobalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setGlobalTableVersion(value: String): Self = StObject.set(x, "GlobalTableVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalTableVersionUndefined: Self = StObject.set(x, "GlobalTableVersion", js.undefined)
    
    @scala.inline
    def setItemCount(value: Long): Self = StObject.set(x, "ItemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemCountUndefined: Self = StObject.set(x, "ItemCount", js.undefined)
    
    @scala.inline
    def setKeySchema(value: KeySchema): Self = StObject.set(x, "KeySchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeySchemaUndefined: Self = StObject.set(x, "KeySchema", js.undefined)
    
    @scala.inline
    def setKeySchemaVarargs(value: KeySchemaElement*): Self = StObject.set(x, "KeySchema", js.Array(value :_*))
    
    @scala.inline
    def setLatestStreamArn(value: StreamArn): Self = StObject.set(x, "LatestStreamArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestStreamArnUndefined: Self = StObject.set(x, "LatestStreamArn", js.undefined)
    
    @scala.inline
    def setLatestStreamLabel(value: String): Self = StObject.set(x, "LatestStreamLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestStreamLabelUndefined: Self = StObject.set(x, "LatestStreamLabel", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexes(value: LocalSecondaryIndexDescriptionList): Self = StObject.set(x, "LocalSecondaryIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalSecondaryIndexesUndefined: Self = StObject.set(x, "LocalSecondaryIndexes", js.undefined)
    
    @scala.inline
    def setLocalSecondaryIndexesVarargs(value: LocalSecondaryIndexDescription*): Self = StObject.set(x, "LocalSecondaryIndexes", js.Array(value :_*))
    
    @scala.inline
    def setProvisionedThroughput(value: ProvisionedThroughputDescription): Self = StObject.set(x, "ProvisionedThroughput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedThroughputUndefined: Self = StObject.set(x, "ProvisionedThroughput", js.undefined)
    
    @scala.inline
    def setReplicas(value: ReplicaDescriptionList): Self = StObject.set(x, "Replicas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasUndefined: Self = StObject.set(x, "Replicas", js.undefined)
    
    @scala.inline
    def setReplicasVarargs(value: ReplicaDescription*): Self = StObject.set(x, "Replicas", js.Array(value :_*))
    
    @scala.inline
    def setRestoreSummary(value: RestoreSummary): Self = StObject.set(x, "RestoreSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestoreSummaryUndefined: Self = StObject.set(x, "RestoreSummary", js.undefined)
    
    @scala.inline
    def setSSEDescription(value: SSEDescription): Self = StObject.set(x, "SSEDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSEDescriptionUndefined: Self = StObject.set(x, "SSEDescription", js.undefined)
    
    @scala.inline
    def setStreamSpecification(value: StreamSpecification): Self = StObject.set(x, "StreamSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamSpecificationUndefined: Self = StObject.set(x, "StreamSpecification", js.undefined)
    
    @scala.inline
    def setTableArn(value: String): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableArnUndefined: Self = StObject.set(x, "TableArn", js.undefined)
    
    @scala.inline
    def setTableId(value: TableId): Self = StObject.set(x, "TableId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableIdUndefined: Self = StObject.set(x, "TableId", js.undefined)
    
    @scala.inline
    def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
    
    @scala.inline
    def setTableSizeBytes(value: Long): Self = StObject.set(x, "TableSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableSizeBytesUndefined: Self = StObject.set(x, "TableSizeBytes", js.undefined)
    
    @scala.inline
    def setTableStatus(value: TableStatus): Self = StObject.set(x, "TableStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableStatusUndefined: Self = StObject.set(x, "TableStatus", js.undefined)
  }
}
