package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.componentsInputmaskInputMaskMod.InputMaskProps
import typingsSlinky.primereact.componentsTooltipTooltipOptionsMod.TooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputMask
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.inputmaskMod.InputMask] {
  @JSImport("primereact/inputmask", "InputMask")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, name, onChange, placeholder, required, size, type */
  def apply(
    autoClear: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maxlength: Int | Double = null,
    onComplete: /* e */ Event => Unit = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    slotChar: String = null,
    style: js.Object = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    unmask: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.inputmaskMod.InputMask] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClear)) __obj.updateDynamic("autoClear")(autoClear.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(js.Any.fromFunction1(onComplete))
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (slotChar != null) __obj.updateDynamic("slotChar")(slotChar.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    if (tooltipOptions != null) __obj.updateDynamic("tooltipOptions")(tooltipOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(unmask)) __obj.updateDynamic("unmask")(unmask.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.inputmaskMod.InputMask] = new slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.primereact.inputmaskMod.InputMask](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputMaskProps
}

