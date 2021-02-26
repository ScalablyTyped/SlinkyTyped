package typingsSlinky.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleRunConfiguration extends StObject {
  
  /**
    * A list of upload ARNs for app packages to be installed with your app.
    */
  var auxiliaryApps: js.UndefOr[AmazonResourceNames] = js.native
  
  /**
    * Specifies the billing method for a test run: metered or unmetered. If the parameter is not specified, the default value is metered.  If you have purchased unmetered device slots, you must set this parameter to unmetered to make use of them. Otherwise, your run counts against your metered time. 
    */
  var billingMethod: js.UndefOr[BillingMethod] = js.native
  
  /**
    * Input CustomerArtifactPaths object for the scheduled run configuration.
    */
  var customerArtifactPaths: js.UndefOr[CustomerArtifactPaths] = js.native
  
  /**
    * The ARN of the extra data for the run. The extra data is a .zip file that AWS Device Farm extracts to external data for Android or the app's sandbox for iOS.
    */
  var extraDataPackageArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Information about the locale that is used for the run.
    */
  var locale: js.UndefOr[String] = js.native
  
  /**
    * Information about the location that is used for the run.
    */
  var location: js.UndefOr[Location] = js.native
  
  /**
    * Reserved for internal use.
    */
  var networkProfileArn: js.UndefOr[AmazonResourceName] = js.native
  
  /**
    * Information about the radio states for the run.
    */
  var radios: js.UndefOr[Radios] = js.native
  
  /**
    * An array of ARNs for your VPC endpoint configurations.
    */
  var vpceConfigurationArns: js.UndefOr[AmazonResourceNames] = js.native
}
object ScheduleRunConfiguration {
  
  @scala.inline
  def apply(): ScheduleRunConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunConfiguration]
  }
  
  @scala.inline
  implicit class ScheduleRunConfigurationMutableBuilder[Self <: ScheduleRunConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuxiliaryApps(value: AmazonResourceNames): Self = StObject.set(x, "auxiliaryApps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuxiliaryAppsUndefined: Self = StObject.set(x, "auxiliaryApps", js.undefined)
    
    @scala.inline
    def setAuxiliaryAppsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "auxiliaryApps", js.Array(value :_*))
    
    @scala.inline
    def setBillingMethod(value: BillingMethod): Self = StObject.set(x, "billingMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingMethodUndefined: Self = StObject.set(x, "billingMethod", js.undefined)
    
    @scala.inline
    def setCustomerArtifactPaths(value: CustomerArtifactPaths): Self = StObject.set(x, "customerArtifactPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerArtifactPathsUndefined: Self = StObject.set(x, "customerArtifactPaths", js.undefined)
    
    @scala.inline
    def setExtraDataPackageArn(value: AmazonResourceName): Self = StObject.set(x, "extraDataPackageArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtraDataPackageArnUndefined: Self = StObject.set(x, "extraDataPackageArn", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNetworkProfileArn(value: AmazonResourceName): Self = StObject.set(x, "networkProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkProfileArnUndefined: Self = StObject.set(x, "networkProfileArn", js.undefined)
    
    @scala.inline
    def setRadios(value: Radios): Self = StObject.set(x, "radios", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiosUndefined: Self = StObject.set(x, "radios", js.undefined)
    
    @scala.inline
    def setVpceConfigurationArns(value: AmazonResourceNames): Self = StObject.set(x, "vpceConfigurationArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpceConfigurationArnsUndefined: Self = StObject.set(x, "vpceConfigurationArns", js.undefined)
    
    @scala.inline
    def setVpceConfigurationArnsVarargs(value: AmazonResourceName*): Self = StObject.set(x, "vpceConfigurationArns", js.Array(value :_*))
  }
}
