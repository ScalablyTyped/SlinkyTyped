package typingsSlinky.antDesignPro.noticeIconTabMod

import slinky.core.facade.ReactElement
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoticeIconData extends js.Object {
  
  var avatar: js.UndefOr[String | ReactElement] = js.native
  
  var datetime: js.UndefOr[ReactElement] = js.native
  
  var description: js.UndefOr[ReactElement] = js.native
  
  var extra: js.UndefOr[ReactElement] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object NoticeIconData {
  
  @scala.inline
  def apply(): NoticeIconData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeIconData]
  }
  
  @scala.inline
  implicit class NoticeIconDataOps[Self <: NoticeIconData] (val x: Self) extends AnyVal {
    
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
    def setDatetimeReactElement(value: ReactElement): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatetime(value: ReactElement): Self = this.set("datetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDatetime: Self = this.set("datetime", js.undefined)
    
    @scala.inline
    def setDescriptionReactElement(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: ReactElement): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExtraReactElement(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: ReactElement): Self = this.set("extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtra: Self = this.set("extra", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
