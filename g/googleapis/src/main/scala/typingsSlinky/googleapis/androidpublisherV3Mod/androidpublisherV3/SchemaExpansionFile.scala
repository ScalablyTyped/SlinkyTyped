package typingsSlinky.googleapis.androidpublisherV3Mod.androidpublisherV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaExpansionFile extends js.Object {
  /**
    * If set this field indicates that this APK has an Expansion File uploaded
    * to it: this APK does not reference another APK&#39;s Expansion File. The
    * field&#39;s value is the size of the uploaded Expansion File in bytes.
    */
  var fileSize: js.UndefOr[String] = js.native
  /**
    * If set this APK&#39;s Expansion File references another APK&#39;s
    * Expansion File. The file_size field will not be set.
    */
  var referencesVersion: js.UndefOr[Double] = js.native
}

object SchemaExpansionFile {
  @scala.inline
  def apply(): SchemaExpansionFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaExpansionFile]
  }
  @scala.inline
  implicit class SchemaExpansionFileOps[Self <: SchemaExpansionFile] (val x: Self) extends AnyVal {
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

