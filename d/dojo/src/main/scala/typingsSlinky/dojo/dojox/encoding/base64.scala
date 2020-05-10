package typingsSlinky.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/base64.html
  *
  *
  */
@js.native
trait base64 extends js.Object {
  /**
    * Convert a base64-encoded string to an array of bytes
    *
    * @param str
    */
  def decode(str: String): Unit = js.native
  /**
    * Encode an array of bytes as a base64-encoded string
    *
    * @param ba
    */
  def encode(ba: js.Array[Double]): Unit = js.native
}

object base64 {
  @scala.inline
  def apply(decode: String => Unit, encode: js.Array[Double] => Unit): base64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[base64]
  }
  @scala.inline
  implicit class base64Ops[Self <: base64] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecode(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decode")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncode(value: js.Array[Double] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

