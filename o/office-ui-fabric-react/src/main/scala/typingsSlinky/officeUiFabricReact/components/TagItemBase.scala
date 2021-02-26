package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TagItemBase {
  
  @scala.inline
  def apply(index: Double, item: ITag): SharedBuilder_ITagItemProps_1858524942 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    new SharedBuilder_ITagItemProps_1858524942(js.Array(this.component, __props.asInstanceOf[ITagItemProps]))
  }
  
  @JSImport("office-ui-fabric-react", "TagItemBase")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ITagItemProps): SharedBuilder_ITagItemProps_1858524942 = new SharedBuilder_ITagItemProps_1858524942(js.Array(this.component, p.asInstanceOf[js.Any]))
}
