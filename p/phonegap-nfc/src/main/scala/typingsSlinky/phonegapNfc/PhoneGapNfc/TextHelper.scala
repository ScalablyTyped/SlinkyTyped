package typingsSlinky.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextHelper extends js.Object {
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String = js.native
  /**
    * Encode text payload
    * @param text
    * @param lang
    * @param encoding
    */
  def encodePayload(text: String, lang: String, encoding: String): js.Array[Double] = js.native
}

object TextHelper {
  @scala.inline
  def apply(decodePayload: js.Any => String, encodePayload: (String, String, String) => js.Array[Double]): TextHelper = {
    val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction3(encodePayload))
    __obj.asInstanceOf[TextHelper]
  }
  @scala.inline
  implicit class TextHelperOps[Self <: TextHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodePayload(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodePayload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodePayload(value: (String, String, String) => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodePayload")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

