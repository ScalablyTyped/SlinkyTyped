package typingsSlinky.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  withTheme  :boolean}> */
@js.native
trait PartialwithThemeboolean extends js.Object {
  var withTheme: js.UndefOr[Boolean] = js.native
}

object PartialwithThemeboolean {
  @scala.inline
  def apply(): PartialwithThemeboolean = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialwithThemeboolean]
  }
  @scala.inline
  implicit class PartialwithThemebooleanOps[Self <: PartialwithThemeboolean] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithTheme(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithTheme: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withTheme")(js.undefined)
        ret
    }
  }
  
}

