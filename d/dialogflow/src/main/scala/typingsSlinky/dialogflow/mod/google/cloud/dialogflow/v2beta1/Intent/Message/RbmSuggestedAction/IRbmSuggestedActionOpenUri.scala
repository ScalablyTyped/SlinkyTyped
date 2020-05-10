package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedActionOpenUri. */
@js.native
trait IRbmSuggestedActionOpenUri extends js.Object {
  /** RbmSuggestedActionOpenUri uri */
  var uri: js.UndefOr[String | Null] = js.native
}

object IRbmSuggestedActionOpenUri {
  @scala.inline
  def apply(): IRbmSuggestedActionOpenUri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmSuggestedActionOpenUri]
  }
  @scala.inline
  implicit class IRbmSuggestedActionOpenUriOps[Self <: IRbmSuggestedActionOpenUri] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(js.undefined)
        ret
    }
    @scala.inline
    def withUriNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("uri")(null)
        ret
    }
  }
  
}

