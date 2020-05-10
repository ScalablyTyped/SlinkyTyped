package typingsSlinky.arcgisJsApi.esri

import org.scalajs.dom.raw.MouseEvent
import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneViewHitTestResult extends Object {
  /**
    * Ground intersection result. The ground hit result will always be returned, even if the ground was excluded from the [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var ground: HitTestResultGround = js.native
  /**
    * An array of result objects returned from the [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest). Results are returned when the location of the input screen coordinates intersect a [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in the view. See the table below for the specification of each object in this array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var results: js.Array[SceneViewHitTestResultResults] = js.native
  /**
    * The screen coordinates (or native mouse event) of the click on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#HitTestResult)
    */
  var screenPoint: SceneViewScreenPoint | MouseEvent = js.native
}

object SceneViewHitTestResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    ground: HitTestResultGround,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    results: js.Array[SceneViewHitTestResultResults],
    screenPoint: SceneViewScreenPoint | MouseEvent
  ): SceneViewHitTestResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], ground = ground.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), results = results.asInstanceOf[js.Any], screenPoint = screenPoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewHitTestResult]
  }
  @scala.inline
  implicit class SceneViewHitTestResultOps[Self <: SceneViewHitTestResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGround(value: HitTestResultGround): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[SceneViewHitTestResultResults]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenPointMouseEvent(value: MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScreenPoint(value: SceneViewScreenPoint | MouseEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screenPoint")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

