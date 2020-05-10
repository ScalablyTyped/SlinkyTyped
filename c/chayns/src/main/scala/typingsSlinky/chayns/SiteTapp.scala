package typingsSlinky.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Enviroment Variables
  * Site
  * interfaces
  */
@js.native
trait SiteTapp extends js.Object {
  var customUrl: String = js.native
  var id: Double = js.native
  var internalName: String = js.native
  var isExclusiveView: Boolean = js.native
  var isKioskMode: Boolean = js.native
  var isSubTapp: Boolean = js.native
  var showName: String = js.native
  var sortId: Double = js.native
  var userGroupIds: js.Array[Double] = js.native
}

object SiteTapp {
  @scala.inline
  def apply(
    customUrl: String,
    id: Double,
    internalName: String,
    isExclusiveView: Boolean,
    isKioskMode: Boolean,
    isSubTapp: Boolean,
    showName: String,
    sortId: Double,
    userGroupIds: js.Array[Double]
  ): SiteTapp = {
    val __obj = js.Dynamic.literal(customUrl = customUrl.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], internalName = internalName.asInstanceOf[js.Any], isExclusiveView = isExclusiveView.asInstanceOf[js.Any], isKioskMode = isKioskMode.asInstanceOf[js.Any], isSubTapp = isSubTapp.asInstanceOf[js.Any], showName = showName.asInstanceOf[js.Any], sortId = sortId.asInstanceOf[js.Any], userGroupIds = userGroupIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiteTapp]
  }
  @scala.inline
  implicit class SiteTappOps[Self <: SiteTapp] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInternalName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("internalName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsExclusiveView(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isExclusiveView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsKioskMode(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isKioskMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsSubTapp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSubTapp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUserGroupIds(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

