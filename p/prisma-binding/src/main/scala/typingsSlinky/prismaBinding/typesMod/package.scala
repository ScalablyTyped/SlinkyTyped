package typingsSlinky.prismaBinding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object typesMod {
  
  type Exists = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* filter */ typingsSlinky.prismaBinding.typesMod.Filter, 
      js.Promise[scala.Boolean]
    ]
  ]
  
  type Filter = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  type QueryMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      /* info */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      js.Promise[js.Any]
    ]
  ]
  
  type SubscriptionMap = org.scalablytyped.runtime.StringDictionary[
    js.Function2[
      /* args */ js.UndefOr[js.Any], 
      /* info */ js.UndefOr[typingsSlinky.graphql.definitionMod.GraphQLResolveInfo | java.lang.String], 
      (typingsSlinky.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]) | (js.Promise[typingsSlinky.std.AsyncIterator[js.Any, js.Any, js.UndefOr[scala.Nothing]]])
    ]
  ]
}
