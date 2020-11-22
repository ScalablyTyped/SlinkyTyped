package typingsSlinky.babelTypes.ts36Mod

import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteral
import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXExpressionContainer
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningElement
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteral
import typingsSlinky.babelTypes.babelTypesStrings.NumericLiteral
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.ts36Mod.StringLiteral_
  - typingsSlinky.babelTypes.ts36Mod.NumericLiteral_
  - typingsSlinky.babelTypes.ts36Mod.BooleanLiteral_
  - typingsSlinky.babelTypes.ts36Mod.NullLiteral_
  - typingsSlinky.babelTypes.ts36Mod.JSXAttribute_
  - typingsSlinky.babelTypes.ts36Mod.JSXClosingElement_
  - typingsSlinky.babelTypes.ts36Mod.JSXElement_
  - typingsSlinky.babelTypes.ts36Mod.JSXExpressionContainer_
  - typingsSlinky.babelTypes.ts36Mod.JSXOpeningElement_
*/
trait Immutable extends js.Object
object Immutable {
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_],
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    selfClosing: Boolean,
    start: Double,
    `type`: JSXOpeningElement
  ): Immutable = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def BooleanLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteral, value: Boolean): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def NumericLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteral, value: Double): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXExpressionContainer_(
    end: Double,
    expression: Expression,
    loc: SourceLocation,
    start: Double,
    `type`: JSXExpressionContainer
  ): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def StringLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      typingsSlinky.babelTypes.ts36Mod.JSXElement_ | JSXExpressionContainer_ | JSXText_
    ],
    closingElement: JSXClosingElement_,
    end: Double,
    loc: SourceLocation,
    openingElement: JSXOpeningElement_,
    start: Double,
    `type`: JSXElement
  ): Immutable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingElement = closingElement.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def NullLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NullLiteral): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXClosingElement_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXMemberExpression_,
    start: Double,
    `type`: JSXClosingElement
  ): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXAttribute_(
    end: Double,
    loc: SourceLocation,
    name: JSXIdentifier_ | JSXNamespacedName_,
    start: Double,
    `type`: JSXAttribute
  ): Immutable = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
}
