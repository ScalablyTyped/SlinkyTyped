package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Svg {
  @JSImport("react-native-svg", "Svg")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps426770904[typingsSlinky.reactNativeSvg.mod.Svg] = new SharedBuilder_SvgProps426770904[typingsSlinky.reactNativeSvg.mod.Svg](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Svg.type): SharedBuilder_SvgProps426770904[typingsSlinky.reactNativeSvg.mod.Svg] = new SharedBuilder_SvgProps426770904[typingsSlinky.reactNativeSvg.mod.Svg](js.Array(this.component, js.Dictionary.empty))()
}

