package typingsSlinky.expoVectorIcons.components

import typingsSlinky.expoVectorIcons.createIconSetMod.IconButtonProps
import typingsSlinky.expoVectorIcons.createIconSetMod.IconProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fontisto {
  
  @JSImport("@expo/vector-icons", "Fontisto")
  @js.native
  object component extends js.Object
  
  def withProps(p: IconProps[String]): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Fontisto] = new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Fontisto](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(name: String): SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Fontisto] = {
    val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    new SharedBuilder_IconProps1974345922[typingsSlinky.expoVectorIcons.mod.Fontisto](js.Array(this.component, __props.asInstanceOf[IconProps[String]]))
  }
  
  object Button {
    
    @JSImport("@expo/vector-icons", "Fontisto.Button")
    @js.native
    object component extends js.Object
    
    def withProps(p: IconButtonProps[String]): SharedBuilder_IconButtonProps_740635817 = new SharedBuilder_IconButtonProps_740635817(js.Array(this.component, p.asInstanceOf[js.Any]))
    
    @scala.inline
    def apply(name: String): SharedBuilder_IconButtonProps_740635817 = {
      val __props = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      new SharedBuilder_IconButtonProps_740635817(js.Array(this.component, __props.asInstanceOf[IconButtonProps[String]]))
    }
  }
}
