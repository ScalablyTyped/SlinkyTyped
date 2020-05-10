package typingsSlinky.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDevEndpointsResponse extends js.Object {
  /**
    * The names of all the DevEndpoints in the account, or the DevEndpoints with the specified tags.
    */
  var DevEndpointNames: js.UndefOr[DevEndpointNameList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
}

object ListDevEndpointsResponse {
  @scala.inline
  def apply(): ListDevEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevEndpointsResponse]
  }
  @scala.inline
  implicit class ListDevEndpointsResponseOps[Self <: ListDevEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDevEndpointNames(value: DevEndpointNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpointNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDevEndpointNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DevEndpointNames")(js.undefined)
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

