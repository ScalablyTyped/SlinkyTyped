package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectVersionsResponse extends js.Object {
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * A list of model descriptions. The list is sorted by the creation date and time of the model versions, latest to earliest.
    */
  var ProjectVersionDescriptions: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectVersionDescriptions] = js.native
}

object DescribeProjectVersionsResponse {
  @scala.inline
  def apply(): DescribeProjectVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectVersionsResponse]
  }
  @scala.inline
  implicit class DescribeProjectVersionsResponseOps[Self <: DescribeProjectVersionsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: ExtendedPaginationToken): Self = {
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
    def withProjectVersionDescriptions(value: ProjectVersionDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectVersionDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectVersionDescriptions")(js.undefined)
        ret
    }
  }
  
}

