package typingsSlinky.bootpag.JqueryBootpag

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * css class for active (default 'active')
    */
  var activeClass: js.UndefOr[String] = js.native
  /**
    * css class for disabled (default 'disabled')
    */
  var disabledClass: js.UndefOr[String] = js.native
  /**
    * name of first (default 'FIRST')
    */
  var first: js.UndefOr[String] = js.native
  /**
    * css class for first (default 'first')
    */
  var firstClass: js.UndefOr[String] = js.native
  /**
    * do we ant first and last (default true)
    */
  var firstLastUse: js.UndefOr[Boolean] = js.native
  /**
    * template for pagination links (default "javascript:void(0);")
    */
  var href: js.UndefOr[String] = js.native
  /**
    * variable name in href template for page number (default "{{number}}")
    */
  var hrefVariable: js.UndefOr[String] = js.native
  /**
    * name of last (default 'LAST')
    */
  var last: js.UndefOr[String] = js.native
  /**
    * css class for last (default 'last')
    */
  var lastClass: js.UndefOr[String] = js.native
  /**
    * next/prev buttons move over one page or maximum visible pages (default true)
    */
  var leaps: js.UndefOr[Boolean] = js.native
  /**
    * maximum number of visible pages
    */
  var maxVisible: Double = js.native
  /**
    * next button text (default ???)
    */
  var next: js.UndefOr[String] = js.native
  /**
    * css class for next (default 'next')
    */
  var nextClass: js.UndefOr[String] = js.native
  /**
    * page to show on start
    */
  var page: js.UndefOr[Double] = js.native
  /**
    * prev button text (default ???)
    */
  var prev: js.UndefOr[String] = js.native
  /**
    * css class for prev (default 'prev')
    */
  var prevClass: js.UndefOr[String] = js.native
  /**
    * number of pages
    */
  var total: Double = js.native
  /**
    * css class for wrap (default 'pagination')
    */
  var wrapClass: js.UndefOr[String] = js.native
}

object Options {
  @scala.inline
  def apply(maxVisible: Double, total: Double): Options = {
    val __obj = js.Dynamic.literal(maxVisible = maxVisible.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxVisible(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxVisible")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withActiveClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActiveClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("activeClass")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFirst(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirst: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("first")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstClass")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstLastUse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLastUse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstLastUse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstLastUse")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withHrefVariable(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefVariable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHrefVariable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hrefVariable")(js.undefined)
        ret
    }
    @scala.inline
    def withLast(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLast: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("last")(js.undefined)
        ret
    }
    @scala.inline
    def withLastClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLeaps(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLeaps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("leaps")(js.undefined)
        ret
    }
    @scala.inline
    def withNext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("next")(js.undefined)
        ret
    }
    @scala.inline
    def withNextClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.undefined)
        ret
    }
    @scala.inline
    def withPrev(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrev: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prev")(js.undefined)
        ret
    }
    @scala.inline
    def withPrevClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrevClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prevClass")(js.undefined)
        ret
    }
    @scala.inline
    def withWrapClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWrapClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("wrapClass")(js.undefined)
        ret
    }
  }
  
}

