package typingsSlinky.reactBootstrap.components

import org.scalajs.dom.raw.HTMLElement
import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.collapseMod.CollapseProps
import typingsSlinky.reactBootstrap.reactBootstrapStrings.height
import typingsSlinky.reactBootstrap.reactBootstrapStrings.width
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Collapse {
  @JSImport("react-bootstrap", "Collapse")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Collapse] {
    @scala.inline
    def dimensionFunction0(value: () => String): this.type = set("dimension", js.Any.fromFunction0(value))
    @scala.inline
    def dimension(value: height | width | js.Function0[String]): this.type = set("dimension", value.asInstanceOf[js.Any])
    @scala.inline
    def getDimensionValue(value: (/* dimension */ Double, /* element */ ReactElement) => Double): this.type = set("getDimensionValue", js.Any.fromFunction2(value))
    @scala.inline
    def in(value: Boolean): this.type = set("in", value.asInstanceOf[js.Any])
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
    def timeout(value: Double): this.type = set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def transitionAppear(value: Boolean): this.type = set("transitionAppear", value.asInstanceOf[js.Any])
    @scala.inline
    def unmountOnExit(value: Boolean): this.type = set("unmountOnExit", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CollapseProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Collapse.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

