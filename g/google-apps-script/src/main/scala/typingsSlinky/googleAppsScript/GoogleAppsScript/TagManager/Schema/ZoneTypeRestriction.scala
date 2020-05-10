package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ZoneTypeRestriction extends js.Object {
  var enable: js.UndefOr[Boolean] = js.native
  var whitelistedTypeId: js.UndefOr[js.Array[String]] = js.native
}

object ZoneTypeRestriction {
  @scala.inline
  def apply(): ZoneTypeRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ZoneTypeRestriction]
  }
  @scala.inline
  implicit class ZoneTypeRestrictionOps[Self <: ZoneTypeRestriction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEnable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enable")(js.undefined)
        ret
    }
    @scala.inline
    def withWhitelistedTypeId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedTypeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWhitelistedTypeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("whitelistedTypeId")(js.undefined)
        ret
    }
  }
  
}

