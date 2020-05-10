package typingsSlinky.nodeObjectHash.objectSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Advanced coerce options
  */
@js.native
trait CoerceOptions extends js.Object {
  /**
    * If `true` converts booleans to string `1` and `0`
    * @example
    * // coerce.boolean = true
    * true === 1;
    * false === '0';
    * @example
    * // coerce.boolean = true
    * true !== 1;
    * false !== '0'
    * @default true
    */
  var boolean: js.UndefOr[Boolean] = js.native
  /**
    * If `true` dates may equal the same formatted strings
    * @example
    * // coerce.date = true
    * @example
    * // coerce.date = false
    * @default true
    */
  var date: js.UndefOr[Boolean] = js.native
  /**
    * If `true` functions may equal the same formatted strings
    * @example
    * // coerce.function = true
    * @example
    * // coerce.function = false
    * @default true
    */
  var function: js.UndefOr[Boolean] = js.native
  /**
    * If `true` null will be equal to empty string
    * @example
    * // coerce.null = true
    * null === ''
    * @example
    * // coerce.null = false
    * null !== ''
    * @default true
    */
  var `null`: js.UndefOr[Boolean] = js.native
  /**
    * If `true` converts numbers to strings
    * @example
    * // coerce.number = true
    * 1 === '1';
    * @example
    * // coerce.number = true
    * 1 !== '1';
    * @default true
    */
  var number: js.UndefOr[Boolean] = js.native
  /**
    * If `true` set will be coerced to array
    * @example
    * // coerce.set = true
    * @example
    * // coerce.set = false
    * @default true
    */
  var set: js.UndefOr[Boolean] = js.native
  /**
    * If `true` strings and coerced string will be equal to coerced numbers, booleans, etc
    * @example
    * // coerce.string = true
    * '1' === true
    * @example
    * // coerce.string = false
    * '1' !== 1
    * @default true
    */
  var string: js.UndefOr[Boolean] = js.native
  /**
    * If `true` all symbols will have eual representation
    * @example
    * // coerce.symbol = true
    * Symbol.for('a') === Symbol.for('b')
    * @example
    * // coerce.symbol = false
    * Symbol.for('a') !== Symbol.for('b')
    * @default true
    */
  var symbol: js.UndefOr[Boolean] = js.native
  /**
    * If `true` undefined will be equal to empty string
    * @example
    * // coerce.undefined = true
    * undefined === ''
    * @example
    * // coerce.undefined = false
    * undefined !== ''
    * @default true
    */
  var undefined: js.UndefOr[Boolean] = js.native
}

object CoerceOptions {
  @scala.inline
  def apply(): CoerceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoerceOptions]
  }
  @scala.inline
  implicit class CoerceOptionsOps[Self <: CoerceOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoolean(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boolean")(js.undefined)
        ret
    }
    @scala.inline
    def withDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(js.undefined)
        ret
    }
    @scala.inline
    def withFunction(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("function")(js.undefined)
        ret
    }
    @scala.inline
    def withNull(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("null")(js.undefined)
        ret
    }
    @scala.inline
    def withNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("number")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withString(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("string")(js.undefined)
        ret
    }
    @scala.inline
    def withSymbol(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSymbol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("symbol")(js.undefined)
        ret
    }
    @scala.inline
    def withUndefined(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUndefined: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("undefined")(js.undefined)
        ret
    }
  }
  
}

