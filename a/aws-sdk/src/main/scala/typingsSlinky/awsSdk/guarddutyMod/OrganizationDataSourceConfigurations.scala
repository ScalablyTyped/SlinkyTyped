package typingsSlinky.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationDataSourceConfigurations extends StObject {
  
  /**
    * Describes whether S3 data event logs are enabled for new members of the organization.
    */
  var S3Logs: js.UndefOr[OrganizationS3LogsConfiguration] = js.native
}
object OrganizationDataSourceConfigurations {
  
  @scala.inline
  def apply(): OrganizationDataSourceConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationDataSourceConfigurations]
  }
  
  @scala.inline
  implicit class OrganizationDataSourceConfigurationsMutableBuilder[Self <: OrganizationDataSourceConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Logs(value: OrganizationS3LogsConfiguration): Self = StObject.set(x, "S3Logs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3LogsUndefined: Self = StObject.set(x, "S3Logs", js.undefined)
  }
}
