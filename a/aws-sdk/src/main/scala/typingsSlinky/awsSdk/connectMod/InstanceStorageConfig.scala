package typingsSlinky.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceStorageConfig extends StObject {
  
  /**
    * The existing association identifier that uniquely identifies the resource type and storage config for the given instance ID.
    */
  var AssociationId: js.UndefOr[typingsSlinky.awsSdk.connectMod.AssociationId] = js.native
  
  /**
    * The configuration of the Kinesis Firehose delivery stream.
    */
  var KinesisFirehoseConfig: js.UndefOr[typingsSlinky.awsSdk.connectMod.KinesisFirehoseConfig] = js.native
  
  /**
    * The configuration of the Kinesis data stream.
    */
  var KinesisStreamConfig: js.UndefOr[typingsSlinky.awsSdk.connectMod.KinesisStreamConfig] = js.native
  
  /**
    * The configuration of the Kinesis video stream.
    */
  var KinesisVideoStreamConfig: js.UndefOr[typingsSlinky.awsSdk.connectMod.KinesisVideoStreamConfig] = js.native
  
  /**
    * The S3 configuration.
    */
  var S3Config: js.UndefOr[typingsSlinky.awsSdk.connectMod.S3Config] = js.native
  
  /**
    * A valid storage type.
    */
  var StorageType: typingsSlinky.awsSdk.connectMod.StorageType = js.native
}
object InstanceStorageConfig {
  
  @scala.inline
  def apply(StorageType: StorageType): InstanceStorageConfig = {
    val __obj = js.Dynamic.literal(StorageType = StorageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceStorageConfig]
  }
  
  @scala.inline
  implicit class InstanceStorageConfigMutableBuilder[Self <: InstanceStorageConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseConfig(value: KinesisFirehoseConfig): Self = StObject.set(x, "KinesisFirehoseConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseConfigUndefined: Self = StObject.set(x, "KinesisFirehoseConfig", js.undefined)
    
    @scala.inline
    def setKinesisStreamConfig(value: KinesisStreamConfig): Self = StObject.set(x, "KinesisStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamConfigUndefined: Self = StObject.set(x, "KinesisStreamConfig", js.undefined)
    
    @scala.inline
    def setKinesisVideoStreamConfig(value: KinesisVideoStreamConfig): Self = StObject.set(x, "KinesisVideoStreamConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisVideoStreamConfigUndefined: Self = StObject.set(x, "KinesisVideoStreamConfig", js.undefined)
    
    @scala.inline
    def setS3Config(value: S3Config): Self = StObject.set(x, "S3Config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3ConfigUndefined: Self = StObject.set(x, "S3Config", js.undefined)
    
    @scala.inline
    def setStorageType(value: StorageType): Self = StObject.set(x, "StorageType", value.asInstanceOf[js.Any])
  }
}
