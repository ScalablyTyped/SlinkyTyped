package typingsSlinky.officeUiFabricReact.components

import typingsSlinky.officeUiFabricReact.checkTypesMod.ICheckProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Check {
  @JSImport("office-ui-fabric-react", "Check")
  @js.native
  object component extends js.Object
  
  def withProps(p: ICheckProps): SharedBuilder_ICheckProps839741726 = new SharedBuilder_ICheckProps839741726(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Check.type): SharedBuilder_ICheckProps839741726 = new SharedBuilder_ICheckProps839741726(js.Array(this.component, js.Dictionary.empty))()
}

