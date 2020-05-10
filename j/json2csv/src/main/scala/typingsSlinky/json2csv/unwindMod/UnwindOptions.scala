package typingsSlinky.json2csv.unwindMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnwindOptions extends js.Object {
  var blankOut: js.UndefOr[Boolean] = js.native
  var paths: js.UndefOr[js.Array[String]] = js.native
}

object UnwindOptions {
  @scala.inline
  def apply(): UnwindOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnwindOptions]
  }
  @scala.inline
  implicit class UnwindOptionsOps[Self <: UnwindOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBlankOut(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankOut")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBlankOut: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("blankOut")(js.undefined)
        ret
    }
    @scala.inline
    def withPaths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paths")(js.undefined)
        ret
    }
  }
  
}

