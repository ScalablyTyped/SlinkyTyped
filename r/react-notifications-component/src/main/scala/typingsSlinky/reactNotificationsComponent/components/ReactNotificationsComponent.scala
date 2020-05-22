package typingsSlinky.reactNotificationsComponent.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNotificationsComponent.mod.ReactNotificationProps
import typingsSlinky.reactNotificationsComponent.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationsComponent {
  @JSImport("react-notifications-component", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def breakpoint(value: Double): this.type = set("breakpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def isMobile(value: Boolean): this.type = set("isMobile", value.asInstanceOf[js.Any])
    @scala.inline
    def types(value: js.Array[String]): this.type = set("types", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ReactNotificationProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNotificationsComponent.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

