package typingsSlinky.googleGax

import typingsSlinky.googleGax.descriptorMod.Descriptor
import typingsSlinky.googleGax.longRunningApiCallerMod.LongrunningApiCaller
import typingsSlinky.googleGax.operationsClientMod.OperationsClient
import typingsSlinky.protobufjs.mod.Message
import typingsSlinky.protobufjs.mod.Reader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object longRunningDescriptorMod {
  
  @JSImport("google-gax/build/src/longRunningCalls/longRunningDescriptor", "LongRunningDescriptor")
  @js.native
  class LongRunningDescriptor protected () extends Descriptor {
    def this(operationsClient: OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
    
    def getApiCaller(): LongrunningApiCaller = js.native
    
    def metadataDecoder(reader: js.typedarray.Uint8Array): Message[js.Object] = js.native
    def metadataDecoder(reader: js.typedarray.Uint8Array, length: Double): Message[js.Object] = js.native
    def metadataDecoder(reader: Reader): Message[js.Object] = js.native
    def metadataDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    @JSName("metadataDecoder")
    var metadataDecoder_Original: AnyDecoder = js.native
    
    var operationsClient: OperationsClient = js.native
    
    def responseDecoder(reader: js.typedarray.Uint8Array): Message[js.Object] = js.native
    def responseDecoder(reader: js.typedarray.Uint8Array, length: Double): Message[js.Object] = js.native
    def responseDecoder(reader: Reader): Message[js.Object] = js.native
    def responseDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    @JSName("responseDecoder")
    var responseDecoder_Original: AnyDecoder = js.native
  }
  
  type AnyDecoder = js.Function2[
    /* reader */ Reader | js.typedarray.Uint8Array, 
    /* length */ js.UndefOr[Double], 
    Message[js.Object]
  ]
}
