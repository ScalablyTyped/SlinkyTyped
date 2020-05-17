package typingsSlinky.prosemirrorInputrules.anon

import typingsSlinky.prosemirrorInputrules.mod.InputRule
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Rules[S /* <: Schema[_, _] */] extends js.Object {
  var rules: js.Array[InputRule[S]] = js.native
}

object Rules {
  @scala.inline
  def apply[S](rules: js.Array[InputRule[S]]): Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[S]]
  }
  @scala.inline
  implicit class RulesOps[Self[s] <: Rules[s], S] (val x: Self[S]) extends AnyVal {
    @scala.inline
    def duplicate: Self[S] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[S]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[S] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[S] with Other]
    @scala.inline
    def withRules(value: js.Array[InputRule[S]]): Self[S] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rules")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

