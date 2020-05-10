package typingsSlinky.reactToastNotifications.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactToastNotifications.mod.ToastConsumerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastConsumer {
  @JSImport("react-toast-notifications", "ToastConsumer")
  @js.native
  object component extends js.Object
  
  def withProps(p: ToastConsumerProps): Default[tag.type, typingsSlinky.reactToastNotifications.mod.ToastConsumer] = new Default[tag.type, typingsSlinky.reactToastNotifications.mod.ToastConsumer](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToastConsumer.type): Default[tag.type, typingsSlinky.reactToastNotifications.mod.ToastConsumer] = new Default[tag.type, typingsSlinky.reactToastNotifications.mod.ToastConsumer](js.Array(this.component, js.Dictionary.empty))()
}

