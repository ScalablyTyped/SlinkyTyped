package typingsSlinky.cesium

import typingsSlinky.cesium.mod.Cartesian2
import typingsSlinky.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDisableCheckIfAllPixelsAreTransparent extends js.Object {
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.native
  var missingImageUrl: Resource | String = js.native
  var pixelsToCheck: js.Array[Cartesian2] = js.native
}

object AnonDisableCheckIfAllPixelsAreTransparent {
  @scala.inline
  def apply(missingImageUrl: Resource | String, pixelsToCheck: js.Array[Cartesian2]): AnonDisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDisableCheckIfAllPixelsAreTransparent]
  }
  @scala.inline
  implicit class AnonDisableCheckIfAllPixelsAreTransparentOps[Self <: AnonDisableCheckIfAllPixelsAreTransparent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissingImageUrl(value: Resource | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missingImageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPixelsToCheck(value: js.Array[Cartesian2]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pixelsToCheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisableCheckIfAllPixelsAreTransparent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckIfAllPixelsAreTransparent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableCheckIfAllPixelsAreTransparent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableCheckIfAllPixelsAreTransparent")(js.undefined)
        ret
    }
  }
  
}

