package typingsSlinky.arcgisJsApi.esri

import typingsSlinky.std.Object
import typingsSlinky.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhaseEvent extends Object {
  /**
    * The elapsed time since the last animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var deltaTime: Double = js.native
  /**
    * The amount of time spent within the current animation frame. This can be used for budgeting (e.g. some tasks may already have run).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var elapsedFrameTime: Double = js.native
  /**
    * The absolute time at the start of the current animation frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-scheduling.html#PhaseEvent)
    */
  var time: Double = js.native
}

object PhaseEvent {
  @scala.inline
  def apply(
    constructor: js.Function,
    deltaTime: Double,
    elapsedFrameTime: Double,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    time: Double
  ): PhaseEvent = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], elapsedFrameTime = elapsedFrameTime.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhaseEvent]
  }
  @scala.inline
  implicit class PhaseEventOps[Self <: PhaseEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeltaTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deltaTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElapsedFrameTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elapsedFrameTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

