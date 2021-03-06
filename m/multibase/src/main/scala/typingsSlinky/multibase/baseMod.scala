package typingsSlinky.multibase

import typingsSlinky.multibase.multibaseStrings.b_
import typingsSlinky.multibase.multibaseStrings.c_
import typingsSlinky.multibase.multibaseStrings.f_
import typingsSlinky.multibase.multibaseStrings.k_
import typingsSlinky.multibase.multibaseStrings.m_
import typingsSlinky.multibase.multibaseStrings.t_
import typingsSlinky.multibase.multibaseStrings.u_
import typingsSlinky.multibase.multibaseStrings.v_
import typingsSlinky.multibase.multibaseStrings.z_
import typingsSlinky.multibase.typesMod.Codec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  /** @typedef {import('./types').CodecFactory} CodecFactory */
  /** @typedef {import("./types").BaseName} BaseName */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Class to encode/decode in the supported Bases
    *
    */
  @JSImport("multibase/dist/src/base", JSImport.Namespace)
  @js.native
  class ^ protected () extends Base {
    /**
      * @param {BaseName} name
      * @param {BaseCode} code
      * @param {CodecFactory} factory
      * @param {string} alphabet
      */
    def this(name: BaseName, code: BaseCode, factory: CodecFactory, alphabet: String) = this()
  }
  
  /** @typedef {import('./types').CodecFactory} CodecFactory */
  /** @typedef {import("./types").BaseName} BaseName */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Class to encode/decode in the supported Bases
    *
    */
  @js.native
  trait Base extends StObject {
    
    var alphabet: String = js.native
    
    var code: typingsSlinky.multibase.typesMod.BaseCode = js.native
    
    var codeBuf: js.typedarray.Uint8Array = js.native
    
    var codec: Codec = js.native
    
    /**
      * @param {string} string
      * @returns {Uint8Array}
      */
    def decode(string: String): js.typedarray.Uint8Array = js.native
    
    /**
      * @param {Uint8Array} buf
      * @returns {string}
      */
    def encode(buf: js.typedarray.Uint8Array): String = js.native
    
    var name: typingsSlinky.multibase.typesMod.BaseName = js.native
  }
  object Base {
    
    @scala.inline
    def apply(
      alphabet: String,
      code: typingsSlinky.multibase.typesMod.BaseCode,
      codeBuf: js.typedarray.Uint8Array,
      codec: Codec,
      decode: String => js.typedarray.Uint8Array,
      encode: js.typedarray.Uint8Array => String,
      name: typingsSlinky.multibase.typesMod.BaseName
    ): Base = {
      val __obj = js.Dynamic.literal(alphabet = alphabet.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeBuf = codeBuf.asInstanceOf[js.Any], codec = codec.asInstanceOf[js.Any], decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base]
    }
    
    @scala.inline
    implicit class BaseMutableBuilder[Self <: Base] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlphabet(value: String): Self = StObject.set(x, "alphabet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCode(value: typingsSlinky.multibase.typesMod.BaseCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeBuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "codeBuf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodec(value: Codec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecode(value: String => js.typedarray.Uint8Array): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEncode(value: js.typedarray.Uint8Array => String): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: typingsSlinky.multibase.typesMod.BaseName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.multibase.multibaseStrings.Null
    - typingsSlinky.multibase.multibaseStrings.`0`
    - typingsSlinky.multibase.multibaseStrings.`7`
    - typingsSlinky.multibase.multibaseStrings.`9`
    - typingsSlinky.multibase.multibaseStrings.f_
    - typingsSlinky.multibase.multibaseStrings.F
    - typingsSlinky.multibase.multibaseStrings.v_
    - typingsSlinky.multibase.multibaseStrings.V
    - typingsSlinky.multibase.multibaseStrings.t_
    - typingsSlinky.multibase.multibaseStrings.T
    - typingsSlinky.multibase.multibaseStrings.b_
    - typingsSlinky.multibase.multibaseStrings.B
    - typingsSlinky.multibase.multibaseStrings.c_
    - typingsSlinky.multibase.multibaseStrings.C
    - typingsSlinky.multibase.multibaseStrings.h
    - typingsSlinky.multibase.multibaseStrings.k_
    - typingsSlinky.multibase.multibaseStrings.K
    - typingsSlinky.multibase.multibaseStrings.z_
    - typingsSlinky.multibase.multibaseStrings.Z
    - typingsSlinky.multibase.multibaseStrings.m_
    - typingsSlinky.multibase.multibaseStrings.M
    - typingsSlinky.multibase.multibaseStrings.u_
    - typingsSlinky.multibase.multibaseStrings.U
  */
  trait BaseCode extends StObject
  object BaseCode {
    
    @scala.inline
    def `0`: typingsSlinky.multibase.multibaseStrings.`0` = "0".asInstanceOf[typingsSlinky.multibase.multibaseStrings.`0`]
    
    @scala.inline
    def `7`: typingsSlinky.multibase.multibaseStrings.`7` = "7".asInstanceOf[typingsSlinky.multibase.multibaseStrings.`7`]
    
    @scala.inline
    def `9`: typingsSlinky.multibase.multibaseStrings.`9` = "9".asInstanceOf[typingsSlinky.multibase.multibaseStrings.`9`]
    
    @scala.inline
    def B: typingsSlinky.multibase.multibaseStrings.B = "B".asInstanceOf[typingsSlinky.multibase.multibaseStrings.B]
    
    @scala.inline
    def C: typingsSlinky.multibase.multibaseStrings.C = "C".asInstanceOf[typingsSlinky.multibase.multibaseStrings.C]
    
    @scala.inline
    def F: typingsSlinky.multibase.multibaseStrings.F = "F".asInstanceOf[typingsSlinky.multibase.multibaseStrings.F]
    
    @scala.inline
    def K: typingsSlinky.multibase.multibaseStrings.K = "K".asInstanceOf[typingsSlinky.multibase.multibaseStrings.K]
    
    @scala.inline
    def M: typingsSlinky.multibase.multibaseStrings.M = "M".asInstanceOf[typingsSlinky.multibase.multibaseStrings.M]
    
    @scala.inline
    def Null: typingsSlinky.multibase.multibaseStrings.Null = "\u0000".asInstanceOf[typingsSlinky.multibase.multibaseStrings.Null]
    
    @scala.inline
    def T: typingsSlinky.multibase.multibaseStrings.T = "T".asInstanceOf[typingsSlinky.multibase.multibaseStrings.T]
    
    @scala.inline
    def U: typingsSlinky.multibase.multibaseStrings.U = "U".asInstanceOf[typingsSlinky.multibase.multibaseStrings.U]
    
    @scala.inline
    def V: typingsSlinky.multibase.multibaseStrings.V = "V".asInstanceOf[typingsSlinky.multibase.multibaseStrings.V]
    
    @scala.inline
    def Z: typingsSlinky.multibase.multibaseStrings.Z = "Z".asInstanceOf[typingsSlinky.multibase.multibaseStrings.Z]
    
    @scala.inline
    def b: b_ = "b".asInstanceOf[b_]
    
    @scala.inline
    def c: c_ = "c".asInstanceOf[c_]
    
    @scala.inline
    def f: f_ = "f".asInstanceOf[f_]
    
    @scala.inline
    def h: typingsSlinky.multibase.multibaseStrings.h = "h".asInstanceOf[typingsSlinky.multibase.multibaseStrings.h]
    
    @scala.inline
    def k: k_ = "k".asInstanceOf[k_]
    
    @scala.inline
    def m: m_ = "m".asInstanceOf[m_]
    
    @scala.inline
    def t: t_ = "t".asInstanceOf[t_]
    
    @scala.inline
    def u: u_ = "u".asInstanceOf[u_]
    
    @scala.inline
    def v: v_ = "v".asInstanceOf[v_]
    
    @scala.inline
    def z: z_ = "z".asInstanceOf[z_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.multibase.multibaseStrings.identity
    - typingsSlinky.multibase.multibaseStrings.base2
    - typingsSlinky.multibase.multibaseStrings.base8
    - typingsSlinky.multibase.multibaseStrings.base10
    - typingsSlinky.multibase.multibaseStrings.base16
    - typingsSlinky.multibase.multibaseStrings.base16upper
    - typingsSlinky.multibase.multibaseStrings.base32hex
    - typingsSlinky.multibase.multibaseStrings.base32hexupper
    - typingsSlinky.multibase.multibaseStrings.base32hexpad
    - typingsSlinky.multibase.multibaseStrings.base32hexpadupper
    - typingsSlinky.multibase.multibaseStrings.base32
    - typingsSlinky.multibase.multibaseStrings.base32upper
    - typingsSlinky.multibase.multibaseStrings.base32pad
    - typingsSlinky.multibase.multibaseStrings.base32padupper
    - typingsSlinky.multibase.multibaseStrings.base32z
    - typingsSlinky.multibase.multibaseStrings.base36
    - typingsSlinky.multibase.multibaseStrings.base36upper
    - typingsSlinky.multibase.multibaseStrings.base58btc
    - typingsSlinky.multibase.multibaseStrings.base58flickr
    - typingsSlinky.multibase.multibaseStrings.base64
    - typingsSlinky.multibase.multibaseStrings.base64pad
    - typingsSlinky.multibase.multibaseStrings.base64url
    - typingsSlinky.multibase.multibaseStrings.base64urlpad
  */
  trait BaseName extends StObject
  object BaseName {
    
    @scala.inline
    def base10: typingsSlinky.multibase.multibaseStrings.base10 = "base10".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base10]
    
    @scala.inline
    def base16: typingsSlinky.multibase.multibaseStrings.base16 = "base16".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base16]
    
    @scala.inline
    def base16upper: typingsSlinky.multibase.multibaseStrings.base16upper = "base16upper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base16upper]
    
    @scala.inline
    def base2: typingsSlinky.multibase.multibaseStrings.base2 = "base2".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base2]
    
    @scala.inline
    def base32: typingsSlinky.multibase.multibaseStrings.base32 = "base32".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32]
    
    @scala.inline
    def base32hex: typingsSlinky.multibase.multibaseStrings.base32hex = "base32hex".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32hex]
    
    @scala.inline
    def base32hexpad: typingsSlinky.multibase.multibaseStrings.base32hexpad = "base32hexpad".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32hexpad]
    
    @scala.inline
    def base32hexpadupper: typingsSlinky.multibase.multibaseStrings.base32hexpadupper = "base32hexpadupper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32hexpadupper]
    
    @scala.inline
    def base32hexupper: typingsSlinky.multibase.multibaseStrings.base32hexupper = "base32hexupper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32hexupper]
    
    @scala.inline
    def base32pad: typingsSlinky.multibase.multibaseStrings.base32pad = "base32pad".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32pad]
    
    @scala.inline
    def base32padupper: typingsSlinky.multibase.multibaseStrings.base32padupper = "base32padupper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32padupper]
    
    @scala.inline
    def base32upper: typingsSlinky.multibase.multibaseStrings.base32upper = "base32upper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32upper]
    
    @scala.inline
    def base32z: typingsSlinky.multibase.multibaseStrings.base32z = "base32z".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base32z]
    
    @scala.inline
    def base36: typingsSlinky.multibase.multibaseStrings.base36 = "base36".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base36]
    
    @scala.inline
    def base36upper: typingsSlinky.multibase.multibaseStrings.base36upper = "base36upper".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base36upper]
    
    @scala.inline
    def base58btc: typingsSlinky.multibase.multibaseStrings.base58btc = "base58btc".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base58btc]
    
    @scala.inline
    def base58flickr: typingsSlinky.multibase.multibaseStrings.base58flickr = "base58flickr".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base58flickr]
    
    @scala.inline
    def base64: typingsSlinky.multibase.multibaseStrings.base64 = "base64".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base64]
    
    @scala.inline
    def base64pad: typingsSlinky.multibase.multibaseStrings.base64pad = "base64pad".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base64pad]
    
    @scala.inline
    def base64url: typingsSlinky.multibase.multibaseStrings.base64url = "base64url".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base64url]
    
    @scala.inline
    def base64urlpad: typingsSlinky.multibase.multibaseStrings.base64urlpad = "base64urlpad".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base64urlpad]
    
    @scala.inline
    def base8: typingsSlinky.multibase.multibaseStrings.base8 = "base8".asInstanceOf[typingsSlinky.multibase.multibaseStrings.base8]
    
    @scala.inline
    def identity: typingsSlinky.multibase.multibaseStrings.identity = "identity".asInstanceOf[typingsSlinky.multibase.multibaseStrings.identity]
  }
  
  type CodecFactory = js.Function1[/* input */ String, Codec]
}
