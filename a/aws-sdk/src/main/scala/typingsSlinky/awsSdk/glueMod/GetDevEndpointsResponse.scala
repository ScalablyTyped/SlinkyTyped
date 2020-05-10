package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDevEndpointsResponse extends js.Object {
  /**
    * A list of DevEndpoint definitions.
    */
  var DevEndpoints: js.UndefOr[DevEndpointList] = js.native
  /**
    * A continuation token, if not all DevEndpoint definitions have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object GetDevEndpointsResponse {
  @scala.inline
  def apply(): GetDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDevEndpointsResponse]
  }
  @scala.inline
  implicit class GetDevEndpointsResponseOps[Self <: GetDevEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevEndpoints(value: DevEndpointList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpoints")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: GenericString): Self = {
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

