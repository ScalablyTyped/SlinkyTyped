package typingsSlinky.devextreme.anon

import typingsSlinky.devextreme.devextremeStrings.contains
import typingsSlinky.devextreme.devextremeStrings.day
import typingsSlinky.devextreme.devextremeStrings.equals
import typingsSlinky.devextreme.devextremeStrings.hour
import typingsSlinky.devextreme.devextremeStrings.minute
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.quarter
import typingsSlinky.devextreme.devextremeStrings.second
import typingsSlinky.devextreme.devextremeStrings.startswith
import typingsSlinky.devextreme.devextremeStrings.year
import typingsSlinky.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.native
  var dataSource: js.UndefOr[js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions] = js.native
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var searchMode: js.UndefOr[contains | startswith | equals] = js.native
  var width: js.UndefOr[Double] = js.native
}

object SearchMode {
  @scala.inline
  def apply(): SearchMode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchMode]
  }
  @scala.inline
  implicit class SearchModeOps[Self <: SearchMode] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowSearch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowSearch: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowSearch")(js.undefined)
        ret
    }
    @scala.inline
    def withDataSourceFunction1(value: /* options */ DataSource => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDataSource(value: js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupInterval(value: day | hour | minute | month | quarter | second | year | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("groupInterval")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withSearchMode(value: contains | startswith | equals): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSearchMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("searchMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
  }
  
}

