package typingsSlinky.removeMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gfm extends js.Object {
  var gfm: js.UndefOr[Boolean] = js.native
  var stripListLeaders: js.UndefOr[Boolean] = js.native
}

object Gfm {
  @scala.inline
  def apply(): Gfm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gfm]
  }
  @scala.inline
  implicit class GfmOps[Self <: Gfm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGfm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGfm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gfm")(js.undefined)
        ret
    }
    @scala.inline
    def withStripListLeaders(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripListLeaders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStripListLeaders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stripListLeaders")(js.undefined)
        ret
    }
  }
  
}

