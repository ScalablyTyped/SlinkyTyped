package typingsSlinky.monk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDeletedCount extends js.Object {
  var deletedCount: Double = js.native
  var result: AnonN = js.native
}

object AnonDeletedCount {
  @scala.inline
  def apply(deletedCount: Double, result: AnonN): AnonDeletedCount = {
    val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeletedCount]
  }
  @scala.inline
  implicit class AnonDeletedCountOps[Self <: AnonDeletedCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResult(value: AnonN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

