package typingsSlinky.lokijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<lokijs.SimplesortOptions> */
@js.native
trait PartialSimplesortOptions extends js.Object {
  var desc: js.UndefOr[Boolean] = js.native
  var disableIndexIntersect: js.UndefOr[Boolean] = js.native
  var forceIndexIntersect: js.UndefOr[Boolean] = js.native
  var useJavascriptSorting: js.UndefOr[Boolean] = js.native
}

object PartialSimplesortOptions {
  @scala.inline
  def apply(): PartialSimplesortOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSimplesortOptions]
  }
  @scala.inline
  implicit class PartialSimplesortOptionsOps[Self <: PartialSimplesortOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDesc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDesc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("desc")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableIndexIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIndexIntersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableIndexIntersect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableIndexIntersect")(js.undefined)
        ret
    }
    @scala.inline
    def withForceIndexIntersect(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIndexIntersect")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceIndexIntersect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceIndexIntersect")(js.undefined)
        ret
    }
    @scala.inline
    def withUseJavascriptSorting(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJavascriptSorting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseJavascriptSorting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useJavascriptSorting")(js.undefined)
        ret
    }
  }
  
}

