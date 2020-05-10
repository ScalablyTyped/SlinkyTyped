package typingsSlinky.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserStackAssociationsRequest extends js.Object {
  /**
    * The authentication type for the user who is associated with the stack. You must specify USERPOOL.
    */
  var AuthenticationType: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.AuthenticationType] = js.native
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typingsSlinky.awsSdk.appstreamMod.MaxResults] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: js.UndefOr[String] = js.native
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.native
}

object DescribeUserStackAssociationsRequest {
  @scala.inline
  def apply(): DescribeUserStackAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserStackAssociationsRequest]
  }
  @scala.inline
  implicit class DescribeUserStackAssociationsRequestOps[Self <: DescribeUserStackAssociationsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticationType(value: AuthenticationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthenticationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AuthenticationType")(js.undefined)
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
    def withStackName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStackName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StackName")(js.undefined)
        ret
    }
    @scala.inline
    def withUserName(value: Username): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UserName")(js.undefined)
        ret
    }
  }
  
}

