package typingsSlinky.reactNativeMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCoordinateAnonAccuracy extends js.Object {
  var coordinate: AnonAccuracy = js.native
}

object AnonCoordinateAnonAccuracy {
  @scala.inline
  def apply(coordinate: AnonAccuracy): AnonCoordinateAnonAccuracy = {
    val __obj = js.Dynamic.literal(coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinateAnonAccuracy]
  }
  @scala.inline
  implicit class AnonCoordinateAnonAccuracyOps[Self <: AnonCoordinateAnonAccuracy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoordinate(value: AnonAccuracy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("coordinate")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

