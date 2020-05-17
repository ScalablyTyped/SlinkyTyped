package typingsSlinky.blueprintjsCore.components

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.blueprintjsCore.alertMod.IAlertProps
import typingsSlinky.blueprintjsCore.intentMod.Intent
import typingsSlinky.blueprintjsCore.propsMod.MaybeElement
import typingsSlinky.blueprintjsIcons.iconNameMod.IconName
import typingsSlinky.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Alert {
  @JSImport("@blueprintjs/core", "Alert")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.blueprintjsCore.mod.Alert] {
    @scala.inline
    def canEscapeKeyCancel(value: Boolean): this.type = set("canEscapeKeyCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def canOutsideClickCancel(value: Boolean): this.type = set("canOutsideClickCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def cancelButtonText(value: String): this.type = set("cancelButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def confirmButtonText(value: String): this.type = set("confirmButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def iconReactElement(value: ReactElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def icon(value: IconName | MaybeElement): this.type = set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def iconNull: this.type = set("icon", null)
    @scala.inline
    def intent(value: Intent): this.type = set("intent", value.asInstanceOf[js.Any])
    @scala.inline
    def onCancel(value: /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): this.type = set("onCancel", js.Any.fromFunction1(value))
    @scala.inline
    def onClose(value: (/* confirmed */ Boolean, /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]]) => Unit): this.type = set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def onClosed(value: /* node */ HTMLElement => Unit): this.type = set("onClosed", js.Any.fromFunction1(value))
    @scala.inline
    def onClosing(value: /* node */ HTMLElement => Unit): this.type = set("onClosing", js.Any.fromFunction1(value))
    @scala.inline
    def onConfirm(value: /* evt */ js.UndefOr[SyntheticEvent[Event, HTMLElement]] => Unit): this.type = set("onConfirm", js.Any.fromFunction1(value))
    @scala.inline
    def onOpened(value: /* node */ HTMLElement => Unit): this.type = set("onOpened", js.Any.fromFunction1(value))
    @scala.inline
    def onOpening(value: /* node */ HTMLElement => Unit): this.type = set("onOpening", js.Any.fromFunction1(value))
    @scala.inline
    def portalContainer(value: HTMLElement): this.type = set("portalContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionDuration(value: Double): this.type = set("transitionDuration", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: IAlertProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(isOpen: Boolean): Builder = {
    val __props = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[IAlertProps]))
  }
}

