package typingsSlinky.graphqlToolsMerge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mergeResolversMod {
  
  type ResolversDefinition[TContext] = (typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers[js.Any, TContext, typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]) | typingsSlinky.graphqlToolsMerge.mergeResolversMod.ResolversFactory[TContext]
  
  type ResolversFactory[TContext] = js.Function1[
    /* repeated */ js.Any, 
    typingsSlinky.graphqlToolsUtils.interfacesMod.IResolvers[js.Any, TContext, typingsSlinky.std.Record[java.lang.String, js.Any], js.Any]
  ]
}
