package typingsSlinky.dojo.dojox.drawing.library.icons

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/library/icons.zoomOut.html
  *
  *
  */
@js.native
trait zoomOut extends js.Object {
  /**
    *
    */
  var borderWidth: Double = js.native
  /**
    *
    */
  var closePath: Boolean = js.native
  /**
    *
    */
  var points: js.Array[_] = js.native
  /**
    *
    */
  var `type`: String = js.native
}

object zoomOut {
  @scala.inline
  def apply(borderWidth: Double, closePath: Boolean, points: js.Array[_], `type`: String): zoomOut = {
    val __obj = js.Dynamic.literal(borderWidth = borderWidth.asInstanceOf[js.Any], closePath = closePath.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[zoomOut]
  }
  @scala.inline
  implicit class zoomOutOps[Self <: zoomOut] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBorderWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("borderWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClosePath(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

