package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import typingsSlinky.googleapis.AnonIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Respone of uploading accounts in batch.
  */
@js.native
trait SchemaUploadAccountResponse extends js.Object {
  /**
    * The error encountered while processing the account info.
    */
  var error: js.UndefOr[js.Array[AnonIndex]] = js.native
  /**
    * The fixed string &quot;identitytoolkit#UploadAccountResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaUploadAccountResponse {
  @scala.inline
  def apply(): SchemaUploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUploadAccountResponse]
  }
  @scala.inline
  implicit class SchemaUploadAccountResponseOps[Self <: SchemaUploadAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Array[AnonIndex]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
  }
  
}

