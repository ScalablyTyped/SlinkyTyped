package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeConfigurationSettingsMessage extends StObject {
  
  /**
    * The application for the environment or configuration template.
    */
  var ApplicationName: typingsSlinky.awsSdk.elasticbeanstalkMod.ApplicationName = js.native
  
  /**
    * The name of the environment to describe.  Condition: You must specify either this or a TemplateName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns MissingRequiredParameter error. 
    */
  var EnvironmentName: js.UndefOr[typingsSlinky.awsSdk.elasticbeanstalkMod.EnvironmentName] = js.native
  
  /**
    * The name of the configuration template to describe.  Conditional: You must specify either this parameter or an EnvironmentName, but not both. If you specify both, AWS Elastic Beanstalk returns an InvalidParameterCombination error. If you do not specify either, AWS Elastic Beanstalk returns a MissingRequiredParameter error. 
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.native
}
object DescribeConfigurationSettingsMessage {
  
  @scala.inline
  def apply(ApplicationName: ApplicationName): DescribeConfigurationSettingsMessage = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConfigurationSettingsMessage]
  }
  
  @scala.inline
  implicit class DescribeConfigurationSettingsMessageMutableBuilder[Self <: DescribeConfigurationSettingsMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationName(value: ApplicationName): Self = StObject.set(x, "ApplicationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    @scala.inline
    def setTemplateName(value: ConfigurationTemplateName): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateNameUndefined: Self = StObject.set(x, "TemplateName", js.undefined)
  }
}
