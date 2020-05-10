package typingsSlinky.rbx.breadcrumbBreadcrumbMod

import typingsSlinky.rbx.rbxStrings.arrow
import typingsSlinky.rbx.rbxStrings.bullet
import typingsSlinky.rbx.rbxStrings.centered
import typingsSlinky.rbx.rbxStrings.dot
import typingsSlinky.rbx.rbxStrings.large
import typingsSlinky.rbx.rbxStrings.medium
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.small
import typingsSlinky.rbx.rbxStrings.succeeds
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BreadcrumbModifierProps extends js.Object {
  var align: js.UndefOr[centered | right] = js.native
  var separator: js.UndefOr[arrow | bullet | dot | succeeds] = js.native
  var size: js.UndefOr[small | medium | large] = js.native
}

object BreadcrumbModifierProps {
  @scala.inline
  def apply(): BreadcrumbModifierProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BreadcrumbModifierProps]
  }
  @scala.inline
  implicit class BreadcrumbModifierPropsOps[Self <: BreadcrumbModifierProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlign(value: centered | right): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("align")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: arrow | bullet | dot | succeeds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withSize(value: small | medium | large): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("size")(js.undefined)
        ret
    }
  }
  
}

