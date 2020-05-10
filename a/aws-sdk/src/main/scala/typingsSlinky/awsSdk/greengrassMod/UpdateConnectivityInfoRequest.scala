package typingsSlinky.awsSdk.greengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateConnectivityInfoRequest extends js.Object {
  /**
    * A list of connectivity info.
    */
  var ConnectivityInfo: js.UndefOr[listOfConnectivityInfo] = js.native
  /**
    * The thing name.
    */
  var ThingName: string = js.native
}

object UpdateConnectivityInfoRequest {
  @scala.inline
  def apply(ThingName: string): UpdateConnectivityInfoRequest = {
    val __obj = js.Dynamic.literal(ThingName = ThingName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectivityInfoRequest]
  }
  @scala.inline
  implicit class UpdateConnectivityInfoRequestOps[Self <: UpdateConnectivityInfoRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def withConnectivityInfo(value: listOfConnectivityInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectivityInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConnectivityInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConnectivityInfo")(js.undefined)
        ret
    }
  }
  
}

