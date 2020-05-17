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
  def apply[K](): `0`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[K]]
  }
  @scala.inline
  implicit class `0Ops`[Self[k] <: `0`[k], K] (val x: Self[K]) extends AnyVal {
    @scala.inline
    def duplicate: Self[K] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[K]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[K] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[K] with Other]
    @scala.inline
    def withOptions(
      value: (Parameters[
          /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
        ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
    ): Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptions: Self[K] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(js.undefined)
        ret
    }
  }
  
}

