package typingsSlinky.reactFa.components

import typingsSlinky.reactFa.mod.IconProps
import typingsSlinky.reactFa.mod.defaultCls
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1361400038[defaultCls] = new SharedBuilder_IconProps1361400038[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1361400038[defaultCls] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1361400038[defaultCls](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}
