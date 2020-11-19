package typingsSlinky.antdMobile.actionSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOptionsVarargs(value: (js.Array[ShareOption] | ShareOption)*): Self = this.set("options", js.Array(value :_*))
    
    @scala.inline
    def setOptions(value: js.Array[js.Array[ShareOption] | ShareOption]): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBadgesVarargs(value: BadgesOption*): Self = this.set("badges", js.Array(value :_*))
    
    @scala.inline
    def setBadges(value: js.Array[BadgesOption]): Self = this.set("badges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBadges: Self = this.set("badges", js.undefined)
  }
}
