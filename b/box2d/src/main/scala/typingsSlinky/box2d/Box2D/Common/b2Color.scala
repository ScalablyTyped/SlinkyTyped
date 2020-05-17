package typingsSlinky.box2d.Box2D.Common

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait b2Color extends js.Object {
  /**
  		* Blue
  		**/
  var b: Double = js.native
  /**
  		* RGB color as hex.
  		* @type uint
  		**/
  var color: Double = js.native
  /**
  		* Green
  		**/
  var g: Double = js.native
  /**
  		* Red
  		**/
  var r: Double = js.native
  /**
  		* Sets the Color to new RGB values.
  		* @param rr Red value
  		* @param gg Green value
  		* @param bb Blue value
  		**/
  def Set(rr: Double, gg: Double, bb: Double): Unit = js.native
}

object b2Color {
  @scala.inline
  def apply(Set: (Double, Double, Double) => Unit, b: Double, color: Double, g: Double, r: Double): b2Color = {
    val __obj = js.Dynamic.literal(Set = js.Any.fromFunction3(Set), b = b.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
    __obj.asInstanceOf[b2Color]
  }
  @scala.inline
  implicit class b2ColorOps[Self <: b2Color] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSet(value: (Double, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withB(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("b")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withColor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("color")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withG(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("g")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withR(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("r")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

