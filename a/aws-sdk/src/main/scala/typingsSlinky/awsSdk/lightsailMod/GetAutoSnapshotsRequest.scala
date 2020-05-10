package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAutoSnapshotsRequest extends js.Object {
  /**
    * The name of the source instance or disk from which to get automatic snapshot information.
    */
  var resourceName: ResourceName = js.native
}

object GetAutoSnapshotsRequest {
  @scala.inline
  def apply(resourceName: ResourceName): GetAutoSnapshotsRequest = {
    val __obj = js.Dynamic.literal(resourceName = resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAutoSnapshotsRequest]
  }
  @scala.inline
  implicit class GetAutoSnapshotsRequestOps[Self <: GetAutoSnapshotsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resourceName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

