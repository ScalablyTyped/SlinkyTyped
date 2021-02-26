package typingsSlinky.multibase

import typingsSlinky.multibase.baseMod.^
import typingsSlinky.multibase.multibaseBooleans.`false`
import typingsSlinky.multibase.multibaseStrings.b_
import typingsSlinky.multibase.multibaseStrings.c_
import typingsSlinky.multibase.multibaseStrings.f_
import typingsSlinky.multibase.multibaseStrings.k_
import typingsSlinky.multibase.multibaseStrings.m_
import typingsSlinky.multibase.multibaseStrings.t_
import typingsSlinky.multibase.multibaseStrings.u_
import typingsSlinky.multibase.multibaseStrings.v_
import typingsSlinky.multibase.multibaseStrings.z_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import('./base')} Base */
  /** @typedef {import("./types").BaseNameOrCode} BaseNameOrCode */
  /** @typedef {import("./types").BaseCode} BaseCode */
  /**
    * Create a new Uint8Array with the multibase varint+code.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be prefixed with multibase.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    */
  @JSImport("multibase", JSImport.Namespace)
  @js.native
  def apply(nameOrCode: BaseNameOrCode, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseCode, multibase.multibase/dist/src/base.^>> */
  object codes {
    
    @JSImport("multibase", "codes.B")
    @js.native
    val B_ : ^ = js.native
    
    @JSImport("multibase", "codes.C")
    @js.native
    val C_ : ^ = js.native
    
    @JSImport("multibase", "codes.F")
    @js.native
    val F_ : ^ = js.native
    
    @JSImport("multibase", "codes.K")
    @js.native
    val K_ : ^ = js.native
    
    @JSImport("multibase", "codes.M")
    @js.native
    val M_ : ^ = js.native
    
    @JSImport("multibase", "codes.T")
    @js.native
    val T_ : ^ = js.native
    
    @JSImport("multibase", "codes.U")
    @js.native
    val U_ : ^ = js.native
    
    @JSImport("multibase", "codes.V")
    @js.native
    val V_ : ^ = js.native
    
    @JSImport("multibase", "codes.Z")
    @js.native
    val Z_ : ^ = js.native
    
    @JSImport("multibase", "codes.\u0000")
    @js.native
    val _empty: ^ = js.native
    
    @JSImport("multibase", "codes.b")
    @js.native
    val b: ^ = js.native
    
    @JSImport("multibase", "codes.c")
    @js.native
    val c: ^ = js.native
    
    @JSImport("multibase", "codes.f")
    @js.native
    val f: ^ = js.native
    
    @JSImport("multibase", "codes.h")
    @js.native
    val h: ^ = js.native
    
    @JSImport("multibase", "codes.k")
    @js.native
    val k: ^ = js.native
    
    @JSImport("multibase", "codes.m")
    @js.native
    val m: ^ = js.native
    
    @JSImport("multibase", "codes.t")
    @js.native
    val t: ^ = js.native
    
    @JSImport("multibase", "codes.u")
    @js.native
    val u: ^ = js.native
    
    @JSImport("multibase", "codes.v")
    @js.native
    val v: ^ = js.native
    
    @JSImport("multibase", "codes.z")
    @js.native
    val z: ^ = js.native
    
    @JSImport("multibase", "codes.0")
    @js.native
    val `0`: ^ = js.native
    
    @JSImport("multibase", "codes.7")
    @js.native
    val `7`: ^ = js.native
    
    @JSImport("multibase", "codes.9")
    @js.native
    val `9`: ^ = js.native
  }
  
  @JSImport("multibase", "decode")
  @js.native
  def decode(data: String): js.typedarray.Uint8Array = js.native
  /**
    * Takes a Uint8Array or string encoded with multibase header, decodes it and
    * returns the decoded buffer
    *
    * @param {Uint8Array|string} data
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  @JSImport("multibase", "decode")
  @js.native
  def decode(data: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  /**
    * Encode data with the specified base and add the multibase prefix.
    *
    * @param {BaseNameOrCode} nameOrCode - The multibase name or code number.
    * @param {Uint8Array} buf - The data to be encoded.
    * @returns {Uint8Array}
    * @throws {Error} Will throw if the encoding is not supported
    *
    */
  @JSImport("multibase", "encode")
  @js.native
  def encode(nameOrCode: BaseNameOrCode, buf: js.typedarray.Uint8Array): js.typedarray.Uint8Array = js.native
  
  /**
    * Get the encoding by name or code
    *
    * @param {BaseNameOrCode} nameOrCode
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  @JSImport("multibase", "encoding")
  @js.native
  def encoding(nameOrCode: BaseNameOrCode): Base = js.native
  
  /**
    * Get encoding from data
    *
    * @param {string|Uint8Array} data
    * @returns {Base}
    * @throws {Error} Will throw if the encoding is not supported
    */
  @JSImport("multibase", "encodingFromData")
  @js.native
  def encodingFromData(data: String): Base = js.native
  @JSImport("multibase", "encodingFromData")
  @js.native
  def encodingFromData(data: js.typedarray.Uint8Array): Base = js.native
  
  @JSImport("multibase", "isEncoded")
  @js.native
  def isEncoded(data: String): `false` | String = js.native
  /**
    * Is the given data multibase encoded?
    *
    * @param {Uint8Array|string} data
    * @returns {false | string}
    */
  @JSImport("multibase", "isEncoded")
  @js.native
  def isEncoded(data: js.typedarray.Uint8Array): `false` | String = js.native
  
  /* Inlined std.Readonly<std.Record<multibase.multibase/dist/src/types.BaseName, multibase.multibase/dist/src/base.^>> */
  object names {
    
    @JSImport("multibase", "names.base10")
    @js.native
    val base10: ^ = js.native
    
    @JSImport("multibase", "names.base16")
    @js.native
    val base16: ^ = js.native
    
    @JSImport("multibase", "names.base16upper")
    @js.native
    val base16upper: ^ = js.native
    
    @JSImport("multibase", "names.base2")
    @js.native
    val base2: ^ = js.native
    
    @JSImport("multibase", "names.base32")
    @js.native
    val base32: ^ = js.native
    
    @JSImport("multibase", "names.base32hex")
    @js.native
    val base32hex: ^ = js.native
    
    @JSImport("multibase", "names.base32hexpad")
    @js.native
    val base32hexpad: ^ = js.native
    
    @JSImport("multibase", "names.base32hexpadupper")
    @js.native
    val base32hexpadupper: ^ = js.native
    
    @JSImport("multibase", "names.base32hexupper")
    @js.native
    val base32hexupper: ^ = js.native
    
    @JSImport("multibase", "names.base32pad")
    @js.native
    val base32pad: ^ = js.native
    
    @JSImport("multibase", "names.base32padupper")
    @js.native
    val base32padupper: ^ = js.native
    
    @JSImport("multibase", "names.base32upper")
    @js.native
    val base32upper: ^ = js.native
    
    @JSImport("multibase", "names.base32z")
    @js.native
    val base32z: ^ = js.native
    
    @JSImport("multibase", "names.base36")
    @js.native
    val base36: ^ = js.native
    
    @JSImport("multibase", "names.base36upper")
    @js.native
    val base36upper: ^ = js.native
    
    @JSImport("multibase", "names.base58btc")
    @js.native
    val base58btc: ^ = js.native
    
    @JSImport("multibase", "names.base58flickr")
    @js.native
    val base58flickr: ^ = js.native
    
    @JSImport("multibase", "names.base64")
    @js.native
    val base64: ^ = js.native
    
    @JSImport("multibase", "names.base64pad")
    @js.native
    val base64pad: ^ = js.native
    
    @JSImport("multibase", "names.base64url")
    @js.native
    val base64url: ^ = js.native
    
    @JSImport("multibase", "names.base64urlpad")
    @js.native
    val base64urlpad: ^ = js.native
    
    @JSImport("multibase", "names.base8")
    @js.native
    val base8: ^ = js.native
    
    @JSImport("multibase", "names.identity")
    @js.native
    val identity: ^ = js.native
  }
  
  type Base = ^
  
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
  trait BaseNameOrCode extends StObject
  object BaseNameOrCode {
    
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
    def c: c_ = "c".asInstanceOf[c_]
    
    @scala.inline
    def f: f_ = "f".asInstanceOf[f_]
    
    @scala.inline
    def h: typingsSlinky.multibase.multibaseStrings.h = "h".asInstanceOf[typingsSlinky.multibase.multibaseStrings.h]
    
    @scala.inline
    def identity: typingsSlinky.multibase.multibaseStrings.identity = "identity".asInstanceOf[typingsSlinky.multibase.multibaseStrings.identity]
    
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
}
