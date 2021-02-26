package typingsSlinky.sawtoothSdk.mod.protobuf

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import typingsSlinky.sawtoothSdk.protobufMod.IStateChange
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sawtooth-sdk", "protobuf.StateChange")
@js.native
/**
  * Constructs a new StateChange.
  * @param [properties] Properties to set
  */
class StateChange ()
  extends typingsSlinky.sawtoothSdk.protobufMod.StateChange {
  def this(properties: IStateChange) = this()
}
/* static members */
object StateChange {
  
  /** Type enum. */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.Type")
  @js.native
  object Type extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.sawtoothSdk.protobufMod.StateChange.Type with Double] = js.native
    
    /* 2 */ val DELETE: typingsSlinky.sawtoothSdk.protobufMod.StateChange.Type.DELETE with Double = js.native
    
    /* 1 */ val SET: typingsSlinky.sawtoothSdk.protobufMod.StateChange.Type.SET with Double = js.native
    
    /* 0 */ val TYPE_UNSET: typingsSlinky.sawtoothSdk.protobufMod.StateChange.Type.TYPE_UNSET with Double = js.native
  }
  
  /**
    * Creates a new StateChange instance using the specified properties.
    * @param [properties] Properties to set
    * @returns StateChange instance
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.create")
  @js.native
  def create(): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.create")
  @js.native
  def create(properties: IStateChange): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decode")
  @js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  /**
    * Decodes a StateChange message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns StateChange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decode")
  @js.native
  def decode(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decode")
  @js.native
  def decode(reader: Reader, length: Double): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decodeDelimited")
  @js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  /**
    * Decodes a StateChange message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns StateChange
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.decodeDelimited")
  @js.native
  def decodeDelimited(reader: Reader): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  
  /**
    * Encodes the specified StateChange message. Does not implicitly {@link StateChange.verify|verify} messages.
    * @param message StateChange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.encode")
  @js.native
  def encode(message: IStateChange): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.encode")
  @js.native
  def encode(message: IStateChange, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified StateChange message, length delimited. Does not implicitly {@link StateChange.verify|verify} messages.
    * @param message StateChange message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChange): Writer = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.encodeDelimited")
  @js.native
  def encodeDelimited(message: IStateChange, writer: Writer): Writer = js.native
  
  /**
    * Creates a StateChange message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns StateChange
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.fromObject")
  @js.native
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.sawtoothSdk.protobufMod.StateChange = js.native
  
  /**
    * Creates a plain object from a StateChange message. Also converts values to other types if specified.
    * @param message StateChange
    * @param [options] Conversion options
    * @returns Plain object
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.StateChange): StringDictionary[js.Any] = js.native
  @JSImport("sawtooth-sdk", "protobuf.StateChange.toObject")
  @js.native
  def toObject(message: typingsSlinky.sawtoothSdk.protobufMod.StateChange, options: IConversionOptions): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a StateChange message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  @JSImport("sawtooth-sdk", "protobuf.StateChange.verify")
  @js.native
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
}
