package typingsSlinky.antd.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atAntDashDesignCreateDashReactDashContext.atAntDashDesignCreateDashReactDashContextMod.ConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ConfigConsumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.antd.esConfigDashProviderMod.ConfigConsumer] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.antd.esConfigDashProviderMod.ConfigConsumer].asInstanceOf[String | js.Object]
  def apply(observedBits: Int | Double = null, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.antd.esConfigDashProviderMod.ConfigConsumer] = {
    val __obj = js.Dynamic.literal()
    if (observedBits != null) __obj.updateDynamic("observedBits")(observedBits.asInstanceOf[js.Any])
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[js.Any]
}

