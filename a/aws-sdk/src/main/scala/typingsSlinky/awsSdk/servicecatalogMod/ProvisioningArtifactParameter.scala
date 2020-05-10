package typingsSlinky.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningArtifactParameter extends js.Object {
  /**
    * The default value.
    */
  var DefaultValue: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.DefaultValue] = js.native
  /**
    * The description of the parameter.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.Description] = js.native
  /**
    * If this value is true, the value for this parameter is obfuscated from view when the parameter is retrieved. This parameter is used to hide sensitive information.
    */
  var IsNoEcho: js.UndefOr[NoEcho] = js.native
  /**
    * Constraints that the administrator has put on a parameter.
    */
  var ParameterConstraints: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ParameterConstraints] = js.native
  /**
    * The parameter key.
    */
  var ParameterKey: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ParameterKey] = js.native
  /**
    * The parameter type.
    */
  var ParameterType: js.UndefOr[typingsSlinky.awsSdk.servicecatalogMod.ParameterType] = js.native
}

object ProvisioningArtifactParameter {
  @scala.inline
  def apply(): ProvisioningArtifactParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningArtifactParameter]
  }
  @scala.inline
  implicit class ProvisioningArtifactParameterOps[Self <: ProvisioningArtifactParameter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDefaultValue(value: DefaultValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Description): Self = {
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
    def withIsNoEcho(value: NoEcho): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNoEcho")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsNoEcho: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsNoEcho")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterConstraints(value: ParameterConstraints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterConstraints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterConstraints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterConstraints")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterKey(value: ParameterKey): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterKey")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterType(value: ParameterType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterType")(js.undefined)
        ret
    }
  }
  
}

