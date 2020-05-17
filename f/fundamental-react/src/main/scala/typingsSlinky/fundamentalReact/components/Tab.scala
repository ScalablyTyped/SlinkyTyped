package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.iconMod.IconGlyph
import typingsSlinky.fundamentalReact.tabMod.TabProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tab {
  @JSImport("fundamental-react/lib/Tabs/Tab", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def glyph(value: IconGlyph): this.type = set("glyph", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def index(value: Double): this.type = set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def linkProps(value: js.Any): this.type = set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def onClick(value: /* repeated */ js.Any => _): this.type = set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def tabContentProps(value: js.Any): this.type = set("tabContentProps", value.asInstanceOf[js.Any])
    @scala.inline
    def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[TabProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Tab.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

