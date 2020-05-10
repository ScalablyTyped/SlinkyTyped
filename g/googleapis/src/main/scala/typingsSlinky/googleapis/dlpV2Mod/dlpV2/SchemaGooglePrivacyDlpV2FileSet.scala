package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Set of files to scan.
  */
@js.native
trait SchemaGooglePrivacyDlpV2FileSet extends js.Object {
  /**
    * The regex-filtered set of files to scan. Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var regexFileSet: js.UndefOr[SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet] = js.native
  /**
    * The Cloud Storage url of the file(s) to scan, in the format
    * `gs://&lt;bucket&gt;/&lt;path&gt;`. Trailing wildcard in the path is
    * allowed.  If the url ends in a trailing slash, the bucket or directory
    * represented by the url will be scanned non-recursively (content in
    * sub-directories will not be scanned). This means that `gs://mybucket/` is
    * equivalent to `gs://mybucket/x, and `gs://mybucket/directory/` is
    * equivalent to `gs://mybucket/directory/x.  Exactly one of `url` or
    * `regex_file_set` must be set.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGooglePrivacyDlpV2FileSet {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2FileSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2FileSet]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2FileSetOps[Self <: SchemaGooglePrivacyDlpV2FileSet] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRegexFileSet(value: SchemaGooglePrivacyDlpV2CloudStorageRegexFileSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexFileSet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegexFileSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regexFileSet")(js.undefined)
        ret
    }
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

