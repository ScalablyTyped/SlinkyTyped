package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Namespace)
@js.native
object libDialogMod extends js.Object {
  @js.native
  class DialogBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  
  @js.native
  class DialogFooterBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
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
    /* 2 */ val close: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    /* 1 */ val largeHeader: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
  }
  
}

