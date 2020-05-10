package typingsSlinky.fundamentalReact.components

import org.scalajs.dom.raw.Element
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.tabGroupMod.TabGroupProps
import typingsSlinky.fundamentalReact.tabGroupMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabGroup {
  @JSImport("fundamental-react/lib/Tabs/TabGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    @scala.inline
    def onTabClick(value: (/* event */ SyntheticMouseEvent[Element], /* index */ Double) => Unit): this.type = set("onTabClick", js.Any.fromFunction2(value))
    @scala.inline
    def selectedIndex(value: Double): this.type = set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def size(value: js.Any): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def tabGroupProps(value: js.Any): this.type = set("tabGroupProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

