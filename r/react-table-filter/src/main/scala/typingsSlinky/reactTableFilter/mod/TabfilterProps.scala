package typingsSlinky.reactTableFilter.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabfilterProps extends js.Object {
  var initialFilters: js.UndefOr[String | js.Array[String] | StringDictionary[Boolean]] = js.native
  var rowClass: js.UndefOr[String] = js.native
  var rows: String | js.Array[String] | StringDictionary[Boolean] = js.native
  def onFilterUpdate(filteredArray: js.Array[String], currentFilters: js.Array[_]): js.Array[_] | Unit = js.native
}

object TabfilterProps {
  @scala.inline
  def apply(
    onFilterUpdate: (js.Array[String], js.Array[_]) => js.Array[_] | Unit,
    rows: String | js.Array[String] | StringDictionary[Boolean]
  ): TabfilterProps = {
    val __obj = js.Dynamic.literal(onFilterUpdate = js.Any.fromFunction2(onFilterUpdate), rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabfilterProps]
  }
  @scala.inline
  implicit class TabfilterPropsOps[Self <: TabfilterProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFilterUpdate(value: (js.Array[String], js.Array[_]) => js.Array[_] | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFilterUpdate")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withRows(value: String | js.Array[String] | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInitialFilters(value: String | js.Array[String] | StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFilters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialFilters")(js.undefined)
        ret
    }
    @scala.inline
    def withRowClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRowClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rowClass")(js.undefined)
        ret
    }
  }
  
}

