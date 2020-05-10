package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.MarkerProps
import typingsSlinky.reactNativeSvg.mod.MarkerUnits
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.Orient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Marker {
  @JSImport("react-native-svg", "Marker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvg.mod.Marker] {
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def markerHeight(value: NumberProp): this.type = set("markerHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def markerUnits(value: MarkerUnits): this.type = set("markerUnits", value.asInstanceOf[js.Any])
    @scala.inline
    def markerWidth(value: NumberProp): this.type = set("markerWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def orient(value: Orient | NumberProp): this.type = set("orient", value.asInstanceOf[js.Any])
    @scala.inline
    def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def refX(value: NumberProp): this.type = set("refX", value.asInstanceOf[js.Any])
    @scala.inline
    def refY(value: NumberProp): this.type = set("refY", value.asInstanceOf[js.Any])
    @scala.inline
    def viewBox(value: String): this.type = set("viewBox", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Marker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

