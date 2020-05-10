package typingsSlinky.antdMobileRn.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antdMobileRn.antdMobileRnStrings.bottom
import typingsSlinky.antdMobileRn.antdMobileRnStrings.left
import typingsSlinky.antdMobileRn.antdMobileRnStrings.right
import typingsSlinky.antdMobileRn.antdMobileRnStrings.top
import typingsSlinky.antdMobileRn.drawerIndexNativeMod.DrawerNativeProps
import typingsSlinky.reactNativeDrawerLayout.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Drawer {
  @JSImport("antd-mobile-rn", "Drawer")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antdMobileRn.mod.Drawer] {
    @scala.inline
    def drawerBackgroundColor(value: String): this.type = set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def drawerRef(value: /* el */ default | Null => Unit): this.type = set("drawerRef", js.Any.fromFunction1(value))
    @scala.inline
    def drawerWidth(value: Double): this.type = set("drawerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def onOpenChange(value: /* isOpen */ Boolean => Unit): this.type = set("onOpenChange", js.Any.fromFunction1(value))
    @scala.inline
    def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: left | right | top | bottom): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def sidebarReactElement(value: ReactElement): this.type = set("sidebar", value.asInstanceOf[js.Any])
    @scala.inline
    def sidebar(value: TagMod[Any]): this.type = set("sidebar", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

