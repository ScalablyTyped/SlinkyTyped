package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.justified
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlyBoolean extends js.Object {
  var only: js.UndefOr[Boolean] = js.native
  var value: centered | justified | left | right = js.native
}

object OnlyBoolean {
  @scala.inline
  def apply(value: centered | justified | left | right): OnlyBoolean = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlyBoolean]
  }
  @scala.inline
  implicit class OnlyBooleanOps[Self <: OnlyBoolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: centered | justified | left | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("only")(js.undefined)
        ret
    }
  }
  
}

