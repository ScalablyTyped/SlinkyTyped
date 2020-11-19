package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.verticalDividerTypesMod.IVerticalDividerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VerticalDividerBase {
  
  @JSImport("office-ui-fabric-react/lib/components/Divider/VerticalDivider.base", "VerticalDividerBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: IVerticalDividerProps): SharedBuilder_IVerticalDividerProps_601226333 = new SharedBuilder_IVerticalDividerProps_601226333(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: VerticalDividerBase.type): SharedBuilder_IVerticalDividerProps_601226333 = new SharedBuilder_IVerticalDividerProps_601226333(js.Array(this.component, js.Dictionary.empty))()
}
