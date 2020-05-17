package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class to define a shape via user defined co-orinates.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Polygon extends js.Object {
  /**
    * `false` after moveTo, `true` after `closePath`. In all other cases it is `true`.
    * @member {boolean} PIXI.Polygon#closeStroke
    * @default true
    */
  var closeStroke: Boolean = js.native
  /**
    * An array of the points of this polygon
    *
    * @member {number[]} PIXI.Polygon#points
    */
  var points: js.Array[Double] = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Polygon#type
    * @readOnly
    * @default PIXI.SHAPES.POLY
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * Checks whether the x and y coordinates passed to this function are contained within this polygon
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this polygon
    */
  def contains(x: Double, y: Double): Boolean = js.native
}

object Polygon {
  @scala.inline
  def apply(
    closeStroke: Boolean,
    contains: (Double, Double) => Boolean,
    points: js.Array[Double],
    `type`: Double
  ): Polygon = {
    val __obj = js.Dynamic.literal(closeStroke = closeStroke.asInstanceOf[js.Any], contains = js.Any.fromFunction2(contains), points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Polygon]
  }
  @scala.inline
  implicit class PolygonOps[Self <: Polygon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCloseStroke(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeStroke")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContains(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withPoints(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("points")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

