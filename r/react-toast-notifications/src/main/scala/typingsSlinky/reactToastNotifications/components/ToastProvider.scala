package typingsSlinky.reactToastNotifications.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactToastNotifications.anon.Toast
import typingsSlinky.reactToastNotifications.mod.Placement
import typingsSlinky.reactToastNotifications.mod.ToastProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ToastProvider {
  @JSImport("react-toast-notifications", "ToastProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def autoDismiss(value: Boolean | Double): this.type = set("autoDismiss", value.asInstanceOf[js.Any])
    @scala.inline
    def autoDismissTimeout(value: Double): this.type = set("autoDismissTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def components(value: Toast): this.type = set("components", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ToastProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: ToastProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

