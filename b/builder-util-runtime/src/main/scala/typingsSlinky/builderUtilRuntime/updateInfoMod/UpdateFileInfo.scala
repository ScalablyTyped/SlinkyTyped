package typingsSlinky.builderUtilRuntime.updateInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileInfo extends BlockMapDataHolder {
  var url: String = js.native
}

object UpdateFileInfo {
  @scala.inline
  def apply(sha512: String, url: String): UpdateFileInfo = {
    val __obj = js.Dynamic.literal(sha512 = sha512.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileInfo]
  }
  @scala.inline
  implicit class UpdateFileInfoOps[Self <: UpdateFileInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

