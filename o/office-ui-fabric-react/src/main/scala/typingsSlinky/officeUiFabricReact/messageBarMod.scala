package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.messageBarTypesMod.IMessageBarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBarMod {
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBar")
  @js.native
  val MessageBar: ReactComponentClass[IMessageBarProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
  @js.native
  class MessageBarBase protected ()
    extends typingsSlinky.officeUiFabricReact.messageBarBaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  /* static members */
  object MessageBarBase {
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarBase.defaultProps")
    @js.native
    def defaultProps: IMessageBarProps = js.native
    @scala.inline
    def defaultProps_=(x: IMessageBarProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/MessageBar", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
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
