package typingsSlinky.reactPanelgroup.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactPanelgroup.mod.PanelWidth
import typingsSlinky.reactPanelgroup.mod.PropTypes
import typingsSlinky.reactPanelgroup.mod.default
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.column
import typingsSlinky.reactPanelgroup.reactPanelgroupStrings.row
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactPanelgroup {
  
  @JSImport("react-panelgroup", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def borderColor(value: String): this.type = set("borderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def direction(value: row | column): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onUpdate(value: /* data */ PanelWidth => Unit): this.type = set("onUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def panelColor(value: String): this.type = set("panelColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def panelWidthsVarargs(value: (PanelWidth | Null)*): this.type = set("panelWidths", js.Array(value :_*))
    
    @scala.inline
    def panelWidths(value: js.Array[PanelWidth | Null]): this.type = set("panelWidths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def spacing(value: Double): this.type = set("spacing", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropTypes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactPanelgroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
