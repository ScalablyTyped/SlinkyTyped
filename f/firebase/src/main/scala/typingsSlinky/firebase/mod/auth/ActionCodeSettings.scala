package typingsSlinky.firebase.mod.auth

import typingsSlinky.firebase.AnonBundleId
import typingsSlinky.firebase.AnonInstallApp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the interface that defines the required continue/state URL with
  * optional Android and iOS bundle identifiers.
  * The action code setting fields are:
  * <ul>
  * <li><p>url: Sets the link continue/state URL, which has different meanings
  *     in different contexts:</p>
  *     <ul>
  *     <li>When the link is handled in the web action widgets, this is the deep
  *         link in the continueUrl query parameter.</li>
  *     <li>When the link is handled in the app directly, this is the continueUrl
  *         query parameter in the deep link of the Dynamic Link.</li>
  *     </ul>
  *     </li>
  * <li>iOS: Sets the iOS bundle ID. This will try to open the link in an iOS app
  *     if it is installed.</li>
  * <li>android: Sets the Android package name. This will try to open the link in
  *     an android app if it is installed. If installApp is passed, it specifies
  *     whether to install the Android app if the device supports it and the app
  *     is not already installed. If this field is provided without a
  *     packageName, an error is thrown explaining that the packageName must be
  *     provided in conjunction with this field.
  *     If minimumVersion is specified, and an older version of the app is
  *     installed, the user is taken to the Play Store to upgrade the app.</li>
  * <li>handleCodeInApp: The default is false. When set to true, the action code
  *     link will be be sent as a Universal Link or Android App Link and will be
  *     opened by the app if installed. In the false case, the code will be sent
  *     to the web widget first and then on continue will redirect to the app if
  *     installed.</li>
  * </ul>
  */
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

