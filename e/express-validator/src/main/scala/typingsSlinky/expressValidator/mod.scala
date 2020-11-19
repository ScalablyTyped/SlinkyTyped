package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.anon.PartialMatchedDataOptions
import typingsSlinky.expressValidator.anon.WithDefaults
import typingsSlinky.expressValidator.baseMod.Location
import typingsSlinky.expressValidator.baseMod.Middleware
import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.expressValidator.baseMod.ValidationError
import typingsSlinky.expressValidator.oneOfMod.OneOfCustomMessageBuilder
import typingsSlinky.expressValidator.sanitizationChainMod.SanitizationChain
import typingsSlinky.expressValidator.schemaMod.Schema
import typingsSlinky.expressValidator.validationChainMod.ValidationChain
import typingsSlinky.expressValidator.validationResultMod.ErrorFormatter
import typingsSlinky.expressValidator.validationResultMod.ResultFactory
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def body(): ValidationChain = js.native
  def body(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def body(fields: String): ValidationChain = js.native
  def body(fields: String, message: js.Any): ValidationChain = js.native
  def body(fields: js.Array[String]): ValidationChain = js.native
  def body(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def buildCheckFunction(locations: js.Array[Location]): js.Function2[
    /* fields */ js.UndefOr[String | js.Array[String]], 
    /* message */ js.UndefOr[js.Any], 
    ValidationChain
  ] = js.native
  
  def buildSanitizeFunction(locations: js.Array[Location]): js.Function1[/* fields */ js.UndefOr[String | js.Array[String]], SanitizationChain] = js.native
  
  def check(): ValidationChain = js.native
  def check(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def check(fields: String): ValidationChain = js.native
  def check(fields: String, message: js.Any): ValidationChain = js.native
  def check(fields: js.Array[String]): ValidationChain = js.native
  def check(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def checkSchema(schema: Schema): js.Array[ValidationChain] = js.native
  def checkSchema(schema: Schema, defaultLocations: js.Array[Location]): js.Array[ValidationChain] = js.native
  
  def cookie(): ValidationChain = js.native
  def cookie(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def cookie(fields: String): ValidationChain = js.native
  def cookie(fields: String, message: js.Any): ValidationChain = js.native
  def cookie(fields: js.Array[String]): ValidationChain = js.native
  def cookie(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def header(): ValidationChain = js.native
  def header(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def header(fields: String): ValidationChain = js.native
  def header(fields: String, message: js.Any): ValidationChain = js.native
  def header(fields: js.Array[String]): ValidationChain = js.native
  def header(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def matchedData(req: Request): Record[String, _] = js.native
  def matchedData(req: Request, options: PartialMatchedDataOptions): Record[String, _] = js.native
  
  def oneOf(chains: js.Array[js.Array[ValidationChain] | ValidationChain]): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: js.Any): Middleware = js.native
  def oneOf(chains: js.Array[ValidationChain | js.Array[ValidationChain]], message: OneOfCustomMessageBuilder): Middleware = js.native
  
  def param(): ValidationChain = js.native
  def param(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def param(fields: String): ValidationChain = js.native
  def param(fields: String, message: js.Any): ValidationChain = js.native
  def param(fields: js.Array[String]): ValidationChain = js.native
  def param(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def query(): ValidationChain = js.native
  def query(fields: js.UndefOr[scala.Nothing], message: js.Any): ValidationChain = js.native
  def query(fields: String): ValidationChain = js.native
  def query(fields: String, message: js.Any): ValidationChain = js.native
  def query(fields: js.Array[String]): ValidationChain = js.native
  def query(fields: js.Array[String], message: js.Any): ValidationChain = js.native
  
  def sanitize(): SanitizationChain = js.native
  def sanitize(fields: String): SanitizationChain = js.native
  def sanitize(fields: js.Array[String]): SanitizationChain = js.native
  
  def sanitizeBody(): SanitizationChain = js.native
  def sanitizeBody(fields: String): SanitizationChain = js.native
  def sanitizeBody(fields: js.Array[String]): SanitizationChain = js.native
  
  def sanitizeCookie(): SanitizationChain = js.native
  def sanitizeCookie(fields: String): SanitizationChain = js.native
  def sanitizeCookie(fields: js.Array[String]): SanitizationChain = js.native
  
  def sanitizeParam(): SanitizationChain = js.native
  def sanitizeParam(fields: String): SanitizationChain = js.native
  def sanitizeParam(fields: js.Array[String]): SanitizationChain = js.native
  
  def sanitizeQuery(): SanitizationChain = js.native
  def sanitizeQuery(fields: String): SanitizationChain = js.native
  def sanitizeQuery(fields: js.Array[String]): SanitizationChain = js.native
  
  val validationResult: ResultFactory[ValidationError] with WithDefaults = js.native
  
  @js.native
  class Result[T] protected ()
    extends typingsSlinky.expressValidator.validationResultMod.Result[T] {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
  }
}
