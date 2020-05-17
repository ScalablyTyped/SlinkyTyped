package typingsSlinky.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Readonly<ionic.ionic/definitions.EnterpriseProjectIntegration>> */
@js.native
trait PartialReadonlyEnterprise extends js.Object {
  var appId: js.UndefOr[String] = js.native
  var enabled: js.UndefOr[Boolean] = js.native
  var keyId: js.UndefOr[Double] = js.native
  var orgId: js.UndefOr[String] = js.native
  var productKey: js.UndefOr[String] = js.native
  var registries: js.UndefOr[js.Array[String]] = js.native
  var root: js.UndefOr[String] = js.native
}

object PartialReadonlyEnterprise {
  @scala.inline
  def apply(): PartialReadonlyEnterprise = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialReadonlyEnterprise]
  }
  @scala.inline
  implicit class PartialReadonlyEnterpriseOps[Self <: PartialReadonlyEnterprise] (val x: Self) extends AnyVal {
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
    def withEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabled")(js.undefined)
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
    @scala.inline
    def withRoot(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRoot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.undefined)
        ret
    }
  }
  
}

