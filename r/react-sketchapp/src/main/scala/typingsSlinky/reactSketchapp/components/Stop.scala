package typingsSlinky.reactSketchapp.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.stopMod.StopProps
import typingsSlinky.reactSketchapp.stopMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Stop {
  
  @JSImport("react-sketchapp/lib/components/Svg/Stop", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def stopColor(value: String): this.type = set("stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def stopOpacity(value: NumberProp): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Stop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
