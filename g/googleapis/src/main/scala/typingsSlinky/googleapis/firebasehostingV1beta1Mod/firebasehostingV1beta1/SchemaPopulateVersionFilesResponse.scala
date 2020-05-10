package typingsSlinky.googleapis.firebasehostingV1beta1Mod.firebasehostingV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPopulateVersionFilesResponse extends js.Object {
  /**
    * The content hashes of the specified files that need to be uploaded to the
    * specified endpoint.
    */
  var uploadRequiredHashes: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URL to which the files should be uploaded, in the format:
    * &lt;br&gt;&quot;https://upload-firebasehosting.googleapis.com/upload/sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;/files&quot;.
    * &lt;br&gt;Perform a multipart `POST` of the Gzipped file contents to the
    * URL using a forward slash and the hash of the file appended to the end.
    */
  var uploadUrl: js.UndefOr[String] = js.native
}

object SchemaPopulateVersionFilesResponse {
  @scala.inline
  def apply(): SchemaPopulateVersionFilesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPopulateVersionFilesResponse]
  }
  @scala.inline
  implicit class SchemaPopulateVersionFilesResponseOps[Self <: SchemaPopulateVersionFilesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUploadRequiredHashes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadRequiredHashes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadRequiredHashes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadRequiredHashes")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uploadUrl")(js.undefined)
        ret
    }
  }
  
}

