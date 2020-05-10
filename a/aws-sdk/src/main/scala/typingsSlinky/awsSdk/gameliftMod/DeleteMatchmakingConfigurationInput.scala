package typingsSlinky.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteMatchmakingConfigurationInput extends js.Object {
  /**
    * A unique identifier for a matchmaking configuration. You can use either the configuration name or ARN value.
    */
  var Name: MatchmakingConfigurationName = js.native
}

object DeleteMatchmakingConfigurationInput {
  @scala.inline
  def apply(Name: MatchmakingConfigurationName): DeleteMatchmakingConfigurationInput = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMatchmakingConfigurationInput]
  }
  @scala.inline
  implicit class DeleteMatchmakingConfigurationInputOps[Self <: DeleteMatchmakingConfigurationInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: MatchmakingConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

