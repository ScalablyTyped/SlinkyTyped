package typingsSlinky.instagramPrivateApi.mediaUpdatedMediaResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaUpdatedMediaResponseCreativeConfig extends js.Object {
  var camera_facing: String = js.native
  var capture_type: String = js.native
  var should_render_try_it_on: Boolean = js.native
}

object MediaUpdatedMediaResponseCreativeConfig {
  @scala.inline
  def apply(camera_facing: String, capture_type: String, should_render_try_it_on: Boolean): MediaUpdatedMediaResponseCreativeConfig = {
    val __obj = js.Dynamic.literal(camera_facing = camera_facing.asInstanceOf[js.Any], capture_type = capture_type.asInstanceOf[js.Any], should_render_try_it_on = should_render_try_it_on.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaUpdatedMediaResponseCreativeConfig]
  }
  @scala.inline
  implicit class MediaUpdatedMediaResponseCreativeConfigOps[Self <: MediaUpdatedMediaResponseCreativeConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCamera_facing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("camera_facing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCapture_type(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("capture_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShould_render_try_it_on(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("should_render_try_it_on")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

