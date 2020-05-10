package typingsSlinky.googleapis.servicemanagementV1Mod.servicemanagementV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A rollout resource that defines how service configuration versions are
  * pushed to control plane systems. Typically, you create a new version of the
  * service config, and then create a Rollout to push the service config.
  */
@js.native
trait SchemaRollout extends js.Object {
  /**
    * Creation time of the rollout. Readonly.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * The user who created the Rollout. Readonly.
    */
  var createdBy: js.UndefOr[String] = js.native
  /**
    * The strategy associated with a rollout to delete a `ManagedService`.
    * Readonly.
    */
  var deleteServiceStrategy: js.UndefOr[SchemaDeleteServiceStrategy] = js.native
  /**
    * Optional unique identifier of this Rollout. Only lower case letters,
    * digits  and &#39;-&#39; are allowed.  If not specified by client, the
    * server will generate one. The generated id will have the form of
    * &lt;date&gt;&lt;revision number&gt;, where &quot;date&quot; is the create
    * date in ISO 8601 format.  &quot;revision number&quot; is a monotonically
    * increasing positive number that is reset every day for each service. An
    * example of the generated rollout_id is &#39;2016-02-16r1&#39;
    */
  var rolloutId: js.UndefOr[String] = js.native
  /**
    * The name of the service associated with this Rollout.
    */
  var serviceName: js.UndefOr[String] = js.native
  /**
    * The status of this rollout. Readonly. In case of a failed rollout, the
    * system will automatically rollback to the current Rollout version.
    * Readonly.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Google Service Control selects service configurations based on traffic
    * percentage.
    */
  var trafficPercentStrategy: js.UndefOr[SchemaTrafficPercentStrategy] = js.native
}

object SchemaRollout {
  @scala.inline
  def apply(): SchemaRollout = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRollout]
  }
  @scala.inline
  implicit class SchemaRolloutOps[Self <: SchemaRollout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCreatedBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatedBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdBy")(js.undefined)
        ret
    }
    @scala.inline
    def withDeleteServiceStrategy(value: SchemaDeleteServiceStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteServiceStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeleteServiceStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deleteServiceStrategy")(js.undefined)
        ret
    }
    @scala.inline
    def withRolloutId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRolloutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rolloutId")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTrafficPercentStrategy(value: SchemaTrafficPercentStrategy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficPercentStrategy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrafficPercentStrategy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trafficPercentStrategy")(js.undefined)
        ret
    }
  }
  
}

