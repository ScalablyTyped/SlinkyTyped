package typingsSlinky.rrNotifications.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rrNotifications.anon.AnimationDuration
import typingsSlinky.rrNotifications.anon.Payload
import typingsSlinky.rrNotifications.rrNotificationsStrings.left
import typingsSlinky.rrNotifications.rrNotificationsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object NotificationsProvider {
  @JSImport("rr-notifications", "NotificationsProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def animationDuration(value: Double): this.type = set("animationDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def animationEasing(value: String): this.type = set("animationEasing", value.asInstanceOf[js.Any])
    @scala.inline
    def dismissAfter(value: Double): this.type = set("dismissAfter", value.asInstanceOf[js.Any])
    @scala.inline
    def position(value: js.Tuple4[String, String, String, String]): this.type = set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def slideFromSide(value: right | left): this.type = set("slideFromSide", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AnimationDuration): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(renderNotification: Payload => ReactElement): Builder = {
    val __props = js.Dynamic.literal(renderNotification = js.Any.fromFunction1(renderNotification))
    new Builder(js.Array(this.component, __props.asInstanceOf[AnimationDuration]))
  }
}

