package typingsSlinky.dojo.dojox.gfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/gfx.defaultLinearGradient.html
  *
  * An object defining the default stylistic properties used for Linear Gradient fills.
  * Linear gradients are drawn along a virtual line, which results in appearance of a rotated pattern in a given direction/orientation.
  *
  */
@js.native
trait defaultLinearGradient extends js.Object {
  /**
    * An array of colors at given offsets (from the start of the line).  The start of the line is
    * defined at offest 0 with the end of the line at offset 1.
    * Default value, [{ offset: 0, color: 'black'},{offset: 1, color: 'white'}], is a gradient from black to white.
    *
    */
  var colors: js.Array[_] = js.native
  /**
    * Specifies this object is a Linear Gradient, value 'linear'
    *
    */
  var `type`: String = js.native
  /**
    * The X coordinate of the start of the virtual line along which the gradient is drawn, default value 0.
    *
    */
  var x1: Double = js.native
  /**
    * The X coordinate of the end of the virtual line along which the gradient is drawn, default value 100.
    *
    */
  var x2: Double = js.native
  /**
    * The Y coordinate of the start of the virtual line along which the gradient is drawn, default value 0.
    *
    */
  var y1: Double = js.native
  /**
    * The Y coordinate of the end of the virtual line along which the gradient is drawn, default value 100.
    *
    */
  var y2: Double = js.native
}

object defaultLinearGradient {
  @scala.inline
  def apply(colors: js.Array[_], `type`: String, x1: Double, x2: Double, y1: Double, y2: Double): defaultLinearGradient = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[defaultLinearGradient]
  }
  @scala.inline
  implicit class defaultLinearGradientOps[Self <: defaultLinearGradient] (val x: Self) extends AnyVal {
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
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withX2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("x2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY1(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withY2(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("y2")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

