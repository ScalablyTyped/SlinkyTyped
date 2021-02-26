package typingsSlinky.rcCascader.components

import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.rcCascader.cascaderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Cascader {
  
  @JSImport("rc-cascader/es/Cascader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Cascader.type): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: CascaderProps): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
