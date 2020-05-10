package typingsSlinky.reactNotificationSystem.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactNotificationSystem.mod.Attributes
import typingsSlinky.reactNotificationSystem.mod.Style
import typingsSlinky.reactNotificationSystem.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactNotificationSystem {
  @JSImport("react-notification-system", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    @scala.inline
    def allowHTML(value: Boolean): this.type = set("allowHTML", value.asInstanceOf[js.Any])
    @scala.inline
    def noAnimation(value: Boolean): this.type = set("noAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: Style | Boolean): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Attributes): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ReactNotificationSystem.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

