package typingsSlinky.googleCloudFirestore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxAttempts extends js.Object {
  var maxAttempts: js.UndefOr[Double] = js.native
}

object MaxAttempts {
  @scala.inline
  def apply(): MaxAttempts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxAttempts]
  }
  @scala.inline
  implicit class MaxAttemptsOps[Self <: MaxAttempts] (val x: Self) extends AnyVal {
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

