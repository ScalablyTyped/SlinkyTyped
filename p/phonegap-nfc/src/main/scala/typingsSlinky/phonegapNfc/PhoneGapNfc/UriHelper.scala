package typingsSlinky.phonegapNfc.PhoneGapNfc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UriHelper extends js.Object {
  /**
    * URI identifier codes from URI Record Type Definition NFCForum-TS-RTD_URI_1.0 2006-07-24
    * index in array matches code in the spec
    */
  var protocols: js.Array[String] = js.native
  /**
    * Decode a URI payload bytes
    * @param data
    */
  def decodePayload(data: js.Any): String = js.native
  /**
    * shorten a URI with standard prefix
    * @param uri
    */
  def encodePayload(uri: String): js.Array[Double] = js.native
}

object UriHelper {
  @scala.inline
  def apply(
    decodePayload: js.Any => String,
    encodePayload: String => js.Array[Double],
    protocols: js.Array[String]
  ): UriHelper = {
    val __obj = js.Dynamic.literal(decodePayload = js.Any.fromFunction1(decodePayload), encodePayload = js.Any.fromFunction1(encodePayload), protocols = protocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[UriHelper]
  }
  @scala.inline
  implicit class UriHelperOps[Self <: UriHelper] (val x: Self) extends AnyVal {
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
    def withEncodePayload(value: String => js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodePayload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProtocols(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocols")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

