package typingsSlinky.antDesignPro.components

import org.scalajs.dom.raw.MouseEvent
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignPro.AnonDictkey
import typingsSlinky.antDesignPro.noticeIconMod.NoticeIconProps
import typingsSlinky.antDesignPro.noticeIconMod.default
import typingsSlinky.antDesignPro.noticeIconTabMod.NoticeIconData
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NoticeIcon {
  @JSImport("ant-design-pro/lib/NoticeIcon", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def bellReactElement(value: ReactElement): this.type = set("bell", value.asInstanceOf[js.Any])
    @scala.inline
    def bell(value: TagMod[Any]): this.type = set("bell", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def clearClose(value: Boolean): this.type = set("clearClose", value.asInstanceOf[js.Any])
    @scala.inline
    def count(value: Double): this.type = set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def locale(value: AnonDictkey): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def onClear(value: /* tabName */ String => Unit): this.type = set("onClear", js.Any.fromFunction1(value))
    @scala.inline
    def onItemClick(value: (/* item */ NoticeIconData, /* tabProps */ NoticeIconProps) => Unit): this.type = set("onItemClick", js.Any.fromFunction2(value))
    @scala.inline
    def onPopupVisibleChange(value: /* visible */ Boolean => Unit): this.type = set("onPopupVisibleChange", js.Any.fromFunction1(value))
    @scala.inline
    def onTabChange(value: /* tabTile */ String => Unit): this.type = set("onTabChange", js.Any.fromFunction1(value))
    @scala.inline
    def onViewMore(value: (/* tabProps */ NoticeIconProps, /* e */ MouseEvent) => Unit): this.type = set("onViewMore", js.Any.fromFunction2(value))
    @scala.inline
    def popupVisible(value: Boolean): this.type = set("popupVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: NoticeIconProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: NoticeIcon.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

