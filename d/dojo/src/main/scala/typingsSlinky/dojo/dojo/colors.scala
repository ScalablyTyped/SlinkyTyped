package typingsSlinky.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/colors.html
  *
  * Color utilities, extending Base dojo.Color
  *
  */
@js.native
trait colors extends js.Object {
  /**
    *
    */
  var ThreeD: js.Object = js.native
}

object colors {
  @scala.inline
  def apply(ThreeD: js.Object): colors = {
    val __obj = js.Dynamic.literal(ThreeD = ThreeD.asInstanceOf[js.Any])
    __obj.asInstanceOf[colors]
  }
  @scala.inline
  implicit class colorsOps[Self <: colors] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreeD(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThreeD")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

