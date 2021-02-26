package typingsSlinky.reactNativeSvg.components

import typingsSlinky.reactNativeSvg.mod.SvgProps
import typingsSlinky.reactNativeSvg.mod.defaultCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @JSImport("react-native-svg", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Default.type): SharedBuilder_SvgProps426770904[defaultCls] = new SharedBuilder_SvgProps426770904[defaultCls](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SvgProps): SharedBuilder_SvgProps426770904[defaultCls] = new SharedBuilder_SvgProps426770904[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
