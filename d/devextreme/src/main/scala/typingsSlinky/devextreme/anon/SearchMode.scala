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

trait SearchMode extends js.Object {
  var allowSearch: js.UndefOr[Boolean] = js.undefined
  var dataSource: js.UndefOr[js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions] = js.undefined
  var groupInterval: js.UndefOr[day | hour | minute | month | quarter | second | year | Double] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var searchMode: js.UndefOr[contains | startswith | equals] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object SearchMode {
  @scala.inline
  def apply(
    allowSearch: js.UndefOr[Boolean] = js.undefined,
    dataSource: js.Array[_] | (js.Function1[/* options */ DataSource, _]) | DataSourceOptions = null,
    groupInterval: day | hour | minute | month | quarter | second | year | Double = null,
    height: js.UndefOr[Double] = js.undefined,
    searchMode: contains | startswith | equals = null,
    width: js.UndefOr[Double] = js.undefined
  ): SearchMode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowSearch)) __obj.updateDynamic("allowSearch")(allowSearch.get.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (groupInterval != null) __obj.updateDynamic("groupInterval")(groupInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (searchMode != null) __obj.updateDynamic("searchMode")(searchMode.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMode]
  }
}

