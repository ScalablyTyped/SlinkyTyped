package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rounded Rectangle object is an area that has nice rounded corners, as indicated by its
  * top-left corner point (x, y) and by its width and its height and its radius.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait RoundedRectangle extends js.Object {
  /**
    * @member {number} PIXI.RoundedRectangle#height
    * @default 0
    */
  var height: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#radius
    * @default 20
    */
  var radius: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.RoundedRectangle#type
    * @readonly
    * @default PIXI.SHAPES.RREC
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#width
    * @default 0
    */
  var width: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#x
    * @default 0
    */
  var x: Double = js.native
  /**
    * @member {number} PIXI.RoundedRectangle#y
    * @default 0
    */
  var y: Double = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this Rounded Rectangle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Rounded Rectangle
    */
  def contains(x: Double, y: Double): Boolean = js.native
}

object RoundedRectangle {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    height: Double,
    radius: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): RoundedRectangle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), height = height.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoundedRectangle]
  }
  @scala.inline
  implicit class RoundedRectangleOps[Self <: RoundedRectangle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContains(value: (Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contains")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRadius(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("radius")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: Double): Self = {
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

