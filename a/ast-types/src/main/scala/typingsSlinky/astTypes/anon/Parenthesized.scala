package typingsSlinky.astTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parenthesized extends js.Object {
  var parenthesized: Boolean = js.native
}

object Parenthesized {
  @scala.inline
  def apply(parenthesized: Boolean): Parenthesized = {
    val __obj = js.Dynamic.literal(parenthesized = parenthesized.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parenthesized]
  }
  @scala.inline
  implicit class ParenthesizedOps[Self <: Parenthesized] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParenthesized(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parenthesized")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

