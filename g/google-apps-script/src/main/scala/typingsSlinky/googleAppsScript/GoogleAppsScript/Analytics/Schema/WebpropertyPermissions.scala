package typingsSlinky.googleAppsScript.GoogleAppsScript.Analytics.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebpropertyPermissions extends js.Object {
  var effective: js.UndefOr[js.Array[String]] = js.native
}

object WebpropertyPermissions {
  @scala.inline
  def apply(): WebpropertyPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebpropertyPermissions]
  }
  @scala.inline
  implicit class WebpropertyPermissionsOps[Self <: WebpropertyPermissions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEffective(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffective: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effective")(js.undefined)
        ret
    }
  }
  
}

