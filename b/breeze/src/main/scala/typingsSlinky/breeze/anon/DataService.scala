package typingsSlinky.breeze.anon

import typingsSlinky.breeze.breeze.EntityQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataService extends js.Object {
  var dataService: typingsSlinky.breeze.breeze.DataService = js.native
  var query: EntityQuery = js.native
  def getUrl(): String = js.native
}

object DataService {
  @scala.inline
  def apply(dataService: typingsSlinky.breeze.breeze.DataService, getUrl: () => String, query: EntityQuery): DataService = {
    val __obj = js.Dynamic.literal(dataService = dataService.asInstanceOf[js.Any], getUrl = js.Any.fromFunction0(getUrl), query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataService]
  }
  @scala.inline
  implicit class DataServiceOps[Self <: DataService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDataService(value: typingsSlinky.breeze.breeze.DataService): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataService")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withQuery(value: EntityQuery): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

