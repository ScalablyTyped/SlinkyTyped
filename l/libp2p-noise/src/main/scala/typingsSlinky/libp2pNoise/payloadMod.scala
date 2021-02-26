package typingsSlinky.libp2pNoise

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.protobufjs.mod.IConversionOptions
import typingsSlinky.protobufjs.mod.Reader
import typingsSlinky.protobufjs.mod.Writer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object payloadMod {
  
  object pb {
    
    /** Represents a NoiseHandshakePayload. */
    @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload")
    @js.native
    /**
      * Constructs a new NoiseHandshakePayload.
      * @param [properties] Properties to set
      */
    class NoiseHandshakePayload () extends INoiseHandshakePayload {
      def this(properties: INoiseHandshakePayload) = this()
      
      /** NoiseHandshakePayload data. */
      @JSName("data")
      var data_NoiseHandshakePayload: js.typedarray.Uint8Array = js.native
      
      /** NoiseHandshakePayload identityKey. */
      @JSName("identityKey")
      var identityKey_NoiseHandshakePayload: js.typedarray.Uint8Array = js.native
      
      /** NoiseHandshakePayload identitySig. */
      @JSName("identitySig")
      var identitySig_NoiseHandshakePayload: js.typedarray.Uint8Array = js.native
      
      /**
        * Converts this NoiseHandshakePayload to JSON.
        * @returns JSON object
        */
      def toJSON(): StringDictionary[js.Any] = js.native
    }
    object NoiseHandshakePayload {
      
      /**
        * Creates a new NoiseHandshakePayload instance using the specified properties.
        * @param [properties] Properties to set
        * @returns NoiseHandshakePayload instance
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.create")
      @js.native
      def create(): NoiseHandshakePayload = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.create")
      @js.native
      def create(properties: INoiseHandshakePayload): NoiseHandshakePayload = js.native
      
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decode")
      @js.native
      def decode(reader: js.typedarray.Uint8Array): NoiseHandshakePayload = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decode")
      @js.native
      def decode(reader: js.typedarray.Uint8Array, length: Double): NoiseHandshakePayload = js.native
      /**
        * Decodes a NoiseHandshakePayload message from the specified reader or buffer.
        * @param reader Reader or buffer to decode from
        * @param [length] Message length if known beforehand
        * @returns NoiseHandshakePayload
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decode")
      @js.native
      def decode(reader: Reader): NoiseHandshakePayload = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decode")
      @js.native
      def decode(reader: Reader, length: Double): NoiseHandshakePayload = js.native
      
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decodeDelimited")
      @js.native
      def decodeDelimited(reader: js.typedarray.Uint8Array): NoiseHandshakePayload = js.native
      /**
        * Decodes a NoiseHandshakePayload message from the specified reader or buffer, length delimited.
        * @param reader Reader or buffer to decode from
        * @returns NoiseHandshakePayload
        * @throws {Error} If the payload is not a reader or valid buffer
        * @throws {$protobuf.util.ProtocolError} If required fields are missing
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.decodeDelimited")
      @js.native
      def decodeDelimited(reader: Reader): NoiseHandshakePayload = js.native
      
      /**
        * Encodes the specified NoiseHandshakePayload message. Does not implicitly {@link pb.NoiseHandshakePayload.verify|verify} messages.
        * @param message NoiseHandshakePayload message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.encode")
      @js.native
      def encode(message: INoiseHandshakePayload): Writer = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.encode")
      @js.native
      def encode(message: INoiseHandshakePayload, writer: Writer): Writer = js.native
      
      /**
        * Encodes the specified NoiseHandshakePayload message, length delimited. Does not implicitly {@link pb.NoiseHandshakePayload.verify|verify} messages.
        * @param message NoiseHandshakePayload message or plain object to encode
        * @param [writer] Writer to encode to
        * @returns Writer
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.encodeDelimited")
      @js.native
      def encodeDelimited(message: INoiseHandshakePayload): Writer = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.encodeDelimited")
      @js.native
      def encodeDelimited(message: INoiseHandshakePayload, writer: Writer): Writer = js.native
      
      /**
        * Creates a NoiseHandshakePayload message from a plain object. Also converts values to their respective internal types.
        * @param object Plain object
        * @returns NoiseHandshakePayload
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.fromObject")
      @js.native
      def fromObject(`object`: StringDictionary[js.Any]): NoiseHandshakePayload = js.native
      
      /**
        * Creates a plain object from a NoiseHandshakePayload message. Also converts values to other types if specified.
        * @param message NoiseHandshakePayload
        * @param [options] Conversion options
        * @returns Plain object
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.toObject")
      @js.native
      def toObject(message: NoiseHandshakePayload): StringDictionary[js.Any] = js.native
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.toObject")
      @js.native
      def toObject(message: NoiseHandshakePayload, options: IConversionOptions): StringDictionary[js.Any] = js.native
      
      /**
        * Verifies a NoiseHandshakePayload message.
        * @param message Plain object to verify
        * @returns `null` if valid, otherwise the reason why it is not
        */
      /* static member */
      @JSImport("libp2p-noise/dist/src/proto/payload", "pb.NoiseHandshakePayload.verify")
      @js.native
      def verify(message: StringDictionary[js.Any]): String | Null = js.native
    }
    
    /** Properties of a NoiseHandshakePayload. */
    @js.native
    trait INoiseHandshakePayload extends StObject {
      
      /** NoiseHandshakePayload data */
      var data: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
      
      /** NoiseHandshakePayload identityKey */
      var identityKey: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
      
      /** NoiseHandshakePayload identitySig */
      var identitySig: js.UndefOr[js.typedarray.Uint8Array | Null] = js.native
    }
    object INoiseHandshakePayload {
      
      @scala.inline
      def apply(): INoiseHandshakePayload = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[INoiseHandshakePayload]
      }
      
      @scala.inline
      implicit class INoiseHandshakePayloadMutableBuilder[Self <: INoiseHandshakePayload] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDataNull: Self = StObject.set(x, "data", null)
        
        @scala.inline
        def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
        
        @scala.inline
        def setIdentityKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identityKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentityKeyNull: Self = StObject.set(x, "identityKey", null)
        
        @scala.inline
        def setIdentityKeyUndefined: Self = StObject.set(x, "identityKey", js.undefined)
        
        @scala.inline
        def setIdentitySig(value: js.typedarray.Uint8Array): Self = StObject.set(x, "identitySig", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIdentitySigNull: Self = StObject.set(x, "identitySig", null)
        
        @scala.inline
        def setIdentitySigUndefined: Self = StObject.set(x, "identitySig", js.undefined)
      }
    }
  }
}
