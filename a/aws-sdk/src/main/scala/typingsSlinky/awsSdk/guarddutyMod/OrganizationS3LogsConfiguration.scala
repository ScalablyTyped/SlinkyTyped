package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationS3LogsConfiguration extends StObject {
  
  /**
    * A value that contains information on whether S3 data event logs will be enabled automatically as a data source for the organization.
    */
  var AutoEnable: Boolean = js.native
}
object OrganizationS3LogsConfiguration {
  
  @scala.inline
  def apply(AutoEnable: Boolean): OrganizationS3LogsConfiguration = {
    val __obj = js.Dynamic.literal(AutoEnable = AutoEnable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationS3LogsConfiguration]
  }
  
  @scala.inline
  implicit class OrganizationS3LogsConfigurationMutableBuilder[Self <: OrganizationS3LogsConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoEnable(value: Boolean): Self = StObject.set(x, "AutoEnable", value.asInstanceOf[js.Any])
  }
}
