package typingsSlinky.materialUiCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@material-ui/core.@material-ui/core/test-utils/createMount.MountOptions> */
@js.native
trait PartialMountOptions extends js.Object {
  var mount: js.UndefOr[FnCallNodeOptions] = js.native
}

object PartialMountOptions {
  @scala.inline
  def apply(): PartialMountOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMountOptions]
  }
  @scala.inline
  implicit class PartialMountOptionsOps[Self <: PartialMountOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMount(value: FnCallNodeOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mount")(js.undefined)
        ret
    }
  }
  
}

