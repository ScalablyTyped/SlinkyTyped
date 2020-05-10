package typingsSlinky.dojo.dojox.encoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/bits.html
  *
  *
  */
@js.native
trait bits extends js.Object {
  /**
    *
    * @param buffer
    * @param width
    */
  def InputStream(buffer: js.Any, width: js.Any): Unit = js.native
  /**
    *
    */
  def OutputStream(): Unit = js.native
}

object bits {
  @scala.inline
  def apply(InputStream: (js.Any, js.Any) => Unit, OutputStream: () => Unit): bits = {
    val __obj = js.Dynamic.literal(InputStream = js.Any.fromFunction2(InputStream), OutputStream = js.Any.fromFunction0(OutputStream))
    __obj.asInstanceOf[bits]
  }
  @scala.inline
  implicit class bitsOps[Self <: bits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInputStream(value: (js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InputStream")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOutputStream(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OutputStream")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

