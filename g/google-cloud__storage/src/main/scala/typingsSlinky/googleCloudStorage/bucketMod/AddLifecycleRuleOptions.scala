package typingsSlinky.googleCloudStorage.bucketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddLifecycleRuleOptions extends js.Object {
  var append: js.UndefOr[Boolean] = js.native
}

object AddLifecycleRuleOptions {
  @scala.inline
  def apply(): AddLifecycleRuleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddLifecycleRuleOptions]
  }
  @scala.inline
  implicit class AddLifecycleRuleOptionsOps[Self <: AddLifecycleRuleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("append")(js.undefined)
        ret
    }
  }
  
}

