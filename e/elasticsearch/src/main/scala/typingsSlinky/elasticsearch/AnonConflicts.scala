package typingsSlinky.elasticsearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonConflicts extends js.Object {
  var conflicts: js.UndefOr[String] = js.native
  var dest: AnonOptype = js.native
  var script: js.UndefOr[AnonInline] = js.native
  var source: AnonIndex = js.native
}

object AnonConflicts {
  @scala.inline
  def apply(dest: AnonOptype, source: AnonIndex): AnonConflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConflicts]
  }
  @scala.inline
  implicit class AnonConflictsOps[Self <: AnonConflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: AnonOptype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: AnonIndex): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("source")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConflicts(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConflicts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("conflicts")(js.undefined)
        ret
    }
    @scala.inline
    def withScript(value: AnonInline): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScript: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("script")(js.undefined)
        ret
    }
  }
  
}

