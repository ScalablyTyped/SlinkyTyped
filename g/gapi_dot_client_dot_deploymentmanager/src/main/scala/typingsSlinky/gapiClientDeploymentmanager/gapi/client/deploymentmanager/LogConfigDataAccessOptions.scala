package typingsSlinky.gapiClientDeploymentmanager.gapi.client.deploymentmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LogConfigDataAccessOptions extends js.Object {
  /** Whether Gin logging should happen in a fail-closed manner at the caller. This is relevant only in the LocalIAM implementation, for now. */
  var logMode: js.UndefOr[String] = js.native
}

object LogConfigDataAccessOptions {
  @scala.inline
  def apply(): LogConfigDataAccessOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigDataAccessOptions]
  }
  @scala.inline
  implicit class LogConfigDataAccessOptionsOps[Self <: LogConfigDataAccessOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLogMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logMode")(js.undefined)
        ret
    }
  }
  
}

