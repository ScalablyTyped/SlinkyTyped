package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  /** EntityManager that executed the query */
  var entityManager: js.UndefOr[EntityManager] = js.native
  /** Raw response from the server */
  var httpResponse: HttpResponse = js.native
  /** Total number of results available on the server */
  var inlineCount: js.UndefOr[Double] = js.native
  /** Query that was executed */
  var query: EntityQuery = js.native
  /** Top level entities returned */
  var results: js.Array[Entity] = js.native
  /** All entities returned by the query.  Differs from results when an expand is used. */
  var retrievedEntities: js.UndefOr[js.Array[Entity]] = js.native
}

object QueryResult {
  @scala.inline
  def apply(httpResponse: HttpResponse, query: EntityQuery, results: js.Array[Entity]): QueryResult = {
    val __obj = js.Dynamic.literal(httpResponse = httpResponse.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHttpResponse(value: HttpResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("httpResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: EntityQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: js.Array[Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityManager(value: EntityManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntityManager: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityManager")(js.undefined)
        ret
    }
    @scala.inline
    def withInlineCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInlineCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inlineCount")(js.undefined)
        ret
    }
    @scala.inline
    def withRetrievedEntities(value: js.Array[Entity]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievedEntities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRetrievedEntities: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("retrievedEntities")(js.undefined)
        ret
    }
  }
  
}

