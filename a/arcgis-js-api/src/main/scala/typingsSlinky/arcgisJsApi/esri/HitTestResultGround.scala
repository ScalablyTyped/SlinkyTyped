package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HitTestResultGround extends Object {
  /**
    * The distance from camera position to the ground hit. The distance will be `0` if the ground was not hit at all. In global scenes the distance will be in meters while in local scenes the distance will be in the unit of the spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var distance: Double = js.native
  /**
    * The point at which the ground was hit while performing the hitTest. This may be `null` when the ground was not hit at all (for example by clicking on the sky).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var mapPoint: Point = js.native
}

object HitTestResultGround {
  @scala.inline
  def apply(
    constructor: js.Function,
    distance: Double,
    hasOwnProperty: PropertyKey => Boolean,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean
  ): HitTestResultGround = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[HitTestResultGround]
  }
  @scala.inline
  implicit class HitTestResultGroundOps[Self <: HitTestResultGround] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDistance(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapPoint(value: Point): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

