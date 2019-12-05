package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.PointerEvent
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.ReactComponentClass
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotClassNamesMod.IMenuItemClassNames
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuDotTypesMod.IContextualMenuItem
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemDotTypesMod.IContextualMenuItemProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperDotTypesMod.IContextualMenuItemWrapperProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IContextualMenuItemWrapperProps593486878[ComponentRef <: js.Object] (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, ComponentRef] {
  def apply(
    classNames: IMenuItemClassNames,
    focusableElementIndex: Double,
    index: Double,
    item: IContextualMenuItem,
    totalItemCount: Double,
    componentRef: IRefObject[
      typingsSlinky.officeDashUiDashFabricDashReact.libComponentsContextualMenuContextualMenuItemWrapperContextualMenuItemWrapperMod.ContextualMenuItemWrapper
    ] = null,
    contextualMenuItemAs: ReactComponentClass[IContextualMenuItemProps] = null,
    dismissMenu: (/* ev */ js.UndefOr[js.Any], /* dismissAll */ js.UndefOr[Boolean]) => Unit = null,
    dismissSubMenu: () => Unit = null,
    executeItemClick: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit = null,
    expandedMenuItemKey: String = null,
    getSubMenuId: /* item */ IContextualMenuItem => js.UndefOr[String] = null,
    hasCheckmarks: js.UndefOr[Boolean] = js.undefined,
    hasIcons: js.UndefOr[Boolean] = js.undefined,
    onItemClick: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement]) => Unit = null,
    onItemClickBase: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement] | SyntheticKeyboardEvent[HTMLElement], /* target */ HTMLElement) => Unit = null,
    onItemKeyDown: (/* item */ IContextualMenuItem, /* ev */ SyntheticKeyboardEvent[HTMLElement]) => Unit = null,
    onItemMouseDown: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onItemMouseEnter: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Boolean | Unit = null,
    onItemMouseLeave: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement]) => Unit = null,
    onItemMouseMove: (/* item */ IContextualMenuItem, /* ev */ SyntheticMouseEvent[HTMLElement], /* target */ HTMLElement) => Unit = null,
    onTap: /* ev */ SyntheticTouchEvent[HTMLElement] | PointerEvent => Unit = null,
    openSubMenu: (/* item */ js.Any, /* target */ HTMLElement) => Unit = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, ComponentRef] = {
    val __obj = js.Dynamic.literal(classNames = classNames.asInstanceOf[js.Any], focusableElementIndex = focusableElementIndex.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], totalItemCount = totalItemCount.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (contextualMenuItemAs != null) __obj.updateDynamic("contextualMenuItemAs")(contextualMenuItemAs.asInstanceOf[js.Any])
    if (dismissMenu != null) __obj.updateDynamic("dismissMenu")(js.Any.fromFunction2(dismissMenu))
    if (dismissSubMenu != null) __obj.updateDynamic("dismissSubMenu")(js.Any.fromFunction0(dismissSubMenu))
    if (executeItemClick != null) __obj.updateDynamic("executeItemClick")(js.Any.fromFunction2(executeItemClick))
    if (expandedMenuItemKey != null) __obj.updateDynamic("expandedMenuItemKey")(expandedMenuItemKey.asInstanceOf[js.Any])
    if (getSubMenuId != null) __obj.updateDynamic("getSubMenuId")(js.Any.fromFunction1(getSubMenuId))
    if (!js.isUndefined(hasCheckmarks)) __obj.updateDynamic("hasCheckmarks")(hasCheckmarks.asInstanceOf[js.Any])
    if (!js.isUndefined(hasIcons)) __obj.updateDynamic("hasIcons")(hasIcons.asInstanceOf[js.Any])
    if (onItemClick != null) __obj.updateDynamic("onItemClick")(js.Any.fromFunction2(onItemClick))
    if (onItemClickBase != null) __obj.updateDynamic("onItemClickBase")(js.Any.fromFunction3(onItemClickBase))
    if (onItemKeyDown != null) __obj.updateDynamic("onItemKeyDown")(js.Any.fromFunction2(onItemKeyDown))
    if (onItemMouseDown != null) __obj.updateDynamic("onItemMouseDown")(js.Any.fromFunction2(onItemMouseDown))
    if (onItemMouseEnter != null) __obj.updateDynamic("onItemMouseEnter")(js.Any.fromFunction3(onItemMouseEnter))
    if (onItemMouseLeave != null) __obj.updateDynamic("onItemMouseLeave")(js.Any.fromFunction2(onItemMouseLeave))
    if (onItemMouseMove != null) __obj.updateDynamic("onItemMouseMove")(js.Any.fromFunction3(onItemMouseMove))
    if (onTap != null) __obj.updateDynamic("onTap")(js.Any.fromFunction1(onTap))
    if (openSubMenu != null) __obj.updateDynamic("openSubMenu")(js.Any.fromFunction2(openSubMenu))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = IContextualMenuItemWrapperProps
}

