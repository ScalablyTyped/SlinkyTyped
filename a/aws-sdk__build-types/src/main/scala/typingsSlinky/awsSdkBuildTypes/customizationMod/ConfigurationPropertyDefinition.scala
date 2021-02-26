package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.forked
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.unified
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition
*/
trait ConfigurationPropertyDefinition extends StObject
object ConfigurationPropertyDefinition {
  
  @scala.inline
  def EnvironmentForkedConfigurationPropertyDefinition(
    browser: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    documentation: String,
    inputType: String,
    node: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation,
    `type`: forked,
    universal: ConfigurationPropertyDefinitionRuntimeAttributes with AdditionalDocumentation
  ): typingsSlinky.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], universal = universal.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.EnvironmentForkedConfigurationPropertyDefinition]
  }
  
  @scala.inline
  def UnifiedConfigurationPropertyDefinition(documentation: String, inputType: String, required: Boolean, `type`: unified): typingsSlinky.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], inputType = inputType.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.UnifiedConfigurationPropertyDefinition]
  }
}
