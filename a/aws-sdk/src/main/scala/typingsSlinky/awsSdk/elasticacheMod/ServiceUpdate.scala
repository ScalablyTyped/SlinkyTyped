package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceUpdate extends js.Object {
  /**
    * Indicates whether the service update will be automatically applied once the recommended apply-by date has expired. 
    */
  var AutoUpdateAfterRecommendedApplyByDate: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Elasticache engine to which the update applies. Either Redis or Memcached
    */
  var Engine: js.UndefOr[String] = js.native
  /**
    * The Elasticache engine version to which the update applies. Either Redis or Memcached engine version
    */
  var EngineVersion: js.UndefOr[String] = js.native
  /**
    * The estimated length of time the service update will take
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.native
  /**
    * Provides details of the service update
    */
  var ServiceUpdateDescription: js.UndefOr[String] = js.native
  /**
    * The date after which the service update is no longer available
    */
  var ServiceUpdateEndDate: js.UndefOr[js.Date] = js.native
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.native
  /**
    * The recommendend date to apply the service update in order to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[js.Date] = js.native
  /**
    * The date when the service update is initially available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[js.Date] = js.native
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateSeverity] = js.native
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateStatus] = js.native
  /**
    * Reflects the nature of the service update
    */
  var ServiceUpdateType: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.ServiceUpdateType] = js.native
}

object ServiceUpdate {
  @scala.inline
  def apply(): ServiceUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceUpdate]
  }
  @scala.inline
  implicit class ServiceUpdateOps[Self <: ServiceUpdate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoUpdateAfterRecommendedApplyByDate(value: BooleanOptional): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoUpdateAfterRecommendedApplyByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoUpdateAfterRecommendedApplyByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoUpdateAfterRecommendedApplyByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEngine(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngine: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Engine")(js.undefined)
        ret
    }
    @scala.inline
    def withEngineVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEngineVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EngineVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedUpdateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateName")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateRecommendedApplyByDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateRecommendedApplyByDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateRecommendedApplyByDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateRecommendedApplyByDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateReleaseDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateReleaseDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateReleaseDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateReleaseDate")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateSeverity(value: ServiceUpdateSeverity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateSeverity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateSeverity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateSeverity")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateStatus(value: ServiceUpdateStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceUpdateType(value: ServiceUpdateType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceUpdateType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceUpdateType")(js.undefined)
        ret
    }
  }
  
}

