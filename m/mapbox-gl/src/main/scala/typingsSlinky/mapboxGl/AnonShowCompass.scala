package typingsSlinky.mapboxGl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShowCompass extends js.Object {
  var showCompass: js.UndefOr[Boolean] = js.native
  var showZoom: js.UndefOr[Boolean] = js.native
  var visualizePitch: js.UndefOr[Boolean] = js.native
}

object AnonShowCompass {
  @scala.inline
  def apply(): AnonShowCompass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonShowCompass]
  }
  @scala.inline
  implicit class AnonShowCompassOps[Self <: AnonShowCompass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShowCompass(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCompass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCompass")(js.undefined)
        ret
    }
    @scala.inline
    def withShowZoom(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoom")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowZoom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showZoom")(js.undefined)
        ret
    }
    @scala.inline
    def withVisualizePitch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualizePitch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisualizePitch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visualizePitch")(js.undefined)
        ret
    }
  }
  
}

