package typingsSlinky.googleapis.serviceconsumermanagementV1Mod.serviceconsumermanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Representation of a tenancy unit.
  */
@js.native
trait SchemaTenancyUnit extends js.Object {
  /**
    * @OutputOnly Cloud resource name of the consumer of this service. For
    * example &#39;projects/123456&#39;.
    */
  var consumer: js.UndefOr[String] = js.native
  /**
    * @OutputOnly The time this tenancy unit was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Globally unique identifier of this tenancy unit
    * &quot;services/{service}/{collection id}/{resource
    * id}/tenancyUnits/{unit}&quot;
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Output only. Google Cloud API name of the managed service owning this
    * tenancy unit. For example
    * &#39;serviceconsumermanagement.googleapis.com&#39;.
    */
  var service: js.UndefOr[String] = js.native
  /**
    * Resources constituting the tenancy unit. There can be at most 512 tenant
    * resources in a tenancy unit.
    */
  var tenantResources: js.UndefOr[js.Array[SchemaTenantResource]] = js.native
}

object SchemaTenancyUnit {
  @scala.inline
  def apply(): SchemaTenancyUnit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTenancyUnit]
  }
  @scala.inline
  implicit class SchemaTenancyUnitOps[Self <: SchemaTenancyUnit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withService(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutService: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("service")(js.undefined)
        ret
    }
    @scala.inline
    def withTenantResources(value: js.Array[SchemaTenantResource]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantResources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTenantResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tenantResources")(js.undefined)
        ret
    }
  }
  
}

