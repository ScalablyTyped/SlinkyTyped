package typingsSlinky.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPullRequestOverrideStateOutput extends js.Object {
  /**
    * A Boolean value that indicates whether a pull request has had its rules set aside (TRUE) or whether all approval rules still apply (FALSE).
    */
  var overridden: js.UndefOr[Overridden] = js.native
  /**
    * The Amazon Resource Name (ARN) of the user or identity that overrode the rules and their requirements for the pull request.
    */
  var overrider: js.UndefOr[Arn] = js.native
}

object GetPullRequestOverrideStateOutput {
  @scala.inline
  def apply(): GetPullRequestOverrideStateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestOverrideStateOutput]
  }
  @scala.inline
  implicit class GetPullRequestOverrideStateOutputOps[Self <: GetPullRequestOverrideStateOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOverridden(value: Overridden): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverridden: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overridden")(js.undefined)
        ret
    }
    @scala.inline
    def withOverrider(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverrider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overrider")(js.undefined)
        ret
    }
  }
  
}

