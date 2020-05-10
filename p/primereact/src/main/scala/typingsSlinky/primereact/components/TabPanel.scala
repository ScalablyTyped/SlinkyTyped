package typingsSlinky.primereact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.primereact.tabViewMod.TabPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TabPanel {
  @JSImport("primereact/tabview", "TabPanel")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.primereact.primereactTabviewMod.TabPanel] {
    @scala.inline
    def contentClassName(value: String): this.type = set("contentClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def contentStyle(value: js.Any): this.type = set("contentStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def header(value: String): this.type = set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def headerClassName(value: String): this.type = set("headerClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def headerStyle(value: js.Any): this.type = set("headerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def leftIcon(value: String): this.type = set("leftIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def rightIcon(value: String): this.type = set("rightIcon", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabPanelProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: TabPanel.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

