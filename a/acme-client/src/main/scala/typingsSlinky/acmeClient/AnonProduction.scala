package typingsSlinky.acmeClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonProduction extends js.Object {
  var production: String = js.native
  var staging: String = js.native
}

object AnonProduction {
  @scala.inline
  def apply(production: String, staging: String): AnonProduction = {
    val __obj = js.Dynamic.literal(production = production.asInstanceOf[js.Any], staging = staging.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProduction]
  }
  @scala.inline
  implicit class AnonProductionOps[Self <: AnonProduction] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProduction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("production")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStaging(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("staging")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

