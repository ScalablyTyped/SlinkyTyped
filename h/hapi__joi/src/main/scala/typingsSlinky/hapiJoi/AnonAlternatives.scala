package typingsSlinky.hapiJoi

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

@js.native
trait AnonAlternatives extends js.Object {
  var alternatives: AlternativesSchema = js.native
  var any: AnySchema = js.native
  var array: ArraySchema = js.native
  var binary: BinarySchema = js.native
  var boolean: BooleanSchema = js.native
  var date: DateSchema = js.native
  var function: FunctionSchema = js.native
  var link: LinkSchema = js.native
  var number: NumberSchema = js.native
  var `object`: ObjectSchema[_] = js.native
  var string: StringSchema = js.native
  var symbol: SymbolSchema = js.native
}

object AnonAlternatives {
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
  ): AnonAlternatives = {
    val __obj = js.Dynamic.literal(alternatives = alternatives.asInstanceOf[js.Any], any = any.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlternatives]
  }
  @scala.inline
  implicit class AnonAlternativesOps[Self <: AnonAlternatives] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlternatives(value: AlternativesSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alternatives")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAny(value: AnySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("any")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withArray(value: ArraySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("array")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBinary(value: BinarySchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("binary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBoolean(value: BooleanSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDate(value: DateSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFunction(value: FunctionSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLink(value: LinkSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("link")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumber(value: NumberSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withObject(value: ObjectSchema[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("object")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withString(value: StringSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSymbol(value: SymbolSchema): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

