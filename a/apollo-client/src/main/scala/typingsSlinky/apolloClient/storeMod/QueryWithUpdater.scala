package typingsSlinky.apolloClient.storeMod

import typingsSlinky.apolloClient.AnonMutationResult
import typingsSlinky.apolloClient.queriesMod.QueryStoreValue
import typingsSlinky.apolloClient.typesMod.MutationQueryReducer
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryWithUpdater extends js.Object {
  var query: QueryStoreValue
  var updater: MutationQueryReducer[js.Object]
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
}

