package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceDiskVolumeReportsVolumeInfo extends js.Object {
  var storageFree: js.UndefOr[String] = js.native
  var storageTotal: js.UndefOr[String] = js.native
  var volumeId: js.UndefOr[String] = js.native
}

object ChromeOsDeviceDiskVolumeReportsVolumeInfo {
  @scala.inline
  def apply(): ChromeOsDeviceDiskVolumeReportsVolumeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReportsVolumeInfo]
  }
  @scala.inline
  implicit class ChromeOsDeviceDiskVolumeReportsVolumeInfoOps[Self <: ChromeOsDeviceDiskVolumeReportsVolumeInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withStorageFree(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageFree")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageFree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageFree")(js.undefined)
        ret
    }
    @scala.inline
    def withStorageTotal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageTotal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStorageTotal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("storageTotal")(js.undefined)
        ret
    }
    @scala.inline
    def withVolumeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVolumeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("volumeId")(js.undefined)
        ret
    }
  }
  
}

