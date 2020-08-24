package typingsSlinky.reactOverlays.components

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ReactInstance
import typingsSlinky.reactOverlays.overlayMod.OverlayProps
import typingsSlinky.reactOverlays.overlayMod.OverlayRenderProps
import typingsSlinky.reactOverlays.overlayMod.Placements
import typingsSlinky.reactOverlays.portalMod.PortalProps
import typingsSlinky.reactOverlays.reactOverlaysStrings.click
import typingsSlinky.reactOverlays.reactOverlaysStrings.mousedown
import typingsSlinky.reactTransitionGroup.transitionMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Overlay {
  @JSImport("react-overlays", "Overlay")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactOverlays.mod.Overlay] {
    @scala.inline
    def containerReactElement(value: ReactElement): this.type = set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def container(value: ReactElement | js.Function): this.type = set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def flip(value: Boolean): this.type = set("flip", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnter(value: /* node */ HTMLElement => _): this.type = set("onEnter", js.Any.fromFunction1(value))
    @scala.inline
    def onEntered(value: /* node */ HTMLElement => _): this.type = set("onEntered", js.Any.fromFunction1(value))
    @scala.inline
    def onEntering(value: /* node */ HTMLElement => _): this.type = set("onEntering", js.Any.fromFunction1(value))
    @scala.inline
    def onExit(value: /* node */ HTMLElement => _): this.type = set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def onExited(value: /* node */ HTMLElement => _): this.type = set("onExited", js.Any.fromFunction1(value))
    @scala.inline
    def onExiting(value: /* node */ HTMLElement => _): this.type = set("onExiting", js.Any.fromFunction1(value))
    @scala.inline
    def onHide(value: (/* props */ PortalProps, /* repeated */ js.Any) => _): this.type = set("onHide", js.Any.fromFunction2(value))
    @scala.inline
    def onRendered(value: js.Function): this.type = set("onRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def placement(value: Placements): this.type = set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def popperConfig(value: js.Object): this.type = set("popperConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def rootClose(value: Boolean): this.type = set("rootClose", value.asInstanceOf[js.Any])
    @scala.inline
    def rootCloseDisabled(value: Boolean): this.type = set("rootCloseDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def rootCloseEvent(value: click | mousedown): this.type = set("rootCloseEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def show(value: Boolean): this.type = set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def targetElement(value: Element): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def targetFunction0(value: () => ReactInstance): this.type = set("target", js.Any.fromFunction0(value))
    @scala.inline
    def targetComponent(value: ReactComponentClass[js.Any]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def target(value: ReactInstance | js.Function0[ReactInstance]): this.type = set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionFunctionComponent(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionComponentClass(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
    @scala.inline
    def transition(value: ReactComponentClass[TransitionProps[js.UndefOr[scala.Nothing]]]): this.type = set("transition", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: OverlayProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(children: OverlayRenderProps => ReactElement): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder(js.Array(this.component, __props.asInstanceOf[OverlayProps]))
  }
}

