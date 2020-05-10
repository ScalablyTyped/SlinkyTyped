package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadSession extends js.Object {
  /**
    * The date and time in UTC that the upload session will expire. The complete file must be uploaded before this expiration
    * time is reached.
    */
  var expirationDateTime: js.UndefOr[String] = js.native
  /**
    * A collection of byte ranges that the server is missing for the file. These ranges are zero indexed and of the format
    * 'start-end' (e.g. '0-26' to indicate the first 27 bytes of the file).
    */
  var nextExpectedRanges: js.UndefOr[js.Array[String]] = js.native
  // The URL endpoint that accepts PUT requests for byte ranges of the file.
  var uploadUrl: js.UndefOr[String] = js.native
}

object UploadSession {
  @scala.inline
  def apply(): UploadSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadSession]
  }
  @scala.inline
  implicit class UploadSessionOps[Self <: UploadSession] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExpirationDateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expirationDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withNextExpectedRanges(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExpectedRanges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextExpectedRanges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextExpectedRanges")(js.undefined)
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

