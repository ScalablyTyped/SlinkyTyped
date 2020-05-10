package typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message

import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionDial
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionOpenUri
import typingsSlinky.dialogflow.mod.google.cloud.dialogflow.v2beta1.Intent.Message.RbmSuggestedAction.IRbmSuggestedActionShareLocation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a RbmSuggestedAction. */
@js.native
trait IRbmSuggestedAction extends js.Object {
  /** RbmSuggestedAction dial */
  var dial: js.UndefOr[IRbmSuggestedActionDial | Null] = js.native
  /** RbmSuggestedAction openUrl */
  var openUrl: js.UndefOr[IRbmSuggestedActionOpenUri | Null] = js.native
  /** RbmSuggestedAction postbackData */
  var postbackData: js.UndefOr[String | Null] = js.native
  /** RbmSuggestedAction shareLocation */
  var shareLocation: js.UndefOr[IRbmSuggestedActionShareLocation | Null] = js.native
  /** RbmSuggestedAction text */
  var text: js.UndefOr[String | Null] = js.native
}

object IRbmSuggestedAction {
  @scala.inline
  def apply(): IRbmSuggestedAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRbmSuggestedAction]
  }
  @scala.inline
  implicit class IRbmSuggestedActionOps[Self <: IRbmSuggestedAction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDial(value: IRbmSuggestedActionDial): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dial")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDial: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dial")(js.undefined)
        ret
    }
    @scala.inline
    def withDialNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dial")(null)
        ret
    }
    @scala.inline
    def withOpenUrl(value: IRbmSuggestedActionOpenUri): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenUrlNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openUrl")(null)
        ret
    }
    @scala.inline
    def withPostbackData(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPostbackData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(js.undefined)
        ret
    }
    @scala.inline
    def withPostbackDataNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("postbackData")(null)
        ret
    }
    @scala.inline
    def withShareLocation(value: IRbmSuggestedActionShareLocation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShareLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withShareLocationNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shareLocation")(null)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
    @scala.inline
    def withTextNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(null)
        ret
    }
  }
  
}

