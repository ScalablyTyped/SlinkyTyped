package typingsSlinky.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationsRequest extends StObject {
  
  /**
    * One or more configuration IDs.
    */
  var configurationIds: ConfigurationIdList = js.native
}
object DescribeConfigurationsRequest {
  
  @scala.inline
  def apply(configurationIds: ConfigurationIdList): DescribeConfigurationsRequest = {
    val __obj = js.Dynamic.literal(configurationIds = configurationIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationsRequest]
  }
  
  @scala.inline
  implicit class DescribeConfigurationsRequestMutableBuilder[Self <: DescribeConfigurationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationIds(value: ConfigurationIdList): Self = StObject.set(x, "configurationIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationIdsVarargs(value: ConfigurationId*): Self = StObject.set(x, "configurationIds", js.Array(value :_*))
  }
}
