package typingsSlinky.fancybox

import typingsSlinky.fancybox.fancyboxStrings.`inline`
import typingsSlinky.fancybox.fancyboxStrings.ajax
import typingsSlinky.fancybox.fancyboxStrings.html
import typingsSlinky.fancybox.fancyboxStrings.iframe
import typingsSlinky.fancybox.fancyboxStrings.image
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyBoxGroupItem extends js.Object {
  var opts: js.UndefOr[FancyBoxOptions] = js.native
  var src: String = js.native
  var `type`: js.UndefOr[image | `inline` | ajax | iframe | html] = js.native
}

object FancyBoxGroupItem {
  @scala.inline
  def apply(src: String): FancyBoxGroupItem = {
    val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[FancyBoxGroupItem]
  }
  @scala.inline
  implicit class FancyBoxGroupItemOps[Self <: FancyBoxGroupItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpts(value: FancyBoxOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opts")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: image | `inline` | ajax | iframe | html): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

