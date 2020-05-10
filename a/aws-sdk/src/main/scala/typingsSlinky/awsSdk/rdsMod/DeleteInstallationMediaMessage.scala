package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInstallationMediaMessage extends js.Object {
  /**
    * The installation medium ID.
    */
  var InstallationMediaId: String = js.native
}

object DeleteInstallationMediaMessage {
  @scala.inline
  def apply(InstallationMediaId: String): DeleteInstallationMediaMessage = {
    val __obj = js.Dynamic.literal(InstallationMediaId = InstallationMediaId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstallationMediaMessage]
  }
  @scala.inline
  implicit class DeleteInstallationMediaMessageOps[Self <: DeleteInstallationMediaMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInstallationMediaId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstallationMediaId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

