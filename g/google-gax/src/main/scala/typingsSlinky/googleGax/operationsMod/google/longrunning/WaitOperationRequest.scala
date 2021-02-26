package typingsSlinky.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a WaitOperationRequest. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest")
@js.native
/**
  * Constructs a new WaitOperationRequest.
  * @param [properties] Properties to set
  */
class WaitOperationRequest () extends IWaitOperationRequest {
  def this(properties: IWaitOperationRequest) = this()
  
  /** WaitOperationRequest name. */
  @JSName("name")
  var name_WaitOperationRequest: String = js.native
  
  /**
    * Converts this WaitOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object WaitOperationRequest {
  
  /**
    * Creates a new WaitOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns WaitOperationRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.create")
  @js.native
  def create(): WaitOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.create")
  @js.native
  def create(properties: IWaitOperationRequest): WaitOperationRequest = js.native
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): WaitOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decode")
  @js.native
  def decode(reader: Reader): WaitOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): WaitOperationRequest = js.native
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): WaitOperationRequest = js.native
  /**
    * Decodes a WaitOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns WaitOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): WaitOperationRequest = js.native
  
  /**
    * Encodes the specified WaitOperationRequest message. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.encode")
  @js.native
  def encode(message: IWaitOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.encode")
  @js.native
  def encode(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified WaitOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.WaitOperationRequest.verify|verify} messages.
    * @param message WaitOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IWaitOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IWaitOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a WaitOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns WaitOperationRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): WaitOperationRequest = js.native
  
  /**
    * Creates a plain object from a WaitOperationRequest message. Also converts values to other types if specified.
    * @param message WaitOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.toObject")
  @js.native
  def toObject(message: WaitOperationRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.toObject")
  @js.native
  def toObject(message: WaitOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a WaitOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.WaitOperationRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
