package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/MessageBar", JSImport.Namespace)
@js.native
object messageBarMod extends js.Object {
  
  val MessageBar: ReactComponentClass[IMessageBarProps] = js.native
  
  @js.native
  class MessageBarBase protected ()
    extends typingsSlinky.officeUiFabricReact.messageBarBaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  /* static members */
  @js.native
  object MessageBarBase extends js.Object {
    
    var defaultProps: IMessageBarProps = js.native
  }
  
  @js.native
  object MessageBarType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType with Double] = js.native
    
    /* 2 */ val blocked: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked with Double = js.native
    
    /* 1 */ val error: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.error with Double = js.native
    
    /* 0 */ val info: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.info with Double = js.native
    
    /* 3 */ val severeWarning: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning with Double = js.native
    
    /* 4 */ val success: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.success with Double = js.native
    
    /* 5 */ val warning: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning with Double = js.native
  }
}
