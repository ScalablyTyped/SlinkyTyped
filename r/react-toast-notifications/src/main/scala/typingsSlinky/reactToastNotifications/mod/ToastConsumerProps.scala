package typingsSlinky.reactToastNotifications.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastConsumerProps extends js.Object {
  def children(context: ToastConsumerContext): TagMod[Any]
}

object ToastConsumerProps {
  @scala.inline
  def apply(children: ToastConsumerContext => TagMod[Any]): ToastConsumerProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[ToastConsumerProps]
  }
}

