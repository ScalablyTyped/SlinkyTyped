package typingsSlinky.cucumberMessages.mod.messages

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.IPickle
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleStep
import typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.IPickleTag
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `Pickle` represents a test case Cucumber can *execute*. It is typically derived
  * from another format, such as [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  * In the future a `Pickle` may be derived from other formats such as Markdown or
  * Excel files.
  *
  * By making `Pickle` the main data structure Cucumber uses for execution, the
  * implementation of Cucumber itself becomes simpler, as it doesn't have to deal
  * with the complex structure of a [GherkinDocument](#io.cucumber.messages.GherkinDocument).
  */
@JSImport("cucumber-messages", "messages.Pickle")
@js.native
/**
  * Constructs a new Pickle.
  * @param [properties] Properties to set
  */
class Pickle ()
  extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle {
  def this(properties: IPickle) = this()
}
/* static members */
@JSImport("cucumber-messages", "messages.Pickle")
@js.native
object Pickle extends js.Object {
  
  /**
    * Creates a new Pickle instance using the specified properties.
    * @param [properties] Properties to set
    * @returns Pickle instance
    */
  def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  def create(properties: IPickle): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer.
    * @param reader Reader or buffer to decode from
    * @param [length] Message length if known beforehand
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Decodes a Pickle message from the specified reader or buffer, length delimited.
    * @param reader Reader or buffer to decode from
    * @returns Pickle
    * @throws {Error} If the payload is not a reader or valid buffer
    * @throws {$protobuf.util.ProtocolError} If required fields are missing
    */
  def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Encodes the specified Pickle message. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encode(message: IPickle): Writer = js.native
  def encode(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Encodes the specified Pickle message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.verify|verify} messages.
    * @param message Pickle message or plain object to encode
    * @param [writer] Writer to encode to
    * @returns Writer
    */
  def encodeDelimited(message: IPickle): Writer = js.native
  def encodeDelimited(message: IPickle, writer: Writer): Writer = js.native
  
  /**
    * Creates a Pickle message from a plain object. Also converts values to their respective internal types.
    * @param object Plain object
    * @returns Pickle
    */
  def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle = js.native
  
  /**
    * Creates a plain object from a Pickle message. Also converts values to other types if specified.
    * @param message Pickle
    * @param [options] Conversion options
    * @returns Plain object
    */
  def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle): StringDictionary[js.Any] = js.native
  def toObject(
    message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle,
    options: IConversionOptions
  ): StringDictionary[js.Any] = js.native
  
  /**
    * Verifies a Pickle message.
    * @param message Plain object to verify
    * @returns `null` if valid, otherwise the reason why it is not
    */
  def verify(message: StringDictionary[js.Any]): String | Null = js.native
  
  /** An executable step */
  @js.native
  /**
    * Constructs a new PickleStep.
    * @param [properties] Properties to set
    */
  class PickleStep ()
    extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep {
    def this(properties: IPickleStep) = this()
  }
  /* static members */
  @js.native
  object PickleStep extends js.Object {
    
    /**
      * Creates a new PickleStep instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleStep instance
      */
    def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    def create(properties: IPickleStep): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Decodes a PickleStep message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleStep
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Encodes the specified PickleStep message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IPickleStep): Writer = js.native
    def encode(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleStep message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleStep.verify|verify} messages.
      * @param message PickleStep message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IPickleStep): Writer = js.native
    def encodeDelimited(message: IPickleStep, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleStep message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleStep
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep = js.native
    
    /**
      * Creates a plain object from a PickleStep message. Also converts values to other types if specified.
      * @param message PickleStep
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleStep,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleStep message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** A tag */
  @js.native
  /**
    * Constructs a new PickleTag.
    * @param [properties] Properties to set
    */
  class PickleTag ()
    extends typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag {
    def this(properties: IPickleTag) = this()
  }
  /* static members */
  @js.native
  object PickleTag extends js.Object {
    
    /**
      * Creates a new PickleTag instance using the specified properties.
      * @param [properties] Properties to set
      * @returns PickleTag instance
      */
    def create(): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    def create(properties: IPickleTag): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decode(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    def decode(reader: Reader, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Decodes a PickleTag message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns PickleTag
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    def decodeDelimited(reader: Reader): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Encodes the specified PickleTag message. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encode(message: IPickleTag): Writer = js.native
    def encode(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified PickleTag message, length delimited. Does not implicitly {@link io.cucumber.messages.Pickle.PickleTag.verify|verify} messages.
      * @param message PickleTag message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    def encodeDelimited(message: IPickleTag): Writer = js.native
    def encodeDelimited(message: IPickleTag, writer: Writer): Writer = js.native
    
    /**
      * Creates a PickleTag message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns PickleTag
      */
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag = js.native
    
    /**
      * Creates a plain object from a PickleTag message. Also converts values to other types if specified.
      * @param message PickleTag
      * @param [options] Conversion options
      * @returns Plain object
      */
    def toObject(message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag): StringDictionary[js.Any] = js.native
    def toObject(
      message: typingsSlinky.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.Pickle.PickleTag,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a PickleTag message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
