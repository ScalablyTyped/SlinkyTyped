package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanarySettings extends js.Object {
  /**
    * The ID of the canary deployment.
    */
  var deploymentId: js.UndefOr[String] = js.native
  /**
    * The percent (0-100) of traffic diverted to a canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.native
  /**
    * Stage variables overridden for a canary release deployment, including new stage variables introduced in the canary. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A Boolean flag to indicate whether the canary deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.native
}

object CanarySettings {
  @scala.inline
  def apply(): CanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanarySettings]
  }
  @scala.inline
  implicit class CanarySettingsOps[Self <: CanarySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeploymentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeploymentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deploymentId")(js.undefined)
        ret
    }
    @scala.inline
    def withPercentTraffic(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentTraffic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPercentTraffic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("percentTraffic")(js.undefined)
        ret
    }
    @scala.inline
    def withStageVariableOverrides(value: MapOfStringToString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariableOverrides")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStageVariableOverrides: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stageVariableOverrides")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStageCache(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStageCache")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStageCache: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStageCache")(js.undefined)
        ret
    }
  }
  
}

