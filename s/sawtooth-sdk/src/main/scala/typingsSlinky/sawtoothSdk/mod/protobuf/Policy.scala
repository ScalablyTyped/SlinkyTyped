package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IPolicy
import typingsSlinky.sawtoothSdk.protobufMod.Policy.IEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.Policy")
@js.native
/**
  * Constructs a new Policy.
  * @param [properties] Properties to set
  */
class Policy ()
  extends typingsSlinky.sawtoothSdk.protobufMod.Policy {
  def this(properties: IPolicy) = this()
}
/* static members */
@JSImport("sawtooth-sdk", "protobuf.Policy")
@js.native
object Policy extends js.Object {
  
  /**
    * Creates a new Policy instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Policy instance
    */
  def create(): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def create(properties: IPolicy): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Decodes a Policy message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Policy
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Encodes the specified Policy message. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPolicy): Writer = js.native
  def encode(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Policy message, length delimited. Does not implicitly {@link Policy.verify|verify} messages.
    * @param message Policy message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPolicy): Writer = js.native
  def encodeDelimited(message: IPolicy, writer: Writer): Writer = js.native
  
  /**
    * Creates a Policy message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Policy
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Policy = js.native
  
  /**
    * Creates a plain object from a Policy message. Also converts values to other types if specified.
    * @param message Policy
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy): StringDictionary[js.Any] = js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Policy message.
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
    extends typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry {
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
    def create(): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def create(properties: IEntry): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Decodes an Entry message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Entry
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Encodes the specified Entry message. Does not implicitly {@link Policy.Entry.verify|verify} messages.
      * @param message Entry message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IEntry): Writer = js.native
    def encode(message: IEntry, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Entry message, length delimited. Does not implicitly {@link Policy.Entry.verify|verify} messages.
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
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry = js.native
    
    /**
      * Creates a plain object from an Entry message. Also converts values to other types if specified.
      * @param message Entry
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry): StringDictionary[js.Any] = js.native
    def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.Policy.Entry, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies an Entry message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** EntryType enum. */
  @js.native
  object EntryType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.Policy.EntryType with Double] = js.native
    
    /* 2 */ val DENY_KEY: typingsSlinky.sawtoothSdk.protobufMod.Policy.EntryType.DENY_KEY with Double = js.native
    
    /* 0 */ val ENTRY_TYPE_UNSET: typingsSlinky.sawtoothSdk.protobufMod.Policy.EntryType.ENTRY_TYPE_UNSET with Double = js.native
    
    /* 1 */ val PERMIT_KEY: typingsSlinky.sawtoothSdk.protobufMod.Policy.EntryType.PERMIT_KEY with Double = js.native
  }
}
