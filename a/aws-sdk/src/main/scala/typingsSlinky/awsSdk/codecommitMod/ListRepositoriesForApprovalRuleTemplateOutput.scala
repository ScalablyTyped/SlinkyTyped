package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRepositoriesForApprovalRuleTemplateOutput extends js.Object {
  /**
    * An enumeration token that allows the operation to batch the next results of the operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * A list of repository names that are associated with the specified approval rule template.
    */
  var repositoryNames: js.UndefOr[RepositoryNameList] = js.native
}

object ListRepositoriesForApprovalRuleTemplateOutput {
  @scala.inline
  def apply(): ListRepositoriesForApprovalRuleTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRepositoriesForApprovalRuleTemplateOutput]
  }
  @scala.inline
  implicit class ListRepositoriesForApprovalRuleTemplateOutputOps[Self <: ListRepositoriesForApprovalRuleTemplateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNextToken(value: NextToken): Self = {
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
    @scala.inline
    def withRepositoryNames(value: RepositoryNameList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepositoryNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repositoryNames")(js.undefined)
        ret
    }
  }
  
}

