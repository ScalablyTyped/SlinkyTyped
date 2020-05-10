package typingsSlinky.algoliasearch.mod.Places

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Result of search.
  * https://community.algolia.com/places/api-clients.html#json-answer
  */
@js.native
trait ResultSearchInterface[T /* <: HitInterface | LocalizedHitInterface */] extends js.Object {
  /**
    * Query fallback if query retrieve any result
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var degradedQuery: Boolean = js.native
  /**
    * Contains all the hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var hits: js.Array[T] = js.native
  /**
    * Number of total hits matching the query.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var nbHits: Double = js.native
  /**
    * GET parameters used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var params: String = js.native
  /**
    * Engine processing time (excluding network transfer).
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var processingTimeMS: Double = js.native
  /**
    * Query used to perform the search.
    * https://community.algolia.com/places/api-clients.html#json-answer
    */
  var query: String = js.native
}

object ResultSearchInterface {
  @scala.inline
  def apply[T](
    degradedQuery: Boolean,
    hits: js.Array[T],
    nbHits: Double,
    params: String,
    processingTimeMS: Double,
    query: String
  ): ResultSearchInterface[T] = {
    val __obj = js.Dynamic.literal(degradedQuery = degradedQuery.asInstanceOf[js.Any], hits = hits.asInstanceOf[js.Any], nbHits = nbHits.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], processingTimeMS = processingTimeMS.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultSearchInterface[T]]
  }
  @scala.inline
  implicit class ResultSearchInterfaceOps[Self[t] <: ResultSearchInterface[t], T] (val x: Self[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self[T] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[T]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[T] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[T] with Other]
    @scala.inline
    def withDegradedQuery(value: Boolean): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("degradedQuery")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHits(value: js.Array[T]): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbHits(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbHits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withParams(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("params")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProcessingTimeMS(value: Double): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processingTimeMS")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: String): Self[T] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

