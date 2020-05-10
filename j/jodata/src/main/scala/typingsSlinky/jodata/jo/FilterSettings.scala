package typingsSlinky.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends ISettings {
  var CapturedFilter: js.Array[FilterClause] = js.native
  var DefaultFilters: js.Array[FilterClause] = js.native
  var Filters: js.Array[FilterClause] = js.native
  def fullReset(): Unit = js.native
  def loadFromJson(filterSettings: js.Any): Unit = js.native
}

object FilterSettings {
  @scala.inline
  def apply(
    CapturedFilter: js.Array[FilterClause],
    DefaultFilters: js.Array[FilterClause],
    Filters: js.Array[FilterClause],
    fullReset: () => Unit,
    isSet: () => Boolean,
    loadFromJson: js.Any => Unit,
    reset: () => Unit
  ): FilterSettings = {
    val __obj = js.Dynamic.literal(CapturedFilter = CapturedFilter.asInstanceOf[js.Any], DefaultFilters = DefaultFilters.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], fullReset = js.Any.fromFunction0(fullReset), isSet = js.Any.fromFunction0(isSet), loadFromJson = js.Any.fromFunction1(loadFromJson), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCapturedFilter(value: js.Array[FilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CapturedFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultFilters(value: js.Array[FilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DefaultFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[FilterClause]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFullReset(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fullReset")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadFromJson(value: js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadFromJson")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

