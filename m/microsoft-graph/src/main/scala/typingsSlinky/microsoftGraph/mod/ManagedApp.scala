package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedApp extends MobileApp {
  // The Application's availability. Possible values are: global, lineOfBusiness.
  var appAvailability: js.UndefOr[ManagedAppAvailability] = js.native
  // The Application's version.
  var version: js.UndefOr[String] = js.native
}

object ManagedApp {
  @scala.inline
  def apply(): ManagedApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedApp]
  }
  @scala.inline
  implicit class ManagedAppOps[Self <: ManagedApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppAvailability(value: ManagedAppAvailability): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAvailability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appAvailability")(js.undefined)
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(js.undefined)
        ret
    }
  }
  
}

