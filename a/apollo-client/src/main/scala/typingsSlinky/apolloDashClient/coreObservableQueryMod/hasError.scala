package typingsSlinky.apolloDashClient.coreObservableQueryMod

import typingsSlinky.apolloDashClient.coreWatchQueryOptionsMod.ErrorPolicy
import typingsSlinky.apolloDashClient.dataQueriesMod.QueryStoreValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-client/core/ObservableQuery", "hasError")
@js.native
object hasError extends js.Object {
  def apply(storeValue: QueryStoreValue): Boolean | js.Error = js.native
  def apply(storeValue: QueryStoreValue, policy: ErrorPolicy): Boolean | js.Error = js.native
}

