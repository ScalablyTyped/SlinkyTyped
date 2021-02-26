package typingsSlinky.radium.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.radium.mod.Radium.StyleProps
import typingsSlinky.radium.mod.Radium.StyleRules
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Style {
  
  @scala.inline
  def apply(rules: CSSProperties | StyleRules): Builder = {
    val __props = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StyleProps]))
  }
  
  @JSImport("radium", "default.Style")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.radium.mod.default.Style] {
    
    @scala.inline
    def scopeSelector(value: String): this.type = set("scopeSelector", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StyleProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
