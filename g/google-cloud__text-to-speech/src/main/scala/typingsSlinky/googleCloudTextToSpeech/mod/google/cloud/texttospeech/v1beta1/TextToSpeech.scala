package typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1

import typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech.ListVoicesCallback
import typingsSlinky.googleCloudTextToSpeech.mod.google.cloud.texttospeech.v1beta1.TextToSpeech.SynthesizeSpeechCallback
import typingsSlinky.googleGax.mod.protobuf.rpc.Service
import typingsSlinky.protobufjs.mod.RPCImpl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a TextToSpeech */
@JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeech")
@js.native
class TextToSpeech protected () extends Service {
  /**
    * Constructs a new TextToSpeech service.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    */
  def this(rpcImpl: RPCImpl) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean) = this()
  def this(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean) = this()
  
  /**
    * Calls ListVoices.
    * @param request ListVoicesRequest message or plain object
    * @returns Promise
    */
  def listVoices(request: IListVoicesRequest): js.Promise[ListVoicesResponse] = js.native
  /**
    * Calls ListVoices.
    * @param request ListVoicesRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and ListVoicesResponse
    */
  def listVoices(request: IListVoicesRequest, callback: ListVoicesCallback): Unit = js.native
  
  /**
    * Calls SynthesizeSpeech.
    * @param request SynthesizeSpeechRequest message or plain object
    * @returns Promise
    */
  def synthesizeSpeech(request: ISynthesizeSpeechRequest): js.Promise[SynthesizeSpeechResponse] = js.native
  /**
    * Calls SynthesizeSpeech.
    * @param request SynthesizeSpeechRequest message or plain object
    * @param callback Node-style callback called with the error, if any, and SynthesizeSpeechResponse
    */
  def synthesizeSpeech(request: ISynthesizeSpeechRequest, callback: SynthesizeSpeechCallback): Unit = js.native
}
object TextToSpeech {
  
  /**
    * Creates new TextToSpeech service using the specified rpc implementation.
    * @param rpcImpl RPC implementation
    * @param [requestDelimited=false] Whether requests are length-delimited
    * @param [responseDelimited=false] Whether responses are length-delimited
    * @returns RPC service. Useful where requests and/or responses are streamed.
    */
  /* static member */
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeech.create")
  @js.native
  def create(rpcImpl: RPCImpl): TextToSpeech = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeech.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: js.UndefOr[scala.Nothing], responseDelimited: Boolean): TextToSpeech = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeech.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean): TextToSpeech = js.native
  @JSImport("@google-cloud/text-to-speech/build/protos/protos", "google.cloud.texttospeech.v1beta1.TextToSpeech.create")
  @js.native
  def create(rpcImpl: RPCImpl, requestDelimited: Boolean, responseDelimited: Boolean): TextToSpeech = js.native
  
  /**
    * Callback as used by {@link google.cloud.texttospeech.v1beta1.TextToSpeech#listVoices}.
    * @param error Error, if any
    * @param [response] ListVoicesResponse
    */
  type ListVoicesCallback = js.Function2[/* error */ js.Error | Null, /* response */ js.UndefOr[ListVoicesResponse], Unit]
  
  /**
    * Callback as used by {@link google.cloud.texttospeech.v1beta1.TextToSpeech#synthesizeSpeech}.
    * @param error Error, if any
    * @param [response] SynthesizeSpeechResponse
    */
  type SynthesizeSpeechCallback = js.Function2[
    /* error */ js.Error | Null, 
    /* response */ js.UndefOr[SynthesizeSpeechResponse], 
    Unit
  ]
}
