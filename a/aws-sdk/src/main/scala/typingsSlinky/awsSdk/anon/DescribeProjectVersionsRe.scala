package typingsSlinky.awsSdk.anon

import typingsSlinky.awsSdk.rekognitionMod.ExtendedPaginationToken
import typingsSlinky.awsSdk.rekognitionMod.ProjectArn
import typingsSlinky.awsSdk.rekognitionMod.ProjectVersionsPageSize
import typingsSlinky.awsSdk.rekognitionMod.VersionNames
import typingsSlinky.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/rekognition.DescribeProjectVersionsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeProjectVersionsRe extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100. 
    */
  var MaxResults: js.UndefOr[ProjectVersionsPageSize] = js.native
  /**
    * If the previous response was incomplete (because there is more results to retrieve), Amazon Rekognition Custom Labels returns a pagination token in the response. You can use this pagination token to retrieve the next set of results. 
    */
  var NextToken: js.UndefOr[ExtendedPaginationToken] = js.native
  /**
    * The Amazon Resource Name (ARN) of the project that contains the models you want to describe.
    */
  var ProjectArn: typingsSlinky.awsSdk.rekognitionMod.ProjectArn = js.native
  /**
    * A list of model version names that you want to describe. You can add up to 10 model version names to the list. If you don't specify a value, all model descriptions are returned.
    */
  var VersionNames: js.UndefOr[typingsSlinky.awsSdk.rekognitionMod.VersionNames] = js.native
}

object DescribeProjectVersionsRe {
  @scala.inline
  def apply(ProjectArn: ProjectArn): DescribeProjectVersionsRe = {
    val __obj = js.Dynamic.literal(ProjectArn = ProjectArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProjectVersionsRe]
  }
  @scala.inline
  implicit class DescribeProjectVersionsReOps[Self <: DescribeProjectVersionsRe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProjectArn(value: ProjectArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProjectArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$waiter(value: WaiterConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$waiter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$waiter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: ProjectVersionsPageSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxResults")(js.undefined)
        ret
    }
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
    def withVersionNames(value: VersionNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionNames")(js.undefined)
        ret
    }
  }
  
}

