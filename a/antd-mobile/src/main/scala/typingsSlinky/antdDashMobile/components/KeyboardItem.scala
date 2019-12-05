package typingsSlinky.antdDashMobile.components

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLTableDataCellElement
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.SyntheticMouseEvent
import slinky.web.html.`*`.tag
import typingsSlinky.antdDashMobile.libInputDashItemCustomKeyboardMod.KeyboardItemProps
import typingsSlinky.react.reactMod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object KeyboardItem
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.antdDashMobile.libInputDashItemCustomKeyboardMod.KeyboardItem
    ] {
  @JSImport("antd-mobile/lib/input-item/CustomKeyboard", "KeyboardItem")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    onClick: (SyntheticMouseEvent[HTMLTableDataCellElement], String) => Unit,
    iconOnly: js.UndefOr[Boolean] = js.undefined,
    prefixCls: String = null,
    tdRef: Ref[HTMLTableDataCellElement] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[
    tag.type, 
    typingsSlinky.antdDashMobile.libInputDashItemCustomKeyboardMod.KeyboardItem
  ] = {
    val __obj = js.Dynamic.literal(onClick = js.Any.fromFunction2(onClick))
    if (!js.isUndefined(iconOnly)) __obj.updateDynamic("iconOnly")(iconOnly.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (tdRef != null) __obj.updateDynamic("tdRef")(tdRef.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = KeyboardItemProps
}

