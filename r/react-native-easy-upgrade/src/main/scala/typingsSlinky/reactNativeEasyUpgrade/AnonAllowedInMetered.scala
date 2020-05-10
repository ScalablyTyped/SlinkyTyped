package typingsSlinky.reactNativeEasyUpgrade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAllowedInMetered extends js.Object {
  var allowedInMetered: js.UndefOr[Boolean] = js.native
  var allowedInRoaming: js.UndefOr[Boolean] = js.native
  var downloadDescription: js.UndefOr[String] = js.native
  var downloadTitle: js.UndefOr[String] = js.native
  var external: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var saveAsName: js.UndefOr[String] = js.native
  var showInDownloads: js.UndefOr[Boolean] = js.native
  var tempDownloadPath: String = js.native
}

object AnonAllowedInMetered {
  @scala.inline
  def apply(tempDownloadPath: String): AnonAllowedInMetered = {
    val __obj = js.Dynamic.literal(tempDownloadPath = tempDownloadPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowedInMetered]
  }
  @scala.inline
  implicit class AnonAllowedInMeteredOps[Self <: AnonAllowedInMetered] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTempDownloadPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tempDownloadPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowedInMetered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInMetered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedInMetered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInMetered")(js.undefined)
        ret
    }
    @scala.inline
    def withAllowedInRoaming(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInRoaming")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowedInRoaming: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowedInRoaming")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withDownloadTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withExternal(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("external")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withSaveAsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSaveAsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("saveAsName")(js.undefined)
        ret
    }
    @scala.inline
    def withShowInDownloads(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInDownloads")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowInDownloads: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showInDownloads")(js.undefined)
        ret
    }
  }
  
}

