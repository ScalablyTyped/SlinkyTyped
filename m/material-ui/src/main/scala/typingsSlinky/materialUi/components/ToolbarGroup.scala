package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Toolbar.ToolbarGroupProps
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.materialUi.toolbarGroupMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToolbarGroup {
  @JSImport("material-ui/Toolbar/ToolbarGroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def firstChild(value: Boolean): this.type = set("firstChild", value.asInstanceOf[js.Any])
    @scala.inline
    def float(value: left | right): this.type = set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def lastChild(value: Boolean): this.type = set("lastChild", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToolbarGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToolbarGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

