package typingsSlinky.constantinople.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExpressionToConstantOptions extends js.Object {
  var constants: js.UndefOr[js.Any] = js.native
}

object ExpressionToConstantOptions {
  @scala.inline
  def apply(): ExpressionToConstantOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExpressionToConstantOptions]
  }
  @scala.inline
  implicit class ExpressionToConstantOptionsOps[Self <: ExpressionToConstantOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConstants(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConstants: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("constants")(js.undefined)
        ret
    }
  }
  
}

