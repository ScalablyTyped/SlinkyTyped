package typingsSlinky.reactNativeVersionCheck.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppID extends js.Object {
  /**
    * App ID
    */
  var appID: js.UndefOr[String] = js.native
  var appName: js.UndefOr[String] = js.native
  /**
    * @default true
    */
  var ignoreErrors: js.UndefOr[Boolean] = js.native
}

object AppID {
  @scala.inline
  def apply(): AppID = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppID]
  }
  @scala.inline
  implicit class AppIDOps[Self <: AppID] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppID(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appID")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppID: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appID")(js.undefined)
        ret
    }
    @scala.inline
    def withAppName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appName")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreErrors(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreErrors")(js.undefined)
        ret
    }
  }
  
}

