package typingsSlinky.reactMathjax.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMathjax.anon.Formula
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Node {
  
  @JSImport("react-mathjax", "default.Node")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMathjax.mod.default.Node] {
    
    @scala.inline
    def `inline`(value: Boolean): this.type = set("inline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRender(value: () => Unit): this.type = set("onRender", js.Any.fromFunction0(value))
  }
  
  def withProps(p: Formula): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(formula: String): Builder = {
    val __props = js.Dynamic.literal(formula = formula.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Formula]))
  }
}
