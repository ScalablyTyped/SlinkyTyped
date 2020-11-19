package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXEmptyExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXExpressionContainer
import typingsSlinky.babelTypes.babelTypesStrings.JSXIdentifier
import typingsSlinky.babelTypes.babelTypesStrings.JSXMemberExpression
import typingsSlinky.babelTypes.babelTypesStrings.JSXNamespacedName
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.JSXAttribute_
  - typingsSlinky.babelTypes.mod.JSXClosingElement_
  - typingsSlinky.babelTypes.mod.JSXElement_
  - typingsSlinky.babelTypes.mod.JSXEmptyExpression_
  - typingsSlinky.babelTypes.mod.JSXExpressionContainer_
  - typingsSlinky.babelTypes.mod.JSXIdentifier_
  - typingsSlinky.babelTypes.mod.JSXMemberExpression_
  - typingsSlinky.babelTypes.mod.JSXNamespacedName_
  - typingsSlinky.babelTypes.mod.JSXOpeningElement_
  - typingsSlinky.babelTypes.mod.JSXSpreadAttribute_
  - typingsSlinky.babelTypes.mod.JSXText_
*/
trait JSX extends js.Object
object JSX {
  
  @scala.inline
  def JSXIdentifier_(end: Double, loc: SourceLocation, name: String, start: Double, `type`: JSXIdentifier): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXEmptyExpression_(end: Double, loc: SourceLocation, start: Double, `type`: JSXEmptyExpression): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXClosingElement_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXAttribute_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXNamespacedName_,
    start: Double,
    `type`: JSXAttribute
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXMemberExpression_(
    end: Double,
    loc: SourceLocation,
    `object`: typingsSlinky.babelTypes.mod.JSXMemberExpression_ | JSXIdentifier_,
    property: JSXIdentifier_,
    start: Double,
    `type`: JSXMemberExpression
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXNamespacedName_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_,
    namespace: JSXIdentifier_,
    start: Double,
    `type`: JSXNamespacedName
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXExpressionContainer_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: JSXExpressionContainer
  ): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXSpreadAttribute_(argument: Expression, end: Double, loc: SourceLocation, start: Double, `type`: JSXSpreadAttribute): JSX = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXText_(end: Double, loc: SourceLocation, start: Double, `type`: JSXText, value: String): JSX = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double,
    `type`: JSXOpeningElement
  ): JSX = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[typingsSlinky.babelTypes.mod.JSXElement_ | JSXExpressionContainer_ | JSXText_],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): JSX = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSX]
  }
}
