package typingsSlinky.rcCascader.components

import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.rcCascader.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RcCascader {
  
  @JSImport("rc-cascader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CascaderProps): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: RcCascader.type): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, js.Dictionary.empty))()
}
