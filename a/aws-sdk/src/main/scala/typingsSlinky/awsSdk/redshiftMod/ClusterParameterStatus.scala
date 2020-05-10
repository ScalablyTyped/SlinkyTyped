package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterStatus extends js.Object {
  /**
    * The error that prevented the parameter from being applied to the database.
    */
  var ParameterApplyErrorDescription: js.UndefOr[String] = js.native
  /**
    * The status of the parameter that indicates whether the parameter is in sync with the database, waiting for a cluster reboot, or encountered an error when being applied. The following are possible statuses and descriptions.    in-sync: The parameter value is in sync with the database.    pending-reboot: The parameter value will be applied after the cluster reboots.    applying: The parameter value is being applied to the database.    invalid-parameter: Cannot apply the parameter value because it has an invalid value or syntax.    apply-deferred: The parameter contains static property changes. The changes are deferred until the cluster reboots.    apply-error: Cannot connect to the cluster. The parameter change will be applied after the cluster reboots.    unknown-error: Cannot apply the parameter change right now. The change will be applied after the cluster reboots.  
    */
  var ParameterApplyStatus: js.UndefOr[String] = js.native
  /**
    * The name of the parameter.
    */
  var ParameterName: js.UndefOr[String] = js.native
}

object ClusterParameterStatus {
  @scala.inline
  def apply(): ClusterParameterStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterParameterStatus]
  }
  @scala.inline
  implicit class ClusterParameterStatusOps[Self <: ClusterParameterStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParameterApplyErrorDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyErrorDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyErrorDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyErrorDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterApplyStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterApplyStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterApplyStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withParameterName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParameterName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ParameterName")(js.undefined)
        ret
    }
  }
  
}

