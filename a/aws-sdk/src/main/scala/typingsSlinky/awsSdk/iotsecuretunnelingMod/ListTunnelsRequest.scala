package typingsSlinky.awsSdk.iotsecuretunnelingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTunnelsRequest extends js.Object {
  /**
    * The maximum number of results to return at once.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * A token to retrieve the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The name of the IoT thing associated with the destination device.
    */
  var thingName: js.UndefOr[ThingName] = js.native
}

object ListTunnelsRequest {
  @scala.inline
  def apply(): ListTunnelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTunnelsRequest]
  }
  @scala.inline
  implicit class ListTunnelsRequestOps[Self <: ListTunnelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: NextToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextToken")(js.undefined)
        ret
    }
    @scala.inline
    def withThingName(value: ThingName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThingName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thingName")(js.undefined)
        ret
    }
  }
  
}

