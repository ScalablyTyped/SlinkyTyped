package typingsSlinky.qunit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxDepth extends js.Object {
  var maxDepth: Double = js.native
  def parse(data: js.Any): String = js.native
}

object MaxDepth {
  @scala.inline
  def apply(maxDepth: Double, parse: js.Any => String): MaxDepth = {
    val __obj = js.Dynamic.literal(maxDepth = maxDepth.asInstanceOf[js.Any], parse = js.Any.fromFunction1(parse))
    __obj.asInstanceOf[MaxDepth]
  }
  @scala.inline
  implicit class MaxDepthOps[Self <: MaxDepth] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxDepth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDepth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParse(value: js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

