package typingsSlinky.prosemirrorInputrules.anon

import typingsSlinky.prosemirrorInputrules.mod.InputRule
import typingsSlinky.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules[S /* <: Schema[_, _] */] extends js.Object {
  var rules: js.Array[InputRule[S]]
}

object Rules {
  @scala.inline
  def apply[S](rules: js.Array[InputRule[S]]): Rules[S] = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules[S]]
  }
}

