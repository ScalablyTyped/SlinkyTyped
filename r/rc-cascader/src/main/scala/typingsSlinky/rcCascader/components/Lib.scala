package typingsSlinky.rcCascader.components

import typingsSlinky.rcCascader.cascaderMod.CascaderProps
import typingsSlinky.rcCascader.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Lib {
  @JSImport("rc-cascader/lib", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: CascaderProps): SharedBuilder_CascaderProps300585724[default] = new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(getPopupContainer: js.Any): SharedBuilder_CascaderProps300585724[default] = {
    val __props = js.Dynamic.literal(getPopupContainer = getPopupContainer.asInstanceOf[js.Any])
    new SharedBuilder_CascaderProps300585724[default](js.Array(this.component, __props.asInstanceOf[CascaderProps]))
  }
}

