package typingsSlinky.awsSdkBuildTypes.customizationMod

import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.Configuration
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.Middleware
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParameterSuppression
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.ParserDecorator
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.SyntheticParameter
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsSlinky.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typingsSlinky.awsSdkTypes.middlewareMod.Step
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends StObject
object CustomizationDefinition {
  
  @scala.inline
  def ConfigCustomizationDefinition(configuration: ConfigurationDefinition, `type`: Configuration): typingsSlinky.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition]
  }
  
  @scala.inline
  def MiddlewareCustomizationDefinition(expression: String, priority: Double, step: Step, `type`: Middleware): typingsSlinky.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition]
  }
  
  @scala.inline
  def ParameterSuppressionCustomizationDefinition(location: input | output, name: String, `type`: ParameterSuppression): typingsSlinky.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition]
  }
  
  @scala.inline
  def ParserDecoratorCustomizationDefinition(expression: String, priority: Double, `type`: ParserDecorator): typingsSlinky.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition]
  }
  
  @scala.inline
  def SyntheticParameterCustomizationDefinition(
    documentation: String,
    location: input | output,
    name: String,
    `type`: SyntheticParameter,
    typeExpression: String
  ): typingsSlinky.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition = {
    val __obj = js.Dynamic.literal(documentation = documentation.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], typeExpression = typeExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition]
  }
}
