package typingsSlinky.azureArmResource.subscriptionModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TenantIdDescription extends js.Object {
  /**
    * The fully qualified ID of the tenant. For example,
    * /tenants/00000000-0000-0000-0000-000000000000.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The tenant ID. For example, 00000000-0000-0000-0000-000000000000.
    */
  val tenantId: js.UndefOr[String] = js.native
}

object TenantIdDescription {
  @scala.inline
  def apply(): TenantIdDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TenantIdDescription]
  }
  @scala.inline
  implicit class TenantIdDescriptionOps[Self <: TenantIdDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: String): Self = {
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
    def withTenantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantId")(js.undefined)
        ret
    }
  }
  
}

