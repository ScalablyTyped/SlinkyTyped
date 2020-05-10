package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkteamResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
    */
  var WorkteamArn: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.WorkteamArn] = js.native
}

object CreateWorkteamResponse {
  @scala.inline
  def apply(): CreateWorkteamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkteamResponse]
  }
  @scala.inline
  implicit class CreateWorkteamResponseOps[Self <: CreateWorkteamResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkteamArn(value: WorkteamArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkteamArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkteamArn")(js.undefined)
        ret
    }
  }
  
}

