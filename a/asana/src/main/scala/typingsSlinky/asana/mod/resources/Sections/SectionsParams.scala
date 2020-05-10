package typingsSlinky.asana.mod.resources.Sections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SectionsParams extends js.Object {
  var insert_after: js.UndefOr[String] = js.native
  var insert_before: js.UndefOr[String] = js.native
  var task: Double | String = js.native
}

object SectionsParams {
  @scala.inline
  def apply(task: Double | String): SectionsParams = {
    val __obj = js.Dynamic.literal(task = task.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionsParams]
  }
  @scala.inline
  implicit class SectionsParamsOps[Self <: SectionsParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTask(value: Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("task")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInsert_after(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_after")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert_after: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_after")(js.undefined)
        ret
    }
    @scala.inline
    def withInsert_before(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_before")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInsert_before: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert_before")(js.undefined)
        ret
    }
  }
  
}

