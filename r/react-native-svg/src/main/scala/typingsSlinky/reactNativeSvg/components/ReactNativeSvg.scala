package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvg {
  
  @JSImport("react-native-svg", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps_1156027433 = new SharedBuilder_SvgProps_1156027433(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactNativeSvg.type): SharedBuilder_SvgProps_1156027433 = new SharedBuilder_SvgProps_1156027433(js.Array(this.component, js.Dictionary.empty))()
}
