package typingsSlinky.reactBroadcast.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.reactBroadcast.mod.Subscriber_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subscriber
  extends ExternalComponentWithAttributesWithRefType[tag.type, Subscriber_[js.Any]] {
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](
    channel: String,
    quiet: js.UndefOr[Boolean] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, Subscriber_[js.Any]] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[slinky.web.html.`*`.tag.type, typingsSlinky.reactBroadcast.mod.Subscriber_[js.Any]]]
  }
  type Props = typingsSlinky.reactBroadcast.mod.Subscriber.Props[js.Any]
}

