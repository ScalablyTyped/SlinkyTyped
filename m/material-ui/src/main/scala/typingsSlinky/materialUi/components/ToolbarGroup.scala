package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.MaterialUI.Toolbar.ToolbarGroupProps
import typingsSlinky.materialUi.materialUiStrings.left
import typingsSlinky.materialUi.materialUiStrings.right
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ToolbarGroup {
  
  @JSImport("material-ui", "ToolbarGroup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.materialUi.mod.ToolbarGroup] {
    
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
  
  implicit def make(companion: ToolbarGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ToolbarGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
