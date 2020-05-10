package typingsSlinky.googleCloudStorage.bucketMod

import typingsSlinky.googleCloudStorage.fileMod.CreateWriteStreamOptions
import typingsSlinky.googleCloudStorage.fileMod.File
import typingsSlinky.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadOptions extends CreateWriteStreamOptions {
  var destination: js.UndefOr[String | File] = js.native
  var encryptionKey: js.UndefOr[String | Buffer] = js.native
  var kmsKeyName: js.UndefOr[String] = js.native
}

object UploadOptions {
  @scala.inline
  def apply(): UploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadOptions]
  }
  @scala.inline
  implicit class UploadOptionsOps[Self <: UploadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestination(value: String | File): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination")(js.undefined)
        ret
    }
    @scala.inline
    def withEncryptionKey(value: String | Buffer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncryptionKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encryptionKey")(js.undefined)
        ret
    }
    @scala.inline
    def withKmsKeyName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKmsKeyName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kmsKeyName")(js.undefined)
        ret
    }
  }
  
}

