package typingsSlinky.awsSdk.snsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsByPlatformApplicationResponse extends js.Object {
  /**
    * Endpoints returned for ListEndpointsByPlatformApplication action.
    */
  var Endpoints: js.UndefOr[ListOfEndpoints] = js.native
  /**
    * NextToken string is returned when calling ListEndpointsByPlatformApplication action if additional records are available after the first page results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListEndpointsByPlatformApplicationResponse {
  @scala.inline
  def apply(): ListEndpointsByPlatformApplicationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsByPlatformApplicationResponse]
  }
  @scala.inline
  implicit class ListEndpointsByPlatformApplicationResponseOps[Self <: ListEndpointsByPlatformApplicationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: ListOfEndpoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(js.undefined)
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

