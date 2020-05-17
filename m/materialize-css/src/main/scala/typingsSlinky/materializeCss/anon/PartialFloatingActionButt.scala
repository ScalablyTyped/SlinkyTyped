package typingsSlinky.materializeCss.anon

import typingsSlinky.materializeCss.materializeCssStrings.buttom
import typingsSlinky.materializeCss.materializeCssStrings.left
import typingsSlinky.materializeCss.materializeCssStrings.right
import typingsSlinky.materializeCss.materializeCssStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.FloatingActionButtonOptions> */
@js.native
trait PartialFloatingActionButt extends js.Object {
  var direction: js.UndefOr[top | right | buttom | left] = js.native
  var hoverEnabled: js.UndefOr[Boolean] = js.native
  var toolbarEnabled: js.UndefOr[Boolean] = js.native
}

object PartialFloatingActionButt {
  @scala.inline
  def apply(): PartialFloatingActionButt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFloatingActionButt]
  }
  @scala.inline
  implicit class PartialFloatingActionButtOps[Self <: PartialFloatingActionButt] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDirection(value: top | right | buttom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHoverEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHoverEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hoverEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarEnabled")(js.undefined)
        ret
    }
  }
  
}

