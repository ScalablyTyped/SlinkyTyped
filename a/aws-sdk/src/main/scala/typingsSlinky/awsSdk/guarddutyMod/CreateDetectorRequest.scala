package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorRequest extends StObject {
  
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.ClientToken] = js.native
  
  /**
    * An object that describes which data sources will be enabled for the detector.
    */
  var DataSources: js.UndefOr[DataSourceConfigurations] = js.native
  
  /**
    * A Boolean value that specifies whether the detector is to be enabled.
    */
  var Enable: Boolean = js.native
  
  /**
    * An enum value that specifies how frequently updated findings are exported.
    */
  var FindingPublishingFrequency: js.UndefOr[typingsSlinky.awsSdk.guarddutyMod.FindingPublishingFrequency] = js.native
  
  /**
    * The tags to be added to a new detector resource.
    */
  var Tags: js.UndefOr[TagMap] = js.native
}
object CreateDetectorRequest {
  
  @scala.inline
  def apply(Enable: Boolean): CreateDetectorRequest = {
    val __obj = js.Dynamic.literal(Enable = Enable.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorRequest]
  }
  
  @scala.inline
  implicit class CreateDetectorRequestMutableBuilder[Self <: CreateDetectorRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    @scala.inline
    def setDataSources(value: DataSourceConfigurations): Self = StObject.set(x, "DataSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourcesUndefined: Self = StObject.set(x, "DataSources", js.undefined)
    
    @scala.inline
    def setEnable(value: Boolean): Self = StObject.set(x, "Enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingPublishingFrequency(value: FindingPublishingFrequency): Self = StObject.set(x, "FindingPublishingFrequency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingPublishingFrequencyUndefined: Self = StObject.set(x, "FindingPublishingFrequency", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
