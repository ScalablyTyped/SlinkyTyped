package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultEllipse.html
  *
  * Defines the default Ellipse prototype.
  *
  */
@js.native
trait defaultEllipse extends js.Object {
  /**
    * The X coordinate of the center of the ellipse, default value 0.
    *
    */
  var cx: Double = js.native
  /**
    * The Y coordinate of the center of the ellipse, default value 0.
    *
    */
  var cy: Double = js.native
  /**
    * The radius of the ellipse in the X direction, default value 200.
    *
    */
  var rx: Double = js.native
  /**
    * The radius of the ellipse in the Y direction, default value 200.
    *
    */
  var ry: Double = js.native
  /**
    * Specifies that this object is a type of Ellipse, value is 'ellipse'
    *
    */
  var `type`: String = js.native
}

object defaultEllipse {
  @scala.inline
  def apply(cx: Double, cy: Double, rx: Double, ry: Double, `type`: String): defaultEllipse = {
    val __obj = js.Dynamic.literal(cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], rx = rx.asInstanceOf[js.Any], ry = ry.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultEllipse]
  }
  @scala.inline
  implicit class defaultEllipseOps[Self <: defaultEllipse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRx(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rx")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRy(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ry")(value.asInstanceOf[js.Any])
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

