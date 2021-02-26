package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.slideInChildMod.SlideInChildProps
import typingsSlinky.materialUi.slideInChildMod.default
import typingsSlinky.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SlideInChild {
  
  @scala.inline
  def apply(getLeaveDirection: js.Function): Builder = {
    val __props = js.Dynamic.literal(getLeaveDirection = getLeaveDirection.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SlideInChildProps]))
  }
  
  @JSImport("material-ui/internal/SlideInChild", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def direction(value: String): this.type = set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SlideInChildProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
