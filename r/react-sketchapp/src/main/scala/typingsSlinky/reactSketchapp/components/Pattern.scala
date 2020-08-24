package typingsSlinky.reactSketchapp.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSketchapp.patternMod.PatternProps
import typingsSlinky.reactSketchapp.patternMod.default
import typingsSlinky.reactSketchapp.propsMod.NumberProp
import typingsSlinky.reactSketchapp.reactSketchappStrings.objectBoundingBox
import typingsSlinky.reactSketchapp.reactSketchappStrings.userSpaceOnUse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pattern {
  @JSImport("react-sketchapp/lib/components/Svg/Pattern", JSImport.Default)
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
    def patternContentUnits(value: userSpaceOnUse | objectBoundingBox): this.type = set("patternContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def patternTransform(value: String): this.type = set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def patternUnits(value: userSpaceOnUse | objectBoundingBox): this.type = set("patternUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def x1(value: NumberProp): this.type = set("x1", value.asInstanceOf[js.Any])
    @scala.inline
    def x2(value: NumberProp): this.type = set("x2", value.asInstanceOf[js.Any])
    @scala.inline
    def y1(value: NumberProp): this.type = set("y1", value.asInstanceOf[js.Any])
    @scala.inline
    def y2(value: NumberProp): this.type = set("y2", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PatternProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Pattern.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

