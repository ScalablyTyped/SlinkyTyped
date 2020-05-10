package typingsSlinky.antdMobile.actionSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareActionSheetWithOptions extends ActionSheetOptions {
  var badges: js.UndefOr[js.Array[BadgesOption]] = js.native
  var options: js.Array[js.Array[ShareOption] | ShareOption] = js.native
}

object ShareActionSheetWithOptions {
  @scala.inline
  def apply(options: js.Array[js.Array[ShareOption] | ShareOption]): ShareActionSheetWithOptions = {
    val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareActionSheetWithOptions]
  }
  @scala.inline
  implicit class ShareActionSheetWithOptionsOps[Self <: ShareActionSheetWithOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptions(value: js.Array[js.Array[ShareOption] | ShareOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("options")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBadges(value: js.Array[BadgesOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBadges: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("badges")(js.undefined)
        ret
    }
  }
  
}

