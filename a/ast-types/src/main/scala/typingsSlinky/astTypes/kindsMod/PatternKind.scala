package typingsSlinky.astTypes.kindsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion
  - typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty
*/
trait PatternKind extends StObject
object PatternKind {
  
  @scala.inline
  def ArrayPattern(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    `type`: typingsSlinky.astTypes.astTypesStrings.ArrayPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ArrayPattern]
  }
  
  @scala.inline
  def AssignmentPattern(
    left: PatternKind,
    right: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.AssignmentPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.AssignmentPattern]
  }
  
  @scala.inline
  def Identifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.Identifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.Identifier]
  }
  
  @scala.inline
  def JSXIdentifier(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.JSXIdentifier): typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.JSXIdentifier]
  }
  
  @scala.inline
  def ObjectPattern(
    properties: js.Array[
      PropertyKind | PropertyPatternKind | SpreadPropertyPatternKind | SpreadPropertyKind | ObjectPropertyKind | RestPropertyKind
    ],
    `type`: typingsSlinky.astTypes.astTypesStrings.ObjectPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.ObjectPattern]
  }
  
  @scala.inline
  def PrivateName(id: IdentifierKind, `type`: typingsSlinky.astTypes.astTypesStrings.PrivateName): typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.PrivateName]
  }
  
  @scala.inline
  def PropertyPattern(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.PropertyPattern
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.PropertyPattern]
  }
  
  @scala.inline
  def RestElement(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.RestElement): typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.RestElement]
  }
  
  @scala.inline
  def SpreadElementPattern(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadElementPattern): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadElementPattern]
  }
  
  @scala.inline
  def SpreadPropertyPattern(argument: PatternKind, `type`: typingsSlinky.astTypes.astTypesStrings.SpreadPropertyPattern): typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.SpreadPropertyPattern]
  }
  
  @scala.inline
  def TSAsExpression(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSAsExpression,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSAsExpression]
  }
  
  @scala.inline
  def TSNonNullExpression(expression: ExpressionKind, `type`: typingsSlinky.astTypes.astTypesStrings.TSNonNullExpression): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSNonNullExpression]
  }
  
  @scala.inline
  def TSParameterProperty(
    parameter: IdentifierKind | AssignmentPatternKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSParameterProperty
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty = {
    val __obj = js.Dynamic.literal(parameter = parameter.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSParameterProperty]
  }
  
  @scala.inline
  def TSTypeAssertion(
    expression: ExpressionKind,
    `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeAssertion,
    typeAnnotation: TSTypeKind
  ): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeAssertion]
  }
  
  @scala.inline
  def TSTypeParameter(name: String, `type`: typingsSlinky.astTypes.astTypesStrings.TSTypeParameter): typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.astTypes.namedTypesMod.namedTypes.TSTypeParameter]
  }
}
