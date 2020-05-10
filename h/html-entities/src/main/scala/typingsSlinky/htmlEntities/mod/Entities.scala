package typingsSlinky.htmlEntities.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Entities extends js.Object {
  def decode(toDecode: String): String = js.native
  def encode(toEncode: String): String = js.native
  def encodeNonASCII(toEncode: String): String = js.native
  def encodeNonUTF(toEncode: String): String = js.native
}

object Entities {
  @scala.inline
  def apply(
    decode: String => String,
    encode: String => String,
    encodeNonASCII: String => String,
    encodeNonUTF: String => String
  ): Entities = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode), encodeNonASCII = js.Any.fromFunction1(encodeNonASCII), encodeNonUTF = js.Any.fromFunction1(encodeNonUTF))
    __obj.asInstanceOf[Entities]
  }
  @scala.inline
  implicit class EntitiesOps[Self <: Entities] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeNonASCII(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeNonASCII")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeNonUTF(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeNonUTF")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

