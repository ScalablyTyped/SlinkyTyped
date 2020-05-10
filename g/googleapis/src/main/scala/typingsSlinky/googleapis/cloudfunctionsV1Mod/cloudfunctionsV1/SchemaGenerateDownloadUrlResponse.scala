package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlResponse extends js.Object {
  /**
    * The generated Google Cloud Storage signed URL that should be used for
    * function source code download.
    */
  var downloadUrl: js.UndefOr[String] = js.native
}

object SchemaGenerateDownloadUrlResponse {
  @scala.inline
  def apply(): SchemaGenerateDownloadUrlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlResponse]
  }
  @scala.inline
  implicit class SchemaGenerateDownloadUrlResponseOps[Self <: SchemaGenerateDownloadUrlResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDownloadUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDownloadUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("downloadUrl")(js.undefined)
        ret
    }
  }
  
}

