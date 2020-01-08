package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.ExternalPropsWriterProvider
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.atUifabricUtilities.libSelectionSelectionDotTypesMod.SelectionMode
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupHeaderDotTypesMod.IGroupHeaderProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupShowAllDotTypesMod.IGroupShowAllStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsGroupedListGroupedListDotTypesMod.IGroup
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithViewportMod.IViewport
import typingsSlinky.react.reactMod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_IGroupShowAllProps_1580454456 (implicit pw: ExternalPropsWriterProvider)
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  /* The following DOM/SVG props were specified: className, selected */
  def apply(
    compact: js.UndefOr[Boolean] = js.undefined,
    componentRef: IRefObject[js.Object] = null,
    expandButtonProps: HTMLAttributes[HTMLButtonElement] = null,
    footerText: String = null,
    group: IGroup = null,
    groupIndex: Int | Double = null,
    groupLevel: Int | Double = null,
    groups: js.Array[IGroup] = null,
    indentWidth: Int | Double = null,
    isCollapsedGroupSelectVisible: js.UndefOr[Boolean] = js.undefined,
    isGroupLoading: /* group */ IGroup => Boolean = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    loadingText: String = null,
    onGroupHeaderClick: /* group */ IGroup => Unit = null,
    onRenderTitle: (/* props */ js.UndefOr[IGroupHeaderProps], /* defaultRender */ js.UndefOr[
      js.Function1[
        /* props */ js.UndefOr[IGroupHeaderProps], 
        typingsSlinky.react.reactMod._Global_.JSX.Element | Null
      ]
    ]) => typingsSlinky.react.reactMod._Global_.JSX.Element | Null = null,
    onToggleCollapse: /* group */ IGroup => Unit = null,
    onToggleSelectGroup: /* group */ IGroup => Unit = null,
    onToggleSummarize: /* group */ IGroup => Unit = null,
    selectionMode: SelectionMode = null,
    showAllLinkText: String = null,
    styles: IStyleFunctionOrObject[IGroupShowAllStyleProps, IGroupShowAllStyles] = null,
    theme: ITheme = null,
    viewport: IViewport = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (expandButtonProps != null) __obj.updateDynamic("expandButtonProps")(expandButtonProps.asInstanceOf[js.Any])
    if (footerText != null) __obj.updateDynamic("footerText")(footerText.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupIndex != null) __obj.updateDynamic("groupIndex")(groupIndex.asInstanceOf[js.Any])
    if (groupLevel != null) __obj.updateDynamic("groupLevel")(groupLevel.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (indentWidth != null) __obj.updateDynamic("indentWidth")(indentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(isCollapsedGroupSelectVisible)) __obj.updateDynamic("isCollapsedGroupSelectVisible")(isCollapsedGroupSelectVisible.asInstanceOf[js.Any])
    if (isGroupLoading != null) __obj.updateDynamic("isGroupLoading")(js.Any.fromFunction1(isGroupLoading))
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected.asInstanceOf[js.Any])
    if (loadingText != null) __obj.updateDynamic("loadingText")(loadingText.asInstanceOf[js.Any])
    if (onGroupHeaderClick != null) __obj.updateDynamic("onGroupHeaderClick")(js.Any.fromFunction1(onGroupHeaderClick))
    if (onRenderTitle != null) __obj.updateDynamic("onRenderTitle")(js.Any.fromFunction2(onRenderTitle))
    if (onToggleCollapse != null) __obj.updateDynamic("onToggleCollapse")(js.Any.fromFunction1(onToggleCollapse))
    if (onToggleSelectGroup != null) __obj.updateDynamic("onToggleSelectGroup")(js.Any.fromFunction1(onToggleSelectGroup))
    if (onToggleSummarize != null) __obj.updateDynamic("onToggleSummarize")(js.Any.fromFunction1(onToggleSummarize))
    if (selectionMode != null) __obj.updateDynamic("selectionMode")(selectionMode.asInstanceOf[js.Any])
    if (showAllLinkText != null) __obj.updateDynamic("showAllLinkText")(showAllLinkText.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, js.Object] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IGroupShowAllProps
}

