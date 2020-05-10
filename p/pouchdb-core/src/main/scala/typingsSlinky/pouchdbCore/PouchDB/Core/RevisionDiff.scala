package typingsSlinky.pouchdbCore.PouchDB.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevisionDiff extends js.Object {
  var missing: js.UndefOr[js.Array[String]] = js.native
  var possible_ancestors: js.UndefOr[js.Array[String]] = js.native
}

object RevisionDiff {
  @scala.inline
  def apply(): RevisionDiff = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RevisionDiff]
  }
  @scala.inline
  implicit class RevisionDiffOps[Self <: RevisionDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMissing(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMissing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("missing")(js.undefined)
        ret
    }
    @scala.inline
    def withPossible_ancestors(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possible_ancestors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPossible_ancestors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("possible_ancestors")(js.undefined)
        ret
    }
  }
  
}

