package typingsSlinky.reactSpring.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringConfig
import typingsSlinky.reactSpring.renderpropsUniversalMod.SpringRendererFunc
import typingsSlinky.reactSpring.renderpropsUniversalMod.State
import typingsSlinky.reactSpring.renderpropsUniversalMod.TransitionKeyProps
import typingsSlinky.reactSpring.renderpropsUniversalMod.TransitionProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Transition {
  @JSImport("react-spring/renderprops", "Transition")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[TItem, /* <: js.Object */ TInit, /* <: js.Object */ TFrom, /* <: js.Object */ TEnter, /* <: js.Object */ TLeave, /* <: js.Object */ TUpdate] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[
          tag.type, 
          typingsSlinky.reactSpring.renderpropsMod.Transition[TItem, TInit, TFrom, TEnter, TLeave, TUpdate]
        ] {
    @scala.inline
    def children(
      value: (TItem, /* state */ State, /* index */ Double) => Boolean | Null | (SpringRendererFunc[TInit with TFrom with TEnter with TLeave with TUpdate])
    ): this.type = set("children", js.Any.fromFunction3(value))
    @scala.inline
    def configFunction2(value: (TItem, /* type */ State) => SpringConfig): this.type = set("config", js.Any.fromFunction2(value))
    @scala.inline
    def config(value: SpringConfig | (js.Function2[TItem, /* type */ State, SpringConfig])): this.type = set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def delay(value: Double): this.type = set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def enterFunction1(value: TItem => TEnter): this.type = set("enter", js.Any.fromFunction1(value))
    @scala.inline
    def enter(value: TEnter | (js.Function1[TItem, TEnter])): this.type = set("enter", value.asInstanceOf[js.Any])
    @scala.inline
    def fromFunction1(value: TItem => TFrom): this.type = set("from", js.Any.fromFunction1(value))
    @scala.inline
    def from(value: TFrom | (js.Function1[TItem, TFrom])): this.type = set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def immediateFunction1(value: /* key */ String => Boolean): this.type = set("immediate", js.Any.fromFunction1(value))
    @scala.inline
    def immediate(value: Boolean | (js.Function1[/* key */ String, Boolean])): this.type = set("immediate", value.asInstanceOf[js.Any])
    @scala.inline
    def initialFunction1(value: TItem => TInit): this.type = set("initial", js.Any.fromFunction1(value))
    @scala.inline
    def initial(value: TInit | (js.Function1[TItem, TInit])): this.type = set("initial", value.asInstanceOf[js.Any])
    @scala.inline
    def initialNull: this.type = set("initial", null)
    @scala.inline
    def keysVarargs(value: TransitionKeyProps*): this.type = set("keys", js.Array(value :_*))
    @scala.inline
    def keysFunction1(value: TItem => TransitionKeyProps): this.type = set("keys", js.Any.fromFunction1(value))
    @scala.inline
    def keys(
      value: (js.Function1[TItem, TransitionKeyProps]) | js.Array[TransitionKeyProps] | TransitionKeyProps
    ): this.type = set("keys", value.asInstanceOf[js.Any])
    @scala.inline
    def leaveFunction1(value: TItem => TLeave): this.type = set("leave", js.Any.fromFunction1(value))
    @scala.inline
    def leave(value: TLeave | (js.Function1[TItem, TLeave])): this.type = set("leave", value.asInstanceOf[js.Any])
    @scala.inline
    def native(value: Boolean): this.type = set("native", value.asInstanceOf[js.Any])
    @scala.inline
    def onDestroyed(value: TItem => Unit): this.type = set("onDestroyed", js.Any.fromFunction1(value))
    @scala.inline
    def onRest(value: js.Object => Unit): this.type = set("onRest", js.Any.fromFunction1(value))
    @scala.inline
    def onStart(value: () => Unit): this.type = set("onStart", js.Any.fromFunction0(value))
    @scala.inline
    def reset(value: Boolean): this.type = set("reset", value.asInstanceOf[js.Any])
    @scala.inline
    def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def trail(value: Double): this.type = set("trail", value.asInstanceOf[js.Any])
    @scala.inline
    def unique(value: Boolean): this.type = set("unique", value.asInstanceOf[js.Any])
    @scala.inline
    def updateFunction1(value: TItem => TUpdate): this.type = set("update", js.Any.fromFunction1(value))
    @scala.inline
    def update(value: TUpdate | (js.Function1[TItem, TUpdate])): this.type = set("update", value.asInstanceOf[js.Any])
  }
  
  def withProps[TItem, /* <: js.Object */ TInit, /* <: js.Object */ TFrom, /* <: js.Object */ TEnter, /* <: js.Object */ TLeave, /* <: js.Object */ TUpdate](p: TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, js.Object, js.Object]): Builder[TItem, TInit, TFrom, TEnter, TLeave, TUpdate] = new Builder[TItem, TInit, TFrom, TEnter, TLeave, TUpdate](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[TItem, /* <: js.Object */ TInit, /* <: js.Object */ TFrom, /* <: js.Object */ TEnter, /* <: js.Object */ TLeave, /* <: js.Object */ TUpdate](items: js.Array[TItem] | TItem): Builder[TItem, TInit, TFrom, TEnter, TLeave, TUpdate] = {
    val __props = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    new Builder[TItem, TInit, TFrom, TEnter, TLeave, TUpdate](js.Array(this.component, __props.asInstanceOf[TransitionProps[TItem, TInit, TFrom, TEnter, TLeave, TUpdate, js.Object, js.Object]]))
  }
}

