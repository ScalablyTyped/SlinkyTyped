package typingsSlinky.hapiJoi.anon

import typingsSlinky.hapiJoi.mod.AlternativesSchema
import typingsSlinky.hapiJoi.mod.AnySchema
import typingsSlinky.hapiJoi.mod.ArraySchema
import typingsSlinky.hapiJoi.mod.BinarySchema
import typingsSlinky.hapiJoi.mod.BooleanSchema
import typingsSlinky.hapiJoi.mod.DateSchema
import typingsSlinky.hapiJoi.mod.FunctionSchema
import typingsSlinky.hapiJoi.mod.LinkSchema
import typingsSlinky.hapiJoi.mod.NumberSchema
import typingsSlinky.hapiJoi.mod.ObjectSchema
import typingsSlinky.hapiJoi.mod.StringSchema
import typingsSlinky.hapiJoi.mod.SymbolSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternatives extends js.Object {
  var alternatives: AlternativesSchema
  var any: AnySchema
  var array: ArraySchema
  var binary: BinarySchema
  var boolean: BooleanSchema
  var date: DateSchema
  var function: FunctionSchema
  var link: LinkSchema
  var number: NumberSchema
  var `object`: ObjectSchema[_]
  var string: StringSchema
  var symbol: SymbolSchema
}

object Alternatives {
  @scala.inline
  def apply(
    alternatives: AlternativesSchema,
    any: AnySchema,
    array: ArraySchema,
    binary: BinarySchema,
    boolean: BooleanSchema,
    date: DateSchema,
    function: FunctionSchema,
    link: LinkSchema,
    number: NumberSchema,
    `object`: ObjectSchema[_],
    string: StringSchema,
    symbol: SymbolSchema
  ): Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternatives]
  }
}

