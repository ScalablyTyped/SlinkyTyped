package typingsSlinky.recurlyRecurlyJs.`3dSecureMod`

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RiskOptions extends js.Object {
  var actionTokenId: js.UndefOr[String] = js.native
}

object RiskOptions {
  @scala.inline
  def apply(): RiskOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RiskOptions]
  }
  @scala.inline
  implicit class RiskOptionsOps[Self <: RiskOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionTokenId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTokenId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionTokenId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionTokenId")(js.undefined)
        ret
    }
  }
  
}

