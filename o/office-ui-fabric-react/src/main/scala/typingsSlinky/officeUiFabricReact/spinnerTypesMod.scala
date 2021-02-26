package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.assertive
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.off
import typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.polite
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerTypesMod {
  
  @js.native
  sealed trait SpinnerSize extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerSize")
  @js.native
  object SpinnerSize extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpinnerSize with Double] = js.native
    
    /**
      * 28px Spinner diameter
      */
    @js.native
    sealed trait large extends SpinnerSize
    /* 3 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.large with Double = js.native
    
    /**
      * 20px Spinner diameter
      */
    @js.native
    sealed trait medium extends SpinnerSize
    /* 2 */ val medium: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.medium with Double = js.native
    
    /**
      * 16px Spinner diameter
      */
    @js.native
    sealed trait small extends SpinnerSize
    /* 1 */ val small: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.small with Double = js.native
    
    /**
      * 12px Spinner diameter
      */
    @js.native
    sealed trait xSmall extends SpinnerSize
    /* 0 */ val xSmall: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerSize.xSmall with Double = js.native
  }
  
  @js.native
  sealed trait SpinnerType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Spinner/Spinner.types", "SpinnerType")
  @js.native
  object SpinnerType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SpinnerType with Double] = js.native
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.large` instead.
      * @deprecated Use `SpinnerSize.large` instead.
      */
    @js.native
    sealed trait large extends SpinnerType
    /* 1 */ val large: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.large with Double = js.native
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize.medium` instead.
      * @deprecated Use `SpinnerSize.medium` instead.
      */
    @js.native
    sealed trait normal extends SpinnerType
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.spinnerTypesMod.SpinnerType.normal with Double = js.native
  }
  
  @js.native
  trait ISpinner extends StObject
  
  @js.native
  trait ISpinnerProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * Alternative status label for screen reader
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Politeness setting for label update announcement.
      * @defaultvalue polite
      */
    var ariaLive: js.UndefOr[assertive | polite | off] = js.native
    
    /**
      * Optional callback to access the ISpinner interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[ISpinner]] = js.native
    
    /**
      * The label to show next to the Spinner. Label updates will be announced to the screen readers.
      * Use ariaLive to control politeness level.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * The position of the label in regards of the spinner animation.
      * @defaultvalue SpinnerLabelPosition.bottom
      */
    var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.native
    
    /**
      * The size of Spinner to render. \{ extraSmall, small, medium, large \}
      * @defaultvalue SpinnerType.medium
      */
    var size: js.UndefOr[SpinnerSize] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]] = js.native
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Deprecated and will be removed at \>= 2.0.0. Use `SpinnerSize` instead.
      * @deprecated Use `SpinnerSize` instead.
      */
    var `type`: js.UndefOr[SpinnerType] = js.native
  }
  object ISpinnerProps {
    
    @scala.inline
    def apply(): ISpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinnerProps]
    }
    
    @scala.inline
    implicit class ISpinnerPropsMutableBuilder[Self <: ISpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAriaLive(value: assertive | polite | off): Self = StObject.set(x, "ariaLive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLiveUndefined: Self = StObject.set(x, "ariaLive", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[ISpinner]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ ISpinner | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[ISpinner]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPosition(value: SpinnerLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[ISpinnerStyleProps, ISpinnerStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: ISpinnerStyleProps => DeepPartial[ISpinnerStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setType(value: SpinnerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ISpinnerStyleProps extends StObject {
    
    /** CSS class name for the component attached to the root stylable area. */
    var className: js.UndefOr[String] = js.native
    
    /** Position of the label in regards to the spinner animation. */
    var labelPosition: js.UndefOr[SpinnerLabelPosition] = js.native
    
    /** Size of the spinner animation. */
    var size: js.UndefOr[SpinnerSize] = js.native
    
    /** Theme provided by High-Order Component. */
    var theme: ITheme = js.native
  }
  object ISpinnerStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): ISpinnerStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ISpinnerStyleProps]
    }
    
    @scala.inline
    implicit class ISpinnerStylePropsMutableBuilder[Self <: ISpinnerStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setLabelPosition(value: SpinnerLabelPosition): Self = StObject.set(x, "labelPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelPositionUndefined: Self = StObject.set(x, "labelPosition", js.undefined)
      
      @scala.inline
      def setSize(value: SpinnerSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ISpinnerStyles extends StObject {
    
    /** Styles for the spinner circle animation. */
    var circle: js.UndefOr[IStyle] = js.native
    
    /** Styles for the label accompanying the circle. */
    var label: js.UndefOr[IStyle] = js.native
    
    /** Styles for the root element. Refers to the wrapper containing both the circle and the label. */
    var root: js.UndefOr[IStyle] = js.native
    
    /** Styles for the hidden helper element to aid with screen readers. */
    var screenReaderText: js.UndefOr[IStyle] = js.native
  }
  object ISpinnerStyles {
    
    @scala.inline
    def apply(): ISpinnerStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISpinnerStyles]
    }
    
    @scala.inline
    implicit class ISpinnerStylesMutableBuilder[Self <: ISpinnerStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircle(value: IStyle): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircleNull: Self = StObject.set(x, "circle", null)
      
      @scala.inline
      def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
      
      @scala.inline
      def setLabel(value: IStyle): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelNull: Self = StObject.set(x, "label", null)
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderText(value: IStyle): Self = StObject.set(x, "screenReaderText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderTextNull: Self = StObject.set(x, "screenReaderText", null)
      
      @scala.inline
      def setScreenReaderTextUndefined: Self = StObject.set(x, "screenReaderText", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.top
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.right
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.bottom
    - typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.left
  */
  trait SpinnerLabelPosition extends StObject
  object SpinnerLabelPosition {
    
    @scala.inline
    def bottom: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.bottom = "bottom".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.bottom]
    
    @scala.inline
    def left: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.left = "left".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.left]
    
    @scala.inline
    def right: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.right = "right".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.right]
    
    @scala.inline
    def top: typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.top = "top".asInstanceOf[typingsSlinky.officeUiFabricReact.officeUiFabricReactStrings.top]
  }
}
