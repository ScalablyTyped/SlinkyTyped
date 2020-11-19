package typingsSlinky.apolloClient

import typingsSlinky.apolloClient.observableMod.Subscription
import typingsSlinky.apolloClient.observableQueryMod.ObservableQuery
import typingsSlinky.apolloClient.typesMod.ApolloQueryResult
import typingsSlinky.apolloClient.typesMod.OperationVariables
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("apollo-client/util/subscribeAndCount", JSImport.Namespace)
@js.native
object subscribeAndCountMod extends js.Object {
  
  def default(
    done: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify jest.DoneCallback */ js.Any,
    observable: ObservableQuery[_, OperationVariables],
    cb: js.Function2[/* handleCount */ Double, /* result */ ApolloQueryResult[_], _]
  ): Subscription = js.native
}
