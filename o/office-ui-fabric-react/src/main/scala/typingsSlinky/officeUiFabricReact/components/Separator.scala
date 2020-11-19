package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.separatorTypesMod.ISeparatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Separator {
  
  @JSImport("office-ui-fabric-react", "Separator")
  @js.native
  object component extends js.Object
  
  def withProps(p: ISeparatorProps): SharedBuilder_ISeparatorProps286181022 = new SharedBuilder_ISeparatorProps286181022(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Separator.type): SharedBuilder_ISeparatorProps286181022 = new SharedBuilder_ISeparatorProps286181022(js.Array(this.component, js.Dictionary.empty))()
}
