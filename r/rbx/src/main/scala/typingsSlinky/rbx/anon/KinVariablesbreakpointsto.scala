package typingsSlinky.rbx.anon

import typingsSlinky.rbx.rbxStrings.bottom
import typingsSlinky.rbx.rbxStrings.left
import typingsSlinky.rbx.rbxStrings.right
import typingsSlinky.rbx.rbxStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ K in rbx.rbx/base/helpers/variables.Variables['breakpoints'] ]:? 'top' | 'right' | 'bottom' | 'left'} */
@js.native
trait KinVariablesbreakpointsto extends js.Object {
  var desktop: js.UndefOr[top | right | bottom | left] = js.native
  var fullhd: js.UndefOr[top | right | bottom | left] = js.native
  var mobile: js.UndefOr[top | right | bottom | left] = js.native
  var tablet: js.UndefOr[top | right | bottom | left] = js.native
  var touch: js.UndefOr[top | right | bottom | left] = js.native
  var widescreen: js.UndefOr[top | right | bottom | left] = js.native
}

object KinVariablesbreakpointsto {
  @scala.inline
  def apply(): KinVariablesbreakpointsto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinVariablesbreakpointsto]
  }
  @scala.inline
  implicit class KinVariablesbreakpointstoOps[Self <: KinVariablesbreakpointsto] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesktop(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesktop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desktop")(js.undefined)
        ret
    }
    @scala.inline
    def withFullhd(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFullhd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullhd")(js.undefined)
        ret
    }
    @scala.inline
    def withMobile(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMobile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mobile")(js.undefined)
        ret
    }
    @scala.inline
    def withTablet(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTablet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tablet")(js.undefined)
        ret
    }
    @scala.inline
    def withTouch(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTouch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("touch")(js.undefined)
        ret
    }
    @scala.inline
    def withWidescreen(value: top | right | bottom | left): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidescreen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("widescreen")(js.undefined)
        ret
    }
  }
  
}

