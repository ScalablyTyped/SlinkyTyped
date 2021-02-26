package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.MouseEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.anon.Dictkey
import typingsSlinky.antDesignPro.noticeIconMod.NoticeIconProps
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NoticeIcon {
  
  @JSImport("ant-design-pro", "NoticeIcon")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignPro.mod.NoticeIcon] {
    
    @scala.inline
    def bell(value: ReactElement): this.type = set("bell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bellReactElement(value: ReactElement): this.type = set("bell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def clearClose(value: Boolean): this.type = set("clearClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locale(value: Dictkey): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClear(value: /* tabName */ String => Unit): this.type = set("onClear", js.Any.fromFunction1(value))
    
    @scala.inline
    def onItemClick(value: (/* item */ NoticeIconData, NoticeIconProps) => Unit): this.type = set("onItemClick", js.Any.fromFunction2(value))
    
    @scala.inline
    def onPopupVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onTabChange(value: /* tabTile */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def onViewMore(value: (NoticeIconProps, /* e */ MouseEvent) => Unit): this.type = set("onViewMore", js.Any.fromFunction2(value))
    
    @scala.inline
    def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: NoticeIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: NoticeIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
