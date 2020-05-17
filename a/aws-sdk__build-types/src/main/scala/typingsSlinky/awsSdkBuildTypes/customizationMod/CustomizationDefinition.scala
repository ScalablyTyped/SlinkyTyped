package typingsSlinky.awsSdkBuildTypes.customizationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ConfigCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.MiddlewareCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ParserDecoratorCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.SyntheticParameterCustomizationDefinition
  - typingsSlinky.awsSdkBuildTypes.customizationMod.ParameterSuppressionCustomizationDefinition
*/
trait CustomizationDefinition extends js.Object

object CustomizationDefinition {
  @scala.inline
  implicit def apply(value: ConfigCustomizationDefinition): CustomizationDefinition = value.asInstanceOf[CustomizationDefinition]
  @scala.inline
  implicit def apply(value: MiddlewareCustomizationDefinition): CustomizationDefinition = value.asInstanceOf[CustomizationDefinition]
  @scala.inline
  implicit def apply(value: ParameterSuppressionCustomizationDefinition): CustomizationDefinition = value.asInstanceOf[CustomizationDefinition]
  @scala.inline
  implicit def apply(value: ParserDecoratorCustomizationDefinition): CustomizationDefinition = value.asInstanceOf[CustomizationDefinition]
  @scala.inline
  implicit def apply(value: SyntheticParameterCustomizationDefinition): CustomizationDefinition = value.asInstanceOf[CustomizationDefinition]
}

