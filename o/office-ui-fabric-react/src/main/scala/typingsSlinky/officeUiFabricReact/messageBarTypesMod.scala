package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.officeUiFabricReact.libButtonMod.BaseButton
import typingsSlinky.officeUiFabricReact.libButtonMod.Button
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messageBarTypesMod {
  
  @js.native
  sealed trait MessageBarType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/MessageBar/MessageBar.types", "MessageBarType")
  @js.native
  object MessageBarType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[MessageBarType with Double] = js.native
    
    /** Blocked styled MessageBar */
    @js.native
    sealed trait blocked extends MessageBarType
    /* 2 */ val blocked: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.blocked with Double = js.native
    
    /** Error styled MessageBar */
    @js.native
    sealed trait error extends MessageBarType
    /* 1 */ val error: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.error with Double = js.native
    
    /** Info styled MessageBar */
    @js.native
    sealed trait info extends MessageBarType
    /* 0 */ val info: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.info with Double = js.native
    
    /** SevereWarning styled MessageBar */
    @js.native
    sealed trait severeWarning extends MessageBarType
    /* 3 */ val severeWarning: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.severeWarning with Double = js.native
    
    /** Success styled MessageBar */
    @js.native
    sealed trait success extends MessageBarType
    /* 4 */ val success: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.success with Double = js.native
    
    /** Warning styled MessageBar */
    @js.native
    sealed trait warning extends MessageBarType
    /* 5 */ val warning: typingsSlinky.officeUiFabricReact.messageBarTypesMod.MessageBarType.warning with Double = js.native
  }
  
  @js.native
  trait IMessageBar extends StObject
  
  @js.native
  trait IMessageBarProps extends HTMLAttributes[HTMLElement] {
    
    /**
      * The actions you want to show on the other side.
      */
    var actions: js.UndefOr[ReactElement] = js.native
    
    /**
      * A description of the message bar for the benefit of screen readers.
      * @deprecated Use native prop `aria-label` instead.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IMessageBar interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IMessageBar]] = js.native
    
    /**
      * Aria label on dismiss button if onDismiss is defined.
      */
    var dismissButtonAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * Custom icon prop to replace the dismiss icon.
      * If unset, default will be the Fabric Clear icon.
      */
    var dismissIconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * Determines if the message bar is multi lined.
      * If false, and the text overflows over buttons or to another line, it is clipped.
      * @defaultvalue true
      */
    var isMultiline: js.UndefOr[Boolean] = js.native
    
    /**
      * Custom icon prop to replace the message bar icon.
      * If unset, default will be the icon set by messageBarType.
      */
    var messageBarIconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * The type of MessageBar to render.
      * @defaultvalue MessageBarType.info
      */
    var messageBarType: js.UndefOr[MessageBarType] = js.native
    
    /**
      * Whether the message bar has a dismiss button and its callback.
      * If null, we don't show a dismiss button.
      * @defaultvalue null
      */
    var onDismiss: js.UndefOr[
        js.Function1[/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement | BaseButton | Button]], _]
      ] = js.native
    
    /**
      * Aria label on overflow button if truncated is defined.
      */
    var overflowButtonAriaLabel: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]] = js.native
    
    /**
      * Theme (provided through customization.)
      */
    var theme: js.UndefOr[ITheme] = js.native
    
    /**
      * Determines if the message bar text is truncated.
      * If true, a button will render to toggle between a single line view and multiline view.
      * This prop is for single line message bars with no buttons only in a limited space scenario.
      * @defaultvalue false
      */
    var truncated: js.UndefOr[Boolean] = js.native
  }
  object IMessageBarProps {
    
    @scala.inline
    def apply(): IMessageBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarProps]
    }
    
    @scala.inline
    implicit class IMessageBarPropsMutableBuilder[Self <: IMessageBarProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: ReactElement): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IMessageBar]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IMessageBar | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IMessageBar]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDismissButtonAriaLabel(value: String): Self = StObject.set(x, "dismissButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissButtonAriaLabelUndefined: Self = StObject.set(x, "dismissButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setDismissIconProps(value: IIconProps): Self = StObject.set(x, "dismissIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissIconPropsUndefined: Self = StObject.set(x, "dismissIconProps", js.undefined)
      
      @scala.inline
      def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      @scala.inline
      def setMessageBarIconProps(value: IIconProps): Self = StObject.set(x, "messageBarIconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageBarIconPropsUndefined: Self = StObject.set(x, "messageBarIconProps", js.undefined)
      
      @scala.inline
      def setMessageBarType(value: MessageBarType): Self = StObject.set(x, "messageBarType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageBarTypeUndefined: Self = StObject.set(x, "messageBarType", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement | BaseButton | Button]] => _): Self = StObject.set(x, "onDismiss", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setOverflowButtonAriaLabel(value: String): Self = StObject.set(x, "overflowButtonAriaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonAriaLabelUndefined: Self = StObject.set(x, "overflowButtonAriaLabel", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IMessageBarStyleProps, IMessageBarStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IMessageBarStyleProps => DeepPartial[IMessageBarStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    }
  }
  
  @js.native
  trait IMessageBarStyleProps extends StObject {
    
    /**
      * Whether the MessageBar contains any action elements.
      */
    var actions: js.UndefOr[Boolean] = js.native
    
    /**
      * Additional CSS class(es).
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Whether the single line MessageBar is being expanded.
      */
    var expandSingleLine: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether the MessageBar is rendered in multi line (as opposed to single line) mode.
      */
    var isMultiline: js.UndefOr[Boolean] = js.native
    
    /**
      * Type of the MessageBar.
      */
    var messageBarType: js.UndefOr[MessageBarType] = js.native
    
    /**
      * Whether the MessageBar contains a dismiss button.
      */
    var onDismiss: js.UndefOr[Boolean] = js.native
    
    /**
      * Theme (provided through customization).
      */
    var theme: ITheme = js.native
    
    /**
      * Whether the text is truncated.
      */
    var truncated: js.UndefOr[Boolean] = js.native
  }
  object IMessageBarStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IMessageBarStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessageBarStyleProps]
    }
    
    @scala.inline
    implicit class IMessageBarStylePropsMutableBuilder[Self <: IMessageBarStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: Boolean): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setExpandSingleLine(value: Boolean): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      @scala.inline
      def setIsMultiline(value: Boolean): Self = StObject.set(x, "isMultiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultilineUndefined: Self = StObject.set(x, "isMultiline", js.undefined)
      
      @scala.inline
      def setMessageBarType(value: MessageBarType): Self = StObject.set(x, "messageBarType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageBarTypeUndefined: Self = StObject.set(x, "messageBarType", js.undefined)
      
      @scala.inline
      def setOnDismiss(value: Boolean): Self = StObject.set(x, "onDismiss", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnDismissUndefined: Self = StObject.set(x, "onDismiss", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncated(value: Boolean): Self = StObject.set(x, "truncated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTruncatedUndefined: Self = StObject.set(x, "truncated", js.undefined)
    }
  }
  
  @js.native
  trait IMessageBarStyles extends StObject {
    
    /**
      * Style set for the optional element containing the action elements.
      */
    var actions: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the element containing the icon, text, and optional dismiss button.
      */
    var content: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the element containing the dismiss button.
      */
    var dismissSingleLine: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the optional dismiss button.
      */
    var dismissal: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the icon used to expand and collapse the MessageBar.
      */
    var expand: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the element containing the expand icon.
      */
    var expandSingleLine: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the icon.
      */
    var icon: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the element containing the icon.
      */
    var iconContainer: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the text.
      */
    var innerText: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the root element.
      */
    var root: js.UndefOr[IStyle] = js.native
    
    /**
      * Style set for the element containing the text.
      */
    var text: js.UndefOr[IStyle] = js.native
  }
  object IMessageBarStyles {
    
    @scala.inline
    def apply(): IMessageBarStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IMessageBarStyles]
    }
    
    @scala.inline
    implicit class IMessageBarStylesMutableBuilder[Self <: IMessageBarStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActions(value: IStyle): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionsNull: Self = StObject.set(x, "actions", null)
      
      @scala.inline
      def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      @scala.inline
      def setContent(value: IStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentNull: Self = StObject.set(x, "content", null)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDismissSingleLine(value: IStyle): Self = StObject.set(x, "dismissSingleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissSingleLineNull: Self = StObject.set(x, "dismissSingleLine", null)
      
      @scala.inline
      def setDismissSingleLineUndefined: Self = StObject.set(x, "dismissSingleLine", js.undefined)
      
      @scala.inline
      def setDismissal(value: IStyle): Self = StObject.set(x, "dismissal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissalNull: Self = StObject.set(x, "dismissal", null)
      
      @scala.inline
      def setDismissalUndefined: Self = StObject.set(x, "dismissal", js.undefined)
      
      @scala.inline
      def setExpand(value: IStyle): Self = StObject.set(x, "expand", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandNull: Self = StObject.set(x, "expand", null)
      
      @scala.inline
      def setExpandSingleLine(value: IStyle): Self = StObject.set(x, "expandSingleLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandSingleLineNull: Self = StObject.set(x, "expandSingleLine", null)
      
      @scala.inline
      def setExpandSingleLineUndefined: Self = StObject.set(x, "expandSingleLine", js.undefined)
      
      @scala.inline
      def setExpandUndefined: Self = StObject.set(x, "expand", js.undefined)
      
      @scala.inline
      def setIcon(value: IStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainer(value: IStyle): Self = StObject.set(x, "iconContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconContainerNull: Self = StObject.set(x, "iconContainer", null)
      
      @scala.inline
      def setIconContainerUndefined: Self = StObject.set(x, "iconContainer", js.undefined)
      
      @scala.inline
      def setIconNull: Self = StObject.set(x, "icon", null)
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setInnerText(value: IStyle): Self = StObject.set(x, "innerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerTextNull: Self = StObject.set(x, "innerText", null)
      
      @scala.inline
      def setInnerTextUndefined: Self = StObject.set(x, "innerText", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setText(value: IStyle): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextNull: Self = StObject.set(x, "text", null)
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
