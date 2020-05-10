package typingsSlinky.gapiClientAndroidpublisher.gapi.client.androidpublisher

import typingsSlinky.gapiClient.gapi.client.Request_
import typingsSlinky.gapiClientAndroidpublisher.AnonDeobfuscationFileType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeobfuscationfilesResource extends js.Object {
  /** Uploads the deobfuscation file of the specified APK. If a deobfuscation file already exists, it will be replaced. */
  def upload(request: AnonDeobfuscationFileType): Request_[DeobfuscationFilesUploadResponse] = js.native
}

object DeobfuscationfilesResource {
  @scala.inline
  def apply(upload: AnonDeobfuscationFileType => Request_[DeobfuscationFilesUploadResponse]): DeobfuscationfilesResource = {
    val __obj = js.Dynamic.literal(upload = js.Any.fromFunction1(upload))
    __obj.asInstanceOf[DeobfuscationfilesResource]
  }
  @scala.inline
  implicit class DeobfuscationfilesResourceOps[Self <: DeobfuscationfilesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUpload(value: AnonDeobfuscationFileType => Request_[DeobfuscationFilesUploadResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upload")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

