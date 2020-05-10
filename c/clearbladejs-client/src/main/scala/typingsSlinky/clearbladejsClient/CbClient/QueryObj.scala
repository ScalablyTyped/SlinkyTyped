package typingsSlinky.clearbladejsClient.CbClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryObj extends js.Object {
  var OR: js.Array[Query] = js.native
  var URI: String = js.native
  var endpoint: String = js.native
  var limit: Double = js.native
  var offset: Double = js.native
  var query: Query = js.native
  var systemKey: String = js.native
  var systemSecret: String = js.native
  var user: APIUser = js.native
  def addFilterToQuery(query: QueryObj, condition: QueryConditions, key: String, value: QueryValue): Unit = js.native
  def addSortToQuery(query: QueryObj, direction: QuerySortDirections, column: String): Unit = js.native
  def ascending(field: String): Unit = js.native
  def columns(columnsArray: js.Array[String]): Unit = js.native
  def descending(field: String): Unit = js.native
  def equalTo(field: String, value: QueryValue): Unit = js.native
  def fetch(callback: CbCallback): Unit = js.native
  def greaterThan(field: String, value: QueryValue): Unit = js.native
  def greaterThanEqualTo(field: String, value: QueryValue): Unit = js.native
  def lessThan(field: String, value: QueryValue): Unit = js.native
  def lessThanEqualTo(field: String, value: QueryValue): Unit = js.native
  def matches(field: String, pattern: js.RegExp): Unit = js.native
  def notEqualTo(field: String, value: QueryValue): Unit = js.native
  def or(query: QueryObj): Unit = js.native
  def remove(callback: CbCallback): Unit = js.native
  def setPage(pageSize: Double, pageNum: Double): Unit = js.native
  def update(changes: js.Object, callback: CbCallback): Unit = js.native
}

object QueryObj {
  @scala.inline
  def apply(
    OR: js.Array[Query],
    URI: String,
    addFilterToQuery: (QueryObj, QueryConditions, String, QueryValue) => Unit,
    addSortToQuery: (QueryObj, QuerySortDirections, String) => Unit,
    ascending: String => Unit,
    columns: js.Array[String] => Unit,
    descending: String => Unit,
    endpoint: String,
    equalTo: (String, QueryValue) => Unit,
    fetch: CbCallback => Unit,
    greaterThan: (String, QueryValue) => Unit,
    greaterThanEqualTo: (String, QueryValue) => Unit,
    lessThan: (String, QueryValue) => Unit,
    lessThanEqualTo: (String, QueryValue) => Unit,
    limit: Double,
    matches: (String, js.RegExp) => Unit,
    notEqualTo: (String, QueryValue) => Unit,
    offset: Double,
    or: QueryObj => Unit,
    query: Query,
    remove: CbCallback => Unit,
    setPage: (Double, Double) => Unit,
    systemKey: String,
    systemSecret: String,
    update: (js.Object, CbCallback) => Unit,
    user: APIUser
  ): QueryObj = {
    val __obj = js.Dynamic.literal(OR = OR.asInstanceOf[js.Any], URI = URI.asInstanceOf[js.Any], addFilterToQuery = js.Any.fromFunction4(addFilterToQuery), addSortToQuery = js.Any.fromFunction3(addSortToQuery), ascending = js.Any.fromFunction1(ascending), columns = js.Any.fromFunction1(columns), descending = js.Any.fromFunction1(descending), endpoint = endpoint.asInstanceOf[js.Any], equalTo = js.Any.fromFunction2(equalTo), fetch = js.Any.fromFunction1(fetch), greaterThan = js.Any.fromFunction2(greaterThan), greaterThanEqualTo = js.Any.fromFunction2(greaterThanEqualTo), lessThan = js.Any.fromFunction2(lessThan), lessThanEqualTo = js.Any.fromFunction2(lessThanEqualTo), limit = limit.asInstanceOf[js.Any], matches = js.Any.fromFunction2(matches), notEqualTo = js.Any.fromFunction2(notEqualTo), offset = offset.asInstanceOf[js.Any], or = js.Any.fromFunction1(or), query = query.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove), setPage = js.Any.fromFunction2(setPage), systemKey = systemKey.asInstanceOf[js.Any], systemSecret = systemSecret.asInstanceOf[js.Any], update = js.Any.fromFunction2(update), user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObj]
  }
  @scala.inline
  implicit class QueryObjOps[Self <: QueryObj] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOR(value: js.Array[Query]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OR")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("URI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAddFilterToQuery(value: (QueryObj, QueryConditions, String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addFilterToQuery")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withAddSortToQuery(value: (QueryObj, QuerySortDirections, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSortToQuery")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAscending(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ascending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withColumns(value: js.Array[String] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("columns")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDescending(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("descending")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withEndpoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEqualTo(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("equalTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withFetch(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fetch")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGreaterThan(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withGreaterThanEqualTo(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("greaterThanEqualTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessThan(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThan")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLessThanEqualTo(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lessThanEqualTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMatches(value: (String, js.RegExp) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matches")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withNotEqualTo(value: (String, QueryValue) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notEqualTo")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: Query): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemove(value: CbCallback => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetPage(value: (Double, Double) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setPage")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSystemKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSystemSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("systemSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdate(value: (js.Object, CbCallback) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("update")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withUser(value: APIUser): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("user")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

