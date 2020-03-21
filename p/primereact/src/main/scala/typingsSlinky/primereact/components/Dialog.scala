package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.dialogMod.DialogProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Dialog
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactDialogMod.Dialog] {
  @JSImport("primereact/dialog", "Dialog")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    onHide: () => Unit,
    appendTo: HTMLElement = null,
    ariaCloseIconLabel: String = null,
    baseZIndex: Int | Double = null,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    closable: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    contentStyle: js.Object = null,
    dismissableMask: js.UndefOr[Boolean] = js.undefined,
    focusOnShow: js.UndefOr[Boolean] = js.undefined,
    footer: js.Any = null,
    header: js.Any = null,
    iconsTemplate: () => js.UndefOr[ReactElement] = null,
    maximizable: js.UndefOr[Boolean] = js.undefined,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: () => Unit = null,
    rtl: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactDialogMod.Dialog] = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseIconLabel != null) __obj.updateDynamic("ariaCloseIconLabel")(ariaCloseIconLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissableMask)) __obj.updateDynamic("dismissableMask")(dismissableMask.asInstanceOf[js.Any])
    if (!js.isUndefined(focusOnShow)) __obj.updateDynamic("focusOnShow")(focusOnShow.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.asInstanceOf[js.Any])
    if (iconsTemplate != null) __obj.updateDynamic("iconsTemplate")(js.Any.fromFunction0(iconsTemplate))
    if (!js.isUndefined(maximizable)) __obj.updateDynamic("maximizable")(maximizable.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = DialogProps
}

