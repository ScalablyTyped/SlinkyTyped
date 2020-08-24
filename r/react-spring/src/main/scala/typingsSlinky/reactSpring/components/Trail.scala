package typingsSlinky.reactSpring.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringRendererFunc
import typingsSlinky.reactSpring.renderpropsUniversalMod.TrailKeyProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TrailProps
import typingsSlinky.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Trail {
  @JSImport("react-spring/renderprops", "Trail")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TItem, /* <: js.Object */ DS] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactSpring.renderpropsMod.Trail[TItem, DS]] {
    @scala.inline
    def after(value: Partial[js.Object]): this.type = set("after", value.asInstanceOf[js.Any])
    @scala.inline
    def configFunction1(value: /* key */ String => SpringConfig): this.type = set("config", js.Any.fromFunction1(value))
    @scala.inline
    def config(value: SpringConfig | (js.Function1[/* key */ String, SpringConfig])): this.type = set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def force(value: Boolean): this.type = set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def from(value: Partial[DS]): this.type = set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def immediateFunction1(value: /* key */ String => Boolean): this.type = set("immediate", js.Any.fromFunction1(value))
    @scala.inline
    def immediate(value: Boolean | (js.Function1[/* key */ String, Boolean])): this.type = set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def inject(value: js.Any): this.type = set("inject", value.asInstanceOf[js.Any])
    @scala.inline
    def keysVarargs(value: TrailKeyProps*): this.type = set("keys", js.Array(value :_*))
    @scala.inline
    def keysFunction1(value: TItem => TrailKeyProps): this.type = set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def keys(value: (js.Function1[TItem, TrailKeyProps]) | js.Array[TrailKeyProps] | TrailKeyProps): this.type = set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def onFrame(value: js.Object => Unit): this.type = set("onFrame", js.Any.fromFunction1(value))
    @scala.inline
    def onRest(value: js.Object => Unit): this.type = set("onRest", js.Any.fromFunction1(value))
    @scala.inline
    def onStart(value: () => Unit): this.type = set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def reset(value: Boolean): this.type = set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def to(value: DS): this.type = set("to", value.asInstanceOf[js.Any])
  }
  
  def withProps[TItem, /* <: js.Object */ DS](p: TrailProps[TItem, DS]): Builder[TItem, DS] = new Builder[TItem, DS](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TItem, /* <: js.Object */ DS](children: (TItem, Double) => SpringRendererFunc[DS], items: js.Array[TItem] | TItem): Builder[TItem, DS] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction2(children), items = items.asInstanceOf[js.Any])
    new Builder[TItem, DS](js.Array(this.component, __props.asInstanceOf[TrailProps[TItem, DS]]))
  }
}

