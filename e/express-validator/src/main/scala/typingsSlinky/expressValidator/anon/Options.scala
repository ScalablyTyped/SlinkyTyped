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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] extends SanitizerSchemaOptions[K] {
  
  var options: js.UndefOr[
    (Parameters[
      /* import warning: importer.ImportType#apply Failed type conversion: express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K] */ js.Any
    ]) | (/* import warning: importer.ImportType#apply Failed type conversion: std.Parameters<express-validator.express-validator/src/chain/sanitizers.Sanitizers<any>[K]>[0] */ js.Any)
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */](): Options[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[K]]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] (val x: Self with Options[K]) extends AnyVal {
    
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
