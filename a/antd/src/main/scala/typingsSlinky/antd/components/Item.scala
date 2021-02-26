package typingsSlinky.antd.components

import typingsSlinky.antd.listItemMod.ListItemMetaProps
import typingsSlinky.antd.listItemMod.ListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Item {
  
  object Meta {
    
    @JSImport("antd/lib/list/Item", "default.Meta")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Meta.type): SharedBuilder_ListItemMetaProps1028006195 = new SharedBuilder_ListItemMetaProps1028006195(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: ListItemMetaProps): SharedBuilder_ListItemMetaProps1028006195 = new SharedBuilder_ListItemMetaProps1028006195(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd/lib/list/Item", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Item.type): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ListItemProps): SharedBuilder_ListItemProps_1246570549 = new SharedBuilder_ListItemProps_1246570549(js.Array(this.component, p.asInstanceOf[js.Any]))
}
