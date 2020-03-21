package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.overflowSetTypesMod.IOverflowSetProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/OverflowSet", JSImport.Namespace)
@js.native
object libOverflowSetMod extends js.Object {
  @js.native
  class OverflowSetBase protected ()
    extends typingsSlinky.officeUiFabricReact.overflowSetMod.OverflowSetBase {
    def this(props: IOverflowSetProps) = this()
  }
  
  val OverflowSet: ReactComponentClass[IOverflowSetProps] = js.native
}

