package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyOptionGroupResult extends js.Object {
  var OptionGroup: js.UndefOr[typingsSlinky.awsSdk.rdsMod.OptionGroup] = js.native
}

object CopyOptionGroupResult {
  @scala.inline
  def apply(): CopyOptionGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyOptionGroupResult]
  }
  @scala.inline
  implicit class CopyOptionGroupResultOps[Self <: CopyOptionGroupResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOptionGroup(value: OptionGroup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OptionGroup")(js.undefined)
        ret
    }
  }
  
}

