package typingsSlinky.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddApplicationOutputResponse extends StObject {
  
  /**
    * The application Amazon Resource Name (ARN).
    */
  var ApplicationARN: js.UndefOr[ResourceARN] = js.native
  
  /**
    * The updated application version ID. Kinesis Data Analytics increments this ID when the application is updated.
    */
  var ApplicationVersionId: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.ApplicationVersionId] = js.native
  
  /**
    * Describes the application output configuration. For more information, see Configuring Application Output. 
    */
  var OutputDescriptions: js.UndefOr[typingsSlinky.awsSdk.kinesisanalyticsv2Mod.OutputDescriptions] = js.native
}
object AddApplicationOutputResponse {
  
  @scala.inline
  def apply(): AddApplicationOutputResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddApplicationOutputResponse]
  }
  
  @scala.inline
  implicit class AddApplicationOutputResponseMutableBuilder[Self <: AddApplicationOutputResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationARN(value: ResourceARN): Self = StObject.set(x, "ApplicationARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationARNUndefined: Self = StObject.set(x, "ApplicationARN", js.undefined)
    
    @scala.inline
    def setApplicationVersionId(value: ApplicationVersionId): Self = StObject.set(x, "ApplicationVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationVersionIdUndefined: Self = StObject.set(x, "ApplicationVersionId", js.undefined)
    
    @scala.inline
    def setOutputDescriptions(value: OutputDescriptions): Self = StObject.set(x, "OutputDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDescriptionsUndefined: Self = StObject.set(x, "OutputDescriptions", js.undefined)
    
    @scala.inline
    def setOutputDescriptionsVarargs(value: OutputDescription*): Self = StObject.set(x, "OutputDescriptions", js.Array(value :_*))
  }
}
