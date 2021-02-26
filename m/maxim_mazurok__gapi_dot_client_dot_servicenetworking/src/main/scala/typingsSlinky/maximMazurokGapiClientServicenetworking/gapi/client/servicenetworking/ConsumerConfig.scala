package typingsSlinky.maximMazurokGapiClientServicenetworking.gapi.client.servicenetworking

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConsumerConfig extends StObject {
  
  /** Export custom routes flag value for peering from consumer to producer. */
  var consumerExportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Export subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Import custom routes flag value for peering from consumer to producer. */
  var consumerImportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Import subnet routes with public ip flag value for peering from consumer to producer. */
  var consumerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Export custom routes flag value for peering from producer to consumer. */
  var producerExportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Export subnet routes with public ip flag value for peering from producer to consumer. */
  var producerExportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /** Import custom routes flag value for peering from producer to consumer. */
  var producerImportCustomRoutes: js.UndefOr[Boolean] = js.native
  
  /** Import subnet routes with public ip flag value for peering from producer to consumer. */
  var producerImportSubnetRoutesWithPublicIp: js.UndefOr[Boolean] = js.native
  
  /**
    * Output only. The VPC host network that is used to host managed service instances. In the format, projects/{project}/global/networks/{network} where {project} is the project number
    * e.g. '12345' and {network} is the network name.
    */
  var producerNetwork: js.UndefOr[String] = js.native
  
  /** Output only. The reserved ranges associated with this private service access connection. */
  var reservedRanges: js.UndefOr[js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]] = js.native
}
object ConsumerConfig {
  
  @scala.inline
  def apply(): ConsumerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumerConfig]
  }
  
  @scala.inline
  implicit class ConsumerConfigMutableBuilder[Self <: ConsumerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerExportCustomRoutesUndefined: Self = StObject.set(x, "consumerExportCustomRoutes", js.undefined)
    
    @scala.inline
    def setConsumerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerExportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setConsumerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "consumerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerImportCustomRoutesUndefined: Self = StObject.set(x, "consumerImportCustomRoutes", js.undefined)
    
    @scala.inline
    def setConsumerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "consumerImportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerExportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerExportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerExportCustomRoutesUndefined: Self = StObject.set(x, "producerExportCustomRoutes", js.undefined)
    
    @scala.inline
    def setProducerExportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerExportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerExportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerImportCustomRoutes(value: Boolean): Self = StObject.set(x, "producerImportCustomRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerImportCustomRoutesUndefined: Self = StObject.set(x, "producerImportCustomRoutes", js.undefined)
    
    @scala.inline
    def setProducerImportSubnetRoutesWithPublicIp(value: Boolean): Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerImportSubnetRoutesWithPublicIpUndefined: Self = StObject.set(x, "producerImportSubnetRoutesWithPublicIp", js.undefined)
    
    @scala.inline
    def setProducerNetwork(value: String): Self = StObject.set(x, "producerNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducerNetworkUndefined: Self = StObject.set(x, "producerNetwork", js.undefined)
    
    @scala.inline
    def setReservedRanges(value: js.Array[GoogleCloudServicenetworkingV1ConsumerConfigReservedRange]): Self = StObject.set(x, "reservedRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReservedRangesUndefined: Self = StObject.set(x, "reservedRanges", js.undefined)
    
    @scala.inline
    def setReservedRangesVarargs(value: GoogleCloudServicenetworkingV1ConsumerConfigReservedRange*): Self = StObject.set(x, "reservedRanges", js.Array(value :_*))
  }
}
