package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITag
import typingsSlinky.officeUiFabricReact.tagPickerTypesMod.ITagItemProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object TagItem {
  @JSImport("office-ui-fabric-react", "TagItem")
  @js.native
  object component extends js.Object
  
  def withProps(p: ITagItemProps): SharedBuilder_ITagItemProps_1858524942 = new SharedBuilder_ITagItemProps_1858524942(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(index: Double, item: ITag): SharedBuilder_ITagItemProps_1858524942 = {
    val __props = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    new SharedBuilder_ITagItemProps_1858524942(js.Array(this.component, __props.asInstanceOf[ITagItemProps]))
  }
}

