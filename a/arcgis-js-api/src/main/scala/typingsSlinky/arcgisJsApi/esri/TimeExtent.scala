package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeExtent extends JSONSupport {
  /**
    * The end time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#end)
    *
    * @default null
    */
  var end: js.Date
  /**
    * The start time of the time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#start)
    *
    * @default null
    */
  var start: js.Date
  /**
    * Returns the time extent resulting from the intersection of the current time extent and parsed time extent. Returns `null` if two time extents do not intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeExtent.html#intersection)
    *
    * @param timeExtent The time extent to be intersected with the time extent on which `intersection()` is being called on.
    *
    */
  def intersection(timeExtent: TimeExtent): TimeExtent
}

object TimeExtent {
  @scala.inline
  def apply(end: js.Date, intersection: TimeExtent => TimeExtent, start: js.Date, toJSON: () => js.Any): TimeExtent = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], intersection = js.Any.fromFunction1(intersection), start = start.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[TimeExtent]
  }
}

