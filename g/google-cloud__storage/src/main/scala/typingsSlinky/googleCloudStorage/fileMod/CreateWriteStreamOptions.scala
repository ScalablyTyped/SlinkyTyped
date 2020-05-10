package typingsSlinky.googleCloudStorage.fileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWriteStreamOptions extends CreateResumableUploadOptions {
  var contentType: js.UndefOr[String] = js.native
  var gzip: js.UndefOr[String | Boolean] = js.native
  var resumable: js.UndefOr[Boolean] = js.native
  var validation: js.UndefOr[String | Boolean] = js.native
}

object CreateWriteStreamOptions {
  @scala.inline
  def apply(): CreateWriteStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWriteStreamOptions]
  }
  @scala.inline
  implicit class CreateWriteStreamOptionsOps[Self <: CreateWriteStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentType")(js.undefined)
        ret
    }
    @scala.inline
    def withGzip(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGzip: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gzip")(js.undefined)
        ret
    }
    @scala.inline
    def withResumable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResumable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resumable")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validation")(js.undefined)
        ret
    }
  }
  
}

