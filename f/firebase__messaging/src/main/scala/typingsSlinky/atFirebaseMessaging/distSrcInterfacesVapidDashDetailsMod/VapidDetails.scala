package typingsSlinky.atFirebaseMessaging.distSrcInterfacesVapidDashDetailsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VapidDetails extends js.Object {
  var swScope: String
  var vapidKey: scala.scalajs.js.typedarray.Uint8Array
}

object VapidDetails {
  @scala.inline
  def apply(swScope: String, vapidKey: scala.scalajs.js.typedarray.Uint8Array): VapidDetails = {
    val __obj = js.Dynamic.literal(swScope = swScope.asInstanceOf[js.Any], vapidKey = vapidKey.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VapidDetails]
  }
}

