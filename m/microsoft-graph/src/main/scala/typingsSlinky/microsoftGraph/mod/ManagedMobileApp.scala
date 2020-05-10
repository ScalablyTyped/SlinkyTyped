package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ManagedMobileApp extends Entity {
  // The identifier for an app with it's operating system type.
  var mobileAppIdentifier: js.UndefOr[MobileAppIdentifier] = js.native
  // Version of the entity.
  var version: js.UndefOr[String] = js.native
}

object ManagedMobileApp {
  @scala.inline
  def apply(): ManagedMobileApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedMobileApp]
  }
  @scala.inline
  implicit class ManagedMobileAppOps[Self <: ManagedMobileApp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMobileAppIdentifier(value: MobileAppIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobileAppIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobileAppIdentifier")(js.undefined)
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

