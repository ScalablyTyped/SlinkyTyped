package typingsSlinky.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOriginEndpointsResponse extends js.Object {
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  /**
    * A list of OriginEndpoint records.
    */
  var OriginEndpoints: js.UndefOr[listOfOriginEndpoint] = js.native
}

object ListOriginEndpointsResponse {
  @scala.inline
  def apply(): ListOriginEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginEndpointsResponse]
  }
  @scala.inline
  implicit class ListOriginEndpointsResponseOps[Self <: ListOriginEndpointsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: string): Self = {
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
    @scala.inline
    def withOriginEndpoints(value: listOfOriginEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginEndpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOriginEndpoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OriginEndpoints")(js.undefined)
        ret
    }
  }
  
}

