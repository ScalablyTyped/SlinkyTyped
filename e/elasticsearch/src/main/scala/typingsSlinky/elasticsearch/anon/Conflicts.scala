package typingsSlinky.elasticsearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Conflicts extends js.Object {
  var conflicts: js.UndefOr[String] = js.native
  var dest: Optype = js.native
  var script: js.UndefOr[Inline] = js.native
  var source: Index = js.native
}

object Conflicts {
  @scala.inline
  def apply(dest: Optype, source: Index): Conflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  @scala.inline
  implicit class ConflictsOps[Self <: Conflicts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDest(value: Optype): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dest")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSource(value: Index): Self = {
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
    def withScript(value: Inline): Self = {
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

