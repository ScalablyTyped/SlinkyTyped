package typingsSlinky.pouchdbFind.PouchDB.Find

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pouchdbFind.pouchdbFindStrings.asc
import typingsSlinky.pouchdbFind.pouchdbFindStrings.desc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FindRequest[Content /* <: js.Object */] extends js.Object {
  /** Defines a list of fields that you want to receive. If omitted, you get the full documents. */
  var fields: js.UndefOr[js.Array[String]] = js.native
  /** Maximum number of documents to return. */
  var limit: js.UndefOr[Double] = js.native
  /** Defines a selector to filter the results. Required */
  var selector: Selector = js.native
  /** Number of docs to skip before returning. */
  var skip: js.UndefOr[Double] = js.native
  /** Defines a list of fields defining how you want to sort. Note that sorted fields also have to be selected in the selector. */
  var sort: js.UndefOr[js.Array[String | (StringDictionary[asc | desc])]] = js.native
  /** Set which index to use for the query. It can be “design-doc-name” or “[‘design-doc-name’, ‘name’]”. */
  var use_index: js.UndefOr[String | (js.Tuple2[String, String])] = js.native
}

object FindRequest {
  @scala.inline
  def apply[Content](selector: Selector): FindRequest[Content] = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindRequest[Content]]
  }
  @scala.inline
  implicit class FindRequestOps[Self[content] <: FindRequest[content], Content] (val x: Self[Content]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Content] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Content]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Content] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Content] with Other]
    @scala.inline
    def withSelector(value: Selector): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFields(value: js.Array[String]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFields: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fields")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(js.undefined)
        ret
    }
    @scala.inline
    def withSkip(value: Double): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkip: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skip")(js.undefined)
        ret
    }
    @scala.inline
    def withSort(value: js.Array[String | (StringDictionary[asc | desc])]): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSort: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sort")(js.undefined)
        ret
    }
    @scala.inline
    def withUse_index(value: String | (js.Tuple2[String, String])): Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse_index: Self[Content] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use_index")(js.undefined)
        ret
    }
  }
  
}

