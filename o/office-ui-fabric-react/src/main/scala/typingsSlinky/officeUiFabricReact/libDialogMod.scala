package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogFooterTypesMod.IDialogFooterProps
import typingsSlinky.officeUiFabricReact.dialogTypesMod.IDialogProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDialogMod extends Shortcut {
  
  @JSImport("office-ui-fabric-react/lib/Dialog", JSImport.Default)
  @js.native
  val default: ReactComponentClass[IDialogProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "Dialog")
  @js.native
  val Dialog: ReactComponentClass[IDialogProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase")
  @js.native
  class DialogBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogBase {
    def this(props: IDialogProps) = this()
  }
  /* static members */
  object DialogBase {
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogBase.defaultProps")
    @js.native
    def defaultProps: IDialogProps = js.native
    @scala.inline
    def defaultProps_=(x: IDialogProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContent")
  @js.native
  val DialogContent: ReactComponentClass[IDialogContentProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase")
  @js.native
  class DialogContentBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogContentBase {
    def this(props: IDialogContentProps) = this()
  }
  /* static members */
  object DialogContentBase {
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase.defaultProps")
    @js.native
    def defaultProps: IDialogContentProps = js.native
    @scala.inline
    def defaultProps_=(x: IDialogContentProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogFooter")
  @js.native
  val DialogFooter: ReactComponentClass[IDialogFooterProps] = js.native
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogFooterBase")
  @js.native
  class DialogFooterBase protected ()
    extends typingsSlinky.officeUiFabricReact.dialogMod.DialogFooterBase {
    def this(props: IDialogFooterProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogType")
  @js.native
  object DialogType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType with Double] = js.native
    
    /* 2 */ val close: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    
    /* 1 */ val largeHeader: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/Dialog", "ResponsiveMode")
  @js.native
  object ResponsiveMode extends StObject {
    
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
  
  type _To = ReactComponentClass[IDialogProps]
  
  /* This means you don't have to write `default`, but can instead just say `libDialogMod.foo` */
  override def _to: ReactComponentClass[IDialogProps] = default
}
