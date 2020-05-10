package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultPolyline.html
  *
  * Defines the default PolyLine prototype.
  *
  */
@js.native
trait defaultPolyline extends js.Object {
  /**
    * An array of point objects [{x:0,y:0},...] defining the default polyline's line segments. Value is an empty array [].
    *
    */
  var points: js.Array[_] = js.native
  /**
    * Specifies this object is a PolyLine, default value 'polyline'.
    *
    */
  var `type`: String = js.native
}

object defaultPolyline {
  @scala.inline
  def apply(points: js.Array[_], `type`: String): defaultPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultPolyline]
  }
  @scala.inline
  implicit class defaultPolylineOps[Self <: defaultPolyline] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

