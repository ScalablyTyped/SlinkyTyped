package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.anon.Height
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyleProps
import typingsSlinky.officeUiFabricReact.choiceGroupOptionTypesMod.IChoiceGroupOptionStyles
import typingsSlinky.officeUiFabricReact.iconTypesMod.IIconProps
import typingsSlinky.react.mod.InputHTMLAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object choiceGroupTypesMod {
  
  @js.native
  trait IChoiceGroup extends StObject {
    
    /**
      * Gets the current checked option.
      */
    var checkedOption: js.UndefOr[IChoiceGroupOption] = js.native
    
    /**
      * Sets focus to the checked option or the first enabled option in the ChoiceGroup.
      */
    def focus(): Unit = js.native
  }
  object IChoiceGroup {
    
    @scala.inline
    def apply(focus: () => Unit): IChoiceGroup = {
      val __obj = js.Dynamic.literal(focus = js.Any.fromFunction0(focus))
      __obj.asInstanceOf[IChoiceGroup]
    }
    
    @scala.inline
    implicit class IChoiceGroupMutableBuilder[Self <: IChoiceGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckedOption(value: IChoiceGroupOption): Self = StObject.set(x, "checkedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedOptionUndefined: Self = StObject.set(x, "checkedOption", js.undefined)
      
      @scala.inline
      def setFocus(value: () => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait IChoiceGroupOption extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
    
    /**
      * Aria label of the option for the benefit of screen reader users.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Props for an icon to display with this option.
      */
    var iconProps: js.UndefOr[IIconProps] = js.native
    
    /**
      * Alt text if the option is an image.
      * @default '' (empty string)
      */
    var imageAlt: js.UndefOr[String] = js.native
    
    /**
      * The width and height of the image in px for choice field.
      * @defaultvalue `{ width: 32, height: 32 }`
      */
    var imageSize: js.UndefOr[Height] = js.native
    
    /**
      * Image to display with this option.
      */
    var imageSrc: js.UndefOr[String] = js.native
    
    /**
      * A required key to uniquely identify the option.
      */
    var key: String = js.native
    
    /**
      * ID used on the option's label.
      */
    var labelId: js.UndefOr[String] = js.native
    
    /**
      * Used to customize option rendering.
      */
    var onRenderField: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
    
    /**
      * Used to customize label rendering.
      */
    var onRenderLabel: js.UndefOr[IRenderFunction[IChoiceGroupOption]] = js.native
    
    /**
      * The src of image for choice field which is selected.
      */
    var selectedImageSrc: js.UndefOr[String] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]] = js.native
    
    /**
      * The text string for the option.
      */
    var text: String = js.native
  }
  object IChoiceGroupOption {
    
    @scala.inline
    def apply(key: String, text: String): IChoiceGroupOption = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupOption]
    }
    
    @scala.inline
    implicit class IChoiceGroupOptionMutableBuilder[Self <: IChoiceGroupOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setIconProps(value: IIconProps): Self = StObject.set(x, "iconProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconPropsUndefined: Self = StObject.set(x, "iconProps", js.undefined)
      
      @scala.inline
      def setImageAlt(value: String): Self = StObject.set(x, "imageAlt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageAltUndefined: Self = StObject.set(x, "imageAlt", js.undefined)
      
      @scala.inline
      def setImageSize(value: Height): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
      
      @scala.inline
      def setImageSrc(value: String): Self = StObject.set(x, "imageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageSrcUndefined: Self = StObject.set(x, "imageSrc", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelId(value: String): Self = StObject.set(x, "labelId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelIdUndefined: Self = StObject.set(x, "labelId", js.undefined)
      
      @scala.inline
      def setOnRenderField(
        value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderField", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderFieldUndefined: Self = StObject.set(x, "onRenderField", js.undefined)
      
      @scala.inline
      def setOnRenderLabel(
        value: (/* props */ js.UndefOr[IChoiceGroupOption], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IChoiceGroupOption], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderLabel", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderLabelUndefined: Self = StObject.set(x, "onRenderLabel", js.undefined)
      
      @scala.inline
      def setSelectedImageSrc(value: String): Self = StObject.set(x, "selectedImageSrc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedImageSrcUndefined: Self = StObject.set(x, "selectedImageSrc", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IChoiceGroupOptionStyleProps, IChoiceGroupOptionStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IChoiceGroupOptionStyleProps => DeepPartial[IChoiceGroupOptionStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IChoiceGroupProps extends InputHTMLAttributes[HTMLElement | HTMLInputElement] {
    
    /**
      * ID of an element to use as the aria label for this ChoiceGroup.
      */
    var ariaLabelledBy: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IChoiceGroup interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IChoiceGroup]] = js.native
    
    /**
      * The key of the option that will be initially checked.
      */
    var defaultSelectedKey: js.UndefOr[String | Double] = js.native
    
    /**
      * Descriptive label for the choice group.
      */
    var label: js.UndefOr[String] = js.native
    
    /**
      * A callback for receiving a notification when the choice has been changed.
      */
    @JSName("onChange")
    var onChange_IChoiceGroupProps: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
          /* option */ js.UndefOr[IChoiceGroupOption], 
          Unit
        ]
      ] = js.native
    
    /**
      * Deprecated and will be removed by 07/17/2017. Use `onChange` instead.
      * @deprecated Use `onChange` instead.
      */
    var onChanged: js.UndefOr[
        js.Function2[
          /* option */ IChoiceGroupOption, 
          /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], 
          Unit
        ]
      ] = js.native
    
    /**
      * The options for the choice group.
      */
    var options: js.UndefOr[js.Array[IChoiceGroupOption]] = js.native
    
    /**
      * The key of the selected option. If you provide this, you must maintain selection
      * state by observing onChange events and passing a new value in when changed.
      */
    var selectedKey: js.UndefOr[String | Double] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]] = js.native
    
    /**
      * Theme (provided through customization).
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IChoiceGroupProps {
    
    @scala.inline
    def apply(): IChoiceGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupProps]
    }
    
    @scala.inline
    implicit class IChoiceGroupPropsMutableBuilder[Self <: IChoiceGroupProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaLabelledBy(value: String): Self = StObject.set(x, "ariaLabelledBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelledByUndefined: Self = StObject.set(x, "ariaLabelledBy", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IChoiceGroup]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IChoiceGroup | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IChoiceGroup]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setDefaultSelectedKey(value: String | Double): Self = StObject.set(x, "defaultSelectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSelectedKeyUndefined: Self = StObject.set(x, "defaultSelectedKey", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setOnChange(
        value: (/* ev */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]], /* option */ js.UndefOr[IChoiceGroupOption]) => Unit
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnChanged(
        value: (/* option */ IChoiceGroupOption, /* evt */ js.UndefOr[SyntheticEvent[EventTarget with (HTMLElement | HTMLInputElement), Event]]) => Unit
      ): Self = StObject.set(x, "onChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangedUndefined: Self = StObject.set(x, "onChanged", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[IChoiceGroupOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: IChoiceGroupOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKey(value: String | Double): Self = StObject.set(x, "selectedKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeyUndefined: Self = StObject.set(x, "selectedKey", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IChoiceGroupStyleProps, IChoiceGroupStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IChoiceGroupStyleProps => DeepPartial[IChoiceGroupStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IChoiceGroupStyleProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var optionsContainIconOrImage: js.UndefOr[Boolean] = js.native
    
    var theme: ITheme = js.native
  }
  object IChoiceGroupStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IChoiceGroupStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChoiceGroupStyleProps]
    }
    
    @scala.inline
    implicit class IChoiceGroupStylePropsMutableBuilder[Self <: IChoiceGroupStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setOptionsContainIconOrImage(value: Boolean): Self = StObject.set(x, "optionsContainIconOrImage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsContainIconOrImageUndefined: Self = StObject.set(x, "optionsContainIconOrImage", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IChoiceGroupStyles extends StObject {
    
    /**
      * The actual root of the component.
      * @deprecated Styles will be merged with `root` in a future release.
      */
    var applicationRole: js.UndefOr[IStyle] = js.native
    
    var flexContainer: js.UndefOr[IStyle] = js.native
    
    var label: js.UndefOr[IStyle] = js.native
    
    /**
      * Not currently the actual root of the component (will be fixed in a future release).
      * For now, to style the actual root, use `applicationRole`.
      */
    var root: js.UndefOr[IStyle] = js.native
  }
  object IChoiceGroupStyles {
    
    @scala.inline
    def apply(): IChoiceGroupStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChoiceGroupStyles]
    }
    
    @scala.inline
    implicit class IChoiceGroupStylesMutableBuilder[Self <: IChoiceGroupStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplicationRole(value: IStyle): Self = StObject.set(x, "applicationRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationRoleNull: Self = StObject.set(x, "applicationRole", null)
      
      @scala.inline
      def setApplicationRoleUndefined: Self = StObject.set(x, "applicationRole", js.undefined)
      
      @scala.inline
      def setFlexContainer(value: IStyle): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainerNull: Self = StObject.set(x, "flexContainer", null)
      
      @scala.inline
      def setFlexContainerUndefined: Self = StObject.set(x, "flexContainer", js.undefined)
      
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
    }
  }
}
