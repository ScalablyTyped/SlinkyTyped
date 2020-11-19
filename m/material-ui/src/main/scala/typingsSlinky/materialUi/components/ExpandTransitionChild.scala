package typingsSlinky.materialUi.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.materialUi.expandTransitionChildMod.ExpandTransitionChildProps
import typingsSlinky.materialUi.expandTransitionChildMod.default
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ExpandTransitionChild {
  
  @JSImport("material-ui/internal/ExpandTransitionChild", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def enterDelay(value: Double): this.type = set("enterDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDelay(value: Double): this.type = set("transitionDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ExpandTransitionChildProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ExpandTransitionChild.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
