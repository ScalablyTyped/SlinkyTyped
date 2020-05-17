package typingsSlinky.breeze.breeze

import typingsSlinky.breeze.breeze.core.EnumSymbol
import typingsSlinky.breeze.breeze.core.IEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTypeSymbol extends EnumSymbol {
  var defaultValue: js.Any = js.native
  /** Optional function to get the next value when the datatype is used as a concurrency property. */
  var getConcurrencyValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Optional function to get the next value for key generation, if this datatype is used as a key.  Uses an internal table of previous values. */
  var getNext: js.UndefOr[js.Function0[_]] = js.native
  var isDate: js.UndefOr[Boolean] = js.native
  var isFloat: js.UndefOr[Boolean] = js.native
  var isInteger: js.UndefOr[Boolean] = js.native
  var isNumeric: js.UndefOr[Boolean] = js.native
  /** Optional function to normalize a data value for comparison, if its value cannot be used directly.  Note that this will be called each time a property is changed, so make it fast. */
  var normalize: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  /** Function to convert a value from string to this DataType.  Note that this will be called each time a property is changed, so make it fast. */
  var parse: js.UndefOr[js.Function2[/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String], _]] = js.native
  /** Optional function to convert a raw (server) value from string to this DataType. */
  var parseRawValue: js.UndefOr[js.Function1[/* val */ js.Any, _]] = js.native
  var quoteJsonOData: js.UndefOr[Boolean] = js.native
  /** Function to format this DataType for OData queries. */
  def fmtOData(`val`: js.Any): js.Any = js.native
  def validatorCtor(context: js.Any): Validator = js.native
}

object DataTypeSymbol {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    fmtOData: js.Any => js.Any,
    getName: () => String,
    parentEnum: IEnum,
    validatorCtor: js.Any => Validator
  ): DataTypeSymbol = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], fmtOData = js.Any.fromFunction1(fmtOData), getName = js.Any.fromFunction0(getName), parentEnum = parentEnum.asInstanceOf[js.Any], validatorCtor = js.Any.fromFunction1(validatorCtor))
    __obj.asInstanceOf[DataTypeSymbol]
  }
  @scala.inline
  implicit class DataTypeSymbolOps[Self <: DataTypeSymbol] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFmtOData(value: js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fmtOData")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidatorCtor(value: js.Any => Validator): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorCtor")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetConcurrencyValue(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConcurrencyValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetConcurrencyValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getConcurrencyValue")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNext(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNext")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsFloat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withIsInteger(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsInteger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isInteger")(js.undefined)
        ret
    }
    @scala.inline
    def withIsNumeric(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNumeric: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isNumeric")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalize(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutNormalize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalize")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: (/* val */ js.Any, /* sourceTypeName */ js.UndefOr[String]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withParseRawValue(value: /* val */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseRawValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutParseRawValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseRawValue")(js.undefined)
        ret
    }
    @scala.inline
    def withQuoteJsonOData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteJsonOData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuoteJsonOData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quoteJsonOData")(js.undefined)
        ret
    }
  }
  
}

