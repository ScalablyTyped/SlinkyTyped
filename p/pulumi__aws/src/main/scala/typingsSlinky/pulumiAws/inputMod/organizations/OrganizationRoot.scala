package typingsSlinky.pulumiAws.inputMod.organizations

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationRoot extends js.Object {
  /**
    * ARN of the root
    */
  var arn: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the root
    */
  var id: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the policy type
    */
  var name: js.UndefOr[Input[String]] = js.native
  /**
    * List of policy types enabled for this root. All elements have these attributes:
    */
  var policyTypes: js.UndefOr[Input[js.Array[Input[OrganizationRootPolicyType]]]] = js.native
}

object OrganizationRoot {
  @scala.inline
  def apply(): OrganizationRoot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationRoot]
  }
  @scala.inline
  implicit class OrganizationRootOps[Self <: OrganizationRoot] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyTypes(value: Input[js.Array[Input[OrganizationRootPolicyType]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policyTypes")(js.undefined)
        ret
    }
  }
  
}

