package typingsSlinky.reactFa.components

import typingsSlinky.reactFa.mod.IconProps
import typingsSlinky.reactFa.mod.defaultCls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Default {
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1331641792[defaultCls] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1331641792[defaultCls](js.Array(this.component, __props.asInstanceOf[IconProps]))
  }
  
  @JSImport("react-fa", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps): SharedBuilder_IconProps1331641792[defaultCls] = new SharedBuilder_IconProps1331641792[defaultCls](js.Array(this.component, p.asInstanceOf[js.Any]))
}
