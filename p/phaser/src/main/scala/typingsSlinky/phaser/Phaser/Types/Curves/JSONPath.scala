package typingsSlinky.phaser.Phaser.Types.Curves

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSONPath extends js.Object {
  /**
    * The path is auto closed.
    */
  var autoClose: Boolean = js.native
  /**
    * The list of the curves
    */
  var curves: js.Array[JSONCurve] = js.native
  /**
    * The of the curve.
    */
  var `type`: String = js.native
  /**
    * The X coordinate of the curve's starting point.
    */
  var x: Double = js.native
  /**
    * The Y coordinate of the path's starting point.
    */
  var y: Double = js.native
}

object JSONPath {
  @scala.inline
  def apply(autoClose: Boolean, curves: js.Array[JSONCurve], `type`: String, x: Double, y: Double): JSONPath = {
    val __obj = js.Dynamic.literal(autoClose = autoClose.asInstanceOf[js.Any], curves = curves.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONPath]
  }
  @scala.inline
  implicit class JSONPathOps[Self <: JSONPath] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurves(value: js.Array[JSONCurve]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("curves")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
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

