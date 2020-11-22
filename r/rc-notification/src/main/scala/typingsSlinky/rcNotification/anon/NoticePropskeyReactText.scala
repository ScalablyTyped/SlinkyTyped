package typingsSlinky.rcNotification.anon

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.rcNotification.noticeMod.DivProps
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.ReactText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined rc-notification.rc-notification/es/Notice.NoticeProps & {  key :react.react.ReactText} */
@js.native
trait NoticePropskeyReactText extends js.Object {
  
  var children: js.UndefOr[ReactElement] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var closable: js.UndefOr[Boolean] = js.native
  
  var closeIcon: js.UndefOr[ReactElement] = js.native
  
  var duration: js.UndefOr[Double | Null] = js.native
  
  /** @private Only for internal usage. We don't promise that we will refactor this */
  var holder: js.UndefOr[HTMLDivElement] = js.native
  
  var key: ReactText = js.native
  
  /** Mark as final key since set maxCount may keep the key but user pass key is different */
  var noticeKey: Key = js.native
  
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
  
  var onClose: js.UndefOr[js.Function1[/* key */ Key, Unit]] = js.native
  
  var prefixCls: String = js.native
  
  var props: js.UndefOr[DivProps] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var updateMark: js.UndefOr[String] = js.native
}
object NoticePropskeyReactText {
  
  @scala.inline
  def apply(key: ReactText, noticeKey: Key, prefixCls: String): NoticePropskeyReactText = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], noticeKey = noticeKey.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoticePropskeyReactText]
  }
  
  @scala.inline
  implicit class NoticePropskeyReactTextOps[Self <: NoticePropskeyReactText] (val x: Self) extends AnyVal {
    
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
    def setKey(value: ReactText): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoticeKey(value: Key): Self = this.set("noticeKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenReactElement(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
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
    def setOnClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnClose(value: /* key */ Key => Unit): Self = this.set("onClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    
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
  }
}
