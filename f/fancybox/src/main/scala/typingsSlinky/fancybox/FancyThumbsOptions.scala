package typingsSlinky.fancybox

import typingsSlinky.fancybox.fancyboxStrings.x
import typingsSlinky.fancybox.fancyboxStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FancyThumbsOptions extends js.Object {
  /**
    * Display thumbnails on opening
    */
  var autoStart: js.UndefOr[Boolean] = js.native
  /**
    * Vertical (y) or horizontal (x) scrolling
    */
  var axis: js.UndefOr[x | y] = js.native
  /**
    * Hide thumbnail grid when closing animation starts
    */
  var hideOnClose: js.UndefOr[Boolean] = js.native
  /**
    * Container is injected into this element
    */
  var parentEl: js.UndefOr[String] = js.native
}

object FancyThumbsOptions {
  @scala.inline
  def apply(): FancyThumbsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FancyThumbsOptions]
  }
  @scala.inline
  implicit class FancyThumbsOptionsOps[Self <: FancyThumbsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoStart(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoStart")(js.undefined)
        ret
    }
    @scala.inline
    def withAxis(value: x | y): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAxis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("axis")(js.undefined)
        ret
    }
    @scala.inline
    def withHideOnClose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideOnClose")(js.undefined)
        ret
    }
    @scala.inline
    def withParentEl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParentEl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parentEl")(js.undefined)
        ret
    }
  }
  
}

