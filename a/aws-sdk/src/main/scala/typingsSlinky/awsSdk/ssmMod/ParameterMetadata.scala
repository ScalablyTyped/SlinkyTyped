package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParameterMetadata extends js.Object {
  /**
    * A parameter name can include only the following letters and symbols. a-zA-Z0-9_.-
    */
  var AllowedPattern: js.UndefOr[typingsSlinky.awsSdk.ssmMod.AllowedPattern] = js.native
  /**
    * Description of the parameter actions.
    */
  var Description: js.UndefOr[ParameterDescription] = js.native
  /**
    * The ID of the query key used for this parameter.
    */
  var KeyId: js.UndefOr[ParameterKeyId] = js.native
  /**
    * Date the parameter was last changed or updated.
    */
  var LastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS user who last changed the parameter.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  /**
    * The parameter name.
    */
  var Name: js.UndefOr[PSParameterName] = js.native
  /**
    * A list of policies associated with a parameter.
    */
  var Policies: js.UndefOr[ParameterPolicyList] = js.native
  /**
    * The parameter tier.
    */
  var Tier: js.UndefOr[ParameterTier] = js.native
  /**
    * The type of parameter. Valid parameter types include the following: String, String list, Secure string.
    */
  var Type: js.UndefOr[ParameterType] = js.native
  /**
    * The parameter version.
    */
  var Version: js.UndefOr[PSParameterVersion] = js.native
}

object ParameterMetadata {
  @scala.inline
  def apply(): ParameterMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterMetadata]
  }
  @scala.inline
  implicit class ParameterMetadataOps[Self <: ParameterMetadata] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowedPattern(value: AllowedPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedPattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedPattern: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllowedPattern")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: ParameterDescription): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Description")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: ParameterKeyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyId")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withLastModifiedUser(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedUser")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedUser: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedUser")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: PSParameterName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicies(value: ParameterPolicyList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicies: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Policies")(js.undefined)
        ret
    }
    @scala.inline
    def withTier(value: ParameterTier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tier")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: ParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: PSParameterVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Version")(js.undefined)
        ret
    }
  }
  
}

