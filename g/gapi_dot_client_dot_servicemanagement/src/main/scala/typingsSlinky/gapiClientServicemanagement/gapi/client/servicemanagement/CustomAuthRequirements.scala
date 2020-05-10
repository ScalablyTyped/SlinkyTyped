package typingsSlinky.gapiClientServicemanagement.gapi.client.servicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomAuthRequirements extends js.Object {
  /**
    * A configuration string containing connection information for the
    * authentication provider, typically formatted as a SmartService string
    * (go/smartservice).
    */
  var provider: js.UndefOr[String] = js.native
}

object CustomAuthRequirements {
  @scala.inline
  def apply(): CustomAuthRequirements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomAuthRequirements]
  }
  @scala.inline
  implicit class CustomAuthRequirementsOps[Self <: CustomAuthRequirements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProvider(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
  }
  
}

