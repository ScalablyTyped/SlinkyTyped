package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsByPlatformApplicationInput extends js.Object {
  /**
    * NextToken string is used when calling ListEndpointsByPlatformApplication action to retrieve additional records that are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * PlatformApplicationArn for ListEndpointsByPlatformApplicationInput action.
    */
  var PlatformApplicationArn: String = js.native
}

object ListEndpointsByPlatformApplicationInput {
  @scala.inline
  def apply(PlatformApplicationArn: String): ListEndpointsByPlatformApplicationInput = {
    val __obj = js.Dynamic.literal(PlatformApplicationArn = PlatformApplicationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationInput]
  }
  @scala.inline
  implicit class ListEndpointsByPlatformApplicationInputOps[Self <: ListEndpointsByPlatformApplicationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPlatformApplicationArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PlatformApplicationArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

