package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateMatchmakingConfigurationOutput extends js.Object {
  /**
    * The updated matchmaking configuration.
    */
  var Configuration: js.UndefOr[MatchmakingConfiguration] = js.native
}

object UpdateMatchmakingConfigurationOutput {
  @scala.inline
  def apply(): UpdateMatchmakingConfigurationOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMatchmakingConfigurationOutput]
  }
  @scala.inline
  implicit class UpdateMatchmakingConfigurationOutputOps[Self <: UpdateMatchmakingConfigurationOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfiguration(value: MatchmakingConfiguration): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfiguration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Configuration")(js.undefined)
        ret
    }
  }
  
}

