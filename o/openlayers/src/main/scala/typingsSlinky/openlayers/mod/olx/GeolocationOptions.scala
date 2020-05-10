package typingsSlinky.openlayers.mod.olx

import org.scalajs.dom.raw.PositionOptions
import typingsSlinky.openlayers.mod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeolocationOptions extends js.Object {
  var projection: ProjectionLike = js.native
  var tracking: js.UndefOr[Boolean] = js.native
  var trackingOptions: js.UndefOr[PositionOptions] = js.native
}

object GeolocationOptions {
  @scala.inline
  def apply(): GeolocationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationOptions]
  }
  @scala.inline
  implicit class GeolocationOptionsOps[Self <: GeolocationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjection(value: ProjectionLike): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("projection")(js.undefined)
        ret
    }
    @scala.inline
    def withTracking(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTracking: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tracking")(js.undefined)
        ret
    }
    @scala.inline
    def withTrackingOptions(value: PositionOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrackingOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingOptions")(js.undefined)
        ret
    }
  }
  
}

