package typingsSlinky.officeUiFabricReact.facepileTypesMod

import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.facepileBaseMod.FacepileBase
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsSlinky.react.mod.ClassAttributes
import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class IFacepilePropsOps[Self <: IFacepileProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPersonas(value: js.Array[IFacepilePersona]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaDescription")(js.undefined)
        ret
    }
    @scala.inline
    def withAriaLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAriaLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ariaLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withChevronButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChevronButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("chevronButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withComponentRefFunction1(value: /* ref */ IFacepile | Null => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withComponentRefRefObject(value: ReactRef[IFacepile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComponentRef(value: IRefObject[IFacepile]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponentRef: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("componentRef")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPersonaProps(value: /* persona */ IFacepilePersona => IPersonaSharedProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersonaProps")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPersonaProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPersonaProps")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDisplayablePersonas(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayablePersonas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDisplayablePersonas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDisplayablePersonas")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderPersona(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersona")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPersona: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersona")(js.undefined)
        ret
    }
    @scala.inline
    def withOnRenderPersonaCoin(
      value: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnRenderPersonaCoin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onRenderPersonaCoin")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonProps(value: IButtonProps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButtonProps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonProps")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowButtonType(value: OverflowButtonType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowButtonType")(js.undefined)
        ret
    }
    @scala.inline
    def withOverflowPersonas(value: js.Array[IFacepilePersona]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowPersonas")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOverflowPersonas: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("overflowPersonas")(js.undefined)
        ret
    }
    @scala.inline
    def withPersonaSize(value: PersonaSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersonaSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("personaSize")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAddButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAddButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAddButton")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesFunction1(value: IFacepileStyleProps => Partial[IFacepileStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStyles(value: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTheme(value: ITheme): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("theme")(js.undefined)
        ret
    }
  }
  
}

