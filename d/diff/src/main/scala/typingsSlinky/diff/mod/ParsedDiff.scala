package typingsSlinky.diff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParsedDiff extends js.Object {
  var hunks: js.Array[Hunk] = js.native
  var index: js.UndefOr[String] = js.native
  var newFileName: js.UndefOr[String] = js.native
  var newHeader: js.UndefOr[String] = js.native
  var oldFileName: js.UndefOr[String] = js.native
  var oldHeader: js.UndefOr[String] = js.native
}

object ParsedDiff {
  @scala.inline
  def apply(hunks: js.Array[Hunk]): ParsedDiff = {
    val __obj = js.Dynamic.literal(hunks = hunks.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedDiff]
  }
  @scala.inline
  implicit class ParsedDiffOps[Self <: ParsedDiff] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHunks(value: js.Array[Hunk]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hunks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("index")(js.undefined)
        ret
    }
    @scala.inline
    def withNewFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withNewHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNewHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("newHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withOldFileName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFileName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldFileName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldFileName")(js.undefined)
        ret
    }
    @scala.inline
    def withOldHeader(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOldHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oldHeader")(js.undefined)
        ret
    }
  }
  
}

