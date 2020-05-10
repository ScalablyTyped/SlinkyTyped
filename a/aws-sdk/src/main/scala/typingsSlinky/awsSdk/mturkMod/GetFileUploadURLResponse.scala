package typingsSlinky.awsSdk.mturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFileUploadURLResponse extends js.Object {
  /**
    *  A temporary URL for the file that the Worker uploaded for the answer. 
    */
  var FileUploadURL: js.UndefOr[String] = js.native
}

object GetFileUploadURLResponse {
  @scala.inline
  def apply(): GetFileUploadURLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFileUploadURLResponse]
  }
  @scala.inline
  implicit class GetFileUploadURLResponseOps[Self <: GetFileUploadURLResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileUploadURL(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileUploadURL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFileUploadURL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileUploadURL")(js.undefined)
        ret
    }
  }
  
}

