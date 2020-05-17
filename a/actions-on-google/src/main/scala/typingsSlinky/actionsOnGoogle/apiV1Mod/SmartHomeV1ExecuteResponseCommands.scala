package typingsSlinky.actionsOnGoogle.apiV1Mod

import typingsSlinky.actionsOnGoogle.anon.TypeChallengeType
import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartHomeV1ExecuteResponseCommands extends js.Object {
  var challengeNeeded: js.UndefOr[TypeChallengeType] = js.native
  var debugString: js.UndefOr[String] = js.native
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.native
  var ids: js.Array[String] = js.native
  var states: js.UndefOr[ApiClientObjectMap[_]] = js.native
  var status: SmartHomeV1ExecuteStatus = js.native
}

object SmartHomeV1ExecuteResponseCommands {
  @scala.inline
  def apply(ids: js.Array[String], status: SmartHomeV1ExecuteStatus): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
  @scala.inline
  implicit class SmartHomeV1ExecuteResponseCommandsOps[Self <: SmartHomeV1ExecuteResponseCommands] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ids")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: SmartHomeV1ExecuteStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withChallengeNeeded(value: TypeChallengeType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeNeeded")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChallengeNeeded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("challengeNeeded")(js.undefined)
        ret
    }
    @scala.inline
    def withDebugString(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebugString: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debugString")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorCode(value: SmartHomeV1ExecuteErrors): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("errorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withStates(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(js.undefined)
        ret
    }
  }
  
}

