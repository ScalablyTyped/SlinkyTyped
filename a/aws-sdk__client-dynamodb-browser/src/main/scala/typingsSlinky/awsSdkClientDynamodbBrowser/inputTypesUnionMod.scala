package typingsSlinky.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeDefinitionMod.AttributeDefinition
import typingsSlinky.awsSdkClientDynamodbBrowser.typesAttributeValueMod.AttributeValue
import typingsSlinky.awsSdkClientDynamodbBrowser.typesKeySchemaElementMod.KeySchemaElement
import typingsSlinky.awsSdkClientDynamodbBrowser.typesKeysAndAttributesMod.KeysAndAttributes
import typingsSlinky.awsSdkClientDynamodbBrowser.typesPointInTimeRecoverySpecificationMod.PointInTimeRecoverySpecification
import typingsSlinky.awsSdkClientDynamodbBrowser.typesProvisionedThroughputMod.ProvisionedThroughput
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaMod.Replica
import typingsSlinky.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTagMod.Tag
import typingsSlinky.awsSdkClientDynamodbBrowser.typesTimeToLiveSpecificationMod.TimeToLiveSpecification
import typingsSlinky.awsSdkClientDynamodbBrowser.typesWriteRequestMod.WriteRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput
    - typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def BatchGetItemInput(
      RequestItems: StringDictionary[KeysAndAttributes] | (js.Iterable[js.Tuple2[String, KeysAndAttributes]])
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchGetItemInputMod.BatchGetItemInput]
    }
    
    @scala.inline
    def BatchWriteItemInput(
      RequestItems: (StringDictionary[js.Array[WriteRequest] | js.Iterable[WriteRequest]]) | (js.Iterable[js.Tuple2[String, js.Array[WriteRequest] | js.Iterable[WriteRequest]]])
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput = {
      val __obj = js.Dynamic.literal(RequestItems = RequestItems.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesBatchWriteItemInputMod.BatchWriteItemInput]
    }
    
    @scala.inline
    def CreateBackupInput(BackupName: String, TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput = {
      val __obj = js.Dynamic.literal(BackupName = BackupName.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateBackupInputMod.CreateBackupInput]
    }
    
    @scala.inline
    def CreateGlobalTableInput(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | js.Iterable[Replica]): typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateGlobalTableInputMod.CreateGlobalTableInput]
    }
    
    @scala.inline
    def CreateTableInput(
      AttributeDefinitions: js.Array[AttributeDefinition] | js.Iterable[AttributeDefinition],
      KeySchema: js.Array[KeySchemaElement] | js.Iterable[KeySchemaElement],
      ProvisionedThroughput: ProvisionedThroughput,
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput = {
      val __obj = js.Dynamic.literal(AttributeDefinitions = AttributeDefinitions.asInstanceOf[js.Any], KeySchema = KeySchema.asInstanceOf[js.Any], ProvisionedThroughput = ProvisionedThroughput.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesCreateTableInputMod.CreateTableInput]
    }
    
    @scala.inline
    def DeleteBackupInput(BackupArn: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteBackupInputMod.DeleteBackupInput]
    }
    
    @scala.inline
    def DeleteItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteItemInputMod.DeleteItemInput]
    }
    
    @scala.inline
    def DeleteTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDeleteTableInputMod.DeleteTableInput]
    }
    
    @scala.inline
    def DescribeBackupInput(BackupArn: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeBackupInputMod.DescribeBackupInput]
    }
    
    @scala.inline
    def DescribeContinuousBackupsInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeContinuousBackupsInputMod.DescribeContinuousBackupsInput]
    }
    
    @scala.inline
    def DescribeEndpointsInput(): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeEndpointsInputMod.DescribeEndpointsInput]
    }
    
    @scala.inline
    def DescribeGlobalTableInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableInputMod.DescribeGlobalTableInput]
    }
    
    @scala.inline
    def DescribeGlobalTableSettingsInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeGlobalTableSettingsInputMod.DescribeGlobalTableSettingsInput]
    }
    
    @scala.inline
    def DescribeLimitsInput(): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    @scala.inline
    def DescribeTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTableInputMod.DescribeTableInput]
    }
    
    @scala.inline
    def DescribeTimeToLiveInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesDescribeTimeToLiveInputMod.DescribeTimeToLiveInput]
    }
    
    @scala.inline
    def GetItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesGetItemInputMod.GetItemInput]
    }
    
    @scala.inline
    def ListBackupsInput(): typingsSlinky.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesListBackupsInputMod.ListBackupsInput]
    }
    
    @scala.inline
    def ListGlobalTablesInput(): typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesListGlobalTablesInputMod.ListGlobalTablesInput]
    }
    
    @scala.inline
    def ListTablesInput(): typingsSlinky.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesListTablesInputMod.ListTablesInput]
    }
    
    @scala.inline
    def ListTagsOfResourceInput(ResourceArn: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesListTagsOfResourceInputMod.ListTagsOfResourceInput]
    }
    
    @scala.inline
    def PutItemInput(
      Item: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesPutItemInputMod.PutItemInput]
    }
    
    @scala.inline
    def QueryInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesQueryInputMod.QueryInput]
    }
    
    @scala.inline
    def RestoreTableFromBackupInput(BackupArn: String, TargetTableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput = {
      val __obj = js.Dynamic.literal(BackupArn = BackupArn.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableFromBackupInputMod.RestoreTableFromBackupInput]
    }
    
    @scala.inline
    def RestoreTableToPointInTimeInput(SourceTableName: String, TargetTableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput = {
      val __obj = js.Dynamic.literal(SourceTableName = SourceTableName.asInstanceOf[js.Any], TargetTableName = TargetTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesRestoreTableToPointInTimeInputMod.RestoreTableToPointInTimeInput]
    }
    
    @scala.inline
    def ScanInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesScanInputMod.ScanInput]
    }
    
    @scala.inline
    def TagResourceInput(ResourceArn: String, Tags: js.Array[Tag] | js.Iterable[Tag]): typingsSlinky.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesTagResourceInputMod.TagResourceInput]
    }
    
    @scala.inline
    def UntagResourceInput(ResourceArn: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput = {
      val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUntagResourceInputMod.UntagResourceInput]
    }
    
    @scala.inline
    def UpdateContinuousBackupsInput(PointInTimeRecoverySpecification: PointInTimeRecoverySpecification, TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput = {
      val __obj = js.Dynamic.literal(PointInTimeRecoverySpecification = PointInTimeRecoverySpecification.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateContinuousBackupsInputMod.UpdateContinuousBackupsInput]
    }
    
    @scala.inline
    def UpdateGlobalTableInput(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | js.Iterable[ReplicaUpdate]): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput]
    }
    
    @scala.inline
    def UpdateGlobalTableSettingsInput(GlobalTableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput = {
      val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableSettingsInputMod.UpdateGlobalTableSettingsInput]
    }
    
    @scala.inline
    def UpdateItemInput(
      Key: StringDictionary[AttributeValue] | (js.Iterable[js.Tuple2[String, AttributeValue]]),
      TableName: String
    ): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput = {
      val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateItemInputMod.UpdateItemInput]
    }
    
    @scala.inline
    def UpdateTableInput(TableName: String): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTableInputMod.UpdateTableInput]
    }
    
    @scala.inline
    def UpdateTimeToLiveInput(TableName: String, TimeToLiveSpecification: TimeToLiveSpecification): typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput = {
      val __obj = js.Dynamic.literal(TableName = TableName.asInstanceOf[js.Any], TimeToLiveSpecification = TimeToLiveSpecification.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientDynamodbBrowser.typesUpdateTimeToLiveInputMod.UpdateTimeToLiveInput]
    }
  }
}
