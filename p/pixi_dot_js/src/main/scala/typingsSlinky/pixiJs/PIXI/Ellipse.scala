package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Ellipse object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Ellipse extends js.Object {
  /**
    * @member {number} PIXI.Ellipse#height
    * @default 0
    */
  var height: Double = js.native
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Ellipse#type
    * @readOnly
    * @default PIXI.SHAPES.ELIP
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#width
    * @default 0
    */
  var width: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#x
    * @default 0
    */
  var x: Double = js.native
  /**
    * @member {number} PIXI.Ellipse#y
    * @default 0
    */
  var y: Double = js.native
  /**
    * Checks whether the x and y coordinates given are contained within this ellipse
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coords are within this ellipse
    */
  def contains(x: Double, y: Double): Boolean = js.native
  /**
    * Returns the framing rectangle of the ellipse as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  def getBounds(): Rectangle = js.native
}

object Ellipse {
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    getBounds: () => Rectangle,
    height: Double,
    `type`: Double,
    width: Double,
    x: Double,
    y: Double
  ): Ellipse = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), getBounds = js.Any.fromFunction0(getBounds), height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ellipse]
  }
  @scala.inline
  implicit class EllipseOps[Self <: Ellipse] (val x: Self) extends AnyVal {
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
    def withGetBounds(value: () => Rectangle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getBounds")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
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

