package typingsSlinky.pulumiAws.organizationMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrganizationArgs extends js.Object {
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
}

object OrganizationArgs {
  @scala.inline
  def apply(): OrganizationArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationArgs]
  }
  @scala.inline
  implicit class OrganizationArgsOps[Self <: OrganizationArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

