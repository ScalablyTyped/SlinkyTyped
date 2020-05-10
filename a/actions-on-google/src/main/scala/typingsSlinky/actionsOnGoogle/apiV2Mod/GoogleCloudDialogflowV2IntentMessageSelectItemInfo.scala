package typingsSlinky.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleCloudDialogflowV2IntentMessageSelectItemInfo extends js.Object {
  var key: js.UndefOr[String] = js.native
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}

object GoogleCloudDialogflowV2IntentMessageSelectItemInfo {
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSelectItemInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSelectItemInfo]
  }
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSelectItemInfoOps[Self <: GoogleCloudDialogflowV2IntentMessageSelectItemInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withSynonyms(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSynonyms: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("synonyms")(js.undefined)
        ret
    }
  }
  
}

