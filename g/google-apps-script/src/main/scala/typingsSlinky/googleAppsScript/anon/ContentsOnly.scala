package typingsSlinky.googleAppsScript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentsOnly extends js.Object {
  var contentsOnly: js.UndefOr[Boolean] = js.native
  var formatOnly: js.UndefOr[Boolean] = js.native
}

object ContentsOnly {
  @scala.inline
  def apply(): ContentsOnly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentsOnly]
  }
  @scala.inline
  implicit class ContentsOnlyOps[Self <: ContentsOnly] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withContentsOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentsOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentsOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withFormatOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormatOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatOnly")(js.undefined)
        ret
    }
  }
  
}

