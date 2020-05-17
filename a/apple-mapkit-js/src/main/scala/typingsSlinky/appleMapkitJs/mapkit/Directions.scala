package typingsSlinky.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a directions object with options that you may provide.
  */
@js.native
trait Directions extends js.Object {
  /**
    * Cancels a previous request for route directions.
    *
    * @param id The ID returned by a call to route.
    */
  def cancel(id: Double): Boolean = js.native
  /**
    * Retrieves directions and estimated travel time for the specified start
    * and end points.
    *
    * @param request DirectionsRequest object that specifies details for the
    * directions you want to retrieve.
    * @param callback A callback function that receives the directions,
    * returned asynchronously.
    * @return A request ID, which you can pass to cancel to abort a pending request.
    */
  def route(
    request: DirectionsRequest,
    callback: js.Function2[/* error */ js.Error | Null, /* data */ DirectionsResponse, Unit]
  ): Double = js.native
}

object Directions {
  @scala.inline
  def apply(
    cancel: Double => Boolean,
    route: (DirectionsRequest, js.Function2[/* error */ js.Error | Null, /* data */ DirectionsResponse, Unit]) => Double
  ): Directions = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction1(cancel), route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[Directions]
  }
  @scala.inline
  implicit class DirectionsOps[Self <: Directions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: Double => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoute(
      value: (DirectionsRequest, js.Function2[/* error */ js.Error | Null, /* data */ DirectionsResponse, Unit]) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("route")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

