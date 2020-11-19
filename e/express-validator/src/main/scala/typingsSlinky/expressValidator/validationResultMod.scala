package typingsSlinky.expressValidator

import typingsSlinky.expressValidator.anon.OnlyFirstError
import typingsSlinky.expressValidator.anon.WithDefaults
import typingsSlinky.expressValidator.baseMod.Request
import typingsSlinky.expressValidator.baseMod.ValidationError
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("express-validator/src/validation-result", JSImport.Namespace)
@js.native
object validationResultMod extends js.Object {
  
  val validationResult: ResultFactory[ValidationError] with WithDefaults = js.native
  
  @js.native
  class Result[T] protected () extends js.Object {
    def this(formatter: ErrorFormatter[T], errors: js.Array[ValidationError]) = this()
    
    def array(): js.Array[T] = js.native
    def array(options: OnlyFirstError): js.Array[T] = js.native
    
    val errors: js.Any = js.native
    
    def formatWith[T2](formatter: ErrorFormatter[T2]): Result[T2] = js.native
    
    var formatter: js.Any = js.native
    
    def isEmpty(): Boolean = js.native
    
    def mapped(): Record[String, T] = js.native
    
    def `throw`(): Unit = js.native
  }
  
  @js.native
  trait ResultFactoryBuilderOptions[T] extends js.Object {
    
    def formatter(error: ValidationError): T = js.native
    @JSName("formatter")
    var formatter_Original: ErrorFormatter[T] = js.native
  }
  
  type ErrorFormatter[T] = js.Function1[/* error */ ValidationError, T]
  
  type ResultFactory[T] = js.Function1[/* req */ Request, Result[T]]
}
