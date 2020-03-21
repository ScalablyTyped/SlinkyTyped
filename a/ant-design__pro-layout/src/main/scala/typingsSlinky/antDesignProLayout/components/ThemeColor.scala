package typingsSlinky.antDesignProLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignProLayout.AnonColor
import typingsSlinky.antDesignProLayout.AnonDefaultMessage
import typingsSlinky.antDesignProLayout.themeColorMod.ThemeColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ThemeColor
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/ThemeColor", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  /* The following DOM/SVG props were specified: title */
  def apply(
    formatMessage: AnonDefaultMessage => String,
    onChange: String => Unit,
    value: String,
    colors: js.Array[AnonColor] = null,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(formatMessage = js.Any.fromFunction1(formatMessage), onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ThemeColorProps
}

