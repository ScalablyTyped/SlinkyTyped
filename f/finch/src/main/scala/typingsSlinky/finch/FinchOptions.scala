package typingsSlinky.finch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinchOptions extends js.Object {
  var CoerceParameterTypes: js.UndefOr[Boolean] = js.native
}

object FinchOptions {
  @scala.inline
  def apply(): FinchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinchOptions]
  }
  @scala.inline
  implicit class FinchOptionsOps[Self <: FinchOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoerceParameterTypes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoerceParameterTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoerceParameterTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoerceParameterTypes")(js.undefined)
        ret
    }
  }
  
}

