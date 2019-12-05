package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libIComponentAsMod.IComponentAs
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INav
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavLink
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavLinkGroup
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsNavNavDotTypesMod.INavStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NavBase
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libNavMod.NavBase] {
  @JSImport("office-ui-fabric-react/lib/Nav", "NavBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    ariaLabel: String = null,
    componentRef: IRefObject[INav] = null,
    expandButtonAriaLabel: String = null,
    groups: js.Array[INavLinkGroup] = null,
    initialSelectedKey: String = null,
    isOnTop: js.UndefOr[Boolean] = js.undefined,
    linkAs: IComponentAs[INavButtonProps] = null,
    onLinkClick: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit = null,
    onLinkExpandClick: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement]], /* item */ js.UndefOr[INavLink]) => Unit = null,
    onRenderGroupHeader: (/* props */ js.UndefOr[INavLinkGroup], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[INavLinkGroup], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderLink: (/* props */ js.UndefOr[INavLink], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[INavLink], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    selectedAriaLabel: String = null,
    selectedKey: String = null,
    styles: IStyleFunctionOrObject[INavStyleProps, INavStyles] = null,
    theme: ITheme = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.officeDashUiDashFabricDashReact.libNavMod.NavBase] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonAriaLabel != null) __obj.updateDynamic("expandButtonAriaLabel")(expandButtonAriaLabel.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (initialSelectedKey != null) __obj.updateDynamic("initialSelectedKey")(initialSelectedKey.asInstanceOf[js.Any])
    if (!js.isUndefined(isOnTop)) __obj.updateDynamic("isOnTop")(isOnTop.asInstanceOf[js.Any])
    if (linkAs != null) __obj.updateDynamic("linkAs")(linkAs.asInstanceOf[js.Any])
    if (onLinkClick != null) __obj.updateDynamic("onLinkClick")(js.Any.fromFunction2(onLinkClick))
    if (onLinkExpandClick != null) __obj.updateDynamic("onLinkExpandClick")(js.Any.fromFunction2(onLinkExpandClick))
    if (onRenderGroupHeader != null) __obj.updateDynamic("onRenderGroupHeader")(js.Any.fromFunction2(onRenderGroupHeader))
    if (onRenderLink != null) __obj.updateDynamic("onRenderLink")(js.Any.fromFunction2(onRenderLink))
    if (selectedAriaLabel != null) __obj.updateDynamic("selectedAriaLabel")(selectedAriaLabel.asInstanceOf[js.Any])
    if (selectedKey != null) __obj.updateDynamic("selectedKey")(selectedKey.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = INavProps
}

