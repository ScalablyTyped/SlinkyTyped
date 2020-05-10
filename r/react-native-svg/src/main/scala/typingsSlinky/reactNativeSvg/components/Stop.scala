package typingsSlinky.reactNativeSvg.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNativeSvg.mod.Color
import typingsSlinky.reactNativeSvg.mod.NumberProp
import typingsSlinky.reactNativeSvg.mod.StopProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Stop {
  @JSImport("react-native-svg", "Stop")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactNativeSvg.mod.Stop] {
    @scala.inline
    def offset(value: NumberProp): this.type = set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def stopColor(value: Color): this.type = set("stopColor", value.asInstanceOf[js.Any])
    @scala.inline
    def stopOpacity(value: NumberProp): this.type = set("stopOpacity", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StopProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Stop.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

