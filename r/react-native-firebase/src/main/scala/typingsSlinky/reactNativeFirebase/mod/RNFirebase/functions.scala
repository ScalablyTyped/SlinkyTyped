package typingsSlinky.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.reactNativeFirebase.mod.App
import typingsSlinky.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Source: https://github.com/firebase/firebase-js-sdk/blob/master/packages/functions-types/index.d.ts
object functions {
  
  /**
    * `FirebaseFunctions` represents a Functions app, and is the entry point for
    * all Functions operations.
    */
  @js.native
  trait Functions
    extends /* key */ StringDictionary[js.Any] {
    
    /**
      * Gets an `HttpsCallable` instance that refers to the function with the given
      * name.
      *
      * @param name The name of the https callable function.
      * @return The `HttpsCallable` instance.
      */
    def httpsCallable[Params, Result](name: String): HttpsCallable[Params, Result] = js.native
    
    /**
      * Changes this instance to point to a Cloud Functions emulator running
      * locally.
      *
      * See https://firebase.google.com/docs/functions/local-emulator
      *
      * @param origin the origin string of the local emulator started via firebase tools
      * "http://10.0.0.8:1337".
      */
    def useFunctionsEmulator(origin: String): js.Promise[Null] = js.native
  }
  object Functions {
    
    @scala.inline
    def apply(
      httpsCallable: String => HttpsCallable[js.Any, js.Any],
      useFunctionsEmulator: String => js.Promise[Null]
    ): Functions = {
      val __obj = js.Dynamic.literal(httpsCallable = js.Any.fromFunction1(httpsCallable), useFunctionsEmulator = js.Any.fromFunction1(useFunctionsEmulator))
      __obj.asInstanceOf[Functions]
    }
    
    @scala.inline
    implicit class FunctionsMutableBuilder[Self <: Functions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHttpsCallable(value: String => HttpsCallable[js.Any, js.Any]): Self = StObject.set(x, "httpsCallable", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUseFunctionsEmulator(value: String => js.Promise[Null]): Self = StObject.set(x, "useFunctionsEmulator", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * The set of Firebase Functions status codes. The codes are the same at the
    * ones exposed by gRPC here:
    * https://github.com/grpc/grpc/blob/master/doc/statuscodes.md
    *
    * Possible values:
    * - 'cancelled': The operation was cancelled (typically by the caller).
    * - 'unknown': Unknown error or an error from a different error domain.
    * - 'invalid-argument': Client specified an invalid argument. Note that this
    *   differs from 'failed-precondition'. 'invalid-argument' indicates
    *   arguments that are problematic regardless of the state of the system
    *   (e.g. an invalid field name).
    * - 'deadline-exceeded': Deadline expired before operation could complete.
    *   For operations that change the state of the system, this error may be
    *   returned even if the operation has completed successfully. For example,
    *   a successful response from a server could have been delayed long enough
    *   for the deadline to expire.
    * - 'not-found': Some requested document was not found.
    * - 'already-exists': Some document that we attempted to create already
    *   exists.
    * - 'permission-denied': The caller does not have permission to execute the
    *   specified operation.
    * - 'resource-exhausted': Some resource has been exhausted, perhaps a
    *   per-user quota, or perhaps the entire file system is out of space.
    * - 'failed-precondition': Operation was rejected because the system is not
    *   in a state required for the operation's execution.
    * - 'aborted': The operation was aborted, typically due to a concurrency
    *   issue like transaction aborts, etc.
    * - 'out-of-range': Operation was attempted past the valid range.
    * - 'unimplemented': Operation is not implemented or not supported/enabled.
    * - 'internal': Internal errors. Means some invariants expected by
    *   underlying system has been broken. If you see one of these errors,
    *   something is very broken.
    * - 'unavailable': The service is currently unavailable. This is most likely
    *   a transient condition and may be corrected by retrying with a backoff.
    * - 'data-loss': Unrecoverable data loss or corruption.
    * - 'unauthenticated': The request does not have valid authentication
    *   credentials for the operation.
    */
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`
    - typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated
  */
  trait FunctionsErrorCode extends StObject
  object FunctionsErrorCode {
    
    @scala.inline
    def aborted: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted = "aborted".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.aborted]
    
    @scala.inline
    def `already-exists`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists` = "already-exists".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`already-exists`]
    
    @scala.inline
    def cancelled: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled = "cancelled".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.cancelled]
    
    @scala.inline
    def `data-loss`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss` = "data-loss".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`data-loss`]
    
    @scala.inline
    def `deadline-exceeded`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded` = "deadline-exceeded".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`deadline-exceeded`]
    
    @scala.inline
    def `failed-precondition`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition` = "failed-precondition".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`failed-precondition`]
    
    @scala.inline
    def internal: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal = "internal".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.internal]
    
    @scala.inline
    def `invalid-argument`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument` = "invalid-argument".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`invalid-argument`]
    
    @scala.inline
    def `not-found`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found` = "not-found".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`not-found`]
    
    @scala.inline
    def ok: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok = "ok".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.ok]
    
    @scala.inline
    def `out-of-range`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range` = "out-of-range".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`out-of-range`]
    
    @scala.inline
    def `permission-denied`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied` = "permission-denied".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`permission-denied`]
    
    @scala.inline
    def `resource-exhausted`: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted` = "resource-exhausted".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.`resource-exhausted`]
    
    @scala.inline
    def unauthenticated: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated = "unauthenticated".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unauthenticated]
    
    @scala.inline
    def unavailable: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable = "unavailable".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unavailable]
    
    @scala.inline
    def unimplemented: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented = "unimplemented".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unimplemented]
    
    @scala.inline
    def unknown: typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown = "unknown".asInstanceOf[typingsSlinky.reactNativeFirebase.reactNativeFirebaseStrings.unknown]
  }
  
  /**
    * firebase.functions.X
    */
  @js.native
  trait FunctionsStatics extends StObject {
    
    /**
      * constructor overload:
      * See https://github.com/invertase/react-native-firebase-docs/blob/master/docs/functions/reference/functions.md
      */
    def apply(): Functions = js.native
    def apply(appOrRegion: js.UndefOr[scala.Nothing], region: String): Functions = js.native
    def apply(appOrRegion: String): Functions = js.native
    def apply(appOrRegion: String, region: String): Functions = js.native
    def apply(appOrRegion: App): Functions = js.native
    def apply(appOrRegion: App, region: String): Functions = js.native
    
    /**
      * Uppercased + underscored variables of @FunctionsErrorCode
      */
    var HttpsErrorCode: typingsSlinky.reactNativeFirebase.mod.RNFirebase.functions.HttpsErrorCode = js.native
  }
  
  /**
    * An HttpsCallable is a reference to a "callable" http trigger in
    * Google Cloud Functions.
    */
  type HttpsCallable[Params, Result] = (js.Function1[/* data */ Params, js.Promise[HttpsCallableResult[Result]]]) | js.Function0[js.Promise[HttpsCallableResult[Result]]]
  
  /**
    * An HttpsCallableResult wraps a single result from a function call.
    */
  @js.native
  trait HttpsCallableResult[R] extends StObject {
    
    val data: R = js.native
  }
  object HttpsCallableResult {
    
    @scala.inline
    def apply[R](data: R): HttpsCallableResult[R] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsCallableResult[R]]
    }
    
    @scala.inline
    implicit class HttpsCallableResultMutableBuilder[Self <: HttpsCallableResult[_], R] (val x: Self with HttpsCallableResult[R]) extends AnyVal {
      
      @scala.inline
      def setData(value: R): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
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
  
  type HttpsErrorCode = StringDictionary[FunctionsErrorCode]
}
