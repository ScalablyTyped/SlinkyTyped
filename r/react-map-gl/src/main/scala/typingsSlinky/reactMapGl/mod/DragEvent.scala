package typingsSlinky.reactMapGl.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragEvent
  extends /* key */ StringDictionary[js.Any] {
  var lngLat: js.Tuple2[Double, Double] = js.native
}

object DragEvent {
  @scala.inline
  def apply(lngLat: js.Tuple2[Double, Double]): DragEvent = {
    val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragEvent]
  }
  @scala.inline
  implicit class DragEventOps[Self <: DragEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLngLat(value: js.Tuple2[Double, Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lngLat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

