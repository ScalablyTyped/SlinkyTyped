package typingsSlinky.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentCanarySettings extends js.Object {
  /**
    * The percentage (0.0-100.0) of traffic routed to the canary deployment.
    */
  var percentTraffic: js.UndefOr[Double] = js.native
  /**
    * A stage variable overrides used for the canary release deployment. They can override existing stage variables or add new stage variables for the canary release deployment. These stage variables are represented as a string-to-string map between stage variable names and their values.
    */
  var stageVariableOverrides: js.UndefOr[MapOfStringToString] = js.native
  /**
    * A Boolean flag to indicate whether the canary release deployment uses the stage cache or not.
    */
  var useStageCache: js.UndefOr[Boolean] = js.native
}

object DeploymentCanarySettings {
  @scala.inline
  def apply(): DeploymentCanarySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentCanarySettings]
  }
  @scala.inline
  implicit class DeploymentCanarySettingsOps[Self <: DeploymentCanarySettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

