package typingsSlinky.awsSdk.wafv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRegexPatternSetRequest extends js.Object {
  /**
    * A friendly description of the set. You cannot change the description of a set after you create it.
    */
  var Description: js.UndefOr[EntityDescription] = js.native
  /**
    * A friendly name of the set. You cannot change the name after you create the set.
    */
  var Name: EntityName = js.native
  /**
    * Array of regular expression strings. 
    */
  var RegularExpressionList: typingsSlinky.awsSdk.wafv2Mod.RegularExpressionList = js.native
  /**
    * Specifies whether this is for an AWS CloudFront distribution or for a regional application. A regional application can be an Application Load Balancer (ALB) or an API Gateway stage.  To work with CloudFront, you must also specify the Region US East (N. Virginia) as follows:    CLI - Specify the region when you use the CloudFront scope: --scope=CLOUDFRONT --region=us-east-1.    API and SDKs - For all calls, use the Region endpoint us-east-1.   
    */
  var Scope: typingsSlinky.awsSdk.wafv2Mod.Scope = js.native
  /**
    * An array of key:value pairs to associate with the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object CreateRegexPatternSetRequest {
  @scala.inline
  def apply(Name: EntityName, RegularExpressionList: RegularExpressionList, Scope: Scope): CreateRegexPatternSetRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], RegularExpressionList = RegularExpressionList.asInstanceOf[js.Any], Scope = Scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRegexPatternSetRequest]
  }
  @scala.inline
  implicit class CreateRegexPatternSetRequestOps[Self <: CreateRegexPatternSetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: EntityName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegularExpressionList(value: RegularExpressionList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RegularExpressionList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScope(value: Scope): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDescription(value: EntityDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
  }
  
}

