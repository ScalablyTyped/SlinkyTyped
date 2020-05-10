package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.separatorTypesMod.ISeparatorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SeparatorBase {
  @JSImport("office-ui-fabric-react", "SeparatorBase")
  @js.native
  object component extends js.Object
  
  def withProps(p: ISeparatorProps): SharedBuilder_ISeparatorProps286181022 = new SharedBuilder_ISeparatorProps286181022(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: SeparatorBase.type): SharedBuilder_ISeparatorProps286181022 = new SharedBuilder_ISeparatorProps286181022(js.Array(this.component, js.Dictionary.empty))()
}

