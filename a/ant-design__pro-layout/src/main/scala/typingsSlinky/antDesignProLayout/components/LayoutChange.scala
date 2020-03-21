package typingsSlinky.antDesignProLayout.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antDesignProLayout.AnonChangeSetting
import typingsSlinky.antDesignProLayout.PartialSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LayoutChange
  extends ExternalComponentWithAttributesWithRefType[tag.type, js.Object] {
  @JSImport("@ant-design/pro-layout/lib/SettingDrawer/LayoutChange", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(
    changeSetting: (String, js.Any, js.UndefOr[Boolean]) => Unit,
    settings: PartialSettings,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, js.Object] = {
    val __obj = js.Dynamic.literal(changeSetting = js.Any.fromFunction3(changeSetting), settings = settings.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = AnonChangeSetting
}

