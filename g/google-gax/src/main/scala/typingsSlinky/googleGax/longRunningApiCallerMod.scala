package typingsSlinky.googleGax

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.callMod.OngoingCallPromise
import typingsSlinky.googleGax.gaxMod.CallOptions
import typingsSlinky.googleGax.longRunningDescriptorMod.LongRunningDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longRunningApiCallerMod {
  
  @JSImport("google-gax/build/src/longRunningCalls/longRunningApiCaller", "LongrunningApiCaller")
  @js.native
  class LongrunningApiCaller protected () extends APICaller {
    /**
      * Creates an API caller that performs polling on a long running operation.
      *
      * @private
      * @constructor
      * @param {LongRunningDescriptor} longrunningDescriptor - Holds the
      * decoders used for unpacking responses and the operationsClient
      * used for polling the operation.
      */
    def this(longrunningDescriptor: LongRunningDescriptor) = this()
    
    var _wrapOperation: js.Any = js.native
    
    def call(
      apiCall: SimpleCallbackFunction,
      argument: js.Object,
      settings: CallOptions,
      canceller: OngoingCallPromise
    ): Unit = js.native
    
    var longrunningDescriptor: LongRunningDescriptor = js.native
  }
}
