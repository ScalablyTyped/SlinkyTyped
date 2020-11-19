package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.groupShowAllTypesMod.IGroupShowAllProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupShowAll {
  
  @JSImport("office-ui-fabric-react", "GroupShowAll")
  @js.native
  object component extends js.Object
  
  def withProps(p: IGroupShowAllProps): SharedBuilder_IGroupShowAllProps_1085117924 = new SharedBuilder_IGroupShowAllProps_1085117924(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GroupShowAll.type): SharedBuilder_IGroupShowAllProps_1085117924 = new SharedBuilder_IGroupShowAllProps_1085117924(js.Array(this.component, js.Dictionary.empty))()
}
