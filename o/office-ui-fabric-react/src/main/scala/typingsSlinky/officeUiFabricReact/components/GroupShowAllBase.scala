package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object GroupShowAllBase {
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupShowAll.base", "GroupShowAllBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IGroupShowAllProps): SharedBuilder_IGroupShowAllProps_1085117924 = new SharedBuilder_IGroupShowAllProps_1085117924(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: GroupShowAllBase.type): SharedBuilder_IGroupShowAllProps_1085117924 = new SharedBuilder_IGroupShowAllProps_1085117924(js.Array(this.component, js.Dictionary.empty))()
}

