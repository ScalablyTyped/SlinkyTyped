package typingsSlinky.jqgrid

import typingsSlinky.jqgrid.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IJqGridJsonReader extends js.Object {
  /**
    * current page of the query
    * @param obj 
    * @returns {} 
    */
  var page: String | (js.Function1[/* obj */ js.Any, Double]) = js.native
  /**
    * total number of records for the query
    * @param obj 
    * @returns {} 
    */
  var records: String | (js.Function1[/* obj */ Data, Double]) = js.native
  /**
    * tells jqGrid that the information for the data in the row is repeatable - i.e. the elements have the same tag cell described in cell element. Setting this option to false instructs jqGrid to search elements in the json data by name.
    * This is the name from colModel or the name described with the jsonmap option in colModel
    */
  var repeatitems: Boolean = js.native
  /**
    * Name of the root property
    * @param obj 
    * @returns {} 
    */
  var root: String | (js.Function1[/* obj */ js.Any, _]) = js.native
  /**
    * total pages for the query
    * @param obj 
    * @returns {} 
    */
  var total: String | (js.Function1[/* obj */ js.Any, Double]) = js.native
}

object IJqGridJsonReader {
  @scala.inline
  def apply(
    page: String | (js.Function1[/* obj */ js.Any, Double]),
    records: String | (js.Function1[/* obj */ Data, Double]),
    repeatitems: Boolean,
    root: String | (js.Function1[/* obj */ js.Any, _]),
    total: String | (js.Function1[/* obj */ js.Any, Double])
  ): IJqGridJsonReader = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], repeatitems = repeatitems.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[IJqGridJsonReader]
  }
  @scala.inline
  implicit class IJqGridJsonReaderOps[Self <: IJqGridJsonReader] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPageFunction1(value: /* obj */ js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPage(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("page")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRecordsFunction1(value: /* obj */ Data => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRecords(value: String | (js.Function1[/* obj */ Data, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("records")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRepeatitems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repeatitems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRootFunction1(value: /* obj */ js.Any => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRoot(value: String | (js.Function1[/* obj */ js.Any, _])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("root")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotalFunction1(value: /* obj */ js.Any => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withTotal(value: String | (js.Function1[/* obj */ js.Any, Double])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

