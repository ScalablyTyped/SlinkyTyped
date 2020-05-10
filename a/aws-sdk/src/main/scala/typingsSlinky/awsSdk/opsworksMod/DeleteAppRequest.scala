package typingsSlinky.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteAppRequest extends js.Object {
  /**
    * The app ID.
    */
  var AppId: String = js.native
}

object DeleteAppRequest {
  @scala.inline
  def apply(AppId: String): DeleteAppRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAppRequest]
  }
  @scala.inline
  implicit class DeleteAppRequestOps[Self <: DeleteAppRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

