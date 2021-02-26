package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgCls
import typingsSlinky.reactNativeSvg.mod.SvgProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Svg {
  
  @JSImport("react-native-svg", "Svg")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Svg.type): SharedBuilder_SvgProps426770904[SvgCls] = new SharedBuilder_SvgProps426770904[SvgCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps426770904[SvgCls] = new SharedBuilder_SvgProps426770904[SvgCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
