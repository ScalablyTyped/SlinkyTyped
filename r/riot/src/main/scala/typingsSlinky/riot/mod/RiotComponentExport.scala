package typingsSlinky.riot.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiotComponentExport[Props, State]
  extends /* key */ StringDictionary[js.Any] {
  // optional alias to map the children component names
  var components: js.UndefOr[StringDictionary[RiotComponentShell[Props, State]]] = js.native
  // lifecycle methods
  var onBeforeMount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onBeforeUnmount: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onBeforeUpdate: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onMounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onUnmounted: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  var onUpdated: js.UndefOr[js.Function2[/* currentProps */ Props, /* currentState */ State, Unit]] = js.native
  // state handling methods
  var shouldUpdate: js.UndefOr[js.Function2[/* newProps */ Props, /* currentProps */ Props, Boolean]] = js.native
  // optional on the component object
  var state: js.UndefOr[State] = js.native
}

object RiotComponentExport {
  @scala.inline
  def apply[Props, State](): RiotComponentExport[Props, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiotComponentExport[Props, State]]
  }
  @scala.inline
  implicit class RiotComponentExportOps[Self[props, state] <: RiotComponentExport[props, state], Props, State] (val x: Self[Props, State]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, State] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, State]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, State]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, State]) with Other]
    @scala.inline
    def withComponents(value: StringDictionary[RiotComponentShell[Props, State]]): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComponents: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("components")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeMount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeMount: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeMount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUnmount(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnmount")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUnmount: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUnmount")(js.undefined)
        ret
    }
    @scala.inline
    def withOnBeforeUpdate(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnBeforeUpdate: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onBeforeUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMounted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnMounted: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMounted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUnmounted(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmounted")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUnmounted: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUnmounted")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdated(value: (/* currentProps */ Props, /* currentState */ State) => Unit): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnUpdated: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdated")(js.undefined)
        ret
    }
    @scala.inline
    def withShouldUpdate(value: (/* newProps */ Props, /* currentProps */ Props) => Boolean): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutShouldUpdate: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self[Props, State] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

