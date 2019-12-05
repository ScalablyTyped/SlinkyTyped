package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.Window
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libIRectangleMod.IRectangle
import typingsSlinky.officeDashUiDashFabricDashReact.libCommonDirectionalHintMod.DirectionalHint
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.ICalloutProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsCalloutCalloutDotTypesMod.Target
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IContextualMenuClassNames
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenu
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuListProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsFocusZoneFocusZoneDotTypesMod.IFocusZoneProps
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextualMenuBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libContextualMenuMod.ContextualMenuBase
    ] {
  @JSImport("office-ui-fabric-react/lib/ContextualMenu", "ContextualMenuBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden, id */
  def apply(
    items: js.Array[IContextualMenuItem],
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window], 
      js.UndefOr[IRectangle]
    ]) = null,
    calloutProps: ICalloutProps = null,
    componentRef: IRefObject[IContextualMenu] = null,
    contextualMenuItemAs: ReactComponentClass[IContextualMenuItemProps] = null,
    coverTarget: js.UndefOr[Boolean] = js.undefined,
    delayUpdateFocusOnHover: js.UndefOr[Boolean] = js.undefined,
    directionalHint: DirectionalHint = null,
    directionalHintFixed: js.UndefOr[Boolean] = js.undefined,
    directionalHintForRTL: DirectionalHint = null,
    doNotLayer: js.UndefOr[Boolean] = js.undefined,
    focusZoneProps: IFocusZoneProps = null,
    gapSpace: Int | Double = null,
    getMenuClassNames: (/* theme */ ITheme, /* className */ js.UndefOr[String]) => IContextualMenuClassNames = null,
    isBeakVisible: js.UndefOr[Boolean] = js.undefined,
    isSubMenu: js.UndefOr[Boolean] = js.undefined,
    labelElementId: String = null,
    onDismiss: (/* ev */ js.UndefOr[
      SyntheticMouseEvent[org.scalajs.dom.raw.Element] | SyntheticKeyboardEvent[org.scalajs.dom.raw.Element]
    ], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    onItemClick: (/* ev */ js.UndefOr[SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]], /* item */ js.UndefOr[IContextualMenuItem]) => Boolean | Unit = null,
    onMenuDismissed: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onMenuOpened: /* contextualMenu */ js.UndefOr[IContextualMenuProps] => Unit = null,
    onRenderMenuList: (/* props */ js.UndefOr[IContextualMenuListProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuListProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onRenderSubMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IContextualMenuProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    responsiveMode: ResponsiveMode = null,
    shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles] = null,
    subMenuHoverDelay: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    title: String = null,
    useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined,
    useTargetWidth: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libContextualMenuMod.ContextualMenuBase
  ] = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (!js.isUndefined(alignTargetEdge)) __obj.updateDynamic("alignTargetEdge")(alignTargetEdge.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    if (beakWidth != null) __obj.updateDynamic("beakWidth")(beakWidth.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (calloutProps != null) __obj.updateDynamic("calloutProps")(calloutProps.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (!js.isUndefined(coverTarget)) __obj.updateDynamic("coverTarget")(coverTarget.asInstanceOf[js.Any])
    if (!js.isUndefined(delayUpdateFocusOnHover)) __obj.updateDynamic("delayUpdateFocusOnHover")(delayUpdateFocusOnHover.asInstanceOf[js.Any])
    if (directionalHint != null) __obj.updateDynamic("directionalHint")(directionalHint.asInstanceOf[js.Any])
    if (!js.isUndefined(directionalHintFixed)) __obj.updateDynamic("directionalHintFixed")(directionalHintFixed.asInstanceOf[js.Any])
    if (directionalHintForRTL != null) __obj.updateDynamic("directionalHintForRTL")(directionalHintForRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(doNotLayer)) __obj.updateDynamic("doNotLayer")(doNotLayer.asInstanceOf[js.Any])
    if (focusZoneProps != null) __obj.updateDynamic("focusZoneProps")(focusZoneProps.asInstanceOf[js.Any])
    if (gapSpace != null) __obj.updateDynamic("gapSpace")(gapSpace.asInstanceOf[js.Any])
    if (getMenuClassNames != null) __obj.updateDynamic("getMenuClassNames")(js.Any.fromFunction2(getMenuClassNames))
    if (!js.isUndefined(isBeakVisible)) __obj.updateDynamic("isBeakVisible")(isBeakVisible.asInstanceOf[js.Any])
    if (!js.isUndefined(isSubMenu)) __obj.updateDynamic("isSubMenu")(isSubMenu.asInstanceOf[js.Any])
    if (labelElementId != null) __obj.updateDynamic("labelElementId")(labelElementId.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction2(onDismiss))
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onMenuDismissed != null) __obj.updateDynamic("onMenuDismissed")(js.Any.fromFunction1(onMenuDismissed))
    if (onMenuOpened != null) __obj.updateDynamic("onMenuOpened")(js.Any.fromFunction1(onMenuOpened))
    if (onRenderMenuList != null) __obj.updateDynamic("onRenderMenuList")(js.Any.fromFunction2(onRenderMenuList))
    if (onRenderSubMenu != null) __obj.updateDynamic("onRenderSubMenu")(js.Any.fromFunction2(onRenderSubMenu))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnContainer)) __obj.updateDynamic("shouldFocusOnContainer")(shouldFocusOnContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldFocusOnMount)) __obj.updateDynamic("shouldFocusOnMount")(shouldFocusOnMount.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldUpdateWhenHidden)) __obj.updateDynamic("shouldUpdateWhenHidden")(shouldUpdateWhenHidden.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subMenuHoverDelay != null) __obj.updateDynamic("subMenuHoverDelay")(subMenuHoverDelay.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetAsMinWidth)) __obj.updateDynamic("useTargetAsMinWidth")(useTargetAsMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetWidth)) __obj.updateDynamic("useTargetWidth")(useTargetWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IContextualMenuProps
}

