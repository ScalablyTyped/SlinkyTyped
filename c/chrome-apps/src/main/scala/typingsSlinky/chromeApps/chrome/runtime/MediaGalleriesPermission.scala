package typingsSlinky.chromeApps.chrome.runtime

import typingsSlinky.chromeApps.chromeAppsStrings.allAutoDetected
import typingsSlinky.chromeApps.chromeAppsStrings.read_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaGalleriesPermission extends Permission {
  var mediaGalleries: js.Array[read_ | allAutoDetected] = js.native
}

object MediaGalleriesPermission {
  @scala.inline
  def apply(mediaGalleries: js.Array[read_ | allAutoDetected]): MediaGalleriesPermission = {
    val __obj = js.Dynamic.literal(mediaGalleries = mediaGalleries.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaGalleriesPermission]
  }
  @scala.inline
  implicit class MediaGalleriesPermissionOps[Self <: MediaGalleriesPermission] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMediaGalleries(value: js.Array[read_ | allAutoDetected]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mediaGalleries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

