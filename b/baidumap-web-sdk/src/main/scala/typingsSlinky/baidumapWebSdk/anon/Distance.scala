package typingsSlinky.baidumapWebSdk.anon

import typingsSlinky.baidumapWebSdk.BMap.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Distance extends js.Object {
  var distance: Double
  var points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point]
  var polylines: js.Array[Polyline]
  var target: js.Any
  var `type`: String
}

object Distance {
  @scala.inline
  def apply(
    distance: Double,
    points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point],
    polylines: js.Array[Polyline],
    target: js.Any,
    `type`: String
  ): Distance = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any], polylines = polylines.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Distance]
  }
}

