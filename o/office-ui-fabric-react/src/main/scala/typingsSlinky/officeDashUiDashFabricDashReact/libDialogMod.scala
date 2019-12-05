package typingsSlinky.officeDashUiDashFabricDashReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogDotTypesMod.IDialogProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogFooterDotTypesMod.IDialogFooterProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Namespace)
@js.native
object libDialogMod extends js.Object {
  @js.native
  class DialogBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  
  @js.native
  class DialogFooterBase ()
    extends typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogFooterDotBaseMod.DialogFooterBase
  
  val Dialog: ReactComponentClass[IDialogProps] = js.native
  val DialogContent: ReactComponentClass[IDialogContentProps] = js.native
  val DialogFooter: ReactComponentClass[IDialogFooterProps] = js.native
  val default: ReactComponentClass[IDialogProps] = js.native
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    var defaultProps: IDialogProps = js.native
  }
  
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    var defaultProps: IDialogContentProps = js.native
  }
  
  @js.native
  object DialogType extends js.Object {
    /* 2 */ val close: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.close with Double = js.native
    /* 1 */ val largeHeader: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.largeHeader with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType with Double
      ] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

