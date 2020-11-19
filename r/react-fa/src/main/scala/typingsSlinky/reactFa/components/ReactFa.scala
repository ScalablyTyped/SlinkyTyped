package typingsSlinky.reactFa.components

import slinky.core.ReactComponentClass
import typingsSlinky.reactFa.mod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFa {
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps): SharedBuilder_IconProps1361400038[ReactComponentClass[IconProps] with js.Object] = new SharedBuilder_IconProps1361400038[ReactComponentClass[IconProps] with js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1361400038[ReactComponentClass[IconProps] with js.Object] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1361400038[ReactComponentClass[IconProps] with js.Object](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
}
