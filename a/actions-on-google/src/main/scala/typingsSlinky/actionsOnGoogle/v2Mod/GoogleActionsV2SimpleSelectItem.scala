package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2SimpleSelectItem extends js.Object {
  /**
    * Item key and synonyms.
    */
  var optionInfo: js.UndefOr[GoogleActionsV2OptionInfo] = js.native
  /**
    * Title of the item. It will act as synonym if it's provided.
    * Optional
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2SimpleSelectItem {
  @scala.inline
  def apply(): GoogleActionsV2SimpleSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2SimpleSelectItem]
  }
  @scala.inline
  implicit class GoogleActionsV2SimpleSelectItemOps[Self <: GoogleActionsV2SimpleSelectItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionInfo(value: GoogleActionsV2OptionInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

