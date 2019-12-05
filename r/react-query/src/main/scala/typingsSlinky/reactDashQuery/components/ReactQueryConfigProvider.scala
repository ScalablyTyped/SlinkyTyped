package typingsSlinky.reactDashQuery.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactDashQuery.Anon_Config
import typingsSlinky.reactDashQuery.reactDashQueryMod.ReactQueryProviderConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactQueryConfigProvider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.reactDashQuery.reactDashQueryMod.ReactQueryConfigProvider] {
  @JSImport("react-query", "ReactQueryConfigProvider")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(config: ReactQueryProviderConfig = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.reactDashQuery.reactDashQueryMod.ReactQueryConfigProvider] = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = Anon_Config
}

