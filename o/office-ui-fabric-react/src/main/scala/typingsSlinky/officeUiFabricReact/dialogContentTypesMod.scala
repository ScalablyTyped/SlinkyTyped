package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogContentBaseMod.DialogContentBase
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dialogContentTypesMod {
  
  @js.native
  sealed trait DialogType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.types", "DialogType")
  @js.native
  object DialogType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DialogType with Double] = js.native
    
    /** Dialog with an 'x' close button in the upper-right corner */
    @js.native
    sealed trait close extends DialogType
    /* 2 */ val close: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.close with Double = js.native
    
    /** Dialog with large header banner */
    @js.native
    sealed trait largeHeader extends DialogType
    /* 1 */ val largeHeader: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.largeHeader with Double = js.native
    
    /** Standard dialog */
    @js.native
    sealed trait normal extends DialogType
    /* 0 */ val normal: typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType.normal with Double = js.native
  }
  
  @JSImport("office-ui-fabric-react/lib/components/Dialog/DialogContent.types", "ResponsiveMode")
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
  
  @js.native
  trait IDialogContent extends StObject
  
  @js.native
  trait IDialogContentProps extends ClassAttributes[DialogContentBase] {
    
    /**
      * Optional override class name
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Label to be passed to to aria-label of close button
      * @defaultvalue Close
      */
    var closeButtonAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IDialogContent interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IDialogContent]] = js.native
    
    /**
      * The classname for when the header is draggable
      */
    var draggableHeaderClassName: js.UndefOr[String] = js.native
    
    /**
      * Is inside a multiline wrapper
      */
    var isMultiline: js.UndefOr[Boolean] = js.native
    
    /**
      * Callback for when the Dialog is dismissed from the close button or light dismiss, before the animation completes.
      */
    var onDismiss: js.UndefOr[js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]], _]] = js.native
    
    /**
      * Responsive mode passed in from decorator.
      */
    var responsiveMode: js.UndefOr[ResponsiveMode] = js.native
    
    /**
      * Show an 'x' close button in the upper-right corner
      */
    var showCloseButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]] = js.native
    
    /**
      * The subtext to display in the dialog
      */
    var subText: js.UndefOr[String] = js.native
    
    /**
      * The Id for subText container
      */
    var subTextId: js.UndefOr[String] = js.native
    
    /**
      * Theme provided by HOC.
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * The title text to display at the top of the dialog.
      */
    var title: js.UndefOr[String | ReactElement] = js.native
    
    /**
      * The Id for title container
      *
      * @deprecated use the `id` attribute in `titleProps` instead.
      */
    var titleId: js.UndefOr[String] = js.native
    
    /**
      * The props for title container.
      */
    var titleProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.native
    
    /**
      * Other top buttons that will show up next to the close button
      */
    var topButtonsProps: js.UndefOr[js.Array[IButtonProps]] = js.native
    
    /**
      * The type of Dialog to display.
      * @defaultvalue DialogType.normal
      */
    var `type`: js.UndefOr[DialogType] = js.native
  }
  object IDialogContentProps {
    
    @scala.inline
    def apply(): IDialogContentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogContentProps]
    }
    
    @scala.inline
    implicit class IDialogContentPropsMutableBuilder[Self <: IDialogContentProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCloseButtonAriaLabel(value: String): Self = StObject.set(x, "closeButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseButtonAriaLabelUndefined: Self = StObject.set(x, "closeButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IDialogContent]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IDialogContent | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IDialogContent]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDraggableHeaderClassName(value: String): Self = StObject.set(x, "draggableHeaderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableHeaderClassNameUndefined: Self = StObject.set(x, "draggableHeaderClassName", js.undefined)
      
      @scala.inline
      def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setResponsiveMode(value: ResponsiveMode): Self = StObject.set(x, "responsiveMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveModeUndefined: Self = StObject.set(x, "responsiveMode", js.undefined)
      
      @scala.inline
      def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IDialogContentStyleProps => DeepPartial[IDialogContentStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setSubText(value: String): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextId(value: String): Self = StObject.set(x, "subTextId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextIdUndefined: Self = StObject.set(x, "subTextId", js.undefined)
      
      @scala.inline
      def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTitle(value: String | ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
      
      @scala.inline
      def setTitleProps(value: HTMLAttributes[HTMLDivElement]): Self = StObject.set(x, "titleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitlePropsUndefined: Self = StObject.set(x, "titleProps", js.undefined)
      
      @scala.inline
      def setTitleReactElement(value: ReactElement): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopButtonsProps(value: js.Array[IButtonProps]): Self = StObject.set(x, "topButtonsProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopButtonsPropsUndefined: Self = StObject.set(x, "topButtonsProps", js.undefined)
      
      @scala.inline
      def setTopButtonsPropsVarargs(value: IButtonProps*): Self = StObject.set(x, "topButtonsProps", js.Array(value :_*))
      
      @scala.inline
      def setType(value: DialogType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait IDialogContentStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * The classname for when the header is draggable
      */
    var draggableHeaderClassName: js.UndefOr[String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var isClose: js.UndefOr[Boolean] = js.native
    
    var isLargeHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * Is inside a multiline wrapper
      */
    var isMultiline: js.UndefOr[Boolean] = js.native
    
    /**
      * Accept theme prop.
      */
    var theme: ITheme = js.native
  }
  object IDialogContentStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IDialogContentStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDialogContentStyleProps]
    }
    
    @scala.inline
    implicit class IDialogContentStylePropsMutableBuilder[Self <: IDialogContentStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDraggableHeaderClassName(value: String): Self = StObject.set(x, "draggableHeaderClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableHeaderClassNameUndefined: Self = StObject.set(x, "draggableHeaderClassName", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIsClose(value: Boolean): Self = StObject.set(x, "isClose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCloseUndefined: Self = StObject.set(x, "isClose", js.undefined)
      
      @scala.inline
      def setIsLargeHeader(value: Boolean): Self = StObject.set(x, "isLargeHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLargeHeaderUndefined: Self = StObject.set(x, "isLargeHeader", js.undefined)
      
      @scala.inline
      def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IDialogContentStyles extends StObject {
    
    var button: IStyle = js.native
    
    /**
      * Style for the content element.
      */
    var content: IStyle = js.native
    
    var header: IStyle = js.native
    
    var inner: IStyle = js.native
    
    var innerContent: IStyle = js.native
    
    var subText: IStyle = js.native
    
    var title: IStyle = js.native
    
    var topButton: IStyle = js.native
  }
  object IDialogContentStyles {
    
    @scala.inline
    def apply(): IDialogContentStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDialogContentStyles]
    }
    
    @scala.inline
    implicit class IDialogContentStylesMutableBuilder[Self <: IDialogContentStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButton(value: IStyle): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonNull: Self = StObject.set(x, "button", null)
      
      @scala.inline
      def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setHeader(value: IStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderNull: Self = StObject.set(x, "header", null)
      
      @scala.inline
      def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      @scala.inline
      def setInner(value: IStyle): Self = StObject.set(x, "inner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContent(value: IStyle): Self = StObject.set(x, "innerContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContentNull: Self = StObject.set(x, "innerContent", null)
      
      @scala.inline
      def setInnerContentUndefined: Self = StObject.set(x, "innerContent", js.undefined)
      
      @scala.inline
      def setInnerNull: Self = StObject.set(x, "inner", null)
      
      @scala.inline
      def setInnerUndefined: Self = StObject.set(x, "inner", js.undefined)
      
      @scala.inline
      def setSubText(value: IStyle): Self = StObject.set(x, "subText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubTextNull: Self = StObject.set(x, "subText", null)
      
      @scala.inline
      def setSubTextUndefined: Self = StObject.set(x, "subText", js.undefined)
      
      @scala.inline
      def setTitle(value: IStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleNull: Self = StObject.set(x, "title", null)
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTopButton(value: IStyle): Self = StObject.set(x, "topButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopButtonNull: Self = StObject.set(x, "topButton", null)
      
      @scala.inline
      def setTopButtonUndefined: Self = StObject.set(x, "topButton", js.undefined)
    }
  }
}
