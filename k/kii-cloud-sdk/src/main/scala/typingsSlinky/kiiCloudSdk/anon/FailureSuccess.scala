package typingsSlinky.kiiCloudSdk.anon

import typingsSlinky.kiiCloudSdk.KiiCloud.KiiAppAdminContext
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiGroup
import typingsSlinky.kiiCloudSdk.KiiCloud.KiiUser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailureSuccess extends js.Object {
  def failure(
    theGroup: KiiGroup,
    anErrorString: String,
    addMembersArray: js.Array[KiiUser],
    removeMembersArray: js.Array[KiiUser]
  ): js.Any = js.native
  def success(adminContext: KiiAppAdminContext): js.Any = js.native
}

object FailureSuccess {
  @scala.inline
  def apply(
    failure: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any,
    success: KiiAppAdminContext => js.Any
  ): FailureSuccess = {
    val __obj = js.Dynamic.literal(failure = js.Any.fromFunction4(failure), success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[FailureSuccess]
  }
  @scala.inline
  implicit class FailureSuccessOps[Self <: FailureSuccess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFailure(value: (KiiGroup, String, js.Array[KiiUser], js.Array[KiiUser]) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("failure")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withSuccess(value: KiiAppAdminContext => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("success")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

