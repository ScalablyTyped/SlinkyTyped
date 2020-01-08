package typingsSlinky.officeDashUiDashFabricDashReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.atUifabricMergeDashStyles.libIStyleFunctionMod.IStyleFunctionOrObject
import typingsSlinky.atUifabricStyling.libInterfacesIThemeMod.ITheme
import typingsSlinky.atUifabricUtilities.libCreateRefMod.IRefObject
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsButtonButtonDotTypesMod.IButtonProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.DialogType
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContent
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentStyleProps
import typingsSlinky.officeDashUiDashFabricDashReact.libComponentsDialogDialogContentDotTypesMod.IDialogContentStyles
import typingsSlinky.officeDashUiDashFabricDashReact.libUtilitiesDecoratorsWithResponsiveModeMod.ResponsiveMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContentBase
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogContentBase
    ] {
  @JSImport("office-ui-fabric-react/lib/Dialog", "DialogContentBase")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className */
  def apply(
    closeButtonAriaLabel: String = null,
    componentRef: IRefObject[IDialogContent] = null,
    draggableHeaderClassName: String = null,
    isMultiline: js.UndefOr[Boolean] = js.undefined,
    onDismiss: /* ev */ js.UndefOr[SyntheticMouseEvent[HTMLButtonElement]] => _ = null,
    responsiveMode: ResponsiveMode = null,
    showCloseButton: js.UndefOr[Boolean] = js.undefined,
    styles: IStyleFunctionOrObject[IDialogContentStyleProps, IDialogContentStyles] = null,
    subText: String = null,
    subTextId: String = null,
    theme: ITheme = null,
    title: String | typingsSlinky.react.reactMod._Global_.JSX.Element = null,
    titleId: String = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogContentBase
  ] = {
    val __obj = js.Dynamic.literal()
    if (closeButtonAriaLabel != null) __obj.updateDynamic("closeButtonAriaLabel")(closeButtonAriaLabel.asInstanceOf[js.Any])
    if (componentRef != null) __obj.updateDynamic("componentRef")(componentRef.asInstanceOf[js.Any])
    if (draggableHeaderClassName != null) __obj.updateDynamic("draggableHeaderClassName")(draggableHeaderClassName.asInstanceOf[js.Any])
    if (!js.isUndefined(isMultiline)) __obj.updateDynamic("isMultiline")(isMultiline.asInstanceOf[js.Any])
    if (onDismiss != null) __obj.updateDynamic("onDismiss")(js.Any.fromFunction1(onDismiss))
    if (responsiveMode != null) __obj.updateDynamic("responsiveMode")(responsiveMode.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseButton)) __obj.updateDynamic("showCloseButton")(showCloseButton.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (subText != null) __obj.updateDynamic("subText")(subText.asInstanceOf[js.Any])
    if (subTextId != null) __obj.updateDynamic("subTextId")(subTextId.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleId != null) __obj.updateDynamic("titleId")(titleId.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[
    tag.type, 
    typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogContentBase
  ] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.officeDashUiDashFabricDashReact.libDialogMod.DialogContentBase](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDialogContentProps
}

