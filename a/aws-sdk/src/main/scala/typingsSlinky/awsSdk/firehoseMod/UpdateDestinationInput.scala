package typingsSlinky.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateDestinationInput extends StObject {
  
  /**
    * Obtain this value from the VersionId result of DeliveryStreamDescription. This value is required, and helps the service perform conditional operations. For example, if there is an interleaving update and this value is null, then the update destination fails. After the update is successful, the VersionId value is updated. The service then performs a merge of the old configuration with the new configuration.
    */
  var CurrentDeliveryStreamVersionId: DeliveryStreamVersionId = js.native
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typingsSlinky.awsSdk.firehoseMod.DeliveryStreamName = js.native
  
  /**
    * The ID of the destination.
    */
  var DestinationId: typingsSlinky.awsSdk.firehoseMod.DestinationId = js.native
  
  /**
    * Describes an update for a destination in Amazon ES.
    */
  var ElasticsearchDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ElasticsearchDestinationUpdate] = js.native
  
  /**
    * Describes an update for a destination in Amazon S3.
    */
  var ExtendedS3DestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.ExtendedS3DestinationUpdate] = js.native
  
  /**
    * Describes an update to the specified HTTP endpoint destination.
    */
  var HttpEndpointDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.HttpEndpointDestinationUpdate] = js.native
  
  /**
    * Describes an update for a destination in Amazon Redshift.
    */
  var RedshiftDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.RedshiftDestinationUpdate] = js.native
  
  /**
    * [Deprecated] Describes an update for a destination in Amazon S3.
    */
  var S3DestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.S3DestinationUpdate] = js.native
  
  /**
    * Describes an update for a destination in Splunk.
    */
  var SplunkDestinationUpdate: js.UndefOr[typingsSlinky.awsSdk.firehoseMod.SplunkDestinationUpdate] = js.native
}
object UpdateDestinationInput {
  
  @scala.inline
  def apply(
    CurrentDeliveryStreamVersionId: DeliveryStreamVersionId,
    DeliveryStreamName: DeliveryStreamName,
    DestinationId: DestinationId
  ): UpdateDestinationInput = {
    val __obj = js.Dynamic.literal(CurrentDeliveryStreamVersionId = CurrentDeliveryStreamVersionId.asInstanceOf[js.Any], DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any], DestinationId = DestinationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDestinationInput]
  }
  
  @scala.inline
  implicit class UpdateDestinationInputMutableBuilder[Self <: UpdateDestinationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentDeliveryStreamVersionId(value: DeliveryStreamVersionId): Self = StObject.set(x, "CurrentDeliveryStreamVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationId(value: DestinationId): Self = StObject.set(x, "DestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchDestinationUpdate(value: ElasticsearchDestinationUpdate): Self = StObject.set(x, "ElasticsearchDestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchDestinationUpdateUndefined: Self = StObject.set(x, "ElasticsearchDestinationUpdate", js.undefined)
    
    @scala.inline
    def setExtendedS3DestinationUpdate(value: ExtendedS3DestinationUpdate): Self = StObject.set(x, "ExtendedS3DestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendedS3DestinationUpdateUndefined: Self = StObject.set(x, "ExtendedS3DestinationUpdate", js.undefined)
    
    @scala.inline
    def setHttpEndpointDestinationUpdate(value: HttpEndpointDestinationUpdate): Self = StObject.set(x, "HttpEndpointDestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpEndpointDestinationUpdateUndefined: Self = StObject.set(x, "HttpEndpointDestinationUpdate", js.undefined)
    
    @scala.inline
    def setRedshiftDestinationUpdate(value: RedshiftDestinationUpdate): Self = StObject.set(x, "RedshiftDestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftDestinationUpdateUndefined: Self = StObject.set(x, "RedshiftDestinationUpdate", js.undefined)
    
    @scala.inline
    def setS3DestinationUpdate(value: S3DestinationUpdate): Self = StObject.set(x, "S3DestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3DestinationUpdateUndefined: Self = StObject.set(x, "S3DestinationUpdate", js.undefined)
    
    @scala.inline
    def setSplunkDestinationUpdate(value: SplunkDestinationUpdate): Self = StObject.set(x, "SplunkDestinationUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSplunkDestinationUpdateUndefined: Self = StObject.set(x, "SplunkDestinationUpdate", js.undefined)
  }
}
