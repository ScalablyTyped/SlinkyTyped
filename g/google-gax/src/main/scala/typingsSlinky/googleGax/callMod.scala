package typingsSlinky.googleGax

import typingsSlinky.googleGax.apitypesMod.APICallback
import typingsSlinky.googleGax.apitypesMod.GaxCallResult
import typingsSlinky.googleGax.apitypesMod.NextPageRequestType
import typingsSlinky.googleGax.apitypesMod.RawResponseType
import typingsSlinky.googleGax.apitypesMod.RequestType
import typingsSlinky.googleGax.apitypesMod.ResponseType
import typingsSlinky.googleGax.apitypesMod.ResultTuple
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.googleErrorMod.GoogleError
import typingsSlinky.std.Promise
import typingsSlinky.std.PromiseConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/call", JSImport.Namespace)
@js.native
object callMod extends js.Object {
  @js.native
  trait CancellablePromise[T]
    extends Promise[T]
       with GaxCallResult {
    def cancel(): Unit = js.native
  }
  
  @js.native
  class OngoingCall protected () extends js.Object {
    /**
      * OngoingCall manages callback, API calls, and cancellation
      * of the API calls.
      * @param {APICallback=} callback
      *   The callback to be called asynchronously when the API call
      *   finishes.
      * @constructor
      * @property {APICallback} callback
      *   The callback function to be called.
      * @private
      */
    def this(callback: APICallback) = this()
    @JSName("callback")
    var callback_Original: APICallback = js.native
    var cancelFunc: js.UndefOr[js.Function0[Unit]] = js.native
    var completed: Boolean = js.native
    /**
      * Call calls the specified function. Result will be used to fulfill
      * the promise.
      *
      * @param {SimpleCallbackFunction} func
      *   A function for an API call.
      * @param {Object} argument
      *   A request object.
      */
    def call(func: SimpleCallbackFunction, argument: RequestType): Unit = js.native
    def callback(): Unit = js.native
    def callback(err: Null, response: ResponseType): Unit = js.native
    def callback(err: Null, response: ResponseType, next: NextPageRequestType): Unit = js.native
    def callback(err: Null, response: ResponseType, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    def callback(err: GoogleError): Unit = js.native
    def callback(err: GoogleError, response: ResponseType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType, next: NextPageRequestType): Unit = js.native
    def callback(err: GoogleError, response: ResponseType, next: NextPageRequestType, rawResponse: RawResponseType): Unit = js.native
    /**
      * Cancels the ongoing promise.
      */
    def cancel(): Unit = js.native
  }
  
  @js.native
  class OngoingCallPromise protected () extends OngoingCall {
    /**
      * GaxPromise is GRPCCallbackWrapper, but it holds a promise when
      * the API call finishes.
      * @param {Function} PromiseCtor - A constructor for a promise that implements
      * the ES6 specification of promise.
      * @constructor
      * @private
      */
    def this(PromiseCtor: PromiseConstructor) = this()
    var promise: CancellablePromise[ResultTuple] = js.native
  }
  
}

