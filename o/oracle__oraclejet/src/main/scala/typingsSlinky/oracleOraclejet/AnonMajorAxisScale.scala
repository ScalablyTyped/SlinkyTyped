package typingsSlinky.oracleOraclejet

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMajorAxisScale
  extends /* key */ StringDictionary[js.Any] {
  var majorAxisScale: String = js.native
  var minorAxisScale: String = js.native
  var viewportEnd: String = js.native
  var viewportStart: String = js.native
}

object AnonMajorAxisScale {
  @scala.inline
  def apply(majorAxisScale: String, minorAxisScale: String, viewportEnd: String, viewportStart: String): AnonMajorAxisScale = {
    val __obj = js.Dynamic.literal(majorAxisScale = majorAxisScale.asInstanceOf[js.Any], minorAxisScale = minorAxisScale.asInstanceOf[js.Any], viewportEnd = viewportEnd.asInstanceOf[js.Any], viewportStart = viewportStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMajorAxisScale]
  }
  @scala.inline
  implicit class AnonMajorAxisScaleOps[Self <: AnonMajorAxisScale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMajorAxisScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("majorAxisScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinorAxisScale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minorAxisScale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withViewportStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewportStart")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

