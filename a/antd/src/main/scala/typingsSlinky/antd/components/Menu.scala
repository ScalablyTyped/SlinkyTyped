package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.menuContextMod.MenuTheme
import typingsSlinky.antd.menuMod.MenuProps
import typingsSlinky.antd.menuMod.default
import typingsSlinky.rcMenu.dividerMod.DividerProps
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Menu {
  @JSImport("antd/lib/menu", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def focusable(value: Boolean): this.type = set("focusable", value.asInstanceOf[js.Any])
    @scala.inline
    def inlineIndent(value: Double): this.type = set("inlineIndent", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: MenuTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MenuProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Menu.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  object Divider {
    @JSImport("antd/lib/menu", "Divider")
    @js.native
    object component extends js.Object
    
    @scala.inline
    class Builder (val args: js.Array[js.Any])
      extends AnyVal
         with StBuildingComponent[tag.type, js.Object] {
      @scala.inline
      def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
      @scala.inline
      def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
      @scala.inline
      def rootPrefixCls(value: String): this.type = set("rootPrefixCls", value.asInstanceOf[js.Any])
      @scala.inline
      def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    }
    
    def withProps(p: DividerProps): typingsSlinky.antd.components.Menu.Divider.Builder = new typingsSlinky.antd.components.Menu.Divider.Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
    implicit def make(companion: Divider.type): typingsSlinky.antd.components.Menu.Divider.Builder = new typingsSlinky.antd.components.Menu.Divider.Builder(js.Array(this.component, js.Dictionary.empty))()
  }
  
}

