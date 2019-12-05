package typingsSlinky.googleDashGax.buildSrcApiCallerMod

import typingsSlinky.googleDashGax.buildSrcApitypesMod.APICallback
import typingsSlinky.googleDashGax.buildSrcApitypesMod.CancellableStream
import typingsSlinky.googleDashGax.buildSrcApitypesMod.GRPCCall
import typingsSlinky.googleDashGax.buildSrcApitypesMod.ResultTuple
import typingsSlinky.googleDashGax.buildSrcApitypesMod.SimpleCallbackFunction
import typingsSlinky.googleDashGax.buildSrcCallMod.CancellablePromise
import typingsSlinky.googleDashGax.buildSrcCallMod.OngoingCall
import typingsSlinky.googleDashGax.buildSrcCallMod.OngoingCallPromise
import typingsSlinky.googleDashGax.buildSrcGoogleErrorMod.GoogleError
import typingsSlinky.googleDashGax.buildSrcStreamingCallsStreamingMod.StreamProxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait APICaller extends js.Object {
  def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: OngoingCall): Unit = js.native
  def call(
    apiCall: SimpleCallbackFunction,
    argument: js.Object,
    settings: js.Object,
    canceller: OngoingCallPromise
  ): Unit = js.native
  def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: js.Object, canceller: StreamProxy): Unit = js.native
  def fail(canceller: CancellableStream, err: GoogleError): Unit = js.native
  def fail(canceller: OngoingCallPromise, err: GoogleError): Unit = js.native
  def fail(canceller: OngoingCall, err: GoogleError): Unit = js.native
  def init(settings: ApiCallerSettings): OngoingCallPromise | OngoingCall | StreamProxy = js.native
  def init(settings: ApiCallerSettings, callback: APICallback): OngoingCallPromise | OngoingCall | StreamProxy = js.native
  def result(canceller: CancellableStream): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def result(canceller: OngoingCall): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def result(canceller: OngoingCallPromise): CancellablePromise[ResultTuple] | CancellableStream = js.native
  def wrap(func: GRPCCall): GRPCCall = js.native
}

