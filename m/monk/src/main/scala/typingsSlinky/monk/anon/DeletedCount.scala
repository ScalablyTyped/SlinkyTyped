package typingsSlinky.monk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletedCount extends js.Object {
  var deletedCount: Double = js.native
  var result: N = js.native
}

object DeletedCount {
  @scala.inline
  def apply(deletedCount: Double, result: N): DeletedCount = {
    val __obj = js.Dynamic.literal(deletedCount = deletedCount.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletedCount]
  }
  @scala.inline
  implicit class DeletedCountOps[Self <: DeletedCount] (val x: Self) extends AnyVal {
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
    def withResult(value: N): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("result")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

