package typingsSlinky.apolloDashClient.dataStoreMod

import typingsSlinky.apolloDashClient.Anon_MutationResult
import typingsSlinky.apolloDashClient.coreTypesMod.MutationQueryReducer
import typingsSlinky.apolloDashClient.dataQueriesMod.QueryStoreValue
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
    updater: (/* previousResult */ Record[String, js.Any], /* options */ Anon_MutationResult[js.Object]) => Record[String, js.Any]
  ): QueryWithUpdater = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], updater = js.Any.fromFunction2(updater))
  
    __obj.asInstanceOf[QueryWithUpdater]
  }
}

