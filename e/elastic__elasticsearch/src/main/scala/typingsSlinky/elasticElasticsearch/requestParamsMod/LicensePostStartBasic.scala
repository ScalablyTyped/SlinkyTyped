package typingsSlinky.elasticElasticsearch.requestParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LicensePostStartBasic extends Generic {
  var acknowledge: js.UndefOr[Boolean] = js.native
}

object LicensePostStartBasic {
  @scala.inline
  def apply(): LicensePostStartBasic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicensePostStartBasic]
  }
  @scala.inline
  implicit class LicensePostStartBasicOps[Self <: LicensePostStartBasic] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledge(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcknowledge: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledge")(js.undefined)
        ret
    }
  }
  
}

