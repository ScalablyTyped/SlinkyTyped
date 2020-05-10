package typingsSlinky.officeJs.Visio

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the BoundingBox of the shape.
  *
  * [Api set:  1.1]
  */
@js.native
trait BoundingBox extends js.Object {
  /**
    *
    * The distance between the top and bottom edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var height: Double = js.native
  /**
    *
    * The distance between the left and right edges of the bounding box of the shape, excluding any data graphics associated with the shape.
    *
    * [Api set:  1.1]
    */
  var width: Double = js.native
  /**
    *
    * An integer that specifies the x-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var x: Double = js.native
  /**
    *
    * An integer that specifies the y-coordinate of the bounding box.
    *
    * [Api set:  1.1]
    */
  var y: Double = js.native
}

object BoundingBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): BoundingBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingBox]
  }
  @scala.inline
  implicit class BoundingBoxOps[Self <: BoundingBox] (val x: Self) extends AnyVal {
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

