package typingsSlinky.firebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAcknowledged extends js.Object {
  var acknowledged: js.UndefOr[js.Array[String]] = js.native
  var rejected: js.UndefOr[js.Array[String]] = js.native
}

object AnonAcknowledged {
  @scala.inline
  def apply(): AnonAcknowledged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonAcknowledged]
  }
  @scala.inline
  implicit class AnonAcknowledgedOps[Self <: AnonAcknowledged] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledged(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcknowledged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledged")(js.undefined)
        ret
    }
    @scala.inline
    def withRejected(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRejected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rejected")(js.undefined)
        ret
    }
  }
  
}

