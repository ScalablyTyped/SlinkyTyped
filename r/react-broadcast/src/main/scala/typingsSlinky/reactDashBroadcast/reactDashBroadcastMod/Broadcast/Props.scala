package typingsSlinky.reactDashBroadcast.reactDashBroadcastMod.Broadcast

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof react-broadcast.react-broadcast.Broadcast.DefaultProps<T> ]:? react-broadcast.react-broadcast.Broadcast.DefaultProps<T>[P]} */ trait Props[T] extends js.Object {
  var channel: String
  var children: TagMod[Any]
  var value: T
}

object Props {
  @scala.inline
  def apply[T](channel: String, children: TagMod[Any], value: T): Props[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Props[T]]
  }
}

