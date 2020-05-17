package typingsSlinky.rcCascader.components

import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.rcCascader.cascaderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Cascader {
  @JSImport("rc-cascader/lib/Cascader", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CascaderProps): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Cascader.type): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, js.Dictionary.empty))()
}

