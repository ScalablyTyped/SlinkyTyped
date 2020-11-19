package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BigIntLiteral
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteral
import typingsSlinky.babelTypes.babelTypesStrings.DecimalLiteral
import typingsSlinky.babelTypes.babelTypesStrings.JSXAttribute
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXClosingFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXExpressionContainer
import typingsSlinky.babelTypes.babelTypesStrings.JSXFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningElement
import typingsSlinky.babelTypes.babelTypesStrings.JSXOpeningFragment
import typingsSlinky.babelTypes.babelTypesStrings.JSXSpreadChild
import typingsSlinky.babelTypes.babelTypesStrings.JSXText
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteral
import typingsSlinky.babelTypes.babelTypesStrings.NumericLiteral
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.StringLiteral_
  - typingsSlinky.babelTypes.mod.NumericLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.BigIntLiteral_
  - typingsSlinky.babelTypes.mod.JSXAttribute_
  - typingsSlinky.babelTypes.mod.JSXClosingElement_
  - typingsSlinky.babelTypes.mod.JSXElement_
  - typingsSlinky.babelTypes.mod.JSXExpressionContainer_
  - typingsSlinky.babelTypes.mod.JSXSpreadChild_
  - typingsSlinky.babelTypes.mod.JSXOpeningElement_
  - typingsSlinky.babelTypes.mod.JSXText_
  - typingsSlinky.babelTypes.mod.JSXFragment_
  - typingsSlinky.babelTypes.mod.JSXOpeningFragment_
  - typingsSlinky.babelTypes.mod.JSXClosingFragment_
  - typingsSlinky.babelTypes.mod.DecimalLiteral_
*/
trait Immutable extends _Node
object Immutable {
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): Immutable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsSlinky.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): Immutable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): Immutable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): Immutable = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): Immutable = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): Immutable = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): Immutable = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): Immutable = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsSlinky.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): Immutable = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Immutable]
  }
}
