package typingsSlinky.googleGax.operationsMod.google.longrunning

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a DeleteOperationRequest. */
@JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest")
@js.native
/**
  * Constructs a new DeleteOperationRequest.
  * @param [properties] Properties to set
  */
class DeleteOperationRequest () extends IDeleteOperationRequest {
  def this(properties: IDeleteOperationRequest) = this()
  
  /** DeleteOperationRequest name. */
  @JSName("name")
  var name_DeleteOperationRequest: String = js.native
  
  /**
    * Converts this DeleteOperationRequest to JSON.
    * @returns JSON object
    */
  def toJSON(): StringDictionary[js.Any] = js.native
}
object DeleteOperationRequest {
  
  /**
    * Creates a new DeleteOperationRequest instance using the specified properties.
    * @param [properties] Properties to set
    * @returns DeleteOperationRequest instance
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.create")
  @js.native
  def create(): DeleteOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.create")
  @js.native
  def create(properties: IDeleteOperationRequest): DeleteOperationRequest = js.native
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): DeleteOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decode")
  @js.native
  def decode(reader: Reader): DeleteOperationRequest = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decode")
  @js.native
  def decode(reader: Reader, length: Double): DeleteOperationRequest = js.native
  
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): DeleteOperationRequest = js.native
  /**
    * Decodes a DeleteOperationRequest message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns DeleteOperationRequest
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): DeleteOperationRequest = js.native
  
  /**
    * Encodes the specified DeleteOperationRequest message. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.encode")
  @js.native
  def encode(message: IDeleteOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.encode")
  @js.native
  def encode(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified DeleteOperationRequest message, length delimited. Does not implicitly {@link google.longrunning.DeleteOperationRequest.verify|verify} messages.
    * @param message DeleteOperationRequest message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteOperationRequest): Writer = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.encodeDelimited")
  @js.native
  def encodeDelimited(message: IDeleteOperationRequest, writer: Writer): Writer = js.native
  
  /**
    * Creates a DeleteOperationRequest message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns DeleteOperationRequest
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): DeleteOperationRequest = js.native
  
  /**
    * Creates a plain object from a DeleteOperationRequest message. Also converts values to other types if specified.
    * @param message DeleteOperationRequest
    * @param [options] Conversion options
    * @returns Plain object
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.toObject")
  @js.native
  def toObject(message: DeleteOperationRequest): StringDictionary[js.Any] = js.native
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.toObject")
  @js.native
  def toObject(message: DeleteOperationRequest, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a DeleteOperationRequest message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  /* static member */
  @JSImport("google-gax/build/protos/operations", "google.longrunning.DeleteOperationRequest.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
