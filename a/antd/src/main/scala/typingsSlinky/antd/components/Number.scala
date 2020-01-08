package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libStatisticNumberMod.NumberProps
import typingsSlinky.antd.libStatisticUtilsMod.Formatter
import typingsSlinky.antd.libStatisticUtilsMod.valueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Number
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("antd/lib/statistic/Number", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    value: valueType,
    decimalSeparator: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    precision: Int | Double = null,
    prefixCls: String = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = NumberProps
}

