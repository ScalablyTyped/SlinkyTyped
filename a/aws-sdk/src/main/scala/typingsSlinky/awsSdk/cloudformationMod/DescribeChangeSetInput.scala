package typingsSlinky.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
    */
  var ChangeSetName: ChangeSetNameOrId = js.native
  /**
    * A string (provided by the DescribeChangeSet response output) that identifies the next page of information that you want to retrieve.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.cloudformationMod.NextToken] = js.native
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to describe.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.native
}

object DescribeChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId): DescribeChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeChangeSetInput]
  }
  @scala.inline
  implicit class DescribeChangeSetInputOps[Self <: DescribeChangeSetInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChangeSetName(value: ChangeSetNameOrId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ChangeSetName")(value.asInstanceOf[js.Any])
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
    @scala.inline
    def withStackName(value: StackNameOrId): Self = {
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
  }
  
}

