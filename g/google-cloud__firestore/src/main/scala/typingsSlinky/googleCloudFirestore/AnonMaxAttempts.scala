package typingsSlinky.googleCloudFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonMaxAttempts extends js.Object {
  var maxAttempts: js.UndefOr[Double] = js.native
}

object AnonMaxAttempts {
  @scala.inline
  def apply(): AnonMaxAttempts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonMaxAttempts]
  }
  @scala.inline
  implicit class AnonMaxAttemptsOps[Self <: AnonMaxAttempts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxAttempts(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxAttempts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxAttempts")(js.undefined)
        ret
    }
  }
  
}

