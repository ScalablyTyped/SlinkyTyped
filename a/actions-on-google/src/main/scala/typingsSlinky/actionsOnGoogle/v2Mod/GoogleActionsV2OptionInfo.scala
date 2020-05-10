package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OptionInfo extends js.Object {
  /**
    * A unique key that will be sent back to the agent if this response is given.
    */
  var key: js.UndefOr[String] = js.native
  /**
    * A list of synonyms that can also be used to trigger this item in dialog.
    */
  var synonyms: js.UndefOr[js.Array[String]] = js.native
}

object GoogleActionsV2OptionInfo {
  @scala.inline
  def apply(): GoogleActionsV2OptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OptionInfo]
  }
  @scala.inline
  implicit class GoogleActionsV2OptionInfoOps[Self <: GoogleActionsV2OptionInfo] (val x: Self) extends AnyVal {
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

