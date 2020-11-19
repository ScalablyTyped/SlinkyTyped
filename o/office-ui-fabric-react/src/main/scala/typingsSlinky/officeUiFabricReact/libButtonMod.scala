package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.officeUiFabricReact.anon.PartialIBaseButtonProps
import typingsSlinky.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/Button", JSImport.Namespace)
@js.native
object libButtonMod extends js.Object {
  
  val CommandButton: Instantiable0[typingsSlinky.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  
  @js.native
  class ActionButton ()
    extends typingsSlinky.officeUiFabricReact.actionButtonMod.ActionButton
  
  @js.native
  class BaseButton protected ()
    extends typingsSlinky.officeUiFabricReact.buttonMod.BaseButton {
    def this(props: IBaseButtonProps) = this()
  }
  /* static members */
  @js.native
  object BaseButton extends js.Object {
    
    var defaultProps: PartialIBaseButtonProps = js.native
  }
  
  @js.native
  class Button protected ()
    extends typingsSlinky.officeUiFabricReact.buttonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @js.native
  object ButtonType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType with Double] = js.native
    
    /* 4 */ val command: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    
    /* 3 */ val compound: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    
    /* 6 */ val default: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    
    /* 2 */ val hero: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    
    /* 5 */ val icon: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    
    /* 1 */ val primary: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
  }
  
  @js.native
  class CommandBarButton ()
    extends typingsSlinky.officeUiFabricReact.commandBarButtonMod.CommandBarButton
  
  @js.native
  class CompoundButton ()
    extends typingsSlinky.officeUiFabricReact.compoundButtonMod.CompoundButton
  
  @js.native
  class DefaultButton ()
    extends typingsSlinky.officeUiFabricReact.defaultButtonMod.DefaultButton
  
  @js.native
  object ElementType extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType with Double] = js.native
    
    /* 1 */ val anchor: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    
    /* 0 */ val button: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
  }
  
  @js.native
  class IconButton ()
    extends typingsSlinky.officeUiFabricReact.iconButtonMod.IconButton
  
  @js.native
  class MessageBarButton ()
    extends typingsSlinky.officeUiFabricReact.messageBarButtonMod.MessageBarButton
  
  @js.native
  class PrimaryButton ()
    extends typingsSlinky.officeUiFabricReact.primaryButtonMod.PrimaryButton
}
