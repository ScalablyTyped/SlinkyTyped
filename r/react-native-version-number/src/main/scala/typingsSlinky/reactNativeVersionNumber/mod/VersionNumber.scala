package typingsSlinky.reactNativeVersionNumber.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VersionNumber extends js.Object {
  var appVersion: js.UndefOr[String] = js.native
  var buildVersion: js.UndefOr[String] = js.native
  var bundleIdentifier: js.UndefOr[String] = js.native
}

object VersionNumber {
  @scala.inline
  def apply(): VersionNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VersionNumber]
  }
  @scala.inline
  implicit class VersionNumberOps[Self <: VersionNumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBuildVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuildVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buildVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withBundleIdentifier(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBundleIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bundleIdentifier")(js.undefined)
        ret
    }
  }
  
}

