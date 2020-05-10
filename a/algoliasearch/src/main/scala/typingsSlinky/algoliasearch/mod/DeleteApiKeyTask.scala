package typingsSlinky.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteApiKeyTask extends js.Object {
  var deletedAt: String = js.native
}

object DeleteApiKeyTask {
  @scala.inline
  def apply(deletedAt: String): DeleteApiKeyTask = {
    val __obj = js.Dynamic.literal(deletedAt = deletedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteApiKeyTask]
  }
  @scala.inline
  implicit class DeleteApiKeyTaskOps[Self <: DeleteApiKeyTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDeletedAt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deletedAt")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

