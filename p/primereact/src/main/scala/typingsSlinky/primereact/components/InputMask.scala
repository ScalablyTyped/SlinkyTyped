package typingsSlinky.primereact.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.primereact.AnonValue
import typingsSlinky.primereact.inputMaskMod.InputMaskProps
import typingsSlinky.primereact.tooltipOptionsMod.TooltipOptions
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object InputMask
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.primereact.primereactInputmaskMod.InputMask] {
  @JSImport("primereact/inputmask", "InputMask")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: className, disabled, id, name, placeholder, required, size, type */
  def apply(
    ariaLabelledBy: String = null,
    autoClear: js.UndefOr[Boolean] = js.undefined,
    mask: String = null,
    maxlength: Int | Double = null,
    onChange: /* e */ AnonValue => Unit = null,
    onComplete: /* e */ Event_ => Unit = null,
    readonly: js.UndefOr[Boolean] = js.undefined,
    slotChar: String = null,
    style: js.Object = null,
    tabindex: Int | Double = null,
    tooltip: js.Any = null,
    tooltipOptions: TooltipOptions = null,
    unmask: js.UndefOr[Boolean] = js.undefined,
    value: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.primereact.primereactInputmaskMod.InputMask] = {
    val __obj = js.Dynamic.literal()
    if (ariaLabelledBy != null) __obj.updateDynamic("ariaLabelledBy")(ariaLabelledBy.asInstanceOf[js.Any])
    if (!js.isUndefined(autoClear)) __obj.updateDynamic("autoClear")(autoClear.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (maxlength != null) __obj.updateDynamic("maxlength")(maxlength.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
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
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, typingsSlinky.primereact.primereactInputmaskMod.InputMask] = new slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.primereact.primereactInputmaskMod.InputMask](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = InputMaskProps
}

