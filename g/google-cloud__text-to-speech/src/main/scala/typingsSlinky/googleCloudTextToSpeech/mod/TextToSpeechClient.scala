package typingsSlinky.googleCloudTextToSpeech.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextToSpeechClient extends js.Object {
  
  def listVoices(data: ListVoicesRequest): PromiseLike[js.Array[ListVoicesResponse]] = js.native
  def listVoices(data: ListVoicesRequest, callback: APICallback[ListVoicesResponse]): Unit = js.native
  def listVoices(data: ListVoicesRequest, options: CallOptions): PromiseLike[js.Array[ListVoicesResponse]] = js.native
  def listVoices(data: ListVoicesRequest, options: CallOptions, callback: APICallback[ListVoicesResponse]): Unit = js.native
  @JSName("listVoices")
  var listVoices_Original: MethodOverload[ListVoicesRequest, ListVoicesResponse] = js.native
  
  def synthesizeSpeech(data: SynthesizeSpeechRequest): PromiseLike[js.Array[SynthesizeSpeechResponse]] = js.native
  def synthesizeSpeech(data: SynthesizeSpeechRequest, callback: APICallback[SynthesizeSpeechResponse]): Unit = js.native
  def synthesizeSpeech(data: SynthesizeSpeechRequest, options: CallOptions): PromiseLike[js.Array[SynthesizeSpeechResponse]] = js.native
  def synthesizeSpeech(
    data: SynthesizeSpeechRequest,
    options: CallOptions,
    callback: APICallback[SynthesizeSpeechResponse]
  ): Unit = js.native
  @JSName("synthesizeSpeech")
  var synthesizeSpeech_Original: MethodOverload[SynthesizeSpeechRequest, SynthesizeSpeechResponse] = js.native
}
