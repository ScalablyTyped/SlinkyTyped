package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/CommandBar", JSImport.Namespace)
@js.native
object libCommandBarMod extends js.Object {
  
  val CommandBar: ReactComponentClass[ICommandBarProps] = js.native
  
  @js.native
  class CommandBarBase protected ()
    extends typingsSlinky.officeUiFabricReact.commandBarMod.CommandBarBase {
    def this(props: ICommandBarProps) = this()
  }
  /* static members */
  @js.native
  object CommandBarBase extends js.Object {
    
    var defaultProps: ICommandBarProps = js.native
  }
}
