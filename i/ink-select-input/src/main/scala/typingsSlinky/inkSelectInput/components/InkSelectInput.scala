package typingsSlinky.inkSelectInput.components

import slinky.core.ReactComponentClass
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.inkSelectInput.mod.ItemOfSelectInput
import typingsSlinky.inkSelectInput.mod.SelectInputProps
import typingsSlinky.inkSelectInput.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InkSelectInput {
  
  @JSImport("ink-select-input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def focus(value: Boolean): this.type = set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def indicatorComponent(value: ReactComponentClass[js.Object]): this.type = set("indicatorComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def initialIndex(value: Double): this.type = set("initialIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemComponent(value: ReactComponentClass[js.Object]): this.type = set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def items(value: js.Array[ItemOfSelectInput]): this.type = set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def itemsVarargs(value: ItemOfSelectInput*): this.type = set("items", js.Array(value :_*))
    
    @scala.inline
    def limit(value: Double): this.type = set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: ItemOfSelectInput => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
  }
  
  implicit def make(companion: InkSelectInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SelectInputProps[ItemOfSelectInput]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
