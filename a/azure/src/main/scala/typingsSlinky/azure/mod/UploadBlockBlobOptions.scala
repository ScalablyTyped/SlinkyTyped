package typingsSlinky.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBlockBlobOptions extends UploadBlobOptions {
  var blockIdPrefix: js.UndefOr[String] = js.native
}

object UploadBlockBlobOptions {
  @scala.inline
  def apply(): UploadBlockBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBlockBlobOptions]
  }
  @scala.inline
  implicit class UploadBlockBlobOptionsOps[Self <: UploadBlockBlobOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlockIdPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIdPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlockIdPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blockIdPrefix")(js.undefined)
        ret
    }
  }
  
}

