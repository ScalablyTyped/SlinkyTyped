package typingsSlinky.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MergeConflict extends js.Object {
  var entityInBaseVersion: js.UndefOr[Entity] = js.native
  var entityInWorkspace: js.UndefOr[Entity] = js.native
}

object MergeConflict {
  @scala.inline
  def apply(): MergeConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergeConflict]
  }
  @scala.inline
  implicit class MergeConflictOps[Self <: MergeConflict] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntityInBaseVersion(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInBaseVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityInBaseVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInBaseVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withEntityInWorkspace(value: Entity): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInWorkspace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityInWorkspace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityInWorkspace")(js.undefined)
        ret
    }
  }
  
}

