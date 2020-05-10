package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IObjectVersionAndProperties extends js.Object {
  val ObjVer: IObjVer = js.native
  val Properties: IPropertyValues = js.native
  val Vault: IVault = js.native
  val VersionData: IObjectVersion = js.native
  def Clone(): IObjectVersionAndProperties = js.native
}

object IObjectVersionAndProperties {
  @scala.inline
  def apply(
    Clone: () => IObjectVersionAndProperties,
    ObjVer: IObjVer,
    Properties: IPropertyValues,
    Vault: IVault,
    VersionData: IObjectVersion
  ): IObjectVersionAndProperties = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), ObjVer = ObjVer.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Vault = Vault.asInstanceOf[js.Any], VersionData = VersionData.asInstanceOf[js.Any])
    __obj.asInstanceOf[IObjectVersionAndProperties]
  }
  @scala.inline
  implicit class IObjectVersionAndPropertiesOps[Self <: IObjectVersionAndProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClone(value: () => IObjectVersionAndProperties): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clone")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withObjVer(value: IObjVer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ObjVer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperties(value: IPropertyValues): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVault(value: IVault): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Vault")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersionData(value: IObjectVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VersionData")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

