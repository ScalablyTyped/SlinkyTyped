package typingsSlinky.googleGax

import typingsSlinky.googleGax.apitypesMod.APICallback
import typingsSlinky.googleGax.apitypesMod.CancellableStream
import typingsSlinky.googleGax.apitypesMod.GRPCCall
import typingsSlinky.googleGax.apitypesMod.ResultTuple
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.callMod.CancellablePromise
import typingsSlinky.googleGax.callMod.OngoingCall
import typingsSlinky.googleGax.callMod.OngoingCallPromise
import typingsSlinky.googleGax.descriptorMod.Descriptor
import typingsSlinky.googleGax.gaxMod.CallSettings
import typingsSlinky.googleGax.googleErrorMod.GoogleError
import typingsSlinky.googleGax.streamingMod.StreamProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiCallerMod {
  
  @JSImport("google-gax/build/src/apiCaller", "createAPICaller")
  @js.native
  def createAPICaller(settings: CallSettings): APICaller = js.native
  @JSImport("google-gax/build/src/apiCaller", "createAPICaller")
  @js.native
  def createAPICaller(settings: CallSettings, descriptor: Descriptor): APICaller = js.native
  
  @js.native
  trait APICaller extends StObject {
    
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
    
    def init(): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    def init(callback: APICallback): OngoingCallPromise | OngoingCall | StreamProxy = js.native
    
    def result(canceller: CancellableStream): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCall): CancellablePromise[ResultTuple] | CancellableStream = js.native
    def result(canceller: OngoingCallPromise): CancellablePromise[ResultTuple] | CancellableStream = js.native
    
    def wrap(func: GRPCCall): GRPCCall = js.native
  }
}
