package typingsSlinky.downshift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetPropsCommonOptions extends js.Object {
  var suppressRefError: js.UndefOr[Boolean] = js.native
}

object GetPropsCommonOptions {
  @scala.inline
  def apply(): GetPropsCommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPropsCommonOptions]
  }
  @scala.inline
  implicit class GetPropsCommonOptionsOps[Self <: GetPropsCommonOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuppressRefError(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRefError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressRefError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressRefError")(js.undefined)
        ret
    }
  }
  
}

