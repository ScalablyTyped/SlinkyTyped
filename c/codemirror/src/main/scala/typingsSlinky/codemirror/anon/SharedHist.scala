package typingsSlinky.codemirror.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedHist extends js.Object {
  var from: js.UndefOr[Double] = js.native
  /** By default, the new document inherits the mode of the parent. This option can be set to a mode spec to give it a different mode. */
  var mode: js.Any = js.native
  /** When turned on, the linked copy will share an undo history with the original.
    Thus, something done in one of the two can be undone in the other, and vice versa. */
  var sharedHist: js.UndefOr[Boolean] = js.native
  /** Can be given to make the new document a subview of the original. Subviews only show a given range of lines.
    Note that line coordinates inside the subview will be consistent with those of the parent,
    so that for example a subview starting at line 10 will refer to its first line as line 10, not 0. */
  var to: js.UndefOr[Double] = js.native
}

object SharedHist {
  @scala.inline
  def apply(mode: js.Any): SharedHist = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedHist]
  }
  @scala.inline
  implicit class SharedHistOps[Self <: SharedHist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFrom(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFrom: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("from")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedHist(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedHist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedHist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedHist")(js.undefined)
        ret
    }
    @scala.inline
    def withTo(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("to")(js.undefined)
        ret
    }
  }
  
}

