package typingsSlinky.babelTypes.mod

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
  - typingsSlinky.babelTypes.mod.BooleanLiteral_
  - typingsSlinky.babelTypes.mod.NullLiteral_
  - typingsSlinky.babelTypes.mod.RegExpLiteral_
  - typingsSlinky.babelTypes.mod.TemplateLiteral_
*/
trait Literal extends js.Object

object Literal {
  @scala.inline
  def NullLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NullLiteral): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def StringLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: StringLiteral, value: String): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def BooleanLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: BooleanLiteral, value: Boolean): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def NumericLiteral_(end: Double, loc: SourceLocation, start: Double, `type`: NumericLiteral, value: Double): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def TemplateLiteral_(
    end: Double,
    expressions: js.Array[Expression],
    loc: SourceLocation,
    quasis: js.Array[TemplateElement_],
    start: Double,
    `type`: TemplateLiteral
  ): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
  @scala.inline
  def RegExpLiteral_(end: Double, loc: SourceLocation, pattern: String, start: Double, `type`: RegExpLiteral): Literal = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Literal]
  }
}

