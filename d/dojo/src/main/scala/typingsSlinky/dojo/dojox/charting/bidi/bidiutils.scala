package typingsSlinky.dojo.dojox.charting.bidi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/bidi/_bidiutils.html
  *
  *
  */
@js.native
trait bidiutils extends js.Object {
  /**
    *
    * @param plot
    * @param dim
    * @param offsets
    * @param rtl
    */
  def reverseMatrix(plot: js.Any, dim: js.Any, offsets: js.Any, rtl: js.Any): Unit = js.native
}

object bidiutils {
  @scala.inline
  def apply(reverseMatrix: (js.Any, js.Any, js.Any, js.Any) => Unit): bidiutils = {
    val __obj = js.Dynamic.literal(reverseMatrix = js.Any.fromFunction4(reverseMatrix))
    __obj.asInstanceOf[bidiutils]
  }
  @scala.inline
  implicit class bidiutilsOps[Self <: bidiutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withReverseMatrix(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverseMatrix")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

