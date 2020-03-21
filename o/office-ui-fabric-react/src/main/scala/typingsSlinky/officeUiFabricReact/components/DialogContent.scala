package typingsSlinky.officeUiFabricReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.SyntheticMouseEvent
import slinky.web.html.button.tag
import typingsSlinky.officeUiFabricReact.buttonTypesMod.IButtonProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.DialogType
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContent
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyleProps
import typingsSlinky.officeUiFabricReact.dialogContentTypesMod.IDialogContentStyles
import typingsSlinky.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.uifabricMergeStyles.istylefunctionMod.IStyleFunctionOrObject
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricUtilities.createRefMod.IRefObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DialogContent
  extends ExternalComponentWithAttributesWithRefType[tag.type, LegacyRef[js.Any] with js.Object] {
  @JSImport("office-ui-fabric-react", "DialogContent")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, key */
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
    title: String | ReactElement = null,
    titleId: String = null,
    titleProps: HTMLAttributes[HTMLDivElement] = null,
    topButtonsProps: js.Array[IButtonProps] = null,
    `type`: DialogType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = {
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
    if (titleProps != null) __obj.updateDynamic("titleProps")(titleProps.asInstanceOf[js.Any])
    if (topButtonsProps != null) __obj.updateDynamic("topButtonsProps")(topButtonsProps.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, LegacyRef[js.Any] with js.Object] = new slinky.core.BuildingComponent[
  slinky.web.html.button.tag.type, 
  typingsSlinky.react.mod.LegacyRef[js.Any] with js.Object](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = IDialogContentProps
}

