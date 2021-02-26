package typingsSlinky.expoVectorIcons.components

import typingsSlinky.expoVectorIcons.createIconSetMod.IconButtonProps
import typingsSlinky.expoVectorIcons.createIconSetMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Octicons {
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Octicons] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Octicons](js.Array(this.component, __props.asInstanceOf[IconProps[String]]))
  }
  
  object Button {
    
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.Octicons.Button] = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.Octicons.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps[String]]))
    }
    
    @JSImport("@expo/vector-icons", "Octicons.Button")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: IconButtonProps[String]): SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.Octicons.Button] = new SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.Octicons.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@expo/vector-icons", "Octicons")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps[String]): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Octicons] = new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Octicons](js.Array(this.component, p.asInstanceOf[js.Any]))
}
