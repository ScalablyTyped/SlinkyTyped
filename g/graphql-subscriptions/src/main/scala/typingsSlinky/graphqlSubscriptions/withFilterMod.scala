package typingsSlinky.graphqlSubscriptions

import typingsSlinky.std.AsyncIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("graphql-subscriptions/dist/with-filter", JSImport.Namespace)
@js.native
object withFilterMod extends js.Object {
  
  def withFilter(asyncIteratorFn: ResolverFn, filterFn: FilterFn): ResolverFn = js.native
  
  type FilterFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    Boolean | js.Promise[Boolean]
  ]
  
  type ResolverFn = js.Function4[
    /* rootValue */ js.UndefOr[js.Any], 
    /* args */ js.UndefOr[js.Any], 
    /* context */ js.UndefOr[js.Any], 
    /* info */ js.UndefOr[js.Any], 
    AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]
  ]
}
