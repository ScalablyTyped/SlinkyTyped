package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.RadialGradient.html
  *
  * Specifies the properties for RadialGradients using in fills patterns.
  *
  */
@js.native
trait RadialGradient extends js.Object {
  /**
    * An array of colors at given offsets (from the center of the radial gradient).
    * The center is defined at offest 0 with the outer edge of the gradient at offset 1.
    * Default value, [{ offset: 0, color: 'black'},{offset: 1, color: 'white'}], is a gradient from black to white.
    *
    */
  var colors: js.Array[_] = js.native
  /**
    * The X coordinate of the center of the radial gradient, default value 0.
    *
    */
  var cx: Double = js.native
  /**
    * The Y coordinate of the center of the radial gradient, default value 0.
    *
    */
  var cy: Double = js.native
  /**
    * The radius to the end of the radial gradient, default value 100.
    *
    */
  var r: Double = js.native
  /**
    * Specifies this is a RadialGradient, value 'radial'
    *
    */
  var `type`: String = js.native
}

object RadialGradient {
  @scala.inline
  def apply(colors: js.Array[_], cx: Double, cy: Double, r: Double, `type`: String): RadialGradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], cx = cx.asInstanceOf[js.Any], cy = cy.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialGradient]
  }
  @scala.inline
  implicit class RadialGradientOps[Self <: RadialGradient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withColors(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("colors")(value.asInstanceOf[js.Any])
        ret
    }
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
  }
  
}

