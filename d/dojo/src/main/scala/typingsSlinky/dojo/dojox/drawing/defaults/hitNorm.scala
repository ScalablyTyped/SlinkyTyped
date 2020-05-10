package typingsSlinky.dojo.dojox.drawing.defaults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/defaults.hitNorm.html
  *
  * Normal style of a hit area
  *
  */
@js.native
trait hitNorm extends js.Object {
  /**
    *
    */
  var cap: String = js.native
  /**
    *
    */
  var color: js.Object = js.native
  /**
    *
    */
  var fill: js.Object = js.native
  /**
    *
    */
  var style: String = js.native
  /**
    *
    */
  var width: Double = js.native
}

object hitNorm {
  @scala.inline
  def apply(cap: String, color: js.Object, fill: js.Object, style: String, width: Double): hitNorm = {
    val __obj = js.Dynamic.literal(cap = cap.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fill = fill.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[hitNorm]
  }
  @scala.inline
  implicit class hitNormOps[Self <: hitNorm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCap(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cap")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFill(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fill")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

