package typingsSlinky.reactBootstrapTable2Toolkit.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrapTable2Toolkit.mod.ClearSearchButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClearSearchButton {
  
  @JSImport("react-bootstrap-table2-toolkit", "Search.ClearSearchButton")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onClear(value: () => Unit): this.type = set("onClear", js.Any.fromFunction0(value))
    
    @scala.inline
    def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ClearSearchButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ClearSearchButton.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
