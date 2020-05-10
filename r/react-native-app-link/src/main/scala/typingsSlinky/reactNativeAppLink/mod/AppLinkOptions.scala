package typingsSlinky.reactNativeAppLink.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppLinkOptions extends js.Object {
  val appName: String = js.native
  val appStoreId: Double = js.native
  val appStoreLocale: String = js.native
  val playStoreId: String = js.native
}

object AppLinkOptions {
  @scala.inline
  def apply(appName: String, appStoreId: Double, appStoreLocale: String, playStoreId: String): AppLinkOptions = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], appStoreId = appStoreId.asInstanceOf[js.Any], appStoreLocale = appStoreLocale.asInstanceOf[js.Any], playStoreId = playStoreId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppLinkOptions]
  }
  @scala.inline
  implicit class AppLinkOptionsOps[Self <: AppLinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppStoreId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAppStoreLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appStoreLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPlayStoreId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("playStoreId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

