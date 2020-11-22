package typingsSlinky.rcNotification.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcNotification.noticeMod.DivProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-notification.rc-notification/es/Notification.NoticeContent & {  userPassKey :react.react.Key | undefined} */
@js.native
trait NoticeContentuserPassKeyK extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[ReactElement] = js.native
  
  var content: js.UndefOr[ReactElement] = js.native
  
  var duration: js.UndefOr[Double | Null] = js.native
  
  var holder: js.UndefOr[HTMLDivElement] = js.native
  
  var key: js.UndefOr[Key] = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onClose: js.UndefOr[js.Function0[Unit]] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var props: js.UndefOr[DivProps] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var updateMark: js.UndefOr[String] = js.native
  
  var userPassKey: js.UndefOr[Key] = js.native
}
object NoticeContentuserPassKeyK {
  
  @scala.inline
  def apply(): NoticeContentuserPassKeyK = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoticeContentuserPassKeyK]
  }
  
  @scala.inline
  implicit class NoticeContentuserPassKeyKOps[Self <: NoticeContentuserPassKeyK] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    
    @scala.inline
    def setCloseIconReactElement(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseIcon(value: ReactElement): Self = this.set("closeIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseIcon: Self = this.set("closeIcon", js.undefined)
    
    @scala.inline
    def setContentReactElement(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: ReactElement): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setDurationNull: Self = this.set("duration", null)
    
    @scala.inline
    def setHolder(value: HTMLDivElement): Self = this.set("holder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHolder: Self = this.set("holder", js.undefined)
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setProps(value: DivProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUpdateMark(value: String): Self = this.set("updateMark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateMark: Self = this.set("updateMark", js.undefined)
    
    @scala.inline
    def setUserPassKey(value: Key): Self = this.set("userPassKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserPassKey: Self = this.set("userPassKey", js.undefined)
  }
}
