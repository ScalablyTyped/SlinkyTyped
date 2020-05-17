package typingsSlinky.phoenix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Diff extends js.Object {
  var diff: String = js.native
  var state: String = js.native
}

object Diff {
  @scala.inline
  def apply(diff: String, state: String): Diff = {
    val __obj = js.Dynamic.literal(diff = diff.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Diff]
  }
  @scala.inline
  implicit class DiffOps[Self <: Diff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiff(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diff")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

