package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.antd.libConfigDashProviderContextMod.ConfigConsumerProps
import typingsSlinky.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigConsumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antd.libConfigDashProviderMod.ConfigConsumer] {
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply(observedBits: Int | Double = null, _overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.antd.libConfigDashProviderMod.ConfigConsumer] = {
    val __obj = js.Dynamic.literal()
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[ConfigConsumerProps]
}

