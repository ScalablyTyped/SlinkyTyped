package typingsSlinky.reactMotionLoop.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.Style
import typingsSlinky.reactMotionLoop.mod.ReactMotionLoopProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMotionLoop {
  
  @scala.inline
  def apply(styleFrom: Style, styleTo: Style): Builder = {
    val __props = js.Dynamic.literal(styleFrom = styleFrom.asInstanceOf[js.Any], styleTo = styleTo.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ReactMotionLoopProps]))
  }
  
  @JSImport("react-motion-loop", "ReactMotionLoop")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMotionLoop.mod.ReactMotionLoop] {
    
    @scala.inline
    def children(value: /* interpolatedStyle */ PlainStyle => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def defaultStyle(value: PlainStyle): this.type = set("defaultStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onRest(value: () => Unit): this.type = set("onRest", js.Any.fromFunction0(value))
    
    @scala.inline
    def style(value: Style): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactMotionLoopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
