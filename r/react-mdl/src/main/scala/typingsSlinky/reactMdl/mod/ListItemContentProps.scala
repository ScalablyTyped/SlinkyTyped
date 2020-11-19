package typingsSlinky.reactMdl.mod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.DOMAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemContentProps
  extends MDLHTMLAttributes
     with DOMAttributes[ListItemContent] {
  
  var avatar: js.UndefOr[String | ReactElement] = js.native
  
  var icon: js.UndefOr[String | ReactElement] = js.native
  
  var subtitle: js.UndefOr[ReactElement] = js.native
  
  var useBodyClass: js.UndefOr[Boolean] = js.native
}
object ListItemContentProps {
  
  @scala.inline
  def apply(): ListItemContentProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListItemContentProps]
  }
  
  @scala.inline
  implicit class ListItemContentPropsOps[Self <: ListItemContentProps] (val x: Self) extends AnyVal {
    
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
    def setAvatarReactElement(value: ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatar(value: String | ReactElement): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setIconReactElement(value: ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String | ReactElement): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setSubtitleReactElement(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitle(value: ReactElement): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setUseBodyClass(value: Boolean): Self = this.set("useBodyClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBodyClass: Self = this.set("useBodyClass", js.undefined)
  }
}
