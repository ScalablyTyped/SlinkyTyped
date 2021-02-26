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
import org.scalablytyped.runtime.StObject
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
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): typingsSlinky.babelTypes.mod.BigIntLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.BigIntLiteral_]
  }
  
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): typingsSlinky.babelTypes.mod.BooleanLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.BooleanLiteral_]
  }
  
  @scala.inline
  def DecimalLiteral_(`type`: DecimalLiteral, value: String): typingsSlinky.babelTypes.mod.DecimalLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.DecimalLiteral_]
  }
  
  @scala.inline
  def JSXAttribute_(name: JSXIdentifier_ | JSXNamespacedName_, `type`: JSXAttribute): typingsSlinky.babelTypes.mod.JSXAttribute_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXAttribute_]
  }
  
  @scala.inline
  def JSXClosingElement_(name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_, `type`: JSXClosingElement): typingsSlinky.babelTypes.mod.JSXClosingElement_ = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXClosingElement_]
  }
  
  @scala.inline
  def JSXClosingFragment_(`type`: JSXClosingFragment): typingsSlinky.babelTypes.mod.JSXClosingFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXClosingFragment_]
  }
  
  @scala.inline
  def JSXElement_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | typingsSlinky.babelTypes.mod.JSXElement_ | JSXFragment_
    ],
    openingElement: JSXOpeningElement_,
    `type`: JSXElement
  ): typingsSlinky.babelTypes.mod.JSXElement_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], openingElement = openingElement.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXElement_]
  }
  
  @scala.inline
  def JSXExpressionContainer_(expression: Expression | JSXEmptyExpression_, `type`: JSXExpressionContainer): typingsSlinky.babelTypes.mod.JSXExpressionContainer_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXExpressionContainer_]
  }
  
  @scala.inline
  def JSXFragment_(
    children: js.Array[
      JSXText_ | JSXExpressionContainer_ | JSXSpreadChild_ | JSXElement_ | typingsSlinky.babelTypes.mod.JSXFragment_
    ],
    closingFragment: JSXClosingFragment_,
    openingFragment: JSXOpeningFragment_,
    `type`: JSXFragment
  ): typingsSlinky.babelTypes.mod.JSXFragment_ = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closingFragment = closingFragment.asInstanceOf[js.Any], openingFragment = openingFragment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXFragment_]
  }
  
  @scala.inline
  def JSXOpeningElement_(
    attributes: js.Array[JSXAttribute_ | JSXSpreadAttribute_],
    name: JSXIdentifier_ | JSXMemberExpression_ | JSXNamespacedName_,
    selfClosing: Boolean,
    `type`: JSXOpeningElement
  ): typingsSlinky.babelTypes.mod.JSXOpeningElement_ = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXOpeningElement_]
  }
  
  @scala.inline
  def JSXOpeningFragment_(`type`: JSXOpeningFragment): typingsSlinky.babelTypes.mod.JSXOpeningFragment_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXOpeningFragment_]
  }
  
  @scala.inline
  def JSXSpreadChild_(expression: Expression, `type`: JSXSpreadChild): typingsSlinky.babelTypes.mod.JSXSpreadChild_ = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXSpreadChild_]
  }
  
  @scala.inline
  def JSXText_(`type`: JSXText, value: String): typingsSlinky.babelTypes.mod.JSXText_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.JSXText_]
  }
  
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): typingsSlinky.babelTypes.mod.NullLiteral_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NullLiteral_]
  }
  
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): typingsSlinky.babelTypes.mod.NumericLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.NumericLiteral_]
  }
  
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): typingsSlinky.babelTypes.mod.StringLiteral_ = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsSlinky.babelTypes.mod.StringLiteral_]
  }
}
