package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImagePermissions extends js.Object {
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.native
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.native
}

object ImagePermissions {
  @scala.inline
  def apply(): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImagePermissions]
  }
  @scala.inline
  implicit class ImagePermissionsOps[Self <: ImagePermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowFleet(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFleet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowFleet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowFleet")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowImageBuilder(value: BooleanObject): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImageBuilder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowImageBuilder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowImageBuilder")(js.undefined)
        ret
    }
  }
  
}

