package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.groupFooterTypesMod.IGroupFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GroupFooterBase {
  
  @JSImport("office-ui-fabric-react/lib/components/GroupedList/GroupFooter.base", "GroupFooterBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IGroupFooterProps): SharedBuilder_IGroupFooterProps_1687232494 = new SharedBuilder_IGroupFooterProps_1687232494(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: GroupFooterBase.type): SharedBuilder_IGroupFooterProps_1687232494 = new SharedBuilder_IGroupFooterProps_1687232494(js.Array(this.component, js.Dictionary.empty))()
}
