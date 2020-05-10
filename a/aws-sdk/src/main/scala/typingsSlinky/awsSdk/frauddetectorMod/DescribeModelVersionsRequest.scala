package typingsSlinky.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeModelVersionsRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The model ID.
    */
  var modelId: js.UndefOr[identifier] = js.native
  /**
    * The model type.
    */
  var modelType: js.UndefOr[ModelTypeEnum] = js.native
  /**
    * The model version. 
    */
  var modelVersionNumber: js.UndefOr[nonEmptyString] = js.native
  /**
    * The next token from the previous results.
    */
  var nextToken: js.UndefOr[String] = js.native
}

object DescribeModelVersionsRequest {
  @scala.inline
  def apply(): DescribeModelVersionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeModelVersionsRequest]
  }
  @scala.inline
  implicit class DescribeModelVersionsRequestOps[Self <: DescribeModelVersionsRequest] (val x: Self) extends AnyVal {
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
    def withModelId(value: identifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelId")(js.undefined)
        ret
    }
    @scala.inline
    def withModelType(value: ModelTypeEnum): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelType")(js.undefined)
        ret
    }
    @scala.inline
    def withModelVersionNumber(value: nonEmptyString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelVersionNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelVersionNumber")(js.undefined)
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

