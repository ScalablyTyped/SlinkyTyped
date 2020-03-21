package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.sidebarMod.SidebarProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Sidebar
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactSidebarMod.Sidebar] {
  @JSImport("primereact/sidebar", "Sidebar")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    onHide: () => Unit,
    ariaCloseLabel: String = null,
    baseZIndex: Int | Double = null,
    blockScroll: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    fullScreen: js.UndefOr[Boolean] = js.undefined,
    iconsTemplate: () => js.UndefOr[ReactElement] = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    onShow: () => Unit = null,
    position: String = null,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactSidebarMod.Sidebar] = {
    val __obj = js.Dynamic.literal(onHide = js.Any.fromFunction0(onHide))
    if (ariaCloseLabel != null) __obj.updateDynamic("ariaCloseLabel")(ariaCloseLabel.asInstanceOf[js.Any])
    if (baseZIndex != null) __obj.updateDynamic("baseZIndex")(baseZIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(blockScroll)) __obj.updateDynamic("blockScroll")(blockScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (!js.isUndefined(fullScreen)) __obj.updateDynamic("fullScreen")(fullScreen.asInstanceOf[js.Any])
    if (iconsTemplate != null) __obj.updateDynamic("iconsTemplate")(js.Any.fromFunction0(iconsTemplate))
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal.asInstanceOf[js.Any])
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction0(onShow))
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SidebarProps
}

