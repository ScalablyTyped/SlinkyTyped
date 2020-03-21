package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.overlayPanelMod.OverlayPanelProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object OverlayPanel
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactOverlaypanelMod.OverlayPanel] {
  @JSImport("primereact/overlaypanel", "OverlayPanel")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, id */
  def apply(
    appendTo: js.Any = null,
    ariaCloseLabel: String = null,
    dismissable: js.UndefOr[Boolean] = js.undefined,
    onHide: () => Unit = null,
    showCloseIcon: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactOverlaypanelMod.OverlayPanel] = {
    val __obj = js.Dynamic.literal()
    if (appendTo != null) __obj.updateDynamic("appendTo")(appendTo.asInstanceOf[js.Any])
    if (ariaCloseLabel != null) __obj.updateDynamic("ariaCloseLabel")(ariaCloseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissable)) __obj.updateDynamic("dismissable")(dismissable.asInstanceOf[js.Any])
    if (onHide != null) __obj.updateDynamic("onHide")(js.Any.fromFunction0(onHide))
    if (!js.isUndefined(showCloseIcon)) __obj.updateDynamic("showCloseIcon")(showCloseIcon.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactOverlaypanelMod.OverlayPanel] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactOverlaypanelMod.OverlayPanel](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = OverlayPanelProps
}

