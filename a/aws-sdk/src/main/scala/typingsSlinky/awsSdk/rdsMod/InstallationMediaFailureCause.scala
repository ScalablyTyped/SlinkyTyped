package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallationMediaFailureCause extends js.Object {
  /**
    * The reason that an installation media import failed.
    */
  var Message: js.UndefOr[String] = js.native
}

object InstallationMediaFailureCause {
  @scala.inline
  def apply(): InstallationMediaFailureCause = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallationMediaFailureCause]
  }
  @scala.inline
  implicit class InstallationMediaFailureCauseOps[Self <: InstallationMediaFailureCause] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
  }
  
}

