package typingsSlinky.atom.linterMod

import typingsSlinky.atom.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplacementSolution extends js.Object {
  var currentText: js.UndefOr[String] = js.native
  var position: Range = js.native
  var priority: js.UndefOr[Double] = js.native
  var replaceWith: String = js.native
  var title: js.UndefOr[String] = js.native
}

object ReplacementSolution {
  @scala.inline
  def apply(position: Range, replaceWith: String): ReplacementSolution = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], replaceWith = replaceWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplacementSolution]
  }
  @scala.inline
  implicit class ReplacementSolutionOps[Self <: ReplacementSolution] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: Range): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReplaceWith(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("replaceWith")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCurrentText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentText")(js.undefined)
        ret
    }
    @scala.inline
    def withPriority(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriority: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priority")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
  }
  
}

