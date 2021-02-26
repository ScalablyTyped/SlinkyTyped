package typingsSlinky.reactMotion.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMotion.mod.PlainStyle
import typingsSlinky.reactMotion.mod.StaggeredMotionProps
import typingsSlinky.reactMotion.mod.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StaggeredMotion {
  
  @scala.inline
  def apply(styles: js.UndefOr[js.Array[PlainStyle]] => js.Array[Style]): Builder = {
    val __props = js.Dynamic.literal(styles = js.Any.fromFunction1(styles))
    new Builder(js.Array(this.component, __props.asInstanceOf[StaggeredMotionProps]))
  }
  
  @JSImport("react-motion", "StaggeredMotion")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactMotion.mod.StaggeredMotion] {
    
    @scala.inline
    def defaultStyles(value: js.Array[PlainStyle]): this.type = set("defaultStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultStylesVarargs(value: PlainStyle*): this.type = set("defaultStyles", js.Array(value :_*))
  }
  
  def withProps(p: StaggeredMotionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
