package typingsSlinky.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnterpriseProjectIntegration extends ProjectIntegration {
  var appId: js.UndefOr[String] = js.native
  var keyId: js.UndefOr[Double] = js.native
  var orgId: js.UndefOr[String] = js.native
  var productKey: js.UndefOr[String] = js.native
  var registries: js.UndefOr[js.Array[String]] = js.native
}

object EnterpriseProjectIntegration {
  @scala.inline
  def apply(): EnterpriseProjectIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterpriseProjectIntegration]
  }
  @scala.inline
  implicit class EnterpriseProjectIntegrationOps[Self <: EnterpriseProjectIntegration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrgId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrgId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orgId")(js.undefined)
        ret
    }
    @scala.inline
    def withProductKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productKey")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistries(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registries")(js.undefined)
        ret
    }
  }
  
}

