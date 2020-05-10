package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetExternalModelsRequest extends js.Object {
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[ExternalModelsMaxResults] = js.native
  /**
    * The Amazon SageMaker model endpoint.
    */
  var modelEndpoint: js.UndefOr[String] = js.native
  /**
    * The next page token for the request.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object GetExternalModelsRequest {
  @scala.inline
  def apply(): GetExternalModelsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExternalModelsRequest]
  }
  @scala.inline
  implicit class GetExternalModelsRequestOps[Self <: GetExternalModelsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxResults(value: ExternalModelsMaxResults): Self = {
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
    def withModelEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEndpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
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
  }
  
}

