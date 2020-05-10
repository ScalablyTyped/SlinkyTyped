package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import typingsSlinky.reactNativeSvg.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNativeSvg {
  @JSImport("react-native-svg", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps426770904[default] = new SharedBuilder_SvgProps426770904[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNativeSvg.type): SharedBuilder_SvgProps426770904[default] = new SharedBuilder_SvgProps426770904[default](js.Array(this.component, js.Dictionary.empty))()
}

