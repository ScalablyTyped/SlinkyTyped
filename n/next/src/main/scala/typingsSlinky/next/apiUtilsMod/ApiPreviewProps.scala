package typingsSlinky.next.apiUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApiPreviewProps extends js.Object {
  var previewModeEncryptionKey: String = js.native
  var previewModeId: String = js.native
  var previewModeSigningKey: String = js.native
}

object ApiPreviewProps {
  @scala.inline
  def apply(previewModeEncryptionKey: String, previewModeId: String, previewModeSigningKey: String): ApiPreviewProps = {
    val __obj = js.Dynamic.literal(previewModeEncryptionKey = previewModeEncryptionKey.asInstanceOf[js.Any], previewModeId = previewModeId.asInstanceOf[js.Any], previewModeSigningKey = previewModeSigningKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiPreviewProps]
  }
  @scala.inline
  implicit class ApiPreviewPropsOps[Self <: ApiPreviewProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPreviewModeEncryptionKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewModeEncryptionKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewModeId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewModeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviewModeSigningKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previewModeSigningKey")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

