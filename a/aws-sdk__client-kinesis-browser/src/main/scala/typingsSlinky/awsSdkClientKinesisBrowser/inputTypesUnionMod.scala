package typingsSlinky.awsSdkClientKinesisBrowser

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AFTER_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ALL
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_SEQUENCE_NUMBER
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.AT_TIMESTAMP
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingBytes
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IncomingRecords
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.IteratorAgeMilliseconds
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.LATEST
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingBytes
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.OutgoingRecords
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ReadProvisionedThroughputExceeded
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.TRIM_HORIZON
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UNIFORM_SCALING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.WriteProvisionedThroughputExceeded
import typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsRequestEntryMod.PutRecordsRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputTypesUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput
    - typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput
  */
  trait InputTypesUnion extends StObject
  object InputTypesUnion {
    
    @scala.inline
    def AddTagsToStreamInput(StreamName: String, Tags: StringDictionary[String] | (js.Iterable[js.Tuple2[String, String]])): typingsSlinky.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesAddTagsToStreamInputMod.AddTagsToStreamInput]
    }
    
    @scala.inline
    def CreateStreamInput(ShardCount: Double, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput = {
      val __obj = js.Dynamic.literal(ShardCount = ShardCount.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesCreateStreamInputMod.CreateStreamInput]
    }
    
    @scala.inline
    def DecreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDecreaseStreamRetentionPeriodInputMod.DecreaseStreamRetentionPeriodInput]
    }
    
    @scala.inline
    def DeleteStreamInput(StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDeleteStreamInputMod.DeleteStreamInput]
    }
    
    @scala.inline
    def DeregisterStreamConsumerInput(): typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDeregisterStreamConsumerInputMod.DeregisterStreamConsumerInput]
    }
    
    @scala.inline
    def DescribeLimitsInput(): typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeLimitsInputMod.DescribeLimitsInput]
    }
    
    @scala.inline
    def DescribeStreamConsumerInput(): typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamConsumerInputMod.DescribeStreamConsumerInput]
    }
    
    @scala.inline
    def DescribeStreamInput(StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamInputMod.DescribeStreamInput]
    }
    
    @scala.inline
    def DescribeStreamSummaryInput(StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDescribeStreamSummaryInputMod.DescribeStreamSummaryInput]
    }
    
    @scala.inline
    def DisableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesDisableEnhancedMonitoringInputMod.DisableEnhancedMonitoringInput]
    }
    
    @scala.inline
    def EnableEnhancedMonitoringInput(
      ShardLevelMetrics: (js.Array[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]) | (js.Iterable[
          IncomingBytes | IncomingRecords | OutgoingBytes | OutgoingRecords | WriteProvisionedThroughputExceeded | ReadProvisionedThroughputExceeded | IteratorAgeMilliseconds | ALL | String
        ]),
      StreamName: String
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput = {
      val __obj = js.Dynamic.literal(ShardLevelMetrics = ShardLevelMetrics.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesEnableEnhancedMonitoringInputMod.EnableEnhancedMonitoringInput]
    }
    
    @scala.inline
    def GetRecordsInput(ShardIterator: String): typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput = {
      val __obj = js.Dynamic.literal(ShardIterator = ShardIterator.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesGetRecordsInputMod.GetRecordsInput]
    }
    
    @scala.inline
    def GetShardIteratorInput(
      ShardId: String,
      ShardIteratorType: AT_SEQUENCE_NUMBER | AFTER_SEQUENCE_NUMBER | TRIM_HORIZON | LATEST | AT_TIMESTAMP | String,
      StreamName: String
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput = {
      val __obj = js.Dynamic.literal(ShardId = ShardId.asInstanceOf[js.Any], ShardIteratorType = ShardIteratorType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesGetShardIteratorInputMod.GetShardIteratorInput]
    }
    
    @scala.inline
    def IncreaseStreamRetentionPeriodInput(RetentionPeriodHours: Double, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput = {
      val __obj = js.Dynamic.literal(RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesIncreaseStreamRetentionPeriodInputMod.IncreaseStreamRetentionPeriodInput]
    }
    
    @scala.inline
    def ListShardsInput(): typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesListShardsInputMod.ListShardsInput]
    }
    
    @scala.inline
    def ListStreamConsumersInput(StreamARN: String): typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput = {
      val __obj = js.Dynamic.literal(StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamConsumersInputMod.ListStreamConsumersInput]
    }
    
    @scala.inline
    def ListStreamsInput(): typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesListStreamsInputMod.ListStreamsInput]
    }
    
    @scala.inline
    def ListTagsForStreamInput(StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesListTagsForStreamInputMod.ListTagsForStreamInput]
    }
    
    @scala.inline
    def MergeShardsInput(AdjacentShardToMerge: String, ShardToMerge: String, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput = {
      val __obj = js.Dynamic.literal(AdjacentShardToMerge = AdjacentShardToMerge.asInstanceOf[js.Any], ShardToMerge = ShardToMerge.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesMergeShardsInputMod.MergeShardsInput]
    }
    
    @scala.inline
    def PutRecordInput(
      Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      PartitionKey: String,
      StreamName: String
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordInputMod.PutRecordInput]
    }
    
    @scala.inline
    def PutRecordsInput(
      Records: js.Array[PutRecordsRequestEntry] | js.Iterable[PutRecordsRequestEntry],
      StreamName: String
    ): typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput = {
      val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesPutRecordsInputMod.PutRecordsInput]
    }
    
    @scala.inline
    def RegisterStreamConsumerInput(ConsumerName: String, StreamARN: String): typingsSlinky.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput = {
      val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesRegisterStreamConsumerInputMod.RegisterStreamConsumerInput]
    }
    
    @scala.inline
    def RemoveTagsFromStreamInput(StreamName: String, TagKeys: js.Array[String] | js.Iterable[String]): typingsSlinky.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput = {
      val __obj = js.Dynamic.literal(StreamName = StreamName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesRemoveTagsFromStreamInputMod.RemoveTagsFromStreamInput]
    }
    
    @scala.inline
    def SplitShardInput(NewStartingHashKey: String, ShardToSplit: String, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput = {
      val __obj = js.Dynamic.literal(NewStartingHashKey = NewStartingHashKey.asInstanceOf[js.Any], ShardToSplit = ShardToSplit.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesSplitShardInputMod.SplitShardInput]
    }
    
    @scala.inline
    def StartStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesStartStreamEncryptionInputMod.StartStreamEncryptionInput]
    }
    
    @scala.inline
    def StopStreamEncryptionInput(EncryptionType: NONE | KMS | String, KeyId: String, StreamName: String): typingsSlinky.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput = {
      val __obj = js.Dynamic.literal(EncryptionType = EncryptionType.asInstanceOf[js.Any], KeyId = KeyId.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesStopStreamEncryptionInputMod.StopStreamEncryptionInput]
    }
    
    @scala.inline
    def UpdateShardCountInput(ScalingType: UNIFORM_SCALING | String, StreamName: String, TargetShardCount: Double): typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput = {
      val __obj = js.Dynamic.literal(ScalingType = ScalingType.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], TargetShardCount = TargetShardCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.awsSdkClientKinesisBrowser.typesUpdateShardCountInputMod.UpdateShardCountInput]
    }
  }
}
