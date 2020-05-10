package typingsSlinky.firebaseAuthTypes.mod

import typingsSlinky.firebaseAuthTypes.AnonBundleId
import typingsSlinky.firebaseAuthTypes.AnonInstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionCodeSettings extends js.Object {
  var android: js.UndefOr[AnonInstallApp] = js.native
  var dynamicLinkDomain: js.UndefOr[String] = js.native
  var handleCodeInApp: js.UndefOr[Boolean] = js.native
  var iOS: js.UndefOr[AnonBundleId] = js.native
  var url: String = js.native
}

object ActionCodeSettings {
  @scala.inline
  def apply(url: String): ActionCodeSettings = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeSettings]
  }
  @scala.inline
  implicit class ActionCodeSettingsOps[Self <: ActionCodeSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAndroid(value: AnonInstallApp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAndroid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("android")(js.undefined)
        ret
    }
    @scala.inline
    def withDynamicLinkDomain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkDomain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDynamicLinkDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamicLinkDomain")(js.undefined)
        ret
    }
    @scala.inline
    def withHandleCodeInApp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleCodeInApp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHandleCodeInApp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handleCodeInApp")(js.undefined)
        ret
    }
    @scala.inline
    def withIOS(value: AnonBundleId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIOS: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("iOS")(js.undefined)
        ret
    }
  }
  
}

