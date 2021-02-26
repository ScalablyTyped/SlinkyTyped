package typingsSlinky.jsdevtoolsOno

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typingsSlinky.jsdevtoolsOno.jsdevtoolsOnoBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type ErrorLike = js.Error | ErrorPOJO
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jsdevtoolsOno.typesMod.ErrorLikeConstructorFunction[T]
    - typingsSlinky.jsdevtoolsOno.typesMod.ErrorLikeConstructorClass[T]
  */
  trait ErrorLikeConstructor[T /* <: ErrorLike */] extends StObject
  
  @js.native
  trait ErrorLikeConstructorClass[T /* <: ErrorLike */]
    extends ErrorLikeConstructor[T]
       with Instantiable1[/* args (repeated) */ js.Any, T]
  
  @js.native
  trait ErrorLikeConstructorFunction[T /* <: ErrorLike */] extends ErrorLikeConstructor[T] {
    
    def apply(): T = js.native
  }
  
  @js.native
  trait ErrorPOJO extends StObject {
    
    var message: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var stack: js.UndefOr[String] = js.native
  }
  object ErrorPOJO {
    
    @scala.inline
    def apply(): ErrorPOJO = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorPOJO]
    }
    
    @scala.inline
    implicit class ErrorPOJOMutableBuilder[Self <: ErrorPOJO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  type MessageFormatter = js.Function2[/* message */ String, /* repeated */ js.Any, String]
  
  @js.native
  trait Ono[T /* <: ErrorLike */] extends StObject {
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def apply(error: js.Error): T with js.Error with (OnoError[T with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(error: js.Error, message: String, params: js.Any*): T with js.Error with (OnoError[T with js.Error]) = js.native
    def apply(error: ErrorPOJO): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
    def apply(error: ErrorPOJO, message: String, params: js.Any*): T with ErrorPOJO with (OnoError[T with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply(message: String, params: js.Any*): T with OnoError[T] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](error: js.Error, props: P): T with js.Error with P with (OnoError[T with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): T with js.Error with P with (OnoError[T with js.Error with P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
    def apply[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): T with ErrorPOJO with P with (OnoError[T with ErrorPOJO with P]) = js.native
    /**
      * Creates an error with additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      */
    def apply[P /* <: js.Object */](props: P): T with P with (OnoError[T with P]) = js.native
    /**
      * Creates an error with a formatted message and additional properties.
      *
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def apply[P /* <: js.Object */](props: P, message: String, params: js.Any*): T with P with (OnoError[T with P]) = js.native
    
    /**
      * The type of Error that this `Ono` function produces.
      */
    @JSName(js.Symbol.species)
    val species: ErrorLikeConstructor[T] = js.native
  }
  
  @js.native
  trait OnoConstructor
    extends Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]]
       with Instantiable2[
          /* constructor */ ErrorLikeConstructor[ErrorLike], 
          /* options */ OnoOptions, 
          Ono[ErrorLike]
        ] {
    
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
    def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T], options: OnoOptions): Ono[T] = js.native
    
    /**
      * Extends the given Error object with enhanced Ono functionality, such as improved support for
      * `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      */
    def extend(error: js.Error): js.Error with OnoError[js.Error] = js.native
    def extend(error: ErrorPOJO): ErrorPOJO with OnoError[ErrorPOJO] = js.native
    def extend[E /* <: ErrorLike */](error: js.Error, originalError: E): js.Error with E with (OnoError[js.Error with E]) = js.native
    def extend[E /* <: ErrorLike */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E, props: P): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: js.UndefOr[scala.Nothing], props: P): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E, props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    def extend[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: js.UndefOr[scala.Nothing], props: P): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      */
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: js.Error): js.Error with E with (OnoError[js.Error with E]) = js.native
    @JSName("extend")
    def extend_E_ErrorLike[E /* <: ErrorLike */](error: ErrorPOJO): ErrorPOJO with E with (OnoError[ErrorPOJO with E]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as nested stack traces,
      * additional properties, and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param originalError - The original error. This error's stack trace will be added to the error's stack trace.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: js.Error, originalError: E): js.Error with E with P with (OnoError[js.Error with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    @JSName("extend")
    def extend_E_ErrorLikeP_Object[E /* <: ErrorLike */, P /* <: js.Object */](error: ErrorPOJO, originalError: E): ErrorPOJO with E with P with (OnoError[ErrorPOJO with E with P]) = js.native
    /**
      * Extends the given Error object with enhanced Ono functionality, such as additional properties
      * and improved support for `JSON.stringify()`.
      *
      * @param error - The error object to extend. This object instance will be modified and returned.
      * @param props - An object whose properties will be added to the error
      */
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: js.Error): js.Error with P with (OnoError[js.Error with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: js.Error, props: P): js.Error with P with (OnoError[js.Error with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
    @JSName("extend")
    def extend_P_Object[P /* <: js.Object */](error: ErrorPOJO, props: P): ErrorPOJO with P with (OnoError[ErrorPOJO with P]) = js.native
    
    /**
      * Returns an object containing all properties of the given Error object,
      * which can be used with `JSON.stringify()`.
      */
    def toJSON(error: js.Error): ErrorPOJO with js.Error = js.native
    def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
  }
  
  @js.native
  trait OnoError[T] extends ErrorPOJO {
    
    /**
      * Returns a JSON representation of the error, including all built-in error properties,
      * as well as properties that were dynamically added.
      */
    def toJSON(): ErrorPOJO with T = js.native
  }
  
  @js.native
  trait OnoOptions extends StObject {
    
    /**
      * When `Ono` is used to wrap an error, this setting determines whether the inner error's message
      * is appended to the new error message.
      *
      * Defaults to `true`.
      */
    var concatMessages: js.UndefOr[Boolean] = js.native
    
    /**
      * A function that replaces placeholders like "%s" or "%d" in error messages with values.
      * If set to `false`, then error messages will be treated as literals and no placeholder replacement will occur.
      *
      * Defaults to `utils.inspect()` in Node.js.  Defaults to `Array.join()` in browsers.
      */
    var format: js.UndefOr[MessageFormatter | `false`] = js.native
  }
  object OnoOptions {
    
    @scala.inline
    def apply(): OnoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnoOptions]
    }
    
    @scala.inline
    implicit class OnoOptionsMutableBuilder[Self <: OnoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcatMessages(value: Boolean): Self = StObject.set(x, "concatMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcatMessagesUndefined: Self = StObject.set(x, "concatMessages", js.undefined)
      
      @scala.inline
      def setFormat(value: MessageFormatter | `false`): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatFunction2(value: (/* message */ String, /* repeated */ js.Any) => String): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  @js.native
  trait OnoSingleton
    extends Ono[js.Error] {
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def error(error: js.Error): js.Error with OnoError[js.Error] = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(error: js.Error, message: String, params: js.Any*): js.Error with OnoError[js.Error] = js.native
    def error(error: ErrorPOJO): js.Error with ErrorPOJO with (OnoError[js.Error with ErrorPOJO]) = js.native
    def error(error: ErrorPOJO, message: String, params: js.Any*): js.Error with ErrorPOJO with (OnoError[js.Error with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error(message: String, params: js.Any*): js.Error with OnoError[js.Error] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def error[P /* <: js.Object */](error: js.Error, props: P): js.Error with P with (OnoError[js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def error[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.Error with P with (OnoError[js.Error with P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P): js.Error with ErrorPOJO with P with (OnoError[js.Error with ErrorPOJO with P]) = js.native
    def error[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.Error with ErrorPOJO with P with (OnoError[js.Error with ErrorPOJO with P]) = js.native
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
    @JSName("error")
    var error_Original: Ono[js.Error] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def eval(error: js.Error): js.EvalError with js.Error with (OnoError[js.EvalError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(error: js.Error, message: String, params: js.Any*): js.EvalError with js.Error with (OnoError[js.EvalError with js.Error]) = js.native
    def eval(error: ErrorPOJO): js.EvalError with ErrorPOJO with (OnoError[js.EvalError with ErrorPOJO]) = js.native
    def eval(error: ErrorPOJO, message: String, params: js.Any*): js.EvalError with ErrorPOJO with (OnoError[js.EvalError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval(message: String, params: js.Any*): js.EvalError with OnoError[js.EvalError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def eval[P /* <: js.Object */](error: js.Error, props: P): js.EvalError with js.Error with P with (OnoError[js.EvalError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def eval[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.EvalError with js.Error with P with (OnoError[js.EvalError with js.Error with P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P): js.EvalError with ErrorPOJO with P with (OnoError[js.EvalError with ErrorPOJO with P]) = js.native
    def eval[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.EvalError with ErrorPOJO with P with (OnoError[js.EvalError with ErrorPOJO with P]) = js.native
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
    @JSName("eval")
    var eval_Original: Ono[js.EvalError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def range(error: js.Error): js.RangeError with js.Error with (OnoError[js.RangeError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(error: js.Error, message: String, params: js.Any*): js.RangeError with js.Error with (OnoError[js.RangeError with js.Error]) = js.native
    def range(error: ErrorPOJO): js.RangeError with ErrorPOJO with (OnoError[js.RangeError with ErrorPOJO]) = js.native
    def range(error: ErrorPOJO, message: String, params: js.Any*): js.RangeError with ErrorPOJO with (OnoError[js.RangeError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range(message: String, params: js.Any*): js.RangeError with OnoError[js.RangeError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def range[P /* <: js.Object */](error: js.Error, props: P): js.RangeError with js.Error with P with (OnoError[js.RangeError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def range[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.RangeError with js.Error with P with (OnoError[js.RangeError with js.Error with P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P): js.RangeError with ErrorPOJO with P with (OnoError[js.RangeError with ErrorPOJO with P]) = js.native
    def range[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.RangeError with ErrorPOJO with P with (OnoError[js.RangeError with ErrorPOJO with P]) = js.native
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
    @JSName("range")
    var range_Original: Ono[js.RangeError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def reference(error: js.Error): js.ReferenceError with js.Error with (OnoError[js.ReferenceError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(error: js.Error, message: String, params: js.Any*): js.ReferenceError with js.Error with (OnoError[js.ReferenceError with js.Error]) = js.native
    def reference(error: ErrorPOJO): js.ReferenceError with ErrorPOJO with (OnoError[js.ReferenceError with ErrorPOJO]) = js.native
    def reference(error: ErrorPOJO, message: String, params: js.Any*): js.ReferenceError with ErrorPOJO with (OnoError[js.ReferenceError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference(message: String, params: js.Any*): js.ReferenceError with OnoError[js.ReferenceError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def reference[P /* <: js.Object */](error: js.Error, props: P): js.ReferenceError with js.Error with P with (OnoError[js.ReferenceError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def reference[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.ReferenceError with js.Error with P with (OnoError[js.ReferenceError with js.Error with P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P): js.ReferenceError with ErrorPOJO with P with (OnoError[js.ReferenceError with ErrorPOJO with P]) = js.native
    def reference[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.ReferenceError with ErrorPOJO with P with (OnoError[js.ReferenceError with ErrorPOJO with P]) = js.native
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
    @JSName("reference")
    var reference_Original: Ono[js.ReferenceError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def syntax(error: js.Error): js.SyntaxError with js.Error with (OnoError[js.SyntaxError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(error: js.Error, message: String, params: js.Any*): js.SyntaxError with js.Error with (OnoError[js.SyntaxError with js.Error]) = js.native
    def syntax(error: ErrorPOJO): js.SyntaxError with ErrorPOJO with (OnoError[js.SyntaxError with ErrorPOJO]) = js.native
    def syntax(error: ErrorPOJO, message: String, params: js.Any*): js.SyntaxError with ErrorPOJO with (OnoError[js.SyntaxError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax(message: String, params: js.Any*): js.SyntaxError with OnoError[js.SyntaxError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def syntax[P /* <: js.Object */](error: js.Error, props: P): js.SyntaxError with js.Error with P with (OnoError[js.SyntaxError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def syntax[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.SyntaxError with js.Error with P with (OnoError[js.SyntaxError with js.Error with P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P): js.SyntaxError with ErrorPOJO with P with (OnoError[js.SyntaxError with ErrorPOJO with P]) = js.native
    def syntax[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.SyntaxError with ErrorPOJO with P with (OnoError[js.SyntaxError with ErrorPOJO with P]) = js.native
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
    @JSName("syntax")
    var syntax_Original: Ono[js.SyntaxError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def `type`(error: js.Error): js.TypeError with js.Error with (OnoError[js.TypeError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(error: js.Error, message: String, params: js.Any*): js.TypeError with js.Error with (OnoError[js.TypeError with js.Error]) = js.native
    def `type`(error: ErrorPOJO): js.TypeError with ErrorPOJO with (OnoError[js.TypeError with ErrorPOJO]) = js.native
    def `type`(error: ErrorPOJO, message: String, params: js.Any*): js.TypeError with ErrorPOJO with (OnoError[js.TypeError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`(message: String, params: js.Any*): js.TypeError with OnoError[js.TypeError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def `type`[P /* <: js.Object */](error: js.Error, props: P): js.TypeError with js.Error with P with (OnoError[js.TypeError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def `type`[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.TypeError with js.Error with P with (OnoError[js.TypeError with js.Error with P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P): js.TypeError with ErrorPOJO with P with (OnoError[js.TypeError with ErrorPOJO with P]) = js.native
    def `type`[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.TypeError with ErrorPOJO with P with (OnoError[js.TypeError with ErrorPOJO with P]) = js.native
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
    @JSName("type")
    var type_Original: Ono[js.TypeError] = js.native
    
    /**
      * Creates a new error with the message, stack trace, and properties of another error.
      *
      * @param error - The original error
      */
    def uri(error: js.Error): js.URIError with js.Error with (OnoError[js.URIError with js.Error]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error.
      *
      * @param error - The original error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(error: js.Error, message: String, params: js.Any*): js.URIError with js.Error with (OnoError[js.URIError with js.Error]) = js.native
    def uri(error: ErrorPOJO): js.URIError with ErrorPOJO with (OnoError[js.URIError with ErrorPOJO]) = js.native
    def uri(error: ErrorPOJO, message: String, params: js.Any*): js.URIError with ErrorPOJO with (OnoError[js.URIError with ErrorPOJO]) = js.native
    /**
      * Creates an error with a formatted message.
      *
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri(message: String, params: js.Any*): js.URIError with OnoError[js.URIError] = js.native
    /**
      * Creates a new error with the message, stack trace, and properties of another error,
      * as well as aditional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      */
    def uri[P /* <: js.Object */](error: js.Error, props: P): js.URIError with js.Error with P with (OnoError[js.URIError with js.Error with P]) = js.native
    /**
      * Creates a new error with a formatted message and the stack trace and properties of another error,
      * as well as additional properties.
      *
      * @param error - The original error
      * @param props - An object whose properties will be added to the returned error
      * @param message - The new error message, possibly including argument placeholders
      * @param params - Optional arguments to replace the corresponding placeholders in the message
      */
    def uri[P /* <: js.Object */](error: js.Error, props: P, message: String, params: js.Any*): js.URIError with js.Error with P with (OnoError[js.URIError with js.Error with P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P): js.URIError with ErrorPOJO with P with (OnoError[js.URIError with ErrorPOJO with P]) = js.native
    def uri[P /* <: js.Object */](error: ErrorPOJO, props: P, message: String, params: js.Any*): js.URIError with ErrorPOJO with P with (OnoError[js.URIError with ErrorPOJO with P]) = js.native
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
    @JSName("uri")
    var uri_Original: Ono[js.URIError] = js.native
  }
}
