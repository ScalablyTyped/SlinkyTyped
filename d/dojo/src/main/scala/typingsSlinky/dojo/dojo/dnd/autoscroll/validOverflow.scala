package typingsSlinky.dojo.dojo.dnd.autoscroll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/dnd/autoscroll._validOverflow.html
  *
  *
  */
@js.native
trait validOverflow extends js.Object {
  /**
    *
    */
  var auto: Double = js.native
  /**
    *
    */
  var scroll: Double = js.native
}

object validOverflow {
  @scala.inline
  def apply(auto: Double, scroll: Double): validOverflow = {
    val __obj = js.Dynamic.literal(auto = auto.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[validOverflow]
  }
  @scala.inline
  implicit class validOverflowOps[Self <: validOverflow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuto(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auto")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScroll(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scroll")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

