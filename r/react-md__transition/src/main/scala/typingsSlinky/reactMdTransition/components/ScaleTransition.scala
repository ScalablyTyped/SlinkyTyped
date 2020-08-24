package typingsSlinky.reactMdTransition.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdPortal.getContainerMod.PortalInto
import typingsSlinky.reactMdTransition.scaleTransitionMod.ScaleTransitionProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ScaleTransition {
  @JSImport("@react-md/transition", "ScaleTransition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    @scala.inline
    def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def classNames(value: js.Any): this.type = set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def in(value: js.Any): this.type = set("in", value.asInstanceOf[js.Any])
    @scala.inline
    def mountOnEnter(value: js.Any): this.type = set("mountOnEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnter(value: js.Any): this.type = set("onEnter", value.asInstanceOf[js.Any])
    @scala.inline
    def onEntered(value: js.Any): this.type = set("onEntered", value.asInstanceOf[js.Any])
    @scala.inline
    def onEntering(value: js.Any): this.type = set("onEntering", value.asInstanceOf[js.Any])
    @scala.inline
    def onExit(value: js.Any): this.type = set("onExit", value.asInstanceOf[js.Any])
    @scala.inline
    def onExited(value: js.Any): this.type = set("onExited", value.asInstanceOf[js.Any])
    @scala.inline
    def onExiting(value: js.Any): this.type = set("onExiting", value.asInstanceOf[js.Any])
    @scala.inline
    def portal(value: Boolean): this.type = set("portal", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoHTMLElement(value: HTMLElement): this.type = set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoFunction0(value: () => HTMLElement | Null): this.type = set("portalInto", js.Any.fromFunction0(value))
    @scala.inline
    def portalInto(value: PortalInto): this.type = set("portalInto", value.asInstanceOf[js.Any])
    @scala.inline
    def portalIntoNull: this.type = set("portalInto", null)
    @scala.inline
    def portalIntoId(value: String): this.type = set("portalIntoId", value.asInstanceOf[js.Any])
    @scala.inline
    def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def unmountOnExit(value: js.Any): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
    @scala.inline
    def vertical(value: Boolean): this.type = set("vertical", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ScaleTransitionProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ScaleTransitionProps]))
  }
}

