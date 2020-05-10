package typingsSlinky.googleCloudStorage.fileMod

import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`false`
import typingsSlinky.googleCloudStorage.googleCloudStorageBooleans.`true`
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.crc32c
import typingsSlinky.googleCloudStorage.googleCloudStorageStrings.md5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateReadStreamOptions extends js.Object {
  var decompress: js.UndefOr[Boolean] = js.native
  var end: js.UndefOr[Double] = js.native
  var start: js.UndefOr[Double] = js.native
  var userProject: js.UndefOr[String] = js.native
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.native
}

object CreateReadStreamOptions {
  @scala.inline
  def apply(): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
  @scala.inline
  implicit class CreateReadStreamOptionsOps[Self <: CreateReadStreamOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecompress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecompress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decompress")(js.undefined)
        ret
    }
    @scala.inline
    def withEnd(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(js.undefined)
        ret
    }
    @scala.inline
    def withStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(js.undefined)
        ret
    }
    @scala.inline
    def withUserProject(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserProject: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userProject")(js.undefined)
        ret
    }
    @scala.inline
    def withValidation(value: md5 | crc32c | `false` | `true`): Self = {
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

