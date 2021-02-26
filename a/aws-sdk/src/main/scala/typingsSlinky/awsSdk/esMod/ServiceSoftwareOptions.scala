package typingsSlinky.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSoftwareOptions extends StObject {
  
  /**
    * Timestamp, in Epoch time, until which you can manually request a service software update. After this date, we automatically update your service software.
    */
  var AutomatedUpdateDate: js.UndefOr[js.Date] = js.native
  
  /**
    * True if you are able to cancel your service software version update. False if you are not able to cancel your service software version. 
    */
  var Cancellable: js.UndefOr[Boolean] = js.native
  
  /**
    * The current service software version that is present on the domain.
    */
  var CurrentVersion: js.UndefOr[String] = js.native
  
  /**
    * The description of the UpdateStatus.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The new service software version if one is available.
    */
  var NewVersion: js.UndefOr[String] = js.native
  
  /**
    * True if a service software is never automatically updated. False if a service software is automatically updated after AutomatedUpdateDate. 
    */
  var OptionalDeployment: js.UndefOr[Boolean] = js.native
  
  /**
    * True if you are able to update you service software version. False if you are not able to update your service software version. 
    */
  var UpdateAvailable: js.UndefOr[Boolean] = js.native
  
  /**
    * The status of your service software update. This field can take the following values: ELIGIBLE, PENDING_UPDATE, IN_PROGRESS, COMPLETED, and NOT_ELIGIBLE.
    */
  var UpdateStatus: js.UndefOr[DeploymentStatus] = js.native
}
object ServiceSoftwareOptions {
  
  @scala.inline
  def apply(): ServiceSoftwareOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSoftwareOptions]
  }
  
  @scala.inline
  implicit class ServiceSoftwareOptionsMutableBuilder[Self <: ServiceSoftwareOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomatedUpdateDate(value: js.Date): Self = StObject.set(x, "AutomatedUpdateDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomatedUpdateDateUndefined: Self = StObject.set(x, "AutomatedUpdateDate", js.undefined)
    
    @scala.inline
    def setCancellable(value: Boolean): Self = StObject.set(x, "Cancellable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancellableUndefined: Self = StObject.set(x, "Cancellable", js.undefined)
    
    @scala.inline
    def setCurrentVersion(value: String): Self = StObject.set(x, "CurrentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentVersionUndefined: Self = StObject.set(x, "CurrentVersion", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setNewVersion(value: String): Self = StObject.set(x, "NewVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewVersionUndefined: Self = StObject.set(x, "NewVersion", js.undefined)
    
    @scala.inline
    def setOptionalDeployment(value: Boolean): Self = StObject.set(x, "OptionalDeployment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalDeploymentUndefined: Self = StObject.set(x, "OptionalDeployment", js.undefined)
    
    @scala.inline
    def setUpdateAvailable(value: Boolean): Self = StObject.set(x, "UpdateAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateAvailableUndefined: Self = StObject.set(x, "UpdateAvailable", js.undefined)
    
    @scala.inline
    def setUpdateStatus(value: DeploymentStatus): Self = StObject.set(x, "UpdateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatusUndefined: Self = StObject.set(x, "UpdateStatus", js.undefined)
  }
}
