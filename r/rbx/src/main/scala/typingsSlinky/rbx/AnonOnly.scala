package typingsSlinky.rbx

import typingsSlinky.rbx.rbxStrings.`inline-block`
import typingsSlinky.rbx.rbxStrings.`inline-flex`
import typingsSlinky.rbx.rbxStrings.`inline`
import typingsSlinky.rbx.rbxStrings.block
import typingsSlinky.rbx.rbxStrings.flex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOnly extends js.Object {
  var only: js.UndefOr[Boolean] = js.native
  var value: block | flex | `inline` | `inline-block` | `inline-flex` = js.native
}

object AnonOnly {
  @scala.inline
  def apply(value: block | flex | `inline` | `inline-block` | `inline-flex`): AnonOnly = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnly]
  }
  @scala.inline
  implicit class AnonOnlyOps[Self <: AnonOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withValue(value: block | flex | `inline` | `inline-block` | `inline-flex`): Self = {
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

