package typingsSlinky.graphqlBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object distTypesMod {
  
  type Args = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type Context = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type MutationMap = typingsSlinky.graphqlBinding.distTypesMod.QueryMap
  
  type QueryMap = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      /* info */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      /* context */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      js.Promise[js.Any]
    ]
  ]
  
  type SubscriptionMap = org.scalablytyped.runtime.StringDictionary[
    js.Function3[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      /* context */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      (typingsSlinky.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[typingsSlinky.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
