package typingsSlinky.reactFa.components

import typingsSlinky.reactFa.mod.IconCls
import typingsSlinky.reactFa.mod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Icon {
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1331641792[IconCls] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1331641792[IconCls](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("react-fa", "Icon")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps1331641792[IconCls] = new SharedBuilder_IconProps1331641792[IconCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
