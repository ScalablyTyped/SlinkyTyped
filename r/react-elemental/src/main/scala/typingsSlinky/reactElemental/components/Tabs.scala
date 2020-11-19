package typingsSlinky.reactElemental.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.anon.LabelValue
import typingsSlinky.reactElemental.mod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tabs {
  
  @JSImport("react-elemental", "Tabs")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Tabs] {
    
    @scala.inline
    def fit(value: Boolean): this.type = set("fit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def invert(value: Boolean): this.type = set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: /* value */ String => Unit): this.type = set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def optionsVarargs(value: LabelValue*): this.type = set("options", js.Array(value :_*))
    
    @scala.inline
    def options(value: js.Array[LabelValue]): this.type = set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def secondary(value: Boolean): this.type = set("secondary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TabsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Tabs.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
