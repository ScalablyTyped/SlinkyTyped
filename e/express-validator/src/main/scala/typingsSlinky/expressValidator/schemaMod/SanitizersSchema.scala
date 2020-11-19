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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBlacklist(value: SanitizerSchemaOptions[blacklist]): Self = this.set("blacklist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlacklist: Self = this.set("blacklist", js.undefined)
    
    @scala.inline
    def setCustomSanitizer(value: SanitizerSchemaOptions[customSanitizer]): Self = this.set("customSanitizer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomSanitizer: Self = this.set("customSanitizer", js.undefined)
    
    @scala.inline
    def setEscape(value: SanitizerSchemaOptions[escape]): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
    
    @scala.inline
    def setLtrim(value: SanitizerSchemaOptions[ltrim]): Self = this.set("ltrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLtrim: Self = this.set("ltrim", js.undefined)
    
    @scala.inline
    def setNormalizeEmail(value: SanitizerSchemaOptions[normalizeEmail]): Self = this.set("normalizeEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeEmail: Self = this.set("normalizeEmail", js.undefined)
    
    @scala.inline
    def setRtrim(value: SanitizerSchemaOptions[rtrim]): Self = this.set("rtrim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtrim: Self = this.set("rtrim", js.undefined)
    
    @scala.inline
    def setStripLow(value: SanitizerSchemaOptions[stripLow]): Self = this.set("stripLow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStripLow: Self = this.set("stripLow", js.undefined)
    
    @scala.inline
    def setToArray(value: SanitizerSchemaOptions[toArray]): Self = this.set("toArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToArray: Self = this.set("toArray", js.undefined)
    
    @scala.inline
    def setToBoolean(value: SanitizerSchemaOptions[toBoolean]): Self = this.set("toBoolean", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToBoolean: Self = this.set("toBoolean", js.undefined)
    
    @scala.inline
    def setToDate(value: SanitizerSchemaOptions[toDate]): Self = this.set("toDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDate: Self = this.set("toDate", js.undefined)
    
    @scala.inline
    def setToFloat(value: SanitizerSchemaOptions[toFloat]): Self = this.set("toFloat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToFloat: Self = this.set("toFloat", js.undefined)
    
    @scala.inline
    def setToInt(value: SanitizerSchemaOptions[toInt]): Self = this.set("toInt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToInt: Self = this.set("toInt", js.undefined)
    
    @scala.inline
    def setTrim(value: SanitizerSchemaOptions[trim]): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setUnescape(value: SanitizerSchemaOptions[unescape]): Self = this.set("unescape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnescape: Self = this.set("unescape", js.undefined)
    
    @scala.inline
    def setWhitelist(value: SanitizerSchemaOptions[whitelist]): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
