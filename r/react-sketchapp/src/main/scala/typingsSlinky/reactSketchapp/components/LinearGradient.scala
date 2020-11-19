package typingsSlinky.reactSketchapp.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.linearGradientMod.LinearGradientProps
import typingsSlinky.reactSketchapp.linearGradientMod.default
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LinearGradient {
  
  @JSImport("react-sketchapp/lib/components/Svg/LinearGradient", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def gradientUnits(value: objectBoundingBox | userSpaceOnUse): this.type = set("gradientUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LinearGradientProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(x1: NumberProp, x2: NumberProp, y1: NumberProp, y2: NumberProp): Builder = {
    val __props = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LinearGradientProps]))
  }
}
