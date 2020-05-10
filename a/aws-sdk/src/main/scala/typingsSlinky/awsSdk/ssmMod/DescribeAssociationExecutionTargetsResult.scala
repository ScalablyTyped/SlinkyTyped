package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationExecutionTargetsResult extends js.Object {
  /**
    * Information about the execution.
    */
  var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typingsSlinky.awsSdk.ssmMod.NextToken] = js.native
}

object DescribeAssociationExecutionTargetsResult {
  @scala.inline
  def apply(): DescribeAssociationExecutionTargetsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsResult]
  }
  @scala.inline
  implicit class DescribeAssociationExecutionTargetsResultOps[Self <: DescribeAssociationExecutionTargetsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociationExecutionTargets(value: AssociationExecutionTargetsList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationExecutionTargets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationExecutionTargets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationExecutionTargets")(js.undefined)
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

