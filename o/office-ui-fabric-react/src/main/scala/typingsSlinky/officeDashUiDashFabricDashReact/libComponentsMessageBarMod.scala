package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.IMessageBarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/MessageBar", JSImport.Namespace)
@js.native
object libComponentsMessageBarMod extends js.Object {
  @js.native
  class MessageBarBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotBaseMod.MessageBarBase {
    def this(props: IMessageBarProps) = this()
  }
  
  val MessageBar: ReactComponentClass[IMessageBarProps] = js.native
  /* static members */
  @js.native
  object MessageBarBase extends js.Object {
    var defaultProps: IMessageBarProps = js.native
  }
  
  @js.native
  object MessageBarType extends js.Object {
    /* 2 */ val blocked: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.blocked with Double = js.native
    /* 1 */ val error: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.error with Double = js.native
    /* 0 */ val info: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.info with Double = js.native
    /* 90000 */ val remove: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.remove with Double = js.native
    /* 3 */ val severeWarning: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.severeWarning with Double = js.native
    /* 4 */ val success: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.success with Double = js.native
    /* 5 */ val warning: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType.warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsMessageBarMessageBarDotTypesMod.MessageBarType with Double
      ] = js.native
  }
  
}

