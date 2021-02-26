package typingsSlinky.officeUiFabricReact

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.officeUiFabricReact.anon.PartialIBaseButtonProps
import typingsSlinky.officeUiFabricReact.baseButtonMod.IBaseButtonProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonStyles
import typingsSlinky.officeUiFabricReact.splitButtonClassNamesMod.ISplitButtonClassNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ActionButton")
  @js.native
  class ActionButton protected ()
    extends typingsSlinky.officeUiFabricReact.actionButtonMod.ActionButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton")
  @js.native
  class BaseButton protected ()
    extends typingsSlinky.officeUiFabricReact.baseButtonMod.BaseButton {
    def this(props: IBaseButtonProps) = this()
  }
  /* static members */
  object BaseButton {
    
    @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("office-ui-fabric-react/lib/components/Button", "BaseButton.defaultProps")
    @js.native
    def defaultProps: PartialIBaseButtonProps = js.native
    @scala.inline
    def defaultProps_=(x: PartialIBaseButtonProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "Button")
  @js.native
  class Button protected ()
    extends typingsSlinky.officeUiFabricReact.buttonButtonMod.Button {
    def this(props: IButtonProps) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ButtonType")
  @js.native
  object ButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType with Double] = js.native
    
    /* 6 */ val default: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.default with Double = js.native
    
    /* 4 */ val command: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.command with Double = js.native
    
    /* 3 */ val compound: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.compound with Double = js.native
    
    /* 2 */ val hero: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.hero with Double = js.native
    
    /* 5 */ val icon: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.icon with Double = js.native
    
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.normal with Double = js.native
    
    /* 1 */ val primary: typingsSlinky.officeUiFabricReact.buttonTypesMod.ButtonType.primary with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandBarButton")
  @js.native
  class CommandBarButton protected ()
    extends typingsSlinky.officeUiFabricReact.commandBarButtonMod.CommandBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  class CommandButton ()
    extends typingsSlinky.officeUiFabricReact.actionButtonMod.ActionButton
  @JSImport("office-ui-fabric-react/lib/components/Button", "CommandButton")
  @js.native
  val CommandButton: Instantiable0[typingsSlinky.officeUiFabricReact.actionButtonMod.ActionButton] = js.native
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "CompoundButton")
  @js.native
  class CompoundButton protected ()
    extends typingsSlinky.officeUiFabricReact.compoundButtonMod.CompoundButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "DefaultButton")
  @js.native
  class DefaultButton protected ()
    extends typingsSlinky.officeUiFabricReact.defaultButtonMod.DefaultButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "ElementType")
  @js.native
  object ElementType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType with Double] = js.native
    
    /* 1 */ val anchor: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.anchor with Double = js.native
    
    /* 0 */ val button: typingsSlinky.officeUiFabricReact.buttonTypesMod.ElementType.button with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "IconButton")
  @js.native
  class IconButton protected ()
    extends typingsSlinky.officeUiFabricReact.iconButtonMod.IconButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "MessageBarButton")
  @js.native
  class MessageBarButton protected ()
    extends typingsSlinky.officeUiFabricReact.messageBarButtonMod.MessageBarButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "PrimaryButton")
  @js.native
  class PrimaryButton protected ()
    extends typingsSlinky.officeUiFabricReact.primaryButtonMod.PrimaryButton {
    def this(props: IButtonProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IButtonProps, context: js.Any) = this()
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Button", "getSplitButtonClassNames")
  @js.native
  def getSplitButtonClassNames(styles: IButtonStyles, disabled: Boolean, expanded: Boolean, checked: Boolean): ISplitButtonClassNames = js.native
  @JSImport("office-ui-fabric-react/lib/components/Button", "getSplitButtonClassNames")
  @js.native
  def getSplitButtonClassNames(
    styles: IButtonStyles,
    disabled: Boolean,
    expanded: Boolean,
    checked: Boolean,
    primaryDisabled: Boolean
  ): ISplitButtonClassNames = js.native
}
