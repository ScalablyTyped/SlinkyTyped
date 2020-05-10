package typingsSlinky.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/easy64.html
  *
  *
  */
@js.native
trait easy64 extends js.Object {
  /**
    * decodes the input string back to array of numbers
    *
    * @param input the input string to decode
    */
  def decode(input: String): Unit = js.native
  /**
    * encodes input data in easy64 string
    *
    * @param input an array of numbers (0-255) to encode
    */
  def encode(input: js.Array[_]): Unit = js.native
}

object easy64 {
  @scala.inline
  def apply(decode: String => Unit, encode: js.Array[_] => Unit): easy64 = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
    __obj.asInstanceOf[easy64]
  }
  @scala.inline
  implicit class easy64Ops[Self <: easy64] (val x: Self) extends AnyVal {
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
    def withEncode(value: js.Array[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encode")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

