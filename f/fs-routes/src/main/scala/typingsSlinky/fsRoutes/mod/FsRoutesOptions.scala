package typingsSlinky.fsRoutes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FsRoutesOptions extends js.Object {
  var glob: js.UndefOr[String] = js.native
  var indexFileRegExp: js.UndefOr[js.RegExp] = js.native
}

object FsRoutesOptions {
  @scala.inline
  def apply(): FsRoutesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FsRoutesOptions]
  }
  @scala.inline
  implicit class FsRoutesOptionsOps[Self <: FsRoutesOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGlob(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlob: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("glob")(js.undefined)
        ret
    }
    @scala.inline
    def withIndexFileRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFileRegExp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndexFileRegExp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indexFileRegExp")(js.undefined)
        ret
    }
  }
  
}

