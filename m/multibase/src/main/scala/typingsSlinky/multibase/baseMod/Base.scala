package typingsSlinky.multibase.baseMod

import typingsSlinky.multibase.typesMod.Codec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @typedef {import('./types').CodecFactory} CodecFactory */
/** @typedef {import("./types").BaseName} BaseName */
/** @typedef {import("./types").BaseCode} BaseCode */
/**
  * Class to encode/decode in the supported Bases
  *
  */
@js.native
trait Base extends js.Object {
  
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
  implicit class BaseOps[Self <: Base] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlphabet(value: String): Self = this.set("alphabet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: typingsSlinky.multibase.typesMod.BaseCode): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeBuf(value: js.typedarray.Uint8Array): Self = this.set("codeBuf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodec(value: Codec): Self = this.set("codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecode(value: String => js.typedarray.Uint8Array): Self = this.set("decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncode(value: js.typedarray.Uint8Array => String): Self = this.set("encode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: typingsSlinky.multibase.typesMod.BaseName): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
