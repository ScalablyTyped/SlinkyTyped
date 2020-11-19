package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.IEntry
import typingsSlinky.sawtoothSdk.protobufMod.IClientStateListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.ClientStateListResponse")
@js.native
/**
  * Constructs a new ClientStateListResponse.
  * @param [properties] Properties to set
  */
class ClientStateListResponse ()
  extends typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse {
  def this(properties: IClientStateListResponse) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.ClientStateListResponse")
@js.native
object ClientStateListResponse extends js.Object {
  
  /**
    * Creates a new ClientStateListResponse instance using the specified properties.
    * @param [properties] Properties to set
    * @returns ClientStateListResponse instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def create(properties: IClientStateListResponse): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  
  /**
    * Decodes a ClientStateListResponse message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns ClientStateListResponse
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  
  /**
    * Encodes the specified ClientStateListResponse message. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IClientStateListResponse): Writer = js.native
  def encode(message: IClientStateListResponse, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified ClientStateListResponse message, length delimited. Does not implicitly {@link ClientStateListResponse.verify|verify} messages.
    * @param message ClientStateListResponse message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IClientStateListResponse): Writer = js.native
  def encodeDelimited(message: IClientStateListResponse, writer: Writer): Writer = js.native
  
  /**
    * Creates a ClientStateListResponse message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns ClientStateListResponse
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse = js.native
  
  /**
    * Creates a plain object from a ClientStateListResponse message. Also converts values to other types if specified.
    * @param message ClientStateListResponse
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a ClientStateListResponse message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** Represents an Entry. */
  @js.native
  /**
    * Constructs a new Entry.
    * @param [properties] Properties to set
    */
  class Entry ()
    extends typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry {
    def this(properties: IEntry) = this()
  }
  /* static members */
  @js.native
  object Entry extends js.Object {
    
    /**
      * Creates a new Entry instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Entry instance
      */
    def create(): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    def create(properties: IEntry): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IEntry): Writer = js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link ClientStateListResponse.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IEntry): Writer = js.native
    def encodeDelimited(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Creates an Entry message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Entry
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry = js.native
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Entry,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Status enum. */
  @js.native
  object Status extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status with Double] = js.native
    
    /* 2 */ val INTERNAL_ERROR: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INTERNAL_ERROR with Double = js.native
    
    /* 8 */ val INVALID_ADDRESS: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ADDRESS with Double = js.native
    
    /* 6 */ val INVALID_PAGING: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_PAGING with Double = js.native
    
    /* 9 */ val INVALID_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_ROOT with Double = js.native
    
    /* 7 */ val INVALID_SORT: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.INVALID_SORT with Double = js.native
    
    /* 3 */ val NOT_READY: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NOT_READY with Double = js.native
    
    /* 5 */ val NO_RESOURCE: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_RESOURCE with Double = js.native
    
    /* 4 */ val NO_ROOT: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.NO_ROOT with Double = js.native
    
    /* 1 */ val OK: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.OK with Double = js.native
    
    /* 0 */ val STATUS_UNSET: typingsSlinky.sawtoothSdk.protobufMod.ClientStateListResponse.Status.STATUS_UNSET with Double = js.native
  }
}
