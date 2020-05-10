package typingsSlinky.pa11y.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchConfig extends js.Object {
  var executablePath: String = js.native
  var ignoreHTTPSErrors: Boolean = js.native
}

object LaunchConfig {
  @scala.inline
  def apply(executablePath: String, ignoreHTTPSErrors: Boolean): LaunchConfig = {
    val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any], ignoreHTTPSErrors = ignoreHTTPSErrors.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfig]
  }
  @scala.inline
  implicit class LaunchConfigOps[Self <: LaunchConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExecutablePath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("executablePath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIgnoreHTTPSErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreHTTPSErrors")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

