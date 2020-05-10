package typingsSlinky.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryContext extends js.Object {
  var dataService: DataService = js.native
  var entityManager: EntityManager = js.native
  var query: EntityQuery | String = js.native
  var queryOptions: QueryOptions = js.native
  var url: String = js.native
}

object QueryContext {
  @scala.inline
  def apply(
    dataService: DataService,
    entityManager: EntityManager,
    query: EntityQuery | String,
    queryOptions: QueryOptions,
    url: String
  ): QueryContext = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], entityManager = entityManager.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryOptions = queryOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryContext]
  }
  @scala.inline
  implicit class QueryContextOps[Self <: QueryContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataService(value: DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntityManager(value: EntityManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entityManager")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuery(value: EntityQuery | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueryOptions(value: QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queryOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

