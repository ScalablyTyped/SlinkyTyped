package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepile
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepilePersona
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepileProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepileStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.IFacepileStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFacepileFacepileDotTypesMod.OverflowButtonType
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.IPersonaSharedProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsPersonaPersonaDotTypesMod.PersonaSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object FacepileBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libFacepileMod.FacepileBase
    ] {
  @JSImport("office-ui-fabric-react/lib/Facepile", "FacepileBase")
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
    onRenderPersona: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IFacepilePersona], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderPersonaCoin: (/* props */ js.UndefOr[IFacepilePersona], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IFacepilePersona], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    overflowButtonProps: IButtonProps = null,
    overflowButtonType: OverflowButtonType = null,
    overflowPersonas: js.Array[IFacepilePersona] = null,
    personaSize: PersonaSize = null,
    showAddButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IFacepileStyleProps, IFacepileStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libFacepileMod.FacepileBase
  ] = {
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

