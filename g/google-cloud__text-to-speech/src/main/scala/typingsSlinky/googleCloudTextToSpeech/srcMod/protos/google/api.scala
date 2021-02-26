package typingsSlinky.googleCloudTextToSpeech.srcMod.protos.google

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.googleCloudTextToSpeech.mod.google.api.ICustomHttpPattern
import typingsSlinky.googleCloudTextToSpeech.mod.google.api.IHttp
import typingsSlinky.googleCloudTextToSpeech.mod.google.api.IHttpRule
import typingsSlinky.googleGax.mod.protobuf.Reader
import typingsSlinky.googleGax.mod.protobuf.Writer
import typingsSlinky.protobufjs.mod.IConversionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Namespace api. */
object api {
  
  /** Represents a CustomHttpPattern. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern")
  @js.native
  /**
    * Constructs a new CustomHttpPattern.
    * @param [properties] Properties to set
    */
  class CustomHttpPattern ()
    extends typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern {
    def this(properties: ICustomHttpPattern) = this()
  }
  object CustomHttpPattern {
    
    /**
      * Creates a new CustomHttpPattern instance using the specified properties.
      * @param [properties] Properties to set
      * @returns CustomHttpPattern instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.create")
    @js.native
    def create(): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.create")
    @js.native
    def create(properties: ICustomHttpPattern): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decode")
    @js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    /**
      * Decodes a CustomHttpPattern message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns CustomHttpPattern
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.encode")
    @js.native
    def encode(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified CustomHttpPattern message, length delimited. Does not implicitly {@link google.api.CustomHttpPattern.verify|verify} messages.
      * @param message CustomHttpPattern message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.encodeDelimited")
    @js.native
    def encodeDelimited(message: ICustomHttpPattern, writer: Writer): Writer = js.native
    
    /**
      * Creates a CustomHttpPattern message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns CustomHttpPattern
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern = js.native
    
    /**
      * Creates a plain object from a CustomHttpPattern message. Also converts values to other types if specified.
      * @param message CustomHttpPattern
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.toObject")
    @js.native
    def toObject(
      message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.CustomHttpPattern,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a CustomHttpPattern message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.CustomHttpPattern.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** FieldBehavior enum. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.FieldBehavior")
  @js.native
  object FieldBehavior extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior with Double] = js.native
    
    /* 0 */ val FIELD_BEHAVIOR_UNSPECIFIED: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.FIELD_BEHAVIOR_UNSPECIFIED with Double = js.native
    
    /* 5 */ val IMMUTABLE: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.IMMUTABLE with Double = js.native
    
    /* 4 */ val INPUT_ONLY: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.INPUT_ONLY with Double = js.native
    
    /* 1 */ val OPTIONAL: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.OPTIONAL with Double = js.native
    
    /* 3 */ val OUTPUT_ONLY: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.OUTPUT_ONLY with Double = js.native
    
    /* 2 */ val REQUIRED: typingsSlinky.googleCloudTextToSpeech.mod.google.api.FieldBehavior.REQUIRED with Double = js.native
  }
  
  /** Represents a Http. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http")
  @js.native
  /**
    * Constructs a new Http.
    * @param [properties] Properties to set
    */
  class Http ()
    extends typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http {
    def this(properties: IHttp) = this()
  }
  object Http {
    
    /**
      * Creates a new Http instance using the specified properties.
      * @param [properties] Properties to set
      * @returns Http instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.create")
    @js.native
    def create(): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.create")
    @js.native
    def create(properties: IHttp): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    /**
      * Decodes a Http message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decode")
    @js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    /**
      * Decodes a Http message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns Http
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    
    /**
      * Encodes the specified Http message. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.encode")
    @js.native
    def encode(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified Http message, length delimited. Does not implicitly {@link google.api.Http.verify|verify} messages.
      * @param message Http message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttp, writer: Writer): Writer = js.native
    
    /**
      * Creates a Http message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns Http
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http = js.native
    
    /**
      * Creates a plain object from a Http message. Also converts values to other types if specified.
      * @param message Http
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.toObject")
    @js.native
    def toObject(message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.toObject")
    @js.native
    def toObject(message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.Http, options: IConversionOptions): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a Http message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.Http.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
  
  /** Represents a HttpRule. */
  @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule")
  @js.native
  /**
    * Constructs a new HttpRule.
    * @param [properties] Properties to set
    */
  class HttpRule ()
    extends typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule {
    def this(properties: IHttpRule) = this()
  }
  object HttpRule {
    
    /**
      * Creates a new HttpRule instance using the specified properties.
      * @param [properties] Properties to set
      * @returns HttpRule instance
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.create")
    @js.native
    def create(): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.create")
    @js.native
    def create(properties: IHttpRule): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: js.typedarray.Uint8Array, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    /**
      * Decodes a HttpRule message from the specified reader or buffer.
      * @param reader Reader or buffer to decode from
      * @param [length] Message length if known beforehand
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decode")
    @js.native
    def decode(reader: Reader, length: Double): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: js.typedarray.Uint8Array): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    /**
      * Decodes a HttpRule message from the specified reader or buffer, length delimited.
      * @param reader Reader or buffer to decode from
      * @returns HttpRule
      * @throws {Error} If the payload is not a reader or valid buffer
      * @throws {$protobuf.util.ProtocolError} If required fields are missing
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.decodeDelimited")
    @js.native
    def decodeDelimited(reader: Reader): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    
    /**
      * Encodes the specified HttpRule message. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.encode")
    @js.native
    def encode(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Encodes the specified HttpRule message, length delimited. Does not implicitly {@link google.api.HttpRule.verify|verify} messages.
      * @param message HttpRule message or plain object to encode
      * @param [writer] Writer to encode to
      * @returns Writer
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule): Writer = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.encodeDelimited")
    @js.native
    def encodeDelimited(message: IHttpRule, writer: Writer): Writer = js.native
    
    /**
      * Creates a HttpRule message from a plain object. Also converts values to their respective internal types.
      * @param object Plain object
      * @returns HttpRule
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.fromObject")
    @js.native
    def fromObject(`object`: StringDictionary[js.Any]): typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule = js.native
    
    /**
      * Creates a plain object from a HttpRule message. Also converts values to other types if specified.
      * @param message HttpRule
      * @param [options] Conversion options
      * @returns Plain object
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.toObject")
    @js.native
    def toObject(message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule): StringDictionary[js.Any] = js.native
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.toObject")
    @js.native
    def toObject(
      message: typingsSlinky.googleCloudTextToSpeech.mod.google.api.HttpRule,
      options: IConversionOptions
    ): StringDictionary[js.Any] = js.native
    
    /**
      * Verifies a HttpRule message.
      * @param message Plain object to verify
      * @returns `null` if valid, otherwise the reason why it is not
      */
    /* static member */
    @JSImport("@google-cloud/text-to-speech/build/src", "protos.google.api.HttpRule.verify")
    @js.native
    def verify(message: StringDictionary[js.Any]): String | Null = js.native
  }
}
