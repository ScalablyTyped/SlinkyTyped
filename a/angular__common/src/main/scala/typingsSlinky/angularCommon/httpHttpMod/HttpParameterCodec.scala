package typingsSlinky.angularCommon.httpHttpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpParameterCodec extends js.Object {
  def decodeKey(key: String): String = js.native
  def decodeValue(value: String): String = js.native
  def encodeKey(key: String): String = js.native
  def encodeValue(value: String): String = js.native
}

object HttpParameterCodec {
  @scala.inline
  def apply(
    decodeKey: String => String,
    decodeValue: String => String,
    encodeKey: String => String,
    encodeValue: String => String
  ): HttpParameterCodec = {
    val __obj = js.Dynamic.literal(decodeKey = js.Any.fromFunction1(decodeKey), decodeValue = js.Any.fromFunction1(decodeValue), encodeKey = js.Any.fromFunction1(encodeKey), encodeValue = js.Any.fromFunction1(encodeValue))
    __obj.asInstanceOf[HttpParameterCodec]
  }
  @scala.inline
  implicit class HttpParameterCodecOps[Self <: HttpParameterCodec] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecodeKey(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDecodeValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decodeValue")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeKey(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeKey")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncodeValue(value: String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encodeValue")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

