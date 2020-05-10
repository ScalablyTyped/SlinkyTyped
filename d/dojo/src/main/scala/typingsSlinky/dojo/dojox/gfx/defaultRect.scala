package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultRect.html
  *
  * Defines the default Rect prototype.
  *
  */
@js.native
trait defaultRect extends js.Object {
  /**
    * The height of the default rectangle, value 100.
    *
    */
  var height: Double = js.native
  /**
    * The corner radius for the default rectangle, value 0.
    *
    */
  var r: Double = js.native
  /**
    * Specifies this default object is a type of Rect. Value is 'rect'
    *
    */
  var `type`: String = js.native
  /**
    * The width of the default rectangle, value 100.
    *
    */
  var width: Double = js.native
  /**
    * The X coordinate of the default rectangles position, value 0.
    *
    */
  var x: Double = js.native
  /**
    * The Y coordinate of the default rectangle's position, value 0.
    *
    */
  var y: Double = js.native
}

object defaultRect {
  @scala.inline
  def apply(height: Double, r: Double, `type`: String, width: Double, x: Double, y: Double): defaultRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultRect]
  }
  @scala.inline
  implicit class defaultRectOps[Self <: defaultRect] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

