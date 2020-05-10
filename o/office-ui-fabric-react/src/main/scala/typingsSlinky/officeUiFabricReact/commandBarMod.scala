package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/CommandBar", JSImport.Namespace)
@js.native
object commandBarMod extends js.Object {
  @js.native
  class CommandBarBase protected ()
    extends typingsSlinky.officeUiFabricReact.commandBarBaseMod.CommandBarBase {
    def this(props: ICommandBarProps) = this()
  }
  
  val CommandBar: ReactComponentClass[ICommandBarProps] = js.native
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    var defaultProps: ICommandBarProps = js.native
  }
  
}

