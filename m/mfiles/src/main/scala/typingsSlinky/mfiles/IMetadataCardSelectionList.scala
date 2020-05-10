package typingsSlinky.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMetadataCardSelectionList extends js.Object {
  val Events: IEvents = js.native
  val Filter: String = js.native
  val FilteringValue: String = js.native
  val Items: js.Any = js.native
  val MoreResults: Boolean = js.native
  def AutoSelect(identifier: String): Unit = js.native
  def SetFilter(Filter: String, token: Double, maxResults: Double): Unit = js.native
}

object IMetadataCardSelectionList {
  @scala.inline
  def apply(
    AutoSelect: String => Unit,
    Events: IEvents,
    Filter: String,
    FilteringValue: String,
    Items: js.Any,
    MoreResults: Boolean,
    SetFilter: (String, Double, Double) => Unit
  ): IMetadataCardSelectionList = {
    val __obj = js.Dynamic.literal(AutoSelect = js.Any.fromFunction1(AutoSelect), Events = Events.asInstanceOf[js.Any], Filter = Filter.asInstanceOf[js.Any], FilteringValue = FilteringValue.asInstanceOf[js.Any], Items = Items.asInstanceOf[js.Any], MoreResults = MoreResults.asInstanceOf[js.Any], SetFilter = js.Any.fromFunction3(SetFilter))
    __obj.asInstanceOf[IMetadataCardSelectionList]
  }
  @scala.inline
  implicit class IMetadataCardSelectionListOps[Self <: IMetadataCardSelectionList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoSelect(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AutoSelect")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEvents(value: IEvents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilteringValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FilteringValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Items")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMoreResults(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MoreResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetFilter(value: (String, Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetFilter")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

