package typingsSlinky.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeDefinitionMod.AttributeDefinition
import typingsSlinky.awsSdkClientDynamodbNode.typesAttributeValueMod.AttributeValue
import typingsSlinky.awsSdkClientDynamodbNode.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbNode.typesKeysAndAttributesMod.KeysAndAttributes
import typingsSlinky.awsSdkClientDynamodbNode.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import typingsSlinky.awsSdkClientDynamodbNode.typesReplicaUpdateMod.ReplicaUpdate
import typingsSlinky.awsSdkClientDynamodbNode.typesTagMod.Tag
import typingsSlinky.awsSdkClientDynamodbNode.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typingsSlinky.awsSdkClientDynamodbNode.typesWriteRequestMod.WriteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput
    - typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (js.Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    @scala.inline
    def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | js.Iterable[WriteRequest]]) | (js.Iterable[js.Tuple2[String, js.Array[WriteRequest] | js.Iterable[WriteRequest]]])
    ): typingsSlinky.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    @scala.inline
    def CreateBackupInput(BackupName: String, TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    @scala.inline
    def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | js.Iterable[Replica]): typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    @scala.inline
    def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesCreateTableInputMod.CreateTableInput]
    }
    
    @scala.inline
    def DeleteBackupInput(BackupArn: String): typingsSlinky.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    @scala.inline
    def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    @scala.inline
    def DeleteTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    @scala.inline
    def DescribeBackupInput(BackupArn: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    @scala.inline
    def DescribeContinuousBackupsInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    @scala.inline
    def DescribeEndpointsInput(): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    @scala.inline
    def DescribeGlobalTableInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    @scala.inline
    def DescribeGlobalTableSettingsInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    @scala.inline
    def DescribeLimitsInput(): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    @scala.inline
    def DescribeTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    @scala.inline
    def DescribeTimeToLiveInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    @scala.inline
    def GetItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesGetItemInputMod.GetItemInput]
    }
    
    @scala.inline
    def ListBackupsInput(): typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesListBackupsInputMod.ListBackupsInput]
    }
    
    @scala.inline
    def ListGlobalTablesInput(): typingsSlinky.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    @scala.inline
    def ListTablesInput(): typingsSlinky.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesListTablesInputMod.ListTablesInput]
    }
    
    @scala.inline
    def ListTagsOfResourceInput(ResourceArn: String): typingsSlinky.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    @scala.inline
    def PutItemInput(
      Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesPutItemInputMod.PutItemInput]
    }
    
    @scala.inline
    def QueryInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesQueryInputMod.QueryInput]
    }
    
    @scala.inline
    def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    @scala.inline
    def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    @scala.inline
    def ScanInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesScanInputMod.ScanInput]
    }
    
    @scala.inline
    def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsSlinky.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    @scala.inline
    def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    @scala.inline
    def UpdateGlobalTableSettingsInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    @scala.inline
    def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    @scala.inline
    def UpdateTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    @scala.inline
    def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbNode.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}
