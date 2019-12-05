package typingsSlinky.reactDashBroadcast.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Subscriber_
  extends ExternalComponentWithAttributesWithRefType[
      tag.type, 
      typingsSlinky.reactDashBroadcast.reactDashBroadcastMod.Subscriber_[js.Any]
    ] {
  @JSImport("react-broadcast", "Subscriber")
  @js.native
  object componentImport extends js.Object
  
  override val component: String | js.Object = this.componentImport
  def apply[T](channel: String, _overrides: StringDictionary[js.Any] = null): BuildingComponent[
    tag.type, 
    typingsSlinky.reactDashBroadcast.reactDashBroadcastMod.Subscriber_[js.Any]
  ] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any])
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
    super.apply(__obj.asInstanceOf[Props]).asInstanceOf[slinky.core.BuildingComponent[
  slinky.web.html.`*`.tag.type, 
  typingsSlinky.reactDashBroadcast.reactDashBroadcastMod.Subscriber_[js.Any]]]
  }
  type Props = typingsSlinky.reactDashBroadcast.reactDashBroadcastMod.Subscriber.Props[js.Any]
}

