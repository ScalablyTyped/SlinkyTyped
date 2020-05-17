package typingsSlinky.nodeGeocoder.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Confidence extends js.Object {
  var confidence: js.UndefOr[Double] = js.native
  var googlePlaceId: js.UndefOr[String] = js.native
}

object Confidence {
  @scala.inline
  def apply(): Confidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Confidence]
  }
  @scala.inline
  implicit class ConfidenceOps[Self <: Confidence] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withGooglePlaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGooglePlaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googlePlaceId")(js.undefined)
        ret
    }
  }
  
}

