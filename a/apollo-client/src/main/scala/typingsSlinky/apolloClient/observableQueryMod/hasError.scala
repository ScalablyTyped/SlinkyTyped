package typingsSlinky.apolloClient.observableQueryMod

import typingsSlinky.apolloClient.queriesMod.QueryStoreValue
import typingsSlinky.apolloClient.watchQueryOptionsMod.ErrorPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/core/ObservableQuery", "hasError")
@js.native
object hasError extends js.Object {
  
  def apply(storeValue: QueryStoreValue): Boolean | js.Error = js.native
  def apply(storeValue: QueryStoreValue, policy: ErrorPolicy): Boolean | js.Error = js.native
}
