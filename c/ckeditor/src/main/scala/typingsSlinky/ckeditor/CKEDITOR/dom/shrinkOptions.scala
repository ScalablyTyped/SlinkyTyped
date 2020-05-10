package typingsSlinky.ckeditor.CKEDITOR.dom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait shrinkOptions extends js.Object {
  var shrinkOnBlockBoundary: js.UndefOr[Boolean] = js.native
  var skipBogus: js.UndefOr[Boolean] = js.native
}

object shrinkOptions {
  @scala.inline
  def apply(): shrinkOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[shrinkOptions]
  }
  @scala.inline
  implicit class shrinkOptionsOps[Self <: shrinkOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withShrinkOnBlockBoundary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkOnBlockBoundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShrinkOnBlockBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shrinkOnBlockBoundary")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipBogus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBogus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipBogus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipBogus")(js.undefined)
        ret
    }
  }
  
}

