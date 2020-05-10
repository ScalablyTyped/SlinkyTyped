package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResourcesOutput extends js.Object {
  /**
    * The NextToken value to include in a subsequent SearchResources request, to get more results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.NextToken] = js.native
  /**
    * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var QueryErrors: js.UndefOr[QueryErrorList] = js.native
  /**
    * The ARNs and resource types of resources that are members of the group that you specified.
    */
  var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.native
}

object SearchResourcesOutput {
  @scala.inline
  def apply(): SearchResourcesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesOutput]
  }
  @scala.inline
  implicit class SearchResourcesOutputOps[Self <: SearchResourcesOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    def withQueryErrors(value: QueryErrorList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQueryErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("QueryErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceIdentifiers(value: ResourceIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceIdentifiers")(js.undefined)
        ret
    }
  }
  
}

