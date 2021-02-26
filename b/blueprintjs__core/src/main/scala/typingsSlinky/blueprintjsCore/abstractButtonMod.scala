package typingsSlinky.blueprintjsCore

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import typingsSlinky.blueprintjsCore.alignmentMod.Alignment
import typingsSlinky.blueprintjsCore.anon.ClassName
import typingsSlinky.blueprintjsCore.anon.IsActive
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.button
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.reset
import typingsSlinky.blueprintjsCore.blueprintjsCoreStrings.submit
import typingsSlinky.blueprintjsCore.commonMod.AbstractPureComponent2
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.IElementRefProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.refsMod.IRefObject
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object abstractButtonMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/button/abstractButton", "AbstractButton")
  @js.native
  abstract class AbstractButton[H /* <: HTMLAttributes[HTMLElement] */] protected ()
    extends AbstractPureComponent2[IButtonProps with H, IButtonState, js.Object] {
    def this(props: IButtonProps with H) = this()
    def this(props: IButtonProps with H, context: js.Any) = this()
    
    var buttonRef: HTMLElement | IRefObject[HTMLElement] | Null = js.native
    
    var currentKeyDown: js.Any = js.native
    
    /* protected */ def getCommonButtonProps(): ClassName[H] = js.native
    
    /* protected */ def handleBlur(e: SyntheticFocusEvent[_]): Unit = js.native
    
    /* protected */ def handleKeyDown(e: SyntheticKeyboardEvent[_]): Unit = js.native
    
    /* protected */ def handleKeyUp(e: SyntheticKeyboardEvent[_]): Unit = js.native
    
    /* protected */ def renderChildren(): ReactElement = js.native
    
    @JSName("state")
    var state_AbstractButton: IsActive = js.native
  }
  
  @js.native
  trait IButtonProps
    extends IActionProps
       with IElementRefProps[js.Any] {
    
    /**
      * If set to `true`, the button will display in an active state.
      * This is equivalent to setting `className={Classes.ACTIVE}`.
      * @default false
      */
    var active: js.UndefOr[Boolean] = js.native
    
    /**
      * Text alignment within button. By default, icons and text will be centered
      * within the button. Passing `"left"` or `"right"` will align the button
      * text to that side and push `icon` and `rightIcon` to either edge. Passing
      * `"center"` will center the text and icons together.
      * @default Alignment.CENTER
      */
    var alignText: js.UndefOr[Alignment] = js.native
    
    /** Whether this button should expand to fill its container. */
    var fill: js.UndefOr[Boolean] = js.native
    
    /** Whether this button should use large styles. */
    var large: js.UndefOr[Boolean] = js.native
    
    /**
      * If set to `true`, the button will display a centered loading spinner instead of its contents.
      * The width of the button is not affected by the value of this prop.
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    /** Whether this button should use minimal styles. */
    var minimal: js.UndefOr[Boolean] = js.native
    
    /** Whether this button should use outlined styles. */
    var outlined: js.UndefOr[Boolean] = js.native
    
    /** Name of a Blueprint UI icon (or an icon element) to render after the text. */
    var rightIcon: js.UndefOr[IconName | MaybeElement] = js.native
    
    /** Whether this button should use small styles. */
    var small: js.UndefOr[Boolean] = js.native
    
    /**
      * HTML `type` attribute of button. Accepted values are `"button"`, `"submit"`, and `"reset"`.
      * Note that this prop has no effect on `AnchorButton`; it only affects `Button`.
      * @default "button"
      */
    var `type`: js.UndefOr[submit | reset | button] = js.native
  }
  object IButtonProps {
    
    @scala.inline
    def apply(): IButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IButtonProps]
    }
    
    @scala.inline
    implicit class IButtonPropsMutableBuilder[Self <: IButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setAlignText(value: Alignment): Self = StObject.set(x, "alignText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignTextUndefined: Self = StObject.set(x, "alignText", js.undefined)
      
      @scala.inline
      def setFill(value: Boolean): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMinimal(value: Boolean): Self = StObject.set(x, "minimal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinimalUndefined: Self = StObject.set(x, "minimal", js.undefined)
      
      @scala.inline
      def setOutlined(value: Boolean): Self = StObject.set(x, "outlined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlinedUndefined: Self = StObject.set(x, "outlined", js.undefined)
      
      @scala.inline
      def setRightIcon(value: IconName | MaybeElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconNull: Self = StObject.set(x, "rightIcon", null)
      
      @scala.inline
      def setRightIconReactElement(value: ReactElement): Self = StObject.set(x, "rightIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightIconUndefined: Self = StObject.set(x, "rightIcon", js.undefined)
      
      @scala.inline
      def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      @scala.inline
      def setType(value: submit | reset | button): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IButtonState extends StObject {
    
    var isActive: Boolean = js.native
  }
  object IButtonState {
    
    @scala.inline
    def apply(isActive: Boolean): IButtonState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IButtonState]
    }
    
    @scala.inline
    implicit class IButtonStateMutableBuilder[Self <: IButtonState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
