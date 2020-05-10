package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded to it: this APK does not reference another APK's Expansion File. The field's
    * value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  /** If set this APK's Expansion File references another APK's Expansion File. The file_size field will not be set. */
  var referencesVersion: js.UndefOr[Double] = js.native
}

object ExpansionFile {
  @scala.inline
  def apply(): ExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpansionFile]
  }
  @scala.inline
  implicit class ExpansionFileOps[Self <: ExpansionFile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSize(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fileSize")(js.undefined)
        ret
    }
    @scala.inline
    def withReferencesVersion(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReferencesVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referencesVersion")(js.undefined)
        ret
    }
  }
  
}

