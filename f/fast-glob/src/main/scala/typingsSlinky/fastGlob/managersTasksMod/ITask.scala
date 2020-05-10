package typingsSlinky.fastGlob.managersTasksMod

import typingsSlinky.fastGlob.typesPatternsMod.Pattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITask extends js.Object {
  var base: String = js.native
  var dynamic: Boolean = js.native
  var negative: js.Array[Pattern] = js.native
  var patterns: js.Array[Pattern] = js.native
  var positive: js.Array[Pattern] = js.native
}

object ITask {
  @scala.inline
  def apply(
    base: String,
    dynamic: Boolean,
    negative: js.Array[Pattern],
    patterns: js.Array[Pattern],
    positive: js.Array[Pattern]
  ): ITask = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dynamic = dynamic.asInstanceOf[js.Any], negative = negative.asInstanceOf[js.Any], patterns = patterns.asInstanceOf[js.Any], positive = positive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITask]
  }
  @scala.inline
  implicit class ITaskOps[Self <: ITask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBase(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("base")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDynamic(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dynamic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: js.Array[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPatterns(value: js.Array[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("patterns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPositive(value: js.Array[Pattern]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("positive")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

