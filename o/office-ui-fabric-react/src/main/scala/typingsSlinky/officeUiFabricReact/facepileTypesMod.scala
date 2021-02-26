package typingsSlinky.officeUiFabricReact

import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticMouseEvent
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.facepileBaseMod.FacepileBase
import typingsSlinky.officeUiFabricReact.keytipTypesMod.IKeytipProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaInitialsColor
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsSlinky.react.mod.ButtonHTMLAttributes
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.uifabricMergeStyles.deepPartialMod.DeepPartial
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facepileTypesMod {
  
  @js.native
  sealed trait OverflowButtonType extends StObject
  @JSImport("office-ui-fabric-react/lib/components/Facepile/Facepile.types", "OverflowButtonType")
  @js.native
  object OverflowButtonType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[OverflowButtonType with Double] = js.native
    
    /** +1 overflow icon */
    @js.native
    sealed trait descriptive extends OverflowButtonType
    /* 1 */ val descriptive: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.descriptive with Double = js.native
    
    /** Chevron overflow icon */
    @js.native
    sealed trait downArrow extends OverflowButtonType
    /* 3 */ val downArrow: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.downArrow with Double = js.native
    
    /** More overflow icon */
    @js.native
    sealed trait more extends OverflowButtonType
    /* 2 */ val more: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.more with Double = js.native
    
    /** No overflow */
    @js.native
    sealed trait none extends OverflowButtonType
    /* 0 */ val none: typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType.none with Double = js.native
  }
  
  @js.native
  trait IFacepile extends StObject
  
  @js.native
  trait IFacepilePersona extends ButtonHTMLAttributes[HTMLButtonElement | HTMLDivElement] {
    
    /**
      * Whether initials are calculated for phone numbers and number sequences.
      * Example: Set property to true to get initials for project names consisting of numbers only.
      * @defaultvalue false
      */
    var allowPhoneInitials: js.UndefOr[Boolean] = js.native
    
    /**
      * Extra data - not used directly but can be handy for passing additional data to custom event
      * handlers.
      */
    var data: js.UndefOr[js.Any] = js.native
    
    /**
      * The user's initials to display in the image area when there is no image.
      * @defaultvalue [Derived from personaName]
      */
    var imageInitials: js.UndefOr[String] = js.native
    
    /**
      * Url to the image to use, should be a square aspect ratio and big enough to fit in the image area.
      */
    var imageUrl: js.UndefOr[String] = js.native
    
    /**
      * The background color when the user's initials are displayed.
      * @defaultvalue [Derived from personaName]
      */
    var initialsColor: js.UndefOr[PersonaInitialsColor] = js.native
    
    /**
      * Optional keytip for this button that is only added when 'onClick' is defined for the persona
      */
    var keytipProps: js.UndefOr[IKeytipProps] = js.native
    
    /**
      * If provided, persona will be rendered with cursor:pointer and the handler will be
      * called on click.
      */
    @JSName("onClick")
    var onClick_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    /**
      * If provided, the handler will be called on mouse move.
      */
    @JSName("onMouseMove")
    var onMouseMove_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    /**
      * If provided, the handler will be called when mouse moves out of the component.
      */
    @JSName("onMouseOut")
    var onMouseOut_IFacepilePersona: js.UndefOr[
        js.Function2[
          /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], 
          /* persona */ js.UndefOr[this.type], 
          Unit
        ]
      ] = js.native
    
    /**
      * Name of the person.
      */
    var personaName: js.UndefOr[String] = js.native
  }
  object IFacepilePersona {
    
    @scala.inline
    def apply(): IFacepilePersona = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFacepilePersona]
    }
    
    @scala.inline
    implicit class IFacepilePersonaMutableBuilder[Self <: IFacepilePersona] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowPhoneInitials(value: Boolean): Self = StObject.set(x, "allowPhoneInitials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowPhoneInitialsUndefined: Self = StObject.set(x, "allowPhoneInitials", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setImageInitials(value: String): Self = StObject.set(x, "imageInitials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageInitialsUndefined: Self = StObject.set(x, "imageInitials", js.undefined)
      
      @scala.inline
      def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
      
      @scala.inline
      def setInitialsColor(value: PersonaInitialsColor): Self = StObject.set(x, "initialsColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialsColorUndefined: Self = StObject.set(x, "initialsColor", js.undefined)
      
      @scala.inline
      def setKeytipProps(value: IKeytipProps): Self = StObject.set(x, "keytipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeytipPropsUndefined: Self = StObject.set(x, "keytipProps", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnMouseMove(
        value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(
        value: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* persona */ js.UndefOr[IFacepilePersona]) => Unit
      ): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setPersonaName(value: String): Self = StObject.set(x, "personaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaNameUndefined: Self = StObject.set(x, "personaName", js.undefined)
    }
  }
  
  @js.native
  trait IFacepileProps extends ClassAttributes[FacepileBase] {
    
    /** Button properties for the add face button */
    var addButtonProps: js.UndefOr[IButtonProps] = js.native
    
    /** ARIA label for persona list */
    var ariaDescription: js.UndefOr[String] = js.native
    
    /**
      * Defines the aria label that the screen readers use when focus goes on a list of personas.
      */
    var ariaLabel: js.UndefOr[String] = js.native
    
    /**
      * Deprecated at v0.70, use `overflowButtonProps` instead.
      * @deprecated Use `overflowButtonProps` instead.
      */
    var chevronButtonProps: js.UndefOr[IButtonProps] = js.native
    
    /**
      * Additional css class to apply to the Facepile
      * @defaultvalue undefined
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Optional callback to access the IFacepile interface. Use this instead of ref for accessing
      * the public methods and properties of the component.
      */
    var componentRef: js.UndefOr[IRefObject[IFacepile]] = js.native
    
    /** Method to access properties on the underlying Persona control */
    var getPersonaProps: js.UndefOr[js.Function1[/* persona */ IFacepilePersona, IPersonaSharedProps]] = js.native
    
    /** Maximum number of personas to show */
    var maxDisplayablePersonas: js.UndefOr[Double] = js.native
    
    /** Optional custom renderer for the persona, gets called when there is one persona in personas array*/
    var onRenderPersona: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.native
    
    /** Optional custom renderer for the persona coins, gets called when there are multiple persona in personas array*/
    var onRenderPersonaCoin: js.UndefOr[IRenderFunction[IFacepilePersona]] = js.native
    
    /** Properties for the overflow icon */
    var overflowButtonProps: js.UndefOr[IButtonProps] = js.native
    
    /** Type of overflow icon to use */
    var overflowButtonType: js.UndefOr[OverflowButtonType] = js.native
    
    /**
      * Personas to place in the overflow
      */
    var overflowPersonas: js.UndefOr[js.Array[IFacepilePersona]] = js.native
    
    /** Size to display the personas */
    var personaSize: js.UndefOr[PersonaSize] = js.native
    
    /**
      * Array of IPersonaProps that define each Persona.
      */
    var personas: js.Array[IFacepilePersona] = js.native
    
    /** Show add person button */
    var showAddButton: js.UndefOr[Boolean] = js.native
    
    /**
      * Call to provide customized styling that will layer on top of the variant rules.
      */
    var styles: js.UndefOr[IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: js.UndefOr[ITheme] = js.native
  }
  object IFacepileProps {
    
    @scala.inline
    def apply(personas: js.Array[IFacepilePersona]): IFacepileProps = {
      val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFacepileProps]
    }
    
    @scala.inline
    implicit class IFacepilePropsMutableBuilder[Self <: IFacepileProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddButtonProps(value: IButtonProps): Self = StObject.set(x, "addButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddButtonPropsUndefined: Self = StObject.set(x, "addButtonProps", js.undefined)
      
      @scala.inline
      def setAriaDescription(value: String): Self = StObject.set(x, "ariaDescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescriptionUndefined: Self = StObject.set(x, "ariaDescription", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setChevronButtonProps(value: IButtonProps): Self = StObject.set(x, "chevronButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChevronButtonPropsUndefined: Self = StObject.set(x, "chevronButtonProps", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setComponentRef(value: IRefObject[IFacepile]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefFunction1(value: /* ref */ IFacepile | Null => Unit): Self = StObject.set(x, "componentRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setComponentRefRefObject(value: ReactRef[IFacepile]): Self = StObject.set(x, "componentRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentRefUndefined: Self = StObject.set(x, "componentRef", js.undefined)
      
      @scala.inline
      def setGetPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): Self = StObject.set(x, "getPersonaProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetPersonaPropsUndefined: Self = StObject.set(x, "getPersonaProps", js.undefined)
      
      @scala.inline
      def setMaxDisplayablePersonas(value: Double): Self = StObject.set(x, "maxDisplayablePersonas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDisplayablePersonasUndefined: Self = StObject.set(x, "maxDisplayablePersonas", js.undefined)
      
      @scala.inline
      def setOnRenderPersona(
        value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderPersona", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderPersonaCoin(
        value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
      ): Self = StObject.set(x, "onRenderPersonaCoin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRenderPersonaCoinUndefined: Self = StObject.set(x, "onRenderPersonaCoin", js.undefined)
      
      @scala.inline
      def setOnRenderPersonaUndefined: Self = StObject.set(x, "onRenderPersona", js.undefined)
      
      @scala.inline
      def setOverflowButtonProps(value: IButtonProps): Self = StObject.set(x, "overflowButtonProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonPropsUndefined: Self = StObject.set(x, "overflowButtonProps", js.undefined)
      
      @scala.inline
      def setOverflowButtonType(value: OverflowButtonType): Self = StObject.set(x, "overflowButtonType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonTypeUndefined: Self = StObject.set(x, "overflowButtonType", js.undefined)
      
      @scala.inline
      def setOverflowPersonas(value: js.Array[IFacepilePersona]): Self = StObject.set(x, "overflowPersonas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowPersonasUndefined: Self = StObject.set(x, "overflowPersonas", js.undefined)
      
      @scala.inline
      def setOverflowPersonasVarargs(value: IFacepilePersona*): Self = StObject.set(x, "overflowPersonas", js.Array(value :_*))
      
      @scala.inline
      def setPersonaSize(value: PersonaSize): Self = StObject.set(x, "personaSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonaSizeUndefined: Self = StObject.set(x, "personaSize", js.undefined)
      
      @scala.inline
      def setPersonas(value: js.Array[IFacepilePersona]): Self = StObject.set(x, "personas", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersonasVarargs(value: IFacepilePersona*): Self = StObject.set(x, "personas", js.Array(value :_*))
      
      @scala.inline
      def setShowAddButton(value: Boolean): Self = StObject.set(x, "showAddButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowAddButtonUndefined: Self = StObject.set(x, "showAddButton", js.undefined)
      
      @scala.inline
      def setStyles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesFunction1(value: IFacepileStyleProps => DeepPartial[IFacepileStyles]): Self = StObject.set(x, "styles", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait IFacepileStyleProps extends StObject {
    
    /**
      * Accept custom classNames
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Pixel value for spacing around button. Number value set in pixels
      */
    var spacingAroundItemButton: js.UndefOr[Double] = js.native
    
    /**
      * Theme provided by High-Order Component.
      */
    var theme: ITheme = js.native
  }
  object IFacepileStyleProps {
    
    @scala.inline
    def apply(theme: ITheme): IFacepileStyleProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFacepileStyleProps]
    }
    
    @scala.inline
    implicit class IFacepileStylePropsMutableBuilder[Self <: IFacepileStyleProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setSpacingAroundItemButton(value: Double): Self = StObject.set(x, "spacingAroundItemButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingAroundItemButtonUndefined: Self = StObject.set(x, "spacingAroundItemButton", js.undefined)
      
      @scala.inline
      def setTheme(value: ITheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IFacepileStyles extends StObject {
    
    var addButton: IStyle = js.native
    
    var descriptiveOverflowButton: IStyle = js.native
    
    var itemButton: IStyle = js.native
    
    var itemContainer: IStyle = js.native
    
    var member: IStyle = js.native
    
    var members: IStyle = js.native
    
    var overflowButton: IStyle = js.native
    
    var overflowInitialsIcon: IStyle = js.native
    
    /**
      * Style for the root element.
      */
    var root: IStyle = js.native
    
    var screenReaderOnly: IStyle = js.native
  }
  object IFacepileStyles {
    
    @scala.inline
    def apply(): IFacepileStyles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IFacepileStyles]
    }
    
    @scala.inline
    implicit class IFacepileStylesMutableBuilder[Self <: IFacepileStyles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddButton(value: IStyle): Self = StObject.set(x, "addButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddButtonNull: Self = StObject.set(x, "addButton", null)
      
      @scala.inline
      def setAddButtonUndefined: Self = StObject.set(x, "addButton", js.undefined)
      
      @scala.inline
      def setDescriptiveOverflowButton(value: IStyle): Self = StObject.set(x, "descriptiveOverflowButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptiveOverflowButtonNull: Self = StObject.set(x, "descriptiveOverflowButton", null)
      
      @scala.inline
      def setDescriptiveOverflowButtonUndefined: Self = StObject.set(x, "descriptiveOverflowButton", js.undefined)
      
      @scala.inline
      def setItemButton(value: IStyle): Self = StObject.set(x, "itemButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemButtonNull: Self = StObject.set(x, "itemButton", null)
      
      @scala.inline
      def setItemButtonUndefined: Self = StObject.set(x, "itemButton", js.undefined)
      
      @scala.inline
      def setItemContainer(value: IStyle): Self = StObject.set(x, "itemContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemContainerNull: Self = StObject.set(x, "itemContainer", null)
      
      @scala.inline
      def setItemContainerUndefined: Self = StObject.set(x, "itemContainer", js.undefined)
      
      @scala.inline
      def setMember(value: IStyle): Self = StObject.set(x, "member", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMemberNull: Self = StObject.set(x, "member", null)
      
      @scala.inline
      def setMemberUndefined: Self = StObject.set(x, "member", js.undefined)
      
      @scala.inline
      def setMembers(value: IStyle): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMembersNull: Self = StObject.set(x, "members", null)
      
      @scala.inline
      def setMembersUndefined: Self = StObject.set(x, "members", js.undefined)
      
      @scala.inline
      def setOverflowButton(value: IStyle): Self = StObject.set(x, "overflowButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowButtonNull: Self = StObject.set(x, "overflowButton", null)
      
      @scala.inline
      def setOverflowButtonUndefined: Self = StObject.set(x, "overflowButton", js.undefined)
      
      @scala.inline
      def setOverflowInitialsIcon(value: IStyle): Self = StObject.set(x, "overflowInitialsIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowInitialsIconNull: Self = StObject.set(x, "overflowInitialsIcon", null)
      
      @scala.inline
      def setOverflowInitialsIconUndefined: Self = StObject.set(x, "overflowInitialsIcon", js.undefined)
      
      @scala.inline
      def setRoot(value: IStyle): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootNull: Self = StObject.set(x, "root", null)
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
      
      @scala.inline
      def setScreenReaderOnly(value: IStyle): Self = StObject.set(x, "screenReaderOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScreenReaderOnlyNull: Self = StObject.set(x, "screenReaderOnly", null)
      
      @scala.inline
      def setScreenReaderOnlyUndefined: Self = StObject.set(x, "screenReaderOnly", js.undefined)
    }
  }
}
