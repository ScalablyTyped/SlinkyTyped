package typingsSlinky.reactBootstrapTable.components

import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable.mod.ShowSelectedButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ShowSelectedOnlyButton {
  
  @JSImport("react-bootstrap-table", "ShowSelectedOnlyButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrapTable.mod.ShowSelectedOnlyButton] {
    
    @scala.inline
    def btnContextual(value: String): this.type = set("btnContextual", value.asInstanceOf[js.Any])
    
    @scala.inline
    def btnGlyphicon(value: String): this.type = set("btnGlyphicon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClick(value: /* e */ SyntheticMouseEvent[_] => Unit): this.type = set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def showAllText(value: String): this.type = set("showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOnlySelectText(value: String): this.type = set("showOnlySelectText", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ShowSelectedButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ShowSelectedOnlyButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
