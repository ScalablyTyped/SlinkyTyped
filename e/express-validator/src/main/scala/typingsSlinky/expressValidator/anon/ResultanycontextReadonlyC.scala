package typingsSlinky.expressValidator.anon

import typingsSlinky.expressValidator.baseMod.ValidationError
import typingsSlinky.expressValidator.contextMod.ReadonlyContext
import typingsSlinky.expressValidator.validationResultMod.ErrorFormatter
import typingsSlinky.expressValidator.validationResultMod.Result
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined express-validator.express-validator/src/validation-result.Result<any> & {  context :express-validator.express-validator/src/context.ReadonlyContext} */
@js.native
trait ResultanycontextReadonlyC extends js.Object {
  
  def array(): js.Array[_] = js.native
  def array(options: OnlyFirstError): js.Array[_] = js.native
  
  var context: ReadonlyContext = js.native
  
  val errors: js.Any = js.native
  
  def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
  
  var formatter: js.Any = js.native
  
  def isEmpty(): Boolean = js.native
  
  def mapped(): Record[String, _] = js.native
  
  def `throw`(): Unit = js.native
}
