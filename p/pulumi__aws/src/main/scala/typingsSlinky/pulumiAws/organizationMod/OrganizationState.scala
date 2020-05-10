package typingsSlinky.pulumiAws.organizationMod

import typingsSlinky.pulumiAws.inputMod.organizations.OrganizationAccount
import typingsSlinky.pulumiAws.inputMod.organizations.OrganizationNonMasterAccount
import typingsSlinky.pulumiAws.inputMod.organizations.OrganizationRoot
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationState extends js.Object {
  /**
    * List of organization accounts including the master account. For a list excluding the master account, see the `nonMasterAccounts` attribute. All elements have these attributes:
    */
  val accounts: js.UndefOr[Input[js.Array[Input[OrganizationAccount]]]] = js.native
  /**
    * ARN of the root
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * List of AWS service principal names for which you want to enable integration with your organization. This is typically in the form of a URL, such as service-abbreviation.amazonaws.com. Organization must have `featureSet` set to `ALL`. For additional information, see the [AWS Organizations User Guide](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_integrate_services.html).
    */
  val awsServiceAccessPrincipals: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * List of Organizations policy types to enable in the Organization Root. Organization must have `featureSet` set to `ALL`. For additional information about valid policy types (e.g. `SERVICE_CONTROL_POLICY` and `TAG_POLICY`), see the [AWS Organizations API Reference](https://docs.aws.amazon.com/organizations/latest/APIReference/API_EnablePolicyType.html).
    */
  val enabledPolicyTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Specify "ALL" (default) or "CONSOLIDATED_BILLING".
    */
  val featureSet: js.UndefOr[Input[String]] = js.native
  /**
    * ARN of the master account
    */
  val masterAccountArn: js.UndefOr[Input[String]] = js.native
  /**
    * Email address of the master account
    */
  val masterAccountEmail: js.UndefOr[Input[String]] = js.native
  /**
    * Identifier of the master account
    */
  val masterAccountId: js.UndefOr[Input[String]] = js.native
  /**
    * List of organization accounts excluding the master account. For a list including the master account, see the `accounts` attribute. All elements have these attributes:
    */
  val nonMasterAccounts: js.UndefOr[Input[js.Array[Input[OrganizationNonMasterAccount]]]] = js.native
  /**
    * List of organization roots. All elements have these attributes:
    */
  val roots: js.UndefOr[Input[js.Array[Input[OrganizationRoot]]]] = js.native
}

object OrganizationState {
  @scala.inline
  def apply(): OrganizationState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationState]
  }
  @scala.inline
  implicit class OrganizationStateOps[Self <: OrganizationState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: Input[js.Array[Input[OrganizationAccount]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
        ret
    }
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
    def withAwsServiceAccessPrincipals(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsServiceAccessPrincipals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAwsServiceAccessPrincipals: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("awsServiceAccessPrincipals")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledPolicyTypes(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledPolicyTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledPolicyTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledPolicyTypes")(js.undefined)
        ret
    }
    @scala.inline
    def withFeatureSet(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFeatureSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureSet")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAccountArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAccountArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountArn")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAccountEmail(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountEmail")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAccountEmail: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountEmail")(js.undefined)
        ret
    }
    @scala.inline
    def withMasterAccountId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMasterAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("masterAccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withNonMasterAccounts(value: Input[js.Array[Input[OrganizationNonMasterAccount]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonMasterAccounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonMasterAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonMasterAccounts")(js.undefined)
        ret
    }
    @scala.inline
    def withRoots(value: Input[js.Array[Input[OrganizationRoot]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("roots")(js.undefined)
        ret
    }
  }
  
}

