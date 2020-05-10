package typingsSlinky.firebaseAdmin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonBundleId extends js.Object {
  /**
    * Defines the required iOS bundle ID of the app where the link should be
    * handled if the application is already installed on the device.
    */
  var bundleId: String = js.native
}

object AnonBundleId {
  @scala.inline
  def apply(bundleId: String): AnonBundleId = {
    val __obj = js.Dynamic.literal(bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBundleId]
  }
  @scala.inline
  implicit class AnonBundleIdOps[Self <: AnonBundleId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBundleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

