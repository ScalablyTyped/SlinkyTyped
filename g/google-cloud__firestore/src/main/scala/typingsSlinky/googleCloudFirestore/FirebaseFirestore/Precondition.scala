package typingsSlinky.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Precondition extends js.Object {
  /**
    * If set, the last update time to enforce.
    */
  val lastUpdateTime: js.UndefOr[Timestamp] = js.native
}

object Precondition {
  @scala.inline
  def apply(): Precondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Precondition]
  }
  @scala.inline
  implicit class PreconditionOps[Self <: Precondition] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastUpdateTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
        ret
    }
  }
  
}

