package typingsSlinky.artyomJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchedCommand extends js.Object {
  var index: Double = js.native
  var instruction: ArtyomCommand = js.native
  var wildcard: js.UndefOr[js.Any] = js.native
}

object MatchedCommand {
  @scala.inline
  def apply(index: Double, instruction: ArtyomCommand): MatchedCommand = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], instruction = instruction.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchedCommand]
  }
  @scala.inline
  implicit class MatchedCommandOps[Self <: MatchedCommand] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInstruction(value: ArtyomCommand): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instruction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWildcard(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWildcard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wildcard")(js.undefined)
        ret
    }
  }
  
}

