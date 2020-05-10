package typingsSlinky.googleapis.v2Mod.androidpublisherV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDeobfuscationFilesUploadResponse extends js.Object {
  var deobfuscationFile: js.UndefOr[SchemaDeobfuscationFile] = js.native
}

object SchemaDeobfuscationFilesUploadResponse {
  @scala.inline
  def apply(): SchemaDeobfuscationFilesUploadResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeobfuscationFilesUploadResponse]
  }
  @scala.inline
  implicit class SchemaDeobfuscationFilesUploadResponseOps[Self <: SchemaDeobfuscationFilesUploadResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeobfuscationFile(value: SchemaDeobfuscationFile): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deobfuscationFile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeobfuscationFile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deobfuscationFile")(js.undefined)
        ret
    }
  }
  
}

