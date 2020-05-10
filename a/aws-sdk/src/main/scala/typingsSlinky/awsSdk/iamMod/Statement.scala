package typingsSlinky.awsSdk.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Statement extends js.Object {
  /**
    * The row and column of the end of a Statement in an IAM policy.
    */
  var EndPosition: js.UndefOr[Position] = js.native
  /**
    * The identifier of the policy that was provided as an input.
    */
  var SourcePolicyId: js.UndefOr[PolicyIdentifierType] = js.native
  /**
    * The type of the policy.
    */
  var SourcePolicyType: js.UndefOr[PolicySourceType] = js.native
  /**
    * The row and column of the beginning of the Statement in an IAM policy.
    */
  var StartPosition: js.UndefOr[Position] = js.native
}

object Statement {
  @scala.inline
  def apply(): Statement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statement]
  }
  @scala.inline
  implicit class StatementOps[Self <: Statement] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePolicyId(value: PolicyIdentifierType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePolicyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePolicyId")(js.undefined)
        ret
    }
    @scala.inline
    def withSourcePolicyType(value: PolicySourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePolicyType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSourcePolicyType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SourcePolicyType")(js.undefined)
        ret
    }
    @scala.inline
    def withStartPosition(value: Position): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartPosition")(js.undefined)
        ret
    }
  }
  
}

