package typingsSlinky.rcPicker.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typingsSlinky.rcPicker.dateBodyMod.DateBodyProps
import typingsSlinky.rcPicker.generateMod.GenerateConfig
import typingsSlinky.rcPicker.interfaceMod.Locale
import typingsSlinky.rcPicker.rcPickerStrings.key
import typingsSlinky.rcPicker.rcPickerStrings.mouse
import typingsSlinky.rcPicker.rcPickerStrings.submit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DateBody
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("rc-picker/lib/panels/DatePanel/DateBody", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[DateType](
    generateConfig: GenerateConfig[DateType],
    locale: Locale,
    onSelect: (DateType, /* type */ key | mouse | submit) => Unit,
    prefixCls: String,
    rowCount: Double,
    viewDate: DateType,
    dateRender: (DateType, DateType) => TagMod[Any] = null,
    disabledDate: DateType => Boolean = null,
    prefixColumn: DateType => TagMod[Any] = null,
    rowClassName: DateType => String = null,
    value: DateType = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(generateConfig = generateConfig.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], onSelect = js.Any.fromFunction2(onSelect), prefixCls = prefixCls.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], viewDate = viewDate.asInstanceOf[js.Any])
    if (dateRender != null) __obj.updateDynamic("dateRender")(js.Any.fromFunction2(dateRender))
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(js.Any.fromFunction1(disabledDate))
    if (prefixColumn != null) __obj.updateDynamic("prefixColumn")(js.Any.fromFunction1(prefixColumn))
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction1(rowClassName))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, js.Object]]
  }
  type Props = DateBodyProps[js.Any]
}

