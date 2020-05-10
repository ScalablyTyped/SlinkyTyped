package typingsSlinky.fsTreeDiff.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FSTreeOptions extends js.Object {
  var entries: js.Array[Entry] = js.native
  var sortAndExpand: Boolean = js.native
}

object FSTreeOptions {
  @scala.inline
  def apply(entries: js.Array[Entry], sortAndExpand: Boolean): FSTreeOptions = {
    val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], sortAndExpand = sortAndExpand.asInstanceOf[js.Any])
    __obj.asInstanceOf[FSTreeOptions]
  }
  @scala.inline
  implicit class FSTreeOptionsOps[Self <: FSTreeOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: js.Array[Entry]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSortAndExpand(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sortAndExpand")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

