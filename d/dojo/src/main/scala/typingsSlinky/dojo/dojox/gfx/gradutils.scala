package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx/gradutils.html
  *
  *
  */
@js.native
trait gradutils extends js.Object {
  /**
    * sample a color from a gradient using a point
    *
    * @param fill fill object
    * @param pt point where to sample a color
    */
  def getColor(fill: js.Object, pt: js.Object): Unit = js.native
  /**
    * reverses a gradient
    *
    * @param fill fill object
    */
  def reverse(fill: js.Object): Unit = js.native
}

object gradutils {
  @scala.inline
  def apply(getColor: (js.Object, js.Object) => Unit, reverse: js.Object => Unit): gradutils = {
    val __obj = js.Dynamic.literal(getColor = js.Any.fromFunction2(getColor), reverse = js.Any.fromFunction1(reverse))
    __obj.asInstanceOf[gradutils]
  }
  @scala.inline
  implicit class gradutilsOps[Self <: gradutils] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetColor(value: (js.Object, js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getColor")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withReverse(value: js.Object => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reverse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

