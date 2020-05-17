package typingsSlinky.firebase.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Appid
  extends /* key */ StringDictionary[js.Any] {
  var app_id: js.UndefOr[String] = js.native
  var app_installer_id: js.UndefOr[String] = js.native
  var app_name: String = js.native
  var app_version: js.UndefOr[String] = js.native
  var screen_name: js.UndefOr[String] = js.native
}

object Appid {
  @scala.inline
  def apply(app_name: String): Appid = {
    val __obj = js.Dynamic.literal(app_name = app_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Appid]
  }
  @scala.inline
  implicit class AppidOps[Self <: Appid] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApp_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withApp_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_id")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_installer_id(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_installer_id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_installer_id: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_installer_id")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_version(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_version: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_version")(js.undefined)
        ret
    }
    @scala.inline
    def withScreen_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScreen_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("screen_name")(js.undefined)
        ret
    }
  }
  
}

