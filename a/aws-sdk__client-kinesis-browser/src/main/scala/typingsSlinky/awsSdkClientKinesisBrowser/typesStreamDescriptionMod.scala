package typingsSlinky.awsSdkClientKinesisBrowser

import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.ACTIVE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.CREATING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.DELETING
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import typingsSlinky.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.UPDATING
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.EnhancedMetrics
import typingsSlinky.awsSdkClientKinesisBrowser.typesEnhancedMetricsMod.UnmarshalledEnhancedMetrics
import typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod.Shard
import typingsSlinky.awsSdkClientKinesisBrowser.typesShardMod.UnmarshalledShard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesStreamDescriptionMod {
  
  @js.native
  trait StreamDescription extends StObject {
    
    /**
      * <p>The server-side encryption type used on the stream. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
      */
    var EncryptionType: js.UndefOr[NONE | KMS | String] = js.native
    
    /**
      * <p>Represents the current enhanced monitoring settings of the stream.</p>
      */
    var EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics] = js.native
    
    /**
      * <p>If set to <code>true</code>, more shards in the stream are available to describe.</p>
      */
    var HasMoreShards: Boolean = js.native
    
    /**
      * <p>The GUID for the customer-managed AWS KMS key to use for encryption. This value can be a globally unique identifier, a fully specified ARN to either an alias or a key, or an alias name prefixed by "alias/".You can also use a master key owned by Kinesis Data Streams by specifying the alias <code>aws/kinesis</code>.</p> <ul> <li> <p>Key ARN example: <code>arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias ARN example: <code>arn:aws:kms:us-east-1:123456789012:alias/MyAliasName</code> </p> </li> <li> <p>Globally unique key ID example: <code>12345678-1234-1234-1234-123456789012</code> </p> </li> <li> <p>Alias name example: <code>alias/MyAliasName</code> </p> </li> <li> <p>Master key owned by Kinesis Data Streams: <code>alias/aws/kinesis</code> </p> </li> </ul>
      */
    var KeyId: js.UndefOr[String] = js.native
    
    /**
      * <p>The current retention period, in hours.</p>
      */
    var RetentionPeriodHours: Double = js.native
    
    /**
      * <p>The shards that comprise the stream.</p>
      */
    var Shards: js.Array[Shard] | js.Iterable[Shard] = js.native
    
    /**
      * <p>The Amazon Resource Name (ARN) for the stream being described.</p>
      */
    var StreamARN: String = js.native
    
    /**
      * <p>The approximate time that the stream was created.</p>
      */
    var StreamCreationTimestamp: js.Date | String | Double = js.native
    
    /**
      * <p>The name of the stream being described.</p>
      */
    var StreamName: String = js.native
    
    /**
      * <p>The current status of the stream being described. The stream status is one of the following states:</p> <ul> <li> <p> <code>CREATING</code> - The stream is being created. Kinesis Data Streams immediately returns and sets <code>StreamStatus</code> to <code>CREATING</code>.</p> </li> <li> <p> <code>DELETING</code> - The stream is being deleted. The specified stream is in the <code>DELETING</code> state until Kinesis Data Streams completes the deletion.</p> </li> <li> <p> <code>ACTIVE</code> - The stream exists and is ready for read and write operations or deletion. You should perform read and write operations only on an <code>ACTIVE</code> stream.</p> </li> <li> <p> <code>UPDATING</code> - Shards in the stream are being merged or split. Read and write operations continue to work while the stream is in the <code>UPDATING</code> state.</p> </li> </ul>
      */
    var StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String = js.native
  }
  object StreamDescription {
    
    @scala.inline
    def apply(
      EnhancedMonitoring: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics],
      HasMoreShards: Boolean,
      RetentionPeriodHours: Double,
      Shards: js.Array[Shard] | js.Iterable[Shard],
      StreamARN: String,
      StreamCreationTimestamp: js.Date | String | Double,
      StreamName: String,
      StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
    ): StreamDescription = {
      val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamDescription]
    }
    
    @scala.inline
    implicit class StreamDescriptionMutableBuilder[Self <: StreamDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionType(value: NONE | KMS | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
      
      @scala.inline
      def setEnhancedMonitoring(value: js.Array[EnhancedMetrics] | js.Iterable[EnhancedMetrics]): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedMonitoringIterable(value: js.Iterable[EnhancedMetrics]): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedMonitoringVarargs(value: EnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value :_*))
      
      @scala.inline
      def setHasMoreShards(value: Boolean): Self = StObject.set(x, "HasMoreShards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyId(value: String): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
      
      @scala.inline
      def setRetentionPeriodHours(value: Double): Self = StObject.set(x, "RetentionPeriodHours", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShards(value: js.Array[Shard] | js.Iterable[Shard]): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardsIterable(value: js.Iterable[Shard]): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardsVarargs(value: Shard*): Self = StObject.set(x, "Shards", js.Array(value :_*))
      
      @scala.inline
      def setStreamARN(value: String): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCreationTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamCreationTimestampDate(value: js.Date): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamName(value: String): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamStatus(value: CREATING | DELETING | ACTIVE | UPDATING | String): Self = StObject.set(x, "StreamStatus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UnmarshalledStreamDescription extends StreamDescription {
    
    /**
      * <p>Represents the current enhanced monitoring settings of the stream.</p>
      */
    @JSName("EnhancedMonitoring")
    var EnhancedMonitoring_UnmarshalledStreamDescription: js.Array[UnmarshalledEnhancedMetrics] = js.native
    
    /**
      * <p>The shards that comprise the stream.</p>
      */
    @JSName("Shards")
    var Shards_UnmarshalledStreamDescription: js.Array[UnmarshalledShard] = js.native
    
    /**
      * <p>The approximate time that the stream was created.</p>
      */
    @JSName("StreamCreationTimestamp")
    var StreamCreationTimestamp_UnmarshalledStreamDescription: js.Date = js.native
  }
  object UnmarshalledStreamDescription {
    
    @scala.inline
    def apply(
      EnhancedMonitoring: js.Array[UnmarshalledEnhancedMetrics],
      HasMoreShards: Boolean,
      RetentionPeriodHours: Double,
      Shards: js.Array[UnmarshalledShard],
      StreamARN: String,
      StreamCreationTimestamp: js.Date,
      StreamName: String,
      StreamStatus: CREATING | DELETING | ACTIVE | UPDATING | String
    ): UnmarshalledStreamDescription = {
      val __obj = js.Dynamic.literal(EnhancedMonitoring = EnhancedMonitoring.asInstanceOf[js.Any], HasMoreShards = HasMoreShards.asInstanceOf[js.Any], RetentionPeriodHours = RetentionPeriodHours.asInstanceOf[js.Any], Shards = Shards.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any], StreamCreationTimestamp = StreamCreationTimestamp.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any], StreamStatus = StreamStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledStreamDescription]
    }
    
    @scala.inline
    implicit class UnmarshalledStreamDescriptionMutableBuilder[Self <: UnmarshalledStreamDescription] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnhancedMonitoring(value: js.Array[UnmarshalledEnhancedMetrics]): Self = StObject.set(x, "EnhancedMonitoring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnhancedMonitoringVarargs(value: UnmarshalledEnhancedMetrics*): Self = StObject.set(x, "EnhancedMonitoring", js.Array(value :_*))
      
      @scala.inline
      def setShards(value: js.Array[UnmarshalledShard]): Self = StObject.set(x, "Shards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardsVarargs(value: UnmarshalledShard*): Self = StObject.set(x, "Shards", js.Array(value :_*))
      
      @scala.inline
      def setStreamCreationTimestamp(value: js.Date): Self = StObject.set(x, "StreamCreationTimestamp", value.asInstanceOf[js.Any])
    }
  }
}
