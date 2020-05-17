package typingsSlinky.googleGax

import typingsSlinky.googleGax.descriptorMod.Descriptor
import typingsSlinky.googleGax.operationsClientMod.OperationsClient
import typingsSlinky.protobufjs.mod.Message
import typingsSlinky.protobufjs.mod.Reader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-gax/build/src/longRunningCalls/longRunningDescriptor", JSImport.Namespace)
@js.native
object longRunningDescriptorMod extends js.Object {
  @js.native
  class LongRunningDescriptor protected () extends Descriptor {
    def this(operationsClient: OperationsClient, responseDecoder: AnyDecoder, metadataDecoder: AnyDecoder) = this()
    @JSName("metadataDecoder")
    var metadataDecoder_Original: AnyDecoder = js.native
    var operationsClient: OperationsClient = js.native
    @JSName("responseDecoder")
    var responseDecoder_Original: AnyDecoder = js.native
    def metadataDecoder(reader: Reader): Message[js.Object] = js.native
    def metadataDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    def metadataDecoder(reader: js.typedarray.Uint8Array): Message[js.Object] = js.native
    def metadataDecoder(reader: js.typedarray.Uint8Array, length: Double): Message[js.Object] = js.native
    def responseDecoder(reader: Reader): Message[js.Object] = js.native
    def responseDecoder(reader: Reader, length: Double): Message[js.Object] = js.native
    def responseDecoder(reader: js.typedarray.Uint8Array): Message[js.Object] = js.native
    def responseDecoder(reader: js.typedarray.Uint8Array, length: Double): Message[js.Object] = js.native
  }
  
  type AnyDecoder = js.Function2[
    /* reader */ Reader | js.typedarray.Uint8Array, 
    /* length */ js.UndefOr[Double], 
    Message[js.Object]
  ]
}

