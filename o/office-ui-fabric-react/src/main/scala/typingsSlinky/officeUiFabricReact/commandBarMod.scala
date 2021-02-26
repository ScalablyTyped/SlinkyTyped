package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.commandBarTypesMod.ICommandBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commandBarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar", "CommandBar")
  @js.native
  val CommandBar: ReactComponentClass[ICommandBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/CommandBar", "CommandBarBase")
  @js.native
  class CommandBarBase protected ()
    extends typingsSlinky.officeUiFabricReact.commandBarBaseMod.CommandBarBase {
    def this(props: ICommandBarProps) = this()
  }
  /* static members */
  object CommandBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar", "CommandBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/CommandBar", "CommandBarBase.defaultProps")
    @js.native
    def defaultProps: ICommandBarProps = js.native
    @scala.inline
    def defaultProps_=(x: ICommandBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
