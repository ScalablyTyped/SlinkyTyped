package typingsSlinky.baidumapWebSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Points extends js.Object {
  var points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point]
  var status: Double
}

object Points {
  @scala.inline
  def apply(points: js.Array[typingsSlinky.baidumapWebSdk.BMap.Point], status: Double): Points = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Points]
  }
}

