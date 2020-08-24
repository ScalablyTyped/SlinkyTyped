package typingsSlinky.reactMdTransition.components

import org.scalajs.dom.raw.HTMLElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactMdTransition.collapseMod.CollapseProps
import typingsSlinky.reactMdTransition.typesMod.TransitionTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  @JSImport("@react-md/transition", "Collapse")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, HTMLElement] {
    @scala.inline
    def appear(value: Boolean): this.type = set("appear", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def enter(value: Boolean): this.type = set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def exit(value: Boolean): this.type = set("exit", value.asInstanceOf[js.Any])
    @scala.inline
    def minHeight(value: Double | String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def minPaddingBottom(value: Double | String): this.type = set("minPaddingBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def minPaddingTop(value: Double | String): this.type = set("minPaddingTop", value.asInstanceOf[js.Any])
    @scala.inline
    def onEnter(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEnter", js.Any.fromFunction2(value))
    @scala.inline
    def onEntered(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntered", js.Any.fromFunction2(value))
    @scala.inline
    def onEntering(value: (HTMLElement, /* isAppearing */ Boolean) => Unit): this.type = set("onEntering", js.Any.fromFunction2(value))
    @scala.inline
    def onExit(value: HTMLElement => Unit): this.type = set("onExit", js.Any.fromFunction1(value))
    @scala.inline
    def onExited(value: HTMLElement => Unit): this.type = set("onExited", js.Any.fromFunction1(value))
    @scala.inline
    def onExiting(value: HTMLElement => Unit): this.type = set("onExiting", js.Any.fromFunction1(value))
    @scala.inline
    def temporary(value: Boolean): this.type = set("temporary", value.asInstanceOf[js.Any])
    @scala.inline
    def timeout(value: TransitionTimeout): this.type = set("timeout", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(collapsed: Boolean): Builder = {
    val __props = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CollapseProps]))
  }
}

