package typingsSlinky.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonPromptToInstall extends js.Object {
  var promptToInstall: js.UndefOr[Boolean] = js.native
  var promptToInstallRefusalMsg: js.UndefOr[String] = js.native
}

object AnonPromptToInstall {
  @scala.inline
  def apply(): AnonPromptToInstall = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonPromptToInstall]
  }
  @scala.inline
  implicit class AnonPromptToInstallOps[Self <: AnonPromptToInstall] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPromptToInstall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptToInstall")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptToInstall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptToInstall")(js.undefined)
        ret
    }
    @scala.inline
    def withPromptToInstallRefusalMsg(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptToInstallRefusalMsg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromptToInstallRefusalMsg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promptToInstallRefusalMsg")(js.undefined)
        ret
    }
  }
  
}

