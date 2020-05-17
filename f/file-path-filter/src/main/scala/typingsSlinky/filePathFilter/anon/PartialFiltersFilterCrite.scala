package typingsSlinky.filePathFilter.anon

import typingsSlinky.filePathFilter.typesMod.AnyFilter
import typingsSlinky.filePathFilter.typesMod.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<file-path-filter.file-path-filter/lib/types.Filters<file-path-filter.file-path-filter/lib/types.FilterCriteria>> */
@js.native
trait PartialFiltersFilterCrite extends AnyFilter {
  var exclude: js.UndefOr[FilterCriteria] = js.native
  var include: js.UndefOr[FilterCriteria] = js.native
}

object PartialFiltersFilterCrite {
  @scala.inline
  def apply(): PartialFiltersFilterCrite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialFiltersFilterCrite]
  }
  @scala.inline
  implicit class PartialFiltersFilterCriteOps[Self <: PartialFiltersFilterCrite] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withExcludeFunction1(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withExcludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExclude(value: FilterCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exclude")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeFunction1(value: /* repeated */ js.Any => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIncludeRegExp(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInclude(value: FilterCriteria): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInclude: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("include")(js.undefined)
        ret
    }
  }
  
}

