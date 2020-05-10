package typingsSlinky.expressValidator.schemaMod

import typingsSlinky.expressValidator.expressValidatorStrings.blacklist
import typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer
import typingsSlinky.expressValidator.expressValidatorStrings.escape
import typingsSlinky.expressValidator.expressValidatorStrings.ltrim
import typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail
import typingsSlinky.expressValidator.expressValidatorStrings.rtrim
import typingsSlinky.expressValidator.expressValidatorStrings.stripLow
import typingsSlinky.expressValidator.expressValidatorStrings.toArray
import typingsSlinky.expressValidator.expressValidatorStrings.toBoolean
import typingsSlinky.expressValidator.expressValidatorStrings.toDate
import typingsSlinky.expressValidator.expressValidatorStrings.toFloat
import typingsSlinky.expressValidator.expressValidatorStrings.toInt
import typingsSlinky.expressValidator.expressValidatorStrings.trim
import typingsSlinky.expressValidator.expressValidatorStrings.unescape
import typingsSlinky.expressValidator.expressValidatorStrings.whitelist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> ]:? express-validator.express-validator/src/middlewares/schema.SanitizerSchemaOptions<K>} */
@js.native
trait SanitizersSchema extends js.Object {
  var blacklist: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.blacklist]
  ] = js.native
  var customSanitizer: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer]
  ] = js.native
  var escape: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.escape]
  ] = js.native
  var ltrim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.ltrim]
  ] = js.native
  var normalizeEmail: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail]
  ] = js.native
  var rtrim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.rtrim]
  ] = js.native
  var stripLow: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.stripLow]
  ] = js.native
  var toArray: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toArray]
  ] = js.native
  var toBoolean: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toBoolean]
  ] = js.native
  var toDate: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toDate]
  ] = js.native
  var toFloat: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toFloat]
  ] = js.native
  var toInt: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.toInt]
  ] = js.native
  var trim: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.trim]
  ] = js.native
  var unescape: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.unescape]
  ] = js.native
  var whitelist: js.UndefOr[
    SanitizerSchemaOptions[typingsSlinky.expressValidator.expressValidatorStrings.whitelist]
  ] = js.native
}

object SanitizersSchema {
  @scala.inline
  def apply(): SanitizersSchema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SanitizersSchema]
  }
  @scala.inline
  implicit class SanitizersSchemaOps[Self <: SanitizersSchema] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSanitizer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomSanitizer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customSanitizer")(js.undefined)
        ret
    }
    @scala.inline
    def withEscape(value: SanitizerSchemaOptions[escape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEscape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("escape")(js.undefined)
        ret
    }
    @scala.inline
    def withLtrim(value: SanitizerSchemaOptions[ltrim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ltrim")(js.undefined)
        ret
    }
    @scala.inline
    def withNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNormalizeEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("normalizeEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withRtrim(value: SanitizerSchemaOptions[rtrim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRtrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rtrim")(js.undefined)
        ret
    }
    @scala.inline
    def withStripLow(value: SanitizerSchemaOptions[stripLow]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripLow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripLow")(js.undefined)
        ret
    }
    @scala.inline
    def withToArray(value: SanitizerSchemaOptions[toArray]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToArray: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toArray")(js.undefined)
        ret
    }
    @scala.inline
    def withToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoolean")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToBoolean: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toBoolean")(js.undefined)
        ret
    }
    @scala.inline
    def withToDate(value: SanitizerSchemaOptions[toDate]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toDate")(js.undefined)
        ret
    }
    @scala.inline
    def withToFloat(value: SanitizerSchemaOptions[toFloat]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFloat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToFloat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toFloat")(js.undefined)
        ret
    }
    @scala.inline
    def withToInt(value: SanitizerSchemaOptions[toInt]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToInt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toInt")(js.undefined)
        ret
    }
    @scala.inline
    def withTrim(value: SanitizerSchemaOptions[trim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trim")(js.undefined)
        ret
    }
    @scala.inline
    def withUnescape(value: SanitizerSchemaOptions[unescape]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnescape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unescape")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelist")(js.undefined)
        ret
    }
  }
  
}

