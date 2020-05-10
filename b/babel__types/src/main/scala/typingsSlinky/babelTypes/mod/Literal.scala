package typingsSlinky.babelTypes.mod

import typingsSlinky.babelTypes.babelTypesStrings.BigIntLiteral
import typingsSlinky.babelTypes.babelTypesStrings.BooleanLiteral
import typingsSlinky.babelTypes.babelTypesStrings.NullLiteral
import typingsSlinky.babelTypes.babelTypesStrings.NumericLiteral
import typingsSlinky.babelTypes.babelTypesStrings.RegExpLiteral
import typingsSlinky.babelTypes.babelTypesStrings.StringLiteral
import typingsSlinky.babelTypes.babelTypesStrings.TemplateLiteral
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.babelTypes.mod.StringLiteral_
  - typingsSlinky.babelTypes.mod.NumericLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.RegExpLiteral_
  - typingsSlinky.babelTypes.mod.TemplateLiteral_
  - typingsSlinky.babelTypes.mod.BigIntLiteral_
*/
trait Literal extends _Node

object Literal {
  @scala.inline
  def NullLiteral_(`type`: NullLiteral): Literal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def StringLiteral_(`type`: StringLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def BooleanLiteral_(`type`: BooleanLiteral, value: Boolean): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def BigIntLiteral_(`type`: BigIntLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def NumericLiteral_(`type`: NumericLiteral, value: Double): Literal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def TemplateLiteral_(expressions: js.Array[Expression], quasis: js.Array[TemplateElement_], `type`: TemplateLiteral): Literal = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def RegExpLiteral_(flags: js.Any, pattern: String, `type`: RegExpLiteral): Literal = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

