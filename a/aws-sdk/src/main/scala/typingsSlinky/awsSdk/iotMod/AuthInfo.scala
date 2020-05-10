package typingsSlinky.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthInfo extends js.Object {
  /**
    * The type of action for which the principal is being authorized.
    */
  var actionType: js.UndefOr[ActionType] = js.native
  /**
    * The resources for which the principal is being authorized to perform the specified action.
    */
  var resources: js.UndefOr[Resources] = js.native
}

object AuthInfo {
  @scala.inline
  def apply(): AuthInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthInfo]
  }
  @scala.inline
  implicit class AuthInfoOps[Self <: AuthInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionType(value: ActionType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionType")(js.undefined)
        ret
    }
    @scala.inline
    def withResources(value: Resources): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResources: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resources")(js.undefined)
        ret
    }
  }
  
}

