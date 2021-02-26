package typingsSlinky.expoVectorIcons.components

import typingsSlinky.expoVectorIcons.createIconSetMod.IconButtonProps
import typingsSlinky.expoVectorIcons.createIconSetMod.IconProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleLineIcons {
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons](js.Array(this.component, __props.asInstanceOf[IconProps[String]]))
  }
  
  object Button {
    
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons.Button] = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons.Button](js.Array(this.component, __props.asInstanceOf[IconButtonProps[String]]))
    }
    
    @JSImport("@expo/vector-icons", "SimpleLineIcons.Button")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: IconButtonProps[String]): SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons.Button] = new SharedBuilder_IconButtonProps1530823689[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons.Button](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@expo/vector-icons", "SimpleLineIcons")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: IconProps[String]): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons] = new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.SimpleLineIcons](js.Array(this.component, p.asInstanceOf[js.Any]))
}
