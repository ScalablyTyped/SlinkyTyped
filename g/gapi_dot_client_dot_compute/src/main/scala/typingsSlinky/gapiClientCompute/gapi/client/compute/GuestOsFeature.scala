package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GuestOsFeature extends js.Object {
  /**
    * The type of supported feature. Currently only VIRTIO_SCSI_MULTIQUEUE is supported. For newer Windows images, the server might also populate this
    * property with the value WINDOWS to indicate that this is a Windows image.
    */
  var `type`: js.UndefOr[String] = js.native
}

object GuestOsFeature {
  @scala.inline
  def apply(): GuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GuestOsFeature]
  }
  @scala.inline
  implicit class GuestOsFeatureOps[Self <: GuestOsFeature] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

