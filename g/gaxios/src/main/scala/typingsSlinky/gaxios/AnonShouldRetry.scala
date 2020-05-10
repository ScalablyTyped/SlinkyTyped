package typingsSlinky.gaxios

import typingsSlinky.gaxios.commonMod.GaxiosOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonShouldRetry extends js.Object {
  var config: GaxiosOptions = js.native
  var shouldRetry: Boolean = js.native
}

object AnonShouldRetry {
  @scala.inline
  def apply(config: GaxiosOptions, shouldRetry: Boolean): AnonShouldRetry = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], shouldRetry = shouldRetry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShouldRetry]
  }
  @scala.inline
  implicit class AnonShouldRetryOps[Self <: AnonShouldRetry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfig(value: GaxiosOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("config")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShouldRetry(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shouldRetry")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

