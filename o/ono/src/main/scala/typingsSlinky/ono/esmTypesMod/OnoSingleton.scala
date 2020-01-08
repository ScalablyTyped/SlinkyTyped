package typingsSlinky.ono.esmTypesMod

import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoSingleton extends Ono[Error] {
  @JSName("error")
  var error_Original: Ono[js.Error] = js.native
  @JSName("eval")
  var eval_Original: Ono[js.EvalError] = js.native
  @JSName("range")
  var range_Original: Ono[js.RangeError] = js.native
  @JSName("reference")
  var reference_Original: Ono[js.ReferenceError] = js.native
  @JSName("syntax")
  var syntax_Original: Ono[js.SyntaxError] = js.native
  @JSName("type")
  var type_Original: Ono[js.TypeError] = js.native
  @JSName("uri")
  var uri_Original: Ono[js.URIError] = js.native
  def error(error: ErrorPOJO): js.Error with ErrorPOJO with (OnoError[js.Error with ErrorPOJO]) = js.native
  def error(error: ErrorPOJO, message: String, params: js.Any*): js.Error with ErrorPOJO with (OnoError[js.Error with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def error(error: Error): js.Error with OnoError[js.Error] = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(error: Error, message: String, params: js.Any*): js.Error with OnoError[js.Error] = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error(message: String, params: js.Any*): js.Error with OnoError[js.Error] = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P): js.Error with ErrorPOJO with P with (OnoError[js.Error with ErrorPOJO with P]) = js.native
  def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.Error with ErrorPOJO with P with (OnoError[js.Error with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](error: Error, props: P): js.Error with P with (OnoError[js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.Error with P with (OnoError[js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def error[P /* <: js.Object */](props: P): js.Error with P with (OnoError[js.Error with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def error[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.Error with P with (OnoError[js.Error with P]) = js.native
  def eval(error: ErrorPOJO): js.EvalError with ErrorPOJO with (OnoError[js.EvalError with ErrorPOJO]) = js.native
  def eval(error: ErrorPOJO, message: String, params: js.Any*): js.EvalError with ErrorPOJO with (OnoError[js.EvalError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def eval(error: Error): js.EvalError with js.Error with (OnoError[js.EvalError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(error: Error, message: String, params: js.Any*): js.EvalError with js.Error with (OnoError[js.EvalError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval(message: String, params: js.Any*): js.EvalError with OnoError[js.EvalError] = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): js.EvalError with ErrorPOJO with P with (OnoError[js.EvalError with ErrorPOJO with P]) = js.native
  def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.EvalError with ErrorPOJO with P with (OnoError[js.EvalError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](error: Error, props: P): js.EvalError with js.Error with P with (OnoError[js.EvalError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.EvalError with js.Error with P with (OnoError[js.EvalError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def eval[P /* <: js.Object */](props: P): js.EvalError with P with (OnoError[js.EvalError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def eval[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.EvalError with P with (OnoError[js.EvalError with P]) = js.native
  def range(error: ErrorPOJO): js.RangeError with ErrorPOJO with (OnoError[js.RangeError with ErrorPOJO]) = js.native
  def range(error: ErrorPOJO, message: String, params: js.Any*): js.RangeError with ErrorPOJO with (OnoError[js.RangeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def range(error: Error): js.RangeError with js.Error with (OnoError[js.RangeError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(error: Error, message: String, params: js.Any*): js.RangeError with js.Error with (OnoError[js.RangeError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range(message: String, params: js.Any*): js.RangeError with OnoError[js.RangeError] = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P): js.RangeError with ErrorPOJO with P with (OnoError[js.RangeError with ErrorPOJO with P]) = js.native
  def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.RangeError with ErrorPOJO with P with (OnoError[js.RangeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](error: Error, props: P): js.RangeError with js.Error with P with (OnoError[js.RangeError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.RangeError with js.Error with P with (OnoError[js.RangeError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def range[P /* <: js.Object */](props: P): js.RangeError with P with (OnoError[js.RangeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def range[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.RangeError with P with (OnoError[js.RangeError with P]) = js.native
  def reference(error: ErrorPOJO): js.ReferenceError with ErrorPOJO with (OnoError[js.ReferenceError with ErrorPOJO]) = js.native
  def reference(error: ErrorPOJO, message: String, params: js.Any*): js.ReferenceError with ErrorPOJO with (OnoError[js.ReferenceError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def reference(error: Error): js.ReferenceError with js.Error with (OnoError[js.ReferenceError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(error: Error, message: String, params: js.Any*): js.ReferenceError with js.Error with (OnoError[js.ReferenceError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference(message: String, params: js.Any*): js.ReferenceError with OnoError[js.ReferenceError] = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): js.ReferenceError with ErrorPOJO with P with (OnoError[js.ReferenceError with ErrorPOJO with P]) = js.native
  def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.ReferenceError with ErrorPOJO with P with (OnoError[js.ReferenceError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](error: Error, props: P): js.ReferenceError with js.Error with P with (OnoError[js.ReferenceError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.ReferenceError with js.Error with P with (OnoError[js.ReferenceError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def reference[P /* <: js.Object */](props: P): js.ReferenceError with P with (OnoError[js.ReferenceError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def reference[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.ReferenceError with P with (OnoError[js.ReferenceError with P]) = js.native
  def syntax(error: ErrorPOJO): js.SyntaxError with ErrorPOJO with (OnoError[js.SyntaxError with ErrorPOJO]) = js.native
  def syntax(error: ErrorPOJO, message: String, params: js.Any*): js.SyntaxError with ErrorPOJO with (OnoError[js.SyntaxError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def syntax(error: Error): js.SyntaxError with js.Error with (OnoError[js.SyntaxError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(error: Error, message: String, params: js.Any*): js.SyntaxError with js.Error with (OnoError[js.SyntaxError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax(message: String, params: js.Any*): js.SyntaxError with OnoError[js.SyntaxError] = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): js.SyntaxError with ErrorPOJO with P with (OnoError[js.SyntaxError with ErrorPOJO with P]) = js.native
  def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.SyntaxError with ErrorPOJO with P with (OnoError[js.SyntaxError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](error: Error, props: P): js.SyntaxError with js.Error with P with (OnoError[js.SyntaxError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.SyntaxError with js.Error with P with (OnoError[js.SyntaxError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def syntax[P /* <: js.Object */](props: P): js.SyntaxError with P with (OnoError[js.SyntaxError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def syntax[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.SyntaxError with P with (OnoError[js.SyntaxError with P]) = js.native
  def `type`(error: ErrorPOJO): js.TypeError with ErrorPOJO with (OnoError[js.TypeError with ErrorPOJO]) = js.native
  def `type`(error: ErrorPOJO, message: String, params: js.Any*): js.TypeError with ErrorPOJO with (OnoError[js.TypeError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def `type`(error: Error): js.TypeError with js.Error with (OnoError[js.TypeError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(error: Error, message: String, params: js.Any*): js.TypeError with js.Error with (OnoError[js.TypeError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`(message: String, params: js.Any*): js.TypeError with OnoError[js.TypeError] = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): js.TypeError with ErrorPOJO with P with (OnoError[js.TypeError with ErrorPOJO with P]) = js.native
  def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.TypeError with ErrorPOJO with P with (OnoError[js.TypeError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](error: Error, props: P): js.TypeError with js.Error with P with (OnoError[js.TypeError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.TypeError with js.Error with P with (OnoError[js.TypeError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def `type`[P /* <: js.Object */](props: P): js.TypeError with P with (OnoError[js.TypeError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def `type`[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.TypeError with P with (OnoError[js.TypeError with P]) = js.native
  def uri(error: ErrorPOJO): js.URIError with ErrorPOJO with (OnoError[js.URIError with ErrorPOJO]) = js.native
  def uri(error: ErrorPOJO, message: String, params: js.Any*): js.URIError with ErrorPOJO with (OnoError[js.URIError with ErrorPOJO]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error.
    *
    * @param error - The original error
    */
  def uri(error: Error): js.URIError with js.Error with (OnoError[js.URIError with js.Error]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error.
    *
    * @param error - The original error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(error: Error, message: String, params: js.Any*): js.URIError with js.Error with (OnoError[js.URIError with js.Error]) = js.native
  /**
    * Creates an error with a formatted message.
    *
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri(message: String, params: js.Any*): js.URIError with OnoError[js.URIError] = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): js.URIError with ErrorPOJO with P with (OnoError[js.URIError with ErrorPOJO with P]) = js.native
  def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.URIError with ErrorPOJO with P with (OnoError[js.URIError with ErrorPOJO with P]) = js.native
  /**
    * Creates a new error with the message, stack trace, and properties of another error,
    * as well as aditional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](error: Error, props: P): js.URIError with js.Error with P with (OnoError[js.URIError with js.Error with P]) = js.native
  /**
    * Creates a new error with a formatted message and the stack trace and properties of another error,
    * as well as additional properties.
    *
    * @param error - The original error
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](error: Error, props: P, message: String, params: js.Any*): js.URIError with js.Error with P with (OnoError[js.URIError with js.Error with P]) = js.native
  /**
    * Creates an error with additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    */
  def uri[P /* <: js.Object */](props: P): js.URIError with P with (OnoError[js.URIError with P]) = js.native
  /**
    * Creates an error with a formatted message and additional properties.
    *
    * @param props - An object whose properties will be added to the returned error
    * @param message - The new error message, possibly including argument placeholders
    * @param params - Optional arguments to replace the corresponding placeholders in the message
    */
  def uri[P /* <: js.Object */](props: P, message: String, params: js.Any*): js.URIError with P with (OnoError[js.URIError with P]) = js.native
}

