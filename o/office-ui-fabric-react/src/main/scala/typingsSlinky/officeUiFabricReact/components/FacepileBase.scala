package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepile
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepilePersona
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileStyleProps
import typingsSlinky.officeUiFabricReact.facepileTypesMod.IFacepileStyles
import typingsSlinky.officeUiFabricReact.facepileTypesMod.OverflowButtonType
import typingsSlinky.officeUiFabricReact.personaTypesMod.IPersonaSharedProps
import typingsSlinky.officeUiFabricReact.personaTypesMod.PersonaSize
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FacepileBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeUiFabricReact.mod.FacepileBase] {
  @JSImport("office-ui-fabric-react", "FacepileBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    personas: js.Array[IFacepilePersona],
    addButtonProps: IButtonProps = null,
    ariaDescription: String = null,
    ariaLabel: String = null,
    chevronButtonProps: IButtonProps = null,
    componentRef: IRefObject[IFacepile] = null,
    getPersonaProps: /* persona */ IFacepilePersona => IPersonaSharedProps = null,
    maxDisplayablePersonas: Int | Double = null,
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IFacepilePersona], ReactElement | Null]]) => ReactElement | Null = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeUiFabricReact.mod.FacepileBase] = {
    val __obj = js.Dynamic.literal(personas = personas.asInstanceOf[js.Any])
    if (addButtonProps != null) __obj.updateDynamic("addButtonProps")(addButtonProps.asInstanceOf[js.Any])
    if (ariaDescription != null) __obj.updateDynamic("ariaDescription")(ariaDescription.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (chevronButtonProps != null) __obj.updateDynamic("chevronButtonProps")(chevronButtonProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (getPersonaProps != null) __obj.updateDynamic("getPersonaProps")(js.Any.fromFunction1(getPersonaProps))
    if (maxDisplayablePersonas != null) __obj.updateDynamic("maxDisplayablePersonas")(maxDisplayablePersonas.asInstanceOf[js.Any])
    if (onRenderPersona != null) __obj.updateDynamic("onRenderPersona")(js.Any.fromFunction2(onRenderPersona))
    if (onRenderPersonaCoin != null) __obj.updateDynamic("onRenderPersonaCoin")(js.Any.fromFunction2(onRenderPersonaCoin))
    if (overflowButtonProps != null) __obj.updateDynamic("overflowButtonProps")(overflowButtonProps.asInstanceOf[js.Any])
    if (overflowButtonType != null) __obj.updateDynamic("overflowButtonType")(overflowButtonType.asInstanceOf[js.Any])
    if (overflowPersonas != null) __obj.updateDynamic("overflowPersonas")(overflowPersonas.asInstanceOf[js.Any])
    if (personaSize != null) __obj.updateDynamic("personaSize")(personaSize.asInstanceOf[js.Any])
    if (!js.isUndefined(showAddButton)) __obj.updateDynamic("showAddButton")(showAddButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IFacepileProps
}

