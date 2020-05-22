package typingsSlinky.antdMobile.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobile.antdMobileStrings.bottom
import typingsSlinky.antdMobile.antdMobileStrings.left
import typingsSlinky.antdMobile.antdMobileStrings.right
import typingsSlinky.antdMobile.antdMobileStrings.top
import typingsSlinky.antdMobile.drawerMod.default
import typingsSlinky.antdMobile.drawerPropsTypeMod.DrawerWebProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  @JSImport("antd-mobile/lib/drawer", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: CSSProperties): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def docked(value: Boolean): this.type = set("docked", value.asInstanceOf[js.Any])
    @scala.inline
    def dragHandleStyle(value: CSSProperties): this.type = set("dragHandleStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def dragToggleDistance(value: Double): this.type = set("dragToggleDistance", value.asInstanceOf[js.Any])
    @scala.inline
    def enableDragHandle(value: Boolean): this.type = set("enableDragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def onOpenChange(value: /* isOpen */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def overlayStyle(value: CSSProperties): this.type = set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: left | right | top | bottom): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    @scala.inline
    def sidebarReactElement(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def sidebar(value: TagMod[Any]): this.type = set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def sidebarStyle(value: CSSProperties): this.type = set("sidebarStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def touch(value: Boolean): this.type = set("touch", value.asInstanceOf[js.Any])
    @scala.inline
    def transitions(value: Boolean): this.type = set("transitions", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerWebProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

