package typingsSlinky.googleapis.cloudfunctionsV1Mod.cloudfunctionsV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request of `GenerateDownloadUrl` method.
  */
@js.native
trait SchemaGenerateDownloadUrlRequest extends js.Object {
  /**
    * The optional version of function. If not set, default, current version is
    * used.
    */
  var versionId: js.UndefOr[String] = js.native
}

object SchemaGenerateDownloadUrlRequest {
  @scala.inline
  def apply(): SchemaGenerateDownloadUrlRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGenerateDownloadUrlRequest]
  }
  @scala.inline
  implicit class SchemaGenerateDownloadUrlRequestOps[Self <: SchemaGenerateDownloadUrlRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

