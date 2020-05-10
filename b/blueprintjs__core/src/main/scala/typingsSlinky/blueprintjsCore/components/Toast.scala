package typingsSlinky.blueprintjsCore.components

import slinky.core.TagMod
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.IActionProps
import typingsSlinky.blueprintjsCore.propsMod.ILinkProps
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsCore.toastMod.IToastProps
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Toast {
  @JSImport("@blueprintjs/core", "Toast")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Toast] {
    @scala.inline
    def action(value: IActionProps with ILinkProps): this.type = set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconNull: this.type = set("icon", null)
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def message(value: TagMod[Any]): this.type = set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def onDismiss(value: /* didTimeoutExpire */ Boolean => Unit): this.type = set("onDismiss", js.Any.fromFunction1(value))
    @scala.inline
    def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IToastProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Toast.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

