package typingsSlinky.filePathFilter

import typingsSlinky.filePathFilter.typesMod.FilterCriteria
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<file-path-filter.file-path-filter/lib/types.Filters<file-path-filter.file-path-filter/lib/types.FilterCriteria>> */
trait PartialFiltersFilterCrite extends js.Object {
  var exclude: js.UndefOr[FilterCriteria] = js.undefined
  var include: js.UndefOr[FilterCriteria] = js.undefined
}

object PartialFiltersFilterCrite {
  @scala.inline
  def apply(exclude: FilterCriteria = null, include: FilterCriteria = null): PartialFiltersFilterCrite = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFiltersFilterCrite]
  }
}

