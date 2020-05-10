package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListEndpointsOutput extends js.Object {
  /**
    *  An array or endpoint objects. 
    */
  var Endpoints: EndpointSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of training jobs, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListEndpointsOutput {
  @scala.inline
  def apply(Endpoints: EndpointSummaryList): ListEndpointsOutput = {
    val __obj = js.Dynamic.literal(Endpoints = Endpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListEndpointsOutput]
  }
  @scala.inline
  implicit class ListEndpointsOutputOps[Self <: ListEndpointsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoints(value: EndpointSummaryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
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

