package typingsSlinky.makerJs.MakerJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An intersection of two paths.
  */
@js.native
trait IPathIntersection extends js.Object {
  /**
    * Array of points where the two paths intersected. The length of the array may be either 1 or 2 points.
    */
  var intersectionPoints: js.Array[IPoint] = js.native
  /**
    * This Array property will only be defined if the first parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the first path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path1Angles: js.UndefOr[js.Array[Double]] = js.native
  /**
    * This Array property will only be defined if the second parameter passed to pathIntersection is either an Arc or a Circle.
    * It contains the angles of intersection relative to the second path parameter.
    * The length of the array may be either 1 or 2.
    */
  var path2Angles: js.UndefOr[js.Array[Double]] = js.native
}

object IPathIntersection {
  @scala.inline
  def apply(intersectionPoints: js.Array[IPoint]): IPathIntersection = {
    val __obj = js.Dynamic.literal(intersectionPoints = intersectionPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPathIntersection]
  }
  @scala.inline
  implicit class IPathIntersectionOps[Self <: IPathIntersection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIntersectionPoints(value: js.Array[IPoint]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("intersectionPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPath1Angles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path1Angles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath1Angles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path1Angles")(js.undefined)
        ret
    }
    @scala.inline
    def withPath2Angles(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path2Angles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath2Angles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path2Angles")(js.undefined)
        ret
    }
  }
  
}

