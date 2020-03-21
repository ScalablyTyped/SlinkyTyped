package typingsSlinky.rcCheckbox.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.input.tag
import typingsSlinky.rcCheckbox.mod.default
import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object RcCheckbox
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  @JSImport("rc-checkbox", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: autoFocus, className, disabled, id, name, onBlur, onClick, onFocus, readOnly, style, type */
  def apply(
    checked: Double | Boolean = null,
    defaultChecked: Double | Boolean = null,
    onChange: /* e */ Event_ => Unit = null,
    prefixCls: String = null,
    tabIndex: String | Double = null,
    value: js.Any = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (defaultChecked != null) __obj.updateDynamic("defaultChecked")(defaultChecked.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  def apply(mods: TagMod[tag.type]*): BuildingComponent[tag.type, default] = new slinky.core.BuildingComponent[slinky.web.html.input.tag.type, typingsSlinky.rcCheckbox.mod.default](js.Array(component.asInstanceOf[js.Any], js.Dictionary.empty)).apply(mods: _*)
  type Props = typingsSlinky.rcCheckbox.mod.Props
}

