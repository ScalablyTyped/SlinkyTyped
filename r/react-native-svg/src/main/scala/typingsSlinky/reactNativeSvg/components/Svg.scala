package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Svg {
  
  @JSImport("react-native-svg", "Svg")
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps_1156027433 = new SharedBuilder_SvgProps_1156027433(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Svg.type): SharedBuilder_SvgProps_1156027433 = new SharedBuilder_SvgProps_1156027433(js.Array(this.component, js.Dictionary.empty))()
}
