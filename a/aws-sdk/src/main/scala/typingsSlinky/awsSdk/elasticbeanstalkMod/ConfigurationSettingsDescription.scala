package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationSettingsDescription extends StObject {
  
  /**
    * The name of the application associated with this configuration set.
    */
  var ApplicationName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName] = js.native
  
  /**
    * The date (in UTC time) when this configuration set was created.
    */
  var DateCreated: js.UndefOr[js.Date] = js.native
  
  /**
    * The date (in UTC time) when this configuration set was last modified.
    */
  var DateUpdated: js.UndefOr[js.Date] = js.native
  
  /**
    *  If this configuration set is associated with an environment, the DeploymentStatus parameter indicates the deployment status of this configuration set:     null: This configuration is not associated with a running environment.    pending: This is a draft configuration that is not deployed to the associated environment but is in the process of deploying.    deployed: This is the configuration that is currently deployed to the associated running environment.    failed: This is a draft configuration that failed to successfully deploy.  
    */
  var DeploymentStatus: js.UndefOr[ConfigurationDeploymentStatus] = js.native
  
  /**
    * Describes this configuration set.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.Description] = js.native
  
  /**
    *  If not null, the name of the environment for this configuration set. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * A list of the configuration options and their values in this configuration set.
    */
  var OptionSettings: js.UndefOr[ConfigurationOptionSettingsList] = js.native
  
  /**
    * The ARN of the platform version.
    */
  var PlatformArn: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.PlatformArn] = js.native
  
  /**
    * The name of the solution stack this configuration set uses.
    */
  var SolutionStackName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.SolutionStackName] = js.native
  
  /**
    *  If not null, the name of the configuration template for this configuration set. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}
object ConfigurationSettingsDescription {
  
  @scala.inline
  def apply(): ConfigurationSettingsDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationSettingsDescription]
  }
  
  @scala.inline
  implicit class ConfigurationSettingsDescriptionMutableBuilder[Self <: ConfigurationSettingsDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationNameUndefined: Self = StObject.set(x, "ApplicationName", js.undefined)
    
    @scala.inline
    def setDateCreated(value: js.Date): Self = StObject.set(x, "DateCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateCreatedUndefined: Self = StObject.set(x, "DateCreated", js.undefined)
    
    @scala.inline
    def setDateUpdated(value: js.Date): Self = StObject.set(x, "DateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdatedUndefined: Self = StObject.set(x, "DateUpdated", js.undefined)
    
    @scala.inline
    def setDeploymentStatus(value: ConfigurationDeploymentStatus): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setOptionSettings(value: ConfigurationOptionSettingsList): Self = StObject.set(x, "OptionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionSettingsUndefined: Self = StObject.set(x, "OptionSettings", js.undefined)
    
    @scala.inline
    def setOptionSettingsVarargs(value: ConfigurationOptionSetting*): Self = StObject.set(x, "OptionSettings", js.Array(value :_*))
    
    @scala.inline
    def setPlatformArn(value: PlatformArn): Self = StObject.set(x, "PlatformArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformArnUndefined: Self = StObject.set(x, "PlatformArn", js.undefined)
    
    @scala.inline
    def setSolutionStackName(value: SolutionStackName): Self = StObject.set(x, "SolutionStackName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionStackNameUndefined: Self = StObject.set(x, "SolutionStackName", js.undefined)
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
