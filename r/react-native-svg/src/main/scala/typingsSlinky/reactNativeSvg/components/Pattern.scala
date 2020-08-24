package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.ColumnMajorTransformMatrix
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.PatternCls
import typingsSlinky.reactNativeSvg.mod.PatternProps
import typingsSlinky.reactNativeSvg.mod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Pattern {
  @JSImport("react-native-svg", "Pattern")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, PatternCls] {
    @scala.inline
    def height(value: NumberProp): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def patternContentUnits(value: Units): this.type = set("patternContentUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def patternTransform(value: ColumnMajorTransformMatrix | String): this.type = set("patternTransform", value.asInstanceOf[js.Any])
    @scala.inline
    def patternUnits(value: Units): this.type = set("patternUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
    @scala.inline
    def width(value: NumberProp): this.type = set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def x(value: NumberProp): this.type = set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def y(value: NumberProp): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PatternProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Pattern.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

