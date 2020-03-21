package typingsSlinky.fundamentalReact.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLInputElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.fundamentalReact.formLabelMod.FormLabelProps
import typingsSlinky.fundamentalReact.toggleMod.ToggleProps
import typingsSlinky.fundamentalReact.toggleMod.ToggleSize
import typingsSlinky.fundamentalReact.toggleMod.default
import typingsSlinky.react.mod.ChangeEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toggle
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("fundamental-react/lib/Toggle/Toggle", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: checked, className, disabled, id */
  def apply(
    disableStyles: js.UndefOr[Boolean] = js.undefined,
    isCheck: js.UndefOr[Boolean] = js.undefined,
    isInline: js.UndefOr[Boolean] = js.undefined,
    labelProps: FormLabelProps = null,
    onChange: /* event */ ChangeEvent[HTMLInputElement] => Unit = null,
    size: ToggleSize = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableStyles)) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(isCheck)) __obj.updateDynamic("isCheck")(isCheck.asInstanceOf[js.Any])
    if (!js.isUndefined(isInline)) __obj.updateDynamic("isInline")(isInline.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.fundamentalReact.toggleMod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = ToggleProps
}

