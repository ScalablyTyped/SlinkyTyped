package typingsSlinky.apolloClient.storeMod

import typingsSlinky.apolloClient.AnonMutationResult
import typingsSlinky.apolloClient.queriesMod.QueryStoreValue
import typingsSlinky.apolloClient.typesMod.MutationQueryReducer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue = js.native
  var updater: MutationQueryReducer[js.Object] = js.native
}

object QueryWithUpdater {
  @scala.inline
  def apply(
    query: QueryStoreValue,
    updater: (/* previousResult */ Record[String, js.Any], /* options */ AnonMutationResult[js.Object]) => Record[String, js.Any]
  ): QueryWithUpdater = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], updater = js.Any.fromFunction2(updater))
    __obj.asInstanceOf[QueryWithUpdater]
  }
  @scala.inline
  implicit class QueryWithUpdaterOps[Self <: QueryWithUpdater] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withQuery(value: QueryStoreValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpdater(
      value: (/* previousResult */ Record[String, js.Any], /* options */ AnonMutationResult[js.Object]) => Record[String, js.Any]
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updater")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

