package typingsSlinky.reactElemental.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.reactElemental.mod.AlertProps
import typingsSlinky.reactElemental.mod.AlertSize
import typingsSlinky.reactElemental.mod.AlertType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  @JSImport("react-elemental", "Alert")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactElemental.mod.Alert] {
    @scala.inline
    def dismissible(value: Boolean): this.type = set("dismissible", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: () => Unit): this.type = set("onDismiss", js.Any.fromFunction0(value))
    @scala.inline
    def size(value: AlertSize): this.type = set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def `type`(value: AlertType): this.type = set("type", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: AlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(message: String | ReactElement, title: String): Builder = {
    val __props = js.Dynamic.literal(message = message.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[AlertProps]))
  }
}

