package typingsSlinky.gapiClientIdentitytoolkit.gapi.client.identitytoolkit

import typingsSlinky.gapiClientIdentitytoolkit.anon.Index
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadAccountResponse extends js.Object {
  /** The error encountered while processing the account info. */
  var error: js.UndefOr[js.Array[Index]] = js.native
  /** The fixed string "identitytoolkit#UploadAccountResponse". */
  var kind: js.UndefOr[String] = js.native
}

object UploadAccountResponse {
  @scala.inline
  def apply(): UploadAccountResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadAccountResponse]
  }
  @scala.inline
  implicit class UploadAccountResponseOps[Self <: UploadAccountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Array[Index]): Self = {
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

