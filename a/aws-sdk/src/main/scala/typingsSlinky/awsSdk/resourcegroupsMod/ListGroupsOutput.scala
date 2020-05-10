package typingsSlinky.awsSdk.resourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupsOutput extends js.Object {
  /**
    * A list of GroupIdentifier objects. Each identifier is an object that contains both the GroupName and the GroupArn.
    */
  var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * A list of resource groups.
    */
  var Groups: js.UndefOr[GroupList] = js.native
  /**
    * The NextToken value to include in a subsequent ListGroups request, to get more results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.resourcegroupsMod.NextToken] = js.native
}

object ListGroupsOutput {
  @scala.inline
  def apply(): ListGroupsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGroupsOutput]
  }
  @scala.inline
  implicit class ListGroupsOutputOps[Self <: ListGroupsOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGroupIdentifiers(value: GroupIdentifierList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIdentifiers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupIdentifiers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupIdentifiers")(js.undefined)
        ret
    }
    @scala.inline
    def withGroups(value: GroupList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
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
  }
  
}

