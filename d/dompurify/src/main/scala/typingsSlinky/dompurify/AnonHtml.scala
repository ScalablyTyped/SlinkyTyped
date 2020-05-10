package typingsSlinky.dompurify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHtml extends js.Object {
  var html: js.UndefOr[Boolean] = js.native
  var mathMl: js.UndefOr[Boolean] = js.native
  var svg: js.UndefOr[Boolean] = js.native
  var svgFilters: js.UndefOr[Boolean] = js.native
}

object AnonHtml {
  @scala.inline
  def apply(): AnonHtml = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHtml]
  }
  @scala.inline
  implicit class AnonHtmlOps[Self <: AnonHtml] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHtml(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHtml: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("html")(js.undefined)
        ret
    }
    @scala.inline
    def withMathMl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathMl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMathMl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mathMl")(js.undefined)
        ret
    }
    @scala.inline
    def withSvg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svg")(js.undefined)
        ret
    }
    @scala.inline
    def withSvgFilters(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSvgFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("svgFilters")(js.undefined)
        ret
    }
  }
  
}

