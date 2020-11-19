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

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.expressValidator.expressValidatorBooleans.`true`
  - typingsSlinky.expressValidator.anon.Options[K]
*/
trait SanitizerSchemaOptions[K /* <: /* keyof express-validator.express-validator/src/chain/sanitizers.Sanitizers<any> */ customSanitizer | blacklist | escape | unescape | ltrim | normalizeEmail | rtrim | stripLow | toArray | toBoolean | toDate | toFloat | toInt | trim | whitelist */] extends js.Object
