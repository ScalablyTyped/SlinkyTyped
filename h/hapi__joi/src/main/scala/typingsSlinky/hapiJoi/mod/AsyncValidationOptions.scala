package typingsSlinky.hapiJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncValidationOptions extends ValidationOptions {
  /**
    * when true, warnings are returned alongside the value (i.e. `{ value, warning }`).
    *
    * @default false
    */
  var warnings: js.UndefOr[Boolean] = js.native
}

object AsyncValidationOptions {
  @scala.inline
  def apply(): AsyncValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncValidationOptions]
  }
  @scala.inline
  implicit class AsyncValidationOptionsOps[Self <: AsyncValidationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWarnings(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWarnings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("warnings")(js.undefined)
        ret
    }
  }
  
}

