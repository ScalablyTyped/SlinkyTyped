package typingsSlinky.atHapiJoi

import typingsSlinky.atHapiJoi.atHapiJoiMod.AlternativesSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.AnySchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.ArraySchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.BinarySchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.BooleanSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.DateSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.FunctionSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.LinkSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.NumberSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.ObjectSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.StringSchema
import typingsSlinky.atHapiJoi.atHapiJoiMod.SymbolSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternatives extends js.Object {
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

object Anon_Alternatives {
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
  ): Anon_Alternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alternatives]
  }
}

