package typingsSlinky.expressValidator.anon

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
import typingsSlinky.expressValidator.schemaMod.SanitizerSchemaOptions
import typingsSlinky.std.Parameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait `0`[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] extends SanitizerSchemaOptions[K] {
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.native
}

object `0` {
  @scala.inline
  def apply[/* <: / * keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> * / typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer | typingsSlinky.expressValidator.expressValidatorStrings.blacklist | typingsSlinky.expressValidator.expressValidatorStrings.escape | typingsSlinky.expressValidator.expressValidatorStrings.unescape | typingsSlinky.expressValidator.expressValidatorStrings.ltrim | typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail | typingsSlinky.expressValidator.expressValidatorStrings.rtrim | typingsSlinky.expressValidator.expressValidatorStrings.stripLow | typingsSlinky.expressValidator.expressValidatorStrings.toArray | typingsSlinky.expressValidator.expressValidatorStrings.toBoolean | typingsSlinky.expressValidator.expressValidatorStrings.toDate | typingsSlinky.expressValidator.expressValidatorStrings.toFloat | typingsSlinky.expressValidator.expressValidatorStrings.toInt | typingsSlinky.expressValidator.expressValidatorStrings.trim | typingsSlinky.expressValidator.expressValidatorStrings.whitelist */ K](): `0`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[K]]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`[_], /* <: / * keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> * / typingsSlinky.expressValidator.expressValidatorStrings.customSanitizer | typingsSlinky.expressValidator.expressValidatorStrings.blacklist | typingsSlinky.expressValidator.expressValidatorStrings.escape | typingsSlinky.expressValidator.expressValidatorStrings.unescape | typingsSlinky.expressValidator.expressValidatorStrings.ltrim | typingsSlinky.expressValidator.expressValidatorStrings.normalizeEmail | typingsSlinky.expressValidator.expressValidatorStrings.rtrim | typingsSlinky.expressValidator.expressValidatorStrings.stripLow | typingsSlinky.expressValidator.expressValidatorStrings.toArray | typingsSlinky.expressValidator.expressValidatorStrings.toBoolean | typingsSlinky.expressValidator.expressValidatorStrings.toDate | typingsSlinky.expressValidator.expressValidatorStrings.toFloat | typingsSlinky.expressValidator.expressValidatorStrings.toInt | typingsSlinky.expressValidator.expressValidatorStrings.trim | typingsSlinky.expressValidator.expressValidatorStrings.whitelist */ K] (val x: Self with `0`[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
    ): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

