package typingsSlinky.officeUiFabricReact

import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/Dialog", JSImport.Namespace)
@js.native
object dialogMod extends js.Object {
  
  val Dialog: ReactComponentClass[IDialogProps] = js.native
  
  val DialogContent: ReactComponentClass[IDialogContentProps] = js.native
  
  val DialogFooter: ReactComponentClass[IDialogFooterProps] = js.native
  
  @js.native
  class DialogBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogBaseMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  /* static members */
  @js.native
  object DialogBase extends js.Object {
    
    var defaultProps: IDialogProps = js.native
  }
  
  @js.native
  class DialogContentBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogContentBaseMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  /* static members */
  @js.native
  object DialogContentBase extends js.Object {
    
    var defaultProps: IDialogContentProps = js.native
  }
  
  @js.native
  class DialogFooterBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogFooterBaseMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
  @js.native
  object DialogType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
    
    /* 2 */ val close: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    
    /* 1 */ val largeHeader: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double
      ] = js.native
    
    /* 2 */ val large: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    
    /* 1 */ val medium: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    
    /* 0 */ val small: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    
    /* 999 */ val unknown: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    
    /* 3 */ val xLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    
    /* 4 */ val xxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    
    /* 5 */ val xxxLarge: typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
  }
}
