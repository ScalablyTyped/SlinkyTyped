package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeImagePermissionsRequest extends js.Object {
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.MaxResults] = js.native
  /**
    * The name of the private image for which to describe permissions. The image must be one that you own. 
    */
  var Name: typingsSlinky.awsSdk.appstreamMod.Name = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The 12-digit identifier of one or more AWS accounts with which the image is shared.
    */
  var SharedAwsAccountIds: js.UndefOr[AwsAccountIdList] = js.native
}

object DescribeImagePermissionsRequest {
  @scala.inline
  def apply(Name: Name): DescribeImagePermissionsRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeImagePermissionsRequest]
  }
  @scala.inline
  implicit class DescribeImagePermissionsRequestOps[Self <: DescribeImagePermissionsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxResults(value: MaxResults): Self = {
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
    @scala.inline
    def withSharedAwsAccountIds(value: AwsAccountIdList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAwsAccountIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedAwsAccountIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SharedAwsAccountIds")(js.undefined)
        ret
    }
  }
  
}

