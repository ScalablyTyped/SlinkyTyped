package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPluginInfo extends js.Object {
  var AssemblyName: String = js.native
  var BridgeClassName: String = js.native
  var Configuration: INamedValues = js.native
  var ConfigurationScope: String = js.native
  var ConfigurationSource: INamedValues = js.native
  var ConfigurationVaultGUID: String = js.native
  var IsDefault: Boolean = js.native
  var IsScopeIndependent: Boolean = js.native
  var Name: String = js.native
  def Clone(): IPluginInfo = js.native
}

object IPluginInfo {
  @scala.inline
  def apply(
    AssemblyName: String,
    BridgeClassName: String,
    Clone: () => IPluginInfo,
    Configuration: INamedValues,
    ConfigurationScope: String,
    ConfigurationSource: INamedValues,
    ConfigurationVaultGUID: String,
    IsDefault: Boolean,
    IsScopeIndependent: Boolean,
    Name: String
  ): IPluginInfo = {
    val __obj = js.Dynamic.literal(AssemblyName = AssemblyName.asInstanceOf[js.Any], BridgeClassName = BridgeClassName.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), Configuration = Configuration.asInstanceOf[js.Any], ConfigurationScope = ConfigurationScope.asInstanceOf[js.Any], ConfigurationSource = ConfigurationSource.asInstanceOf[js.Any], ConfigurationVaultGUID = ConfigurationVaultGUID.asInstanceOf[js.Any], IsDefault = IsDefault.asInstanceOf[js.Any], IsScopeIndependent = IsScopeIndependent.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPluginInfo]
  }
  @scala.inline
  implicit class IPluginInfoOps[Self <: IPluginInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssemblyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssemblyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBridgeClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BridgeClassName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClone(value: () => IPluginInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withConfiguration(value: INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationScope(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationScope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationSource(value: INamedValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigurationVaultGUID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigurationVaultGUID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsDefault(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDefault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsScopeIndependent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsScopeIndependent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

