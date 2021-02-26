package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeSvg {
  
  @JSImport("react-native-svg", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactNativeSvg.type): SharedBuilder_SvgProps426770904[js.Object] = new SharedBuilder_SvgProps426770904[js.Object](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps426770904[js.Object] = new SharedBuilder_SvgProps426770904[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
