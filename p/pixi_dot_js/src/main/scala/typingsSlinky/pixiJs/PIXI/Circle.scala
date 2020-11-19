package typingsSlinky.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The Circle object is used to help draw graphics and can also be used to specify a hit area for displayObjects.
  *
  * @class
  * @memberof PIXI
  */
@js.native
trait Circle extends js.Object {
  
  /**
    * Checks whether the x and y coordinates given are contained within this circle
    *
    * @param {number} x - The X coordinate of the point to test
    * @param {number} y - The Y coordinate of the point to test
    * @return {boolean} Whether the x/y coordinates are within this Circle
    */
  def contains(x: Double, y: Double): Boolean = js.native
  
  /**
    * Returns the framing rectangle of the circle as a Rectangle object
    *
    * @return {PIXI.Rectangle} the framing rectangle
    */
  def getBounds(): Rectangle = js.native
  
  /**
    * @member {number} PIXI.Circle#radius
    * @default 0
    */
  var radius: Double = js.native
  
  /**
    * The type of the object, mainly used to avoid `instanceof` checks
    *
    * @member {number} PIXI.Circle#type
    * @readOnly
    * @default PIXI.SHAPES.CIRC
    * @see PIXI.SHAPES
    */
  val `type`: Double = js.native
  
  /**
    * @member {number} PIXI.Circle#x
    * @default 0
    */
  var x: Double = js.native
  
  /**
    * @member {number} PIXI.Circle#y
    * @default 0
    */
  var y: Double = js.native
}
object Circle {
  
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    getBounds: () => Rectangle,
    radius: Double,
    `type`: Double,
    x: Double,
    y: Double
  ): Circle = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), getBounds = js.Any.fromFunction0(getBounds), radius = radius.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Circle]
  }
  
  @scala.inline
  implicit class CircleOps[Self <: Circle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = this.set("contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetBounds(value: () => Rectangle): Self = this.set("getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRadius(value: Double): Self = this.set("radius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Double): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
