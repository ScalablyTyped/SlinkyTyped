package typingsSlinky.reactSketchapp.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.mod.Style
import typingsSlinky.reactSketchapp.mod.StyleReference
import typingsSlinky.reactSketchapp.svgSvgMod.SvgProps
import typingsSlinky.reactSketchapp.typesMod.ResizeConstraints
import typingsSlinky.reactSketchapp.typesMod.SketchShadow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Svg {
  
  @JSImport("react-sketchapp", "Svg")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSketchapp.mod.Svg] {
    
    @scala.inline
    def childrenReactElement(value: ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def childrenVarargs(value: ReactElement*): this.type = set("children", js.Array(value :_*))
    
    @scala.inline
    def children(value: js.Array[ReactElement] | ReactElement): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def opacity(value: String | Double): this.type = set("opacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def resizingConstraint(value: ResizeConstraints): this.type = set("resizingConstraint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def shadowsVarargs(value: SketchShadow*): this.type = set("shadows", js.Array(value :_*))
    
    @scala.inline
    def shadows(value: js.Array[SketchShadow]): this.type = set("shadows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def style(value: Style | StyleReference): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SvgProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Svg.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
