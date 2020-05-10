package typingsSlinky.awsSdk.rekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProjectsResponse extends js.Object {
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * A list of project descriptions. The list is sorted by the date and time the projects are created.
    */
  var ProjectDescriptions: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.ProjectDescriptions] = js.native
}

object DescribeProjectsResponse {
  @scala.inline
  def apply(): DescribeProjectsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProjectsResponse]
  }
  @scala.inline
  implicit class DescribeProjectsResponseOps[Self <: DescribeProjectsResponse] (val x: Self) extends AnyVal {
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
    def withProjectDescriptions(value: ProjectDescriptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectDescriptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProjectDescriptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectDescriptions")(js.undefined)
        ret
    }
  }
  
}

