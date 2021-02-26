package typingsSlinky.rrc.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rrc.mod.ScrollIntoViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ScrollIntoView {
  
  @scala.inline
  def apply(id: String): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScrollIntoViewProps]))
  }
  
  @JSImport("rrc", "ScrollIntoView")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.rrc.mod.ScrollIntoView] {
    
    @scala.inline
    def alignToTop(value: Boolean): this.type = set("alignToTop", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScrollIntoViewProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
