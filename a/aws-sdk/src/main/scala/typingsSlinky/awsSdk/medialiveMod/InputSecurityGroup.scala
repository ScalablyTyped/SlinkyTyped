package typingsSlinky.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSecurityGroup extends js.Object {
  /**
    * Unique ARN of Input Security Group
    */
  var Arn: js.UndefOr[string] = js.native
  /**
    * The Id of the Input Security Group
    */
  var Id: js.UndefOr[string] = js.native
  /**
    * The list of inputs currently using this Input Security Group.
    */
  var Inputs: js.UndefOr[listOfString] = js.native
  /**
    * The current state of the Input Security Group.
    */
  var State: js.UndefOr[InputSecurityGroupState] = js.native
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typingsSlinky.awsSdk.medialiveMod.Tags] = js.native
  /**
    * Whitelist rules and their sync status
    */
  var WhitelistRules: js.UndefOr[listOfInputWhitelistRule] = js.native
}

object InputSecurityGroup {
  @scala.inline
  def apply(): InputSecurityGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputSecurityGroup]
  }
  @scala.inline
  implicit class InputSecurityGroupOps[Self <: InputSecurityGroup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: string): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: listOfString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: InputSecurityGroupState): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Tags): Self = {
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
    @scala.inline
    def withWhitelistRules(value: listOfInputWhitelistRule): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WhitelistRules")(js.undefined)
        ret
    }
  }
  
}

