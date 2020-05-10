package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectivityInfoRequest extends js.Object {
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}

object GetConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: string): GetConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectivityInfoRequest]
  }
  @scala.inline
  implicit class GetConnectivityInfoRequestOps[Self <: GetConnectivityInfoRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThingName(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThingName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

