package typingsSlinky.f1.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait F1Options extends js.Object {
  var name: String = js.native
  var onState: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var onUpdate: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var parsers: js.Any = js.native
  var states: js.Any = js.native
  var targets: js.Any = js.native
  var transitions: js.Array[_] = js.native
}

object F1Options {
  @scala.inline
  def apply(name: String, parsers: js.Any, states: js.Any, targets: js.Any, transitions: js.Array[_]): F1Options = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], parsers = parsers.asInstanceOf[js.Any], states = states.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any])
    __obj.asInstanceOf[F1Options]
  }
  @scala.inline
  implicit class F1OptionsOps[Self <: F1Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParsers(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("states")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTargets(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransitions(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnState(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onState")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onState")(js.undefined)
        ret
    }
    @scala.inline
    def withOnUpdate(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onUpdate")(js.undefined)
        ret
    }
  }
  
}

