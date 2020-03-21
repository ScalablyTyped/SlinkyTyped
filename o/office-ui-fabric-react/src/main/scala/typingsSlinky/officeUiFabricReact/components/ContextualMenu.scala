package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.officeUiFabricReact.calloutTypesMod.ICalloutProps
import typingsSlinky.officeUiFabricReact.calloutTypesMod.Target
import typingsSlinky.officeUiFabricReact.contextualMenuClassNamesMod.IContextualMenuClassNames
import typingsSlinky.officeUiFabricReact.contextualMenuItemTypesMod.IContextualMenuItemProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenu
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuItem
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuListProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyleProps
import typingsSlinky.officeUiFabricReact.contextualMenuTypesMod.IContextualMenuStyles
import typingsSlinky.officeUiFabricReact.directionalHintMod.DirectionalHint
import typingsSlinky.officeUiFabricReact.focusZoneTypesMod.IFocusZoneProps
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.std.Window_
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import typingsSlinky.uifabricUtilities.irectangleMod.IRectangle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ContextualMenu
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("office-ui-fabric-react", "ContextualMenu")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, hidden, id, title */
  def apply(
    items: js.Array[IContextualMenuItem],
    alignTargetEdge: js.UndefOr[Boolean] = js.undefined,
    ariaLabel: String = null,
    beakWidth: Int | Double = null,
    bounds: IRectangle | (js.Function2[
      /* target */ js.UndefOr[Target], 
      /* targetWindow */ js.UndefOr[Window_], 
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
      js.Function1[/* props */ js.UndefOr[IContextualMenuListProps], ReactElement | Null]
    ]) => ReactElement | Null = null,
    onRenderSubMenu: (/* props */ js.UndefOr[IContextualMenuProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IContextualMenuProps], ReactElement | Null]]) => ReactElement | Null = null,
    responsiveMode: ResponsiveMode = null,
    shouldFocusOnContainer: js.UndefOr[Boolean] = js.undefined,
    shouldFocusOnMount: js.UndefOr[Boolean] = js.undefined,
    shouldUpdateWhenHidden: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IContextualMenuStyleProps, IContextualMenuStyles] = null,
    subMenuHoverDelay: Int | Double = null,
    target: Target = null,
    theme: ITheme = null,
    useTargetAsMinWidth: js.UndefOr[Boolean] = js.undefined,
    useTargetWidth: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
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
    if (!js.isUndefined(useTargetAsMinWidth)) __obj.updateDynamic("useTargetAsMinWidth")(useTargetAsMinWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(useTargetWidth)) __obj.updateDynamic("useTargetWidth")(useTargetWidth.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IContextualMenuProps
}

