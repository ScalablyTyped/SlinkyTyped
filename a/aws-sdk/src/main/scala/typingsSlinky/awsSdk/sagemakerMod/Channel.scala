package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Channel extends StObject {
  
  /**
    * The name of the channel. 
    */
  var ChannelName: typingsSlinky.awsSdk.sagemakerMod.ChannelName = js.native
  
  /**
    * If training data is compressed, the compression type. The default value is None. CompressionType is used only in Pipe input mode. In File mode, leave this field unset or set it to None.
    */
  var CompressionType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.CompressionType] = js.native
  
  /**
    * The MIME type of the data.
    */
  var ContentType: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ContentType] = js.native
  
  /**
    * The location of the channel data.
    */
  var DataSource: typingsSlinky.awsSdk.sagemakerMod.DataSource = js.native
  
  /**
    * (Optional) The input mode to use for the data channel in a training job. If you don't set a value for InputMode, Amazon SageMaker uses the value set for TrainingInputMode. Use this parameter to override the TrainingInputMode setting in a AlgorithmSpecification request when you have a channel that needs a different input mode from the training job's general setting. To download the data from Amazon Simple Storage Service (Amazon S3) to the provisioned ML storage volume, and mount the directory to a Docker volume, use File input mode. To stream data directly from Amazon S3 to the container, choose Pipe input mode. To use a model for incremental training, choose File input model.
    */
  var InputMode: js.UndefOr[TrainingInputMode] = js.native
  
  /**
    *  Specify RecordIO as the value when input data is in raw format but the training algorithm requires the RecordIO format. In this case, Amazon SageMaker wraps each individual S3 object in a RecordIO record. If the input data is already in RecordIO format, you don't need to set this attribute. For more information, see Create a Dataset Using RecordIO.  In File mode, leave this field unset or set it to None.
    */
  var RecordWrapperType: js.UndefOr[RecordWrapper] = js.native
  
  /**
    * A configuration for a shuffle option for input data in a channel. If you use S3Prefix for S3DataType, this shuffles the results of the S3 key prefix matches. If you use ManifestFile, the order of the S3 object references in the ManifestFile is shuffled. If you use AugmentedManifestFile, the order of the JSON lines in the AugmentedManifestFile is shuffled. The shuffling order is determined using the Seed value. For Pipe input mode, shuffling is done at the start of every epoch. With large datasets this ensures that the order of the training data is different for each epoch, it helps reduce bias and possible overfitting. In a multi-node training job when ShuffleConfig is combined with S3DataDistributionType of ShardedByS3Key, the data is shuffled across nodes so that the content sent to a particular node on the first epoch might be sent to a different node on the second epoch.
    */
  var ShuffleConfig: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.ShuffleConfig] = js.native
}
object Channel {
  
  @scala.inline
  def apply(ChannelName: ChannelName, DataSource: DataSource): Channel = {
    val __obj = js.Dynamic.literal(ChannelName = ChannelName.asInstanceOf[js.Any], DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  
  @scala.inline
  implicit class ChannelMutableBuilder[Self <: Channel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannelName(value: ChannelName): Self = StObject.set(x, "ChannelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionType(value: CompressionType): Self = StObject.set(x, "CompressionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionTypeUndefined: Self = StObject.set(x, "CompressionType", js.undefined)
    
    @scala.inline
    def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMode(value: TrainingInputMode): Self = StObject.set(x, "InputMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputModeUndefined: Self = StObject.set(x, "InputMode", js.undefined)
    
    @scala.inline
    def setRecordWrapperType(value: RecordWrapper): Self = StObject.set(x, "RecordWrapperType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordWrapperTypeUndefined: Self = StObject.set(x, "RecordWrapperType", js.undefined)
    
    @scala.inline
    def setShuffleConfig(value: ShuffleConfig): Self = StObject.set(x, "ShuffleConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShuffleConfigUndefined: Self = StObject.set(x, "ShuffleConfig", js.undefined)
  }
}
