package typingsSlinky.googleGax

import typingsSlinky.googleGax.apiCallerMod.APICaller
import typingsSlinky.googleGax.apitypesMod.CancellableStream
import typingsSlinky.googleGax.apitypesMod.SimpleCallbackFunction
import typingsSlinky.googleGax.gaxMod.CallSettings
import typingsSlinky.googleGax.streamDescriptorMod.StreamDescriptor
import typingsSlinky.googleGax.streamingMod.StreamProxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamingApiCallerMod {
  
  @JSImport("google-gax/build/src/streamingCalls/streamingApiCaller", "StreamingApiCaller")
  @js.native
  class StreamingApiCaller protected () extends APICaller {
    /**
      * An API caller for methods of gRPC streaming.
      * @private
      * @constructor
      * @param {StreamDescriptor} descriptor - the descriptor of the method structure.
      */
    def this(descriptor: StreamDescriptor) = this()
    
    def call(apiCall: SimpleCallbackFunction, argument: js.Object, settings: CallSettings, stream: StreamProxy): Unit = js.native
    
    var descriptor: StreamDescriptor = js.native
    
    def fail(stream: CancellableStream, err: js.Error): Unit = js.native
  }
}
