package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRetentionConfigurationResponse extends StObject {
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.RetentionConfiguration] = js.native
}
object PutRetentionConfigurationResponse {
  
  @scala.inline
  def apply(): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutRetentionConfigurationResponseMutableBuilder[Self <: PutRetentionConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRetentionConfiguration(value: RetentionConfiguration): Self = StObject.set(x, "RetentionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetentionConfigurationUndefined: Self = StObject.set(x, "RetentionConfiguration", js.undefined)
  }
}
