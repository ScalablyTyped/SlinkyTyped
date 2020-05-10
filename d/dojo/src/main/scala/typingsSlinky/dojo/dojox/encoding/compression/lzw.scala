package typingsSlinky.dojo.dojox.encoding.compression

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/compression/lzw.html
  *
  *
  */
@js.native
trait lzw extends js.Object {
  /**
    *
    * @param n
    */
  def Decoder(n: js.Any): Unit = js.native
  /**
    *
    * @param n
    */
  def Encoder(n: js.Any): Unit = js.native
}

object lzw {
  @scala.inline
  def apply(Decoder: js.Any => Unit, Encoder: js.Any => Unit): lzw = {
    val __obj = js.Dynamic.literal(Decoder = js.Any.fromFunction1(Decoder), Encoder = js.Any.fromFunction1(Encoder))
    __obj.asInstanceOf[lzw]
  }
  @scala.inline
  implicit class lzwOps[Self <: lzw] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecoder(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Decoder")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEncoder(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Encoder")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

