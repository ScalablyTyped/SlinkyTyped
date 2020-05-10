package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message representing a set of files in Cloud Storage.
  */
@js.native
trait SchemaGooglePrivacyDlpV2CloudStorageFileSet extends js.Object {
  /**
    * The url, in the format `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing
    * wildcard in the path is allowed.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2CloudStorageFileSet {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2CloudStorageFileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2CloudStorageFileSet]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2CloudStorageFileSetOps[Self <: SchemaGooglePrivacyDlpV2CloudStorageFileSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

