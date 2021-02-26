package typingsSlinky.firebase.mod.firebase

import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object functions {
  
  @js.native
  trait Functions extends StObject {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @param options The options for this HttpsCallable instance.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable(name: String): HttpsCallable = js.native
    def httpsCallable(name: String, options: HttpsCallableOptions): HttpsCallable = js.native
    
    /**
      * Modify this instance to communicate with the Cloud Functions emulator.
      *
      * Note: this must be called before this instance has been used to do any operations.
      *
      * @param host The emulator host (ex: localhost)
      * @param port The emulator port (ex: 5001)
      */
    def useEmulator(host: String, port: Double): Unit = js.native
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally. See https://firebase.google.com/docs/functions/local-emulator
      *
      * @deprecated Prefer the useEmulator(host, port) method.
      * @param origin The origin of the local emulator, such as
      * "http://localhost:5005".
      */
    def useFunctionsEmulator(url: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.firebase.firebaseStrings.ok
    - typingsSlinky.firebase.firebaseStrings.cancelled
    - typingsSlinky.firebase.firebaseStrings.unknown
    - typingsSlinky.firebase.firebaseStrings.`invalid-argument`
    - typingsSlinky.firebase.firebaseStrings.`deadline-exceeded`
    - typingsSlinky.firebase.firebaseStrings.`not-found`
    - typingsSlinky.firebase.firebaseStrings.`already-exists`
    - typingsSlinky.firebase.firebaseStrings.`permission-denied`
    - typingsSlinky.firebase.firebaseStrings.`resource-exhausted`
    - typingsSlinky.firebase.firebaseStrings.`failed-precondition`
    - typingsSlinky.firebase.firebaseStrings.aborted
    - typingsSlinky.firebase.firebaseStrings.`out-of-range`
    - typingsSlinky.firebase.firebaseStrings.unimplemented
    - typingsSlinky.firebase.firebaseStrings.internal
    - typingsSlinky.firebase.firebaseStrings.unavailable
    - typingsSlinky.firebase.firebaseStrings.`data-loss`
    - typingsSlinky.firebase.firebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    @scala.inline
    def aborted: typingsSlinky.firebase.firebaseStrings.aborted = "aborted".asInstanceOf[typingsSlinky.firebase.firebaseStrings.aborted]
    
    @scala.inline
    def `already-exists`: typingsSlinky.firebase.firebaseStrings.`already-exists` = "already-exists".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`already-exists`]
    
    @scala.inline
    def cancelled: typingsSlinky.firebase.firebaseStrings.cancelled = "cancelled".asInstanceOf[typingsSlinky.firebase.firebaseStrings.cancelled]
    
    @scala.inline
    def `data-loss`: typingsSlinky.firebase.firebaseStrings.`data-loss` = "data-loss".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`data-loss`]
    
    @scala.inline
    def `deadline-exceeded`: typingsSlinky.firebase.firebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`deadline-exceeded`]
    
    @scala.inline
    def `failed-precondition`: typingsSlinky.firebase.firebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`failed-precondition`]
    
    @scala.inline
    def internal: typingsSlinky.firebase.firebaseStrings.internal = "internal".asInstanceOf[typingsSlinky.firebase.firebaseStrings.internal]
    
    @scala.inline
    def `invalid-argument`: typingsSlinky.firebase.firebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`invalid-argument`]
    
    @scala.inline
    def `not-found`: typingsSlinky.firebase.firebaseStrings.`not-found` = "not-found".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`not-found`]
    
    @scala.inline
    def ok: typingsSlinky.firebase.firebaseStrings.ok = "ok".asInstanceOf[typingsSlinky.firebase.firebaseStrings.ok]
    
    @scala.inline
    def `out-of-range`: typingsSlinky.firebase.firebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`out-of-range`]
    
    @scala.inline
    def `permission-denied`: typingsSlinky.firebase.firebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`permission-denied`]
    
    @scala.inline
    def `resource-exhausted`: typingsSlinky.firebase.firebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsSlinky.firebase.firebaseStrings.`resource-exhausted`]
    
    @scala.inline
    def unauthenticated: typingsSlinky.firebase.firebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsSlinky.firebase.firebaseStrings.unauthenticated]
    
    @scala.inline
    def unavailable: typingsSlinky.firebase.firebaseStrings.unavailable = "unavailable".asInstanceOf[typingsSlinky.firebase.firebaseStrings.unavailable]
    
    @scala.inline
    def unimplemented: typingsSlinky.firebase.firebaseStrings.unimplemented = "unimplemented".asInstanceOf[typingsSlinky.firebase.firebaseStrings.unimplemented]
    
    @scala.inline
    def unknown: typingsSlinky.firebase.firebaseStrings.unknown = "unknown".asInstanceOf[typingsSlinky.firebase.firebaseStrings.unknown]
  }
  
  type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Any], js.Promise[HttpsCallableResult]]
  
  @js.native
  trait HttpsCallableOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object HttpsCallableOptions {
    
    @scala.inline
    def apply(): HttpsCallableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HttpsCallableOptions]
    }
    
    @scala.inline
    implicit class HttpsCallableOptionsMutableBuilder[Self <: HttpsCallableOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait HttpsCallableResult extends StObject {
    
    val data: js.Any = js.native
  }
  object HttpsCallableResult {
    
    @scala.inline
    def apply(data: js.Any): HttpsCallableResult = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult]
    }
    
    @scala.inline
    implicit class HttpsCallableResultMutableBuilder[Self <: HttpsCallableResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HttpsError extends Error {
    
    /**
      * A standard error code that will be returned to the client. This also
      * determines the HTTP status code of the response, as defined in code.proto.
      */
    val code: FunctionsErrorCode = js.native
    
    /**
      * Extra data to be converted to JSON and included in the error response.
      */
    val details: js.UndefOr[js.Any] = js.native
  }
  object HttpsError {
    
    @scala.inline
    def apply(code: FunctionsErrorCode, message: String, name: String): HttpsError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsError]
    }
    
    @scala.inline
    implicit class HttpsErrorMutableBuilder[Self <: HttpsError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: FunctionsErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetails(value: js.Any): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    }
  }
}
