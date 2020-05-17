package typingsSlinky.gulpIstanbul.anon

import typingsSlinky.gulpIstanbul.mod.CoverageOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Each extends js.Object {
  var each: js.UndefOr[CoverageOptions | Double] = js.native
  var global: js.UndefOr[CoverageOptions | Double] = js.native
}

object Each {
  @scala.inline
  def apply(): Each = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Each]
  }
  @scala.inline
  implicit class EachOps[Self <: Each] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEach(value: CoverageOptions | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEach: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("each")(js.undefined)
        ret
    }
    @scala.inline
    def withGlobal(value: CoverageOptions | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGlobal: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("global")(js.undefined)
        ret
    }
  }
  
}

